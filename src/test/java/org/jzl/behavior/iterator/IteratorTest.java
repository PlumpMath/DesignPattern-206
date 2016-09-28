package org.jzl.behavior.iterator;

import org.junit.Test;

public class IteratorTest {
	@Test
	public void test() throws Exception {
		ICollection<Character> collection = new MyCollection();
		Iterator<Character> iterator = collection.iterator();
		while( iterator.hasNext() ){
			System.out.println(iterator.next());
		}
	}
}
