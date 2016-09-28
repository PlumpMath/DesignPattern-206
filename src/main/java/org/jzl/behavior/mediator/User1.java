package org.jzl.behavior.mediator;

public class User1 extends User {

	public User1(IMediator mediator) {
		super(mediator);
	}

	@Override
	void work() {
		System.out.println("user1 work");
	}

}
