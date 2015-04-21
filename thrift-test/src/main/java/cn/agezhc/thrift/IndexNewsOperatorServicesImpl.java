package cn.agezhc.thrift;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexNewsOperatorServicesImpl extends IndexNewsOperatorServices implements IndexNewsOperatorServices.Iface {

	public static final Logger log = LoggerFactory.getLogger(IndexNewsOperatorServicesImpl.class);
	@Override
	public boolean indexNews(NewsModel indexNews) throws TException {
		log.info("receiving request from client, id("+indexNews.id+")");
		System.out.println("receiving request from client, id("+indexNews.id+")");
		return true;
	}

	@Override
	public boolean deleteArtificiallyNews(int id) throws TException {
		// TODO Auto-generated method stub
		return true;
	}

}
