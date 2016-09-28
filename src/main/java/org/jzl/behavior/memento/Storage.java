package org.jzl.behavior.memento;

public class Storage {
	Memento memento;
	public Storage(Memento memento){
		this.memento = memento;
	}
	public Memento getMemento() {
		return memento;
	}
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
