package org.jzl.behavior.mediator;

public abstract class User {
	public IMediator mediator;
	public User(IMediator mediator){
		this.mediator = mediator;
	}
	
	abstract void work();

	public IMediator getMediator() {
		return mediator;
	}
}
