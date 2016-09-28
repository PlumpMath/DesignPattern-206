package org.jzl.structure.facade;

import org.junit.Test;

public class ComputerTest {
	@Test
	public void test(){
		
		Computer computer = new Computer();
		
		computer.startup();
		System.out.println("-------------");
		computer.shutdown();
	}
}
