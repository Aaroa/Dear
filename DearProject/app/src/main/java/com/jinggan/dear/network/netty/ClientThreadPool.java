package com.jinggan.dear.network.netty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ClientThreadPool implements Runnable{
	
	public void run() {

		String inetHost = "112.74.109.65";
		int inetPort = 7878;
		
		NettyClient nc = new NettyClient();
		try {
			nc.connect(inetPort, inetHost);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		for(int i=1; i<=1; i++){
			es.execute(new ClientThreadPool());
		}
	}

}
