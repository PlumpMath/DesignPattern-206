package org.jzl.behavior.cor;

import org.junit.Test;

public class CorTest {
	@Test
	public void test() throws Exception {
		AbstractHandler handler1 = new MyHandler("h1");
		AbstractHandler handler2 = new MyHandler("h2");
		AbstractHandler handler3 = new MyHandler("h3");
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler1.operator();
		System.out.println("-----------");
		handler2.operator();
		System.out.println("-----------");
		handler3.operator();
	}
}
