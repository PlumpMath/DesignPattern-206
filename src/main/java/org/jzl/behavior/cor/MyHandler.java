package org.jzl.behavior.cor;

public class MyHandler extends AbstractHandler {
	String name;
	public MyHandler(String name) {
		this.name = name;
	}
	
	public void operator(){
		System.out.println( name + "->deal!");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}
