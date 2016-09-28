package org.jzl.behavior.command;

import org.junit.Test;

public class CommandTest {
	@Test
	public void test() throws Exception {
		General general = new General(new Monitor(new Soldier(new Soldier(null))));
		general.issued();
	}
}
