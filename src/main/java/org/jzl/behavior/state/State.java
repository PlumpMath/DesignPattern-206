package org.jzl.behavior.state;

public enum State {
	RUN,GO,DO;
	public void action(){
		System.out.println(this);
	}
}
