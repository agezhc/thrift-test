package cn.myera.whurec.thrift;

import java.util.Random;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.agezhc.thrift.recommend.PRResponse;

public class RecommenderImp extends Recommender implements Recommender.Iface{

	public static final Logger log = LoggerFactory.getLogger(RecommenderImp.class);
	public static final Random r = new Random();

	private int getPageSize(int pageSize){
		return r.nextInt(pageSize);
	}

	@Override
	public BookResponse pr_recommend(PRRequest request) throws TException {
		// TODO Auto-generated method stub
		BookResponse response = new BookResponse();
		log.info("new request, stuid("+request.stu_model_id+")");
		log.info("request page size: " + request.getPage_size());
		int tmp = getPageSize(request.getPage_size());
		log.info("getPageSize :" + tmp);
		response.setActual_size(tmp);
		log.debug("actual_size: " + response.getActual_size());
		return response;
	}

	@Override
	public BookResponse fp_recommend(FPRequest request) throws TException {
		// TODO Auto-generated method stub
		return null;
	}
}
