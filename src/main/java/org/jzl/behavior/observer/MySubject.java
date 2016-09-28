package org.jzl.behavior.observer;

public class MySubject extends AbstractSubject {

	public void operation() {
		System.out.println("MySubject 全体开始更新");
		notifyObservers();
		System.out.println("MySubject 全体更新完毕");
	}

}
