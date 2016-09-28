package org.jzl.behavior.interpreter;

public class Minus implements IExpression {

	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
