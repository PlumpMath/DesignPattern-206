package org.jzl.structure.proxy;

import org.junit.Test;
import org.jzl.ISend;
import org.jzl.create.singleton.FactoryManager;

public class ProxyTest {
	@Test
	public void test(){
		FactoryManager manager = FactoryManager.getInstance();
		ISend send = manager.getSend(null);
		SendProxy proxy = new SendProxy(send);
		proxy.send();
		
	}
}
