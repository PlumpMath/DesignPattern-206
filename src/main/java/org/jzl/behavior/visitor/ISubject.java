package org.jzl.behavior.visitor;

public interface ISubject {
	void accept(IVisitor visitor);
	String getSubject();
}
