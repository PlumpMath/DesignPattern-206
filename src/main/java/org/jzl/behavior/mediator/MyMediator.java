package org.jzl.behavior.mediator;

import java.util.HashSet;
import java.util.Set;

public class MyMediator implements IMediator {
	
	private Set<User> users = new HashSet<User>();
	
	public void createMediator() {
		users.add(new User1(this));
		users.add(new User2(this));
	}

	public void workAll() {
		for (User user : users) {
			user.work();
		}
	}

}
