package org.jzl.behavior.state;

public class Person {
	State state;
	public Person(){
		this.state = State.DO;
	}
	
	public void action(){
		state.action();
	}

	public void setState(State state) {
		this.state = state;
	}
}
