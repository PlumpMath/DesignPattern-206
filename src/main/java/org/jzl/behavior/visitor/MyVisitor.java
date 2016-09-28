package org.jzl.behavior.visitor;

public class MyVisitor implements IVisitor {

	public void visit(ISubject subject) {
		System.out.println("访问的属性：" + subject.getSubject());
	}

}
