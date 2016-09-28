package org.jzl.behavior.iterator;


public class MyIterator implements Iterator<Character> {
	
	private ICollection<Character> collection;
	private int pos = -1;
	
	public MyIterator(ICollection<Character> collection) {
		this.collection = collection;
	}
	
	public Character next() {
		if (hasNext()) {
			pos ++;
			return collection.get(pos);
		}
		return null;
	}

	public boolean hasNext() {
		return collection.size() > pos + 1;
	}
}
