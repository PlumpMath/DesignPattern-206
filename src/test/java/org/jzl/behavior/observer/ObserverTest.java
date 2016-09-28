package org.jzl.behavior.observer;

import org.junit.Test;

public class ObserverTest {
	@Test
	public void test(){
		MySubject subject = new MySubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		
		subject.operation();
		
	}
}
