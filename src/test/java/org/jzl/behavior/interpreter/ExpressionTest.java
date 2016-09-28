package org.jzl.behavior.interpreter;

import org.junit.Test;

public class ExpressionTest {
	@Test
	public void test() throws Exception {
		Context context = new Context(100, 50);
		IExpression expression = new Plus();
		System.out.println("100 + 50 = " + expression.interpret(context));
		
		expression = new Minus();
		System.out.println("100 - 50 = " + expression.interpret(context));
	}
}
