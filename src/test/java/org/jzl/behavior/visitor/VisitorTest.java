package org.jzl.behavior.visitor;

import org.junit.Test;

public class VisitorTest {
	@Test
	public void test() throws Exception {
		IVisitor visitor = new MyVisitor();
		ISubject subject = new MySubject();
		subject.accept(visitor);
	}
}
