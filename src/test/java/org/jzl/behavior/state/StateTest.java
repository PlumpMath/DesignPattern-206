package org.jzl.behavior.state;

import org.junit.Test;

public class StateTest {
	@Test
	public void test() throws Exception {
		Person person = new Person();
		person.action();
		person.setState(State.RUN);
		person.action();
	}
}
