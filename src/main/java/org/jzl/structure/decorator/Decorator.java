package org.jzl.structure.decorator;


public class Decorator implements Sourceable {
	
	Sourceable sourceable;
	public Decorator(Sourceable sourceable){
		this.sourceable = sourceable;
	}
	
	public void method() {
		System.out.println("之前");
		sourceable.method();
		System.out.println("之后");
	}

}
