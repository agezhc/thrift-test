package cn.agezhc.thrift.recommend;

import java.util.Random;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecommenderImp extends Recommender implements Recommender.Iface{

	public static final Logger log = LoggerFactory.getLogger(RecommenderImp.class);
	public static final Random r = new Random();
	@Override
	public PRResponse recommend(PRRequest request)
			throws TException {
		PRResponse response = new PRResponse();
		log.info("new request, stuid("+request.stuid+")");
		log.info("request page size: " + request.getPage_size());
		int tmp = getPageSize(request.getPage_size());
		log.info("getPageSize :" + tmp);
		response.setActual_size(tmp);
		log.debug("actual_size: " + response.getActual_size());
		return response;
	}

	private int getPageSize(int pageSize){
		return r.nextInt(pageSize);
	}
}
