package org.jzl.behavior.strategy;

import org.junit.Test;

public class ArithmeticTest {
	@Test
	public void test() throws Exception {
		String exp = "12+8";
		ICalculator calculator = new Plus();
		System.out.println(calculator.calculate(exp));
		System.out.println("---------------------");
		exp = "12-8";
		calculator = new Minus();
		System.out.println(calculator.calculate(exp));
		System.out.println("---------------------");
		exp = "6*6";
		calculator = new Multiply();
		System.out.println(calculator.calculate(exp));
		
	}
}
