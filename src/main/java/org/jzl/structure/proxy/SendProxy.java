package org.jzl.structure.proxy;

import org.jzl.ISend;

public class SendProxy implements ISend {
	
	ISend send;
	public SendProxy(ISend send){
		this.send = send;
	}
	
	private void atfer(){
		System.out.println("atfer");
	}
	
	private void before(){
		System.out.println("before");
	}
	
	public void send() {
		before();
		send.send();
		atfer();
	}

}
