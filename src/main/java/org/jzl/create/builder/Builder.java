package org.jzl.create.builder;

import java.util.ArrayList;
import java.util.List;

import org.jzl.ISend;
import org.jzl.create.singleton.FactoryManager;

public class Builder {
	private FactoryManager manager;
	public Builder(){
		manager = FactoryManager.getInstance();
	}
	
	public List<ISend> produce(Class<? extends ISend> type, int count){
		List<ISend> sends = new ArrayList<ISend>();
		for (int i = 0; i < count; i++) {
			sends.add(manager.getSend(type));
		}
		return sends;
	}
}
