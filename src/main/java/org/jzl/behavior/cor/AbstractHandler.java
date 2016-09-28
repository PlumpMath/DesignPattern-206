package org.jzl.behavior.cor;

public abstract class AbstractHandler implements IHandler{
	private IHandler handler;

	public IHandler getHandler() {
		return handler;
	}

	public void setHandler(IHandler handler) {
		this.handler = handler;
	}
}
