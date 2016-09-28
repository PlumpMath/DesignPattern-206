package org.jzl.create.factory;

import org.jzl.ISend;

public interface IFactory<T extends ISend> {
	T produce();
}
