package org.jzl.behavior.strategy;

public class Plus extends AbstractCalculator {

	public int calculate(String exp) {
		int[] ints = split(exp, "\\+");
		return ints[0] + ints[1];
	}

}
