package org.jzl.behavior.interpreter;

public class Plus implements IExpression {

	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
