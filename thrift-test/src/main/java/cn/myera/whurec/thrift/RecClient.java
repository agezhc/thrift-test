package cn.myera.whurec.thrift;

import java.util.Date;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecClient {

	public static final Logger log = LoggerFactory.getLogger(RecClient.class);
	public static void main(String[] args) throws TException {
		TTransport transport = new TSocket("door.myera.cn", 9090);
		TProtocol protocol = new TBinaryProtocol(transport);
		
		Recommender.Client recommender = new Recommender.Client(protocol);
		transport.open();
		PRRequest request = new PRRequest();
		request.setStu_model_id(186619);
		request.setPage_size(10);
		request.setPage_index(1);
		
		Date start = new Date();
		BookResponse response = recommender.pr_recommend(request);
		log.info("actual page size is: "+ response.getActual_size());
		log.info("返回推荐的数量是：" + response.getBook_pref_listSize());
		for(int i = 0; i < response.getBook_pref_listSize(); i++){
			BookPref pref = response.getBook_pref_list().get(i);
			log.info("book_model_id:" + pref.book_model_order + ", pref: " + pref.pref);
		}
		System.out.println(new Date().getTime() - start.getTime());
		transport.close();
		System.out.println("client success!");
	}

}
