package org.jzl.behavior.observer;

public interface ISubject {
	
	void add(IObserver observer);
	void delete(IObserver observer);
	void notifyObservers();
	
	//自身行为
	void operation();
}
