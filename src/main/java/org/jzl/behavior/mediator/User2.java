package org.jzl.behavior.mediator;

public class User2 extends User {

	public User2(IMediator mediator) {
		super(mediator);
	}

	@Override
	void work() {
		System.out.println("user2 work");
	}

}
