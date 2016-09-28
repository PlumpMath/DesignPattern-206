package org.jzl.behavior.mediator;

import org.junit.Test;

public class MediatorTest {
	@Test
	public void test() throws Exception {
		IMediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
