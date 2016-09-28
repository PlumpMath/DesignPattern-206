package org.jzl.behavior.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractSubject implements ISubject {
	
	Set<IObserver> observers;
	public AbstractSubject(){
		observers = new HashSet<IObserver>();
	}
	
	public void add(IObserver observer) {
		observers.add(observer);
	}

	public void delete(IObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.upload();
		}
	}
}
