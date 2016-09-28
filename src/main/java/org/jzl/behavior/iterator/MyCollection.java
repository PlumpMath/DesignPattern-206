package org.jzl.behavior.iterator;

public class MyCollection implements ICollection<Character>{
	Character[] chars = {'a','b','c','d','e'};
	
	public Character get(int i) {
		if (i < size()) {
			return chars[i];
		}
		return null;
	}

	public int size() {
		return chars.length;
	}

	public Iterator<Character> iterator() {
		return new MyIterator(this);
	}
}
