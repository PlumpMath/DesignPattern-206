package org.jzl.structure.adapter;

public class Wrapper implements Targetable {
	Source source;
	
	public Wrapper(){
		source = new Source();
	}

	public void method1() {
		source.method1();
	}

	public void method2() {
		System.out.println("Wrapper 我是方法二");
	}

}
