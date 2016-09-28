package org.jzl.behavior.memento;


public class Test {
	@org.junit.Test
	public void test() throws Exception {
		Original original = new Original("1");
		System.out.println(original);
		Storage storage = new Storage(original.createMemento());
		original.setValue("2");
		System.out.println(original);
		original.restoreMemento(storage.getMemento());
		System.out.println(original);
	}
}
