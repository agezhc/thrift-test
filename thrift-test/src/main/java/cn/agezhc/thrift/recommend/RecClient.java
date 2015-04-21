package cn.agezhc.thrift.recommend;

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
		TTransport transport = new TSocket("ssh.myera.cn", 9090);
		TProtocol protocol = new TBinaryProtocol(transport);
		
		Recommender.Client recommender = new Recommender.Client(protocol);
		transport.open();
		PRRequest request = new PRRequest();
		request.setStuid(2012l);
		request.setPage_size(5);
		request.setPage_index(1);
		
		PRResponse response = recommender.recommend(request);
		log.info("actual page size is: "+ response.getActual_size());
		transport.close();
		System.out.println("client success!");
	}

}
