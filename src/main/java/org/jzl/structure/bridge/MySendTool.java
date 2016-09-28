package org.jzl.structure.bridge;

public class MySendTool extends ASendTool {

	@Override
	public void send() {
		if (getSend() != null) {
			System.out.println("我是桥接");
			getSend().send();
		}
	}

}
