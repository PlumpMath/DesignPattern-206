package org.jzl.behavior.memento;

public class Original {
	private String value;
	public Original(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento createMemento(){
		return new Memento(getValue());
	}
	
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}

	@Override
	public String toString() {
		return "Original [value=" + value + "]";
	}
}
