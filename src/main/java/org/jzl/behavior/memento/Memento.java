package org.jzl.behavior.memento;

public class Memento {
	String value;
	public Memento(String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
