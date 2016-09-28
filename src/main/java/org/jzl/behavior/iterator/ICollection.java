package org.jzl.behavior.iterator;


public interface ICollection<T> {
	Iterator<T> iterator();
	T get(int i);
	int size();
}
