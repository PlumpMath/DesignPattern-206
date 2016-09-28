package org.jzl.behavior.visitor;


public class MySubject implements ISubject {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public String getSubject() {
		return "love";
	}

}
