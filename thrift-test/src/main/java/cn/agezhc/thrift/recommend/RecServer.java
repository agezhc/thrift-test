package cn.agezhc.thrift.recommend;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.agezhc.thrift.recommend.Recommender.Iface;

public class RecServer {

	public static final Logger log = LoggerFactory.getLogger(RecServer.class);
	public static void main(String [] args) throws TTransportException{
		Recommender.Processor<Iface> processor = new Recommender.Processor<Recommender.Iface>(new RecommenderImp());
	
		TServerTransport serverTransport = new TServerSocket(8888);
		
		TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(serverTransport);
		serverArgs.processor(processor);
		serverArgs.protocolFactory(new TBinaryProtocol.Factory(true, true));
		
		TServer server = new TThreadPoolServer(serverArgs);
		log.info("------------server start--------------");
		server.serve();
		log.info("--------------------------------------");
		server.stop();
	}
}
