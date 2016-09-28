package org.jzl.structure.adapter;

import org.junit.Test;

public class AdapterTest {
	@Test
	public void test(){
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
		System.out.println("-------------");
		targetable = new Wrapper();
		targetable.method1();
		targetable.method2();
		System.out.println("-------------");
		
		Method1 method1 = new Method1();
		method1.method1();
		method1.method2();
		
		
		Method2 method2 = new Method2();
		method2.method1();
		method2.method2();
	}
}
