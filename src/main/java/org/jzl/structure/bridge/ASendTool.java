package org.jzl.structure.bridge;

import org.jzl.ISend;

public abstract class ASendTool {
	private ISend send;
	public abstract void send();
	
	public void setSend(ISend send) {
		this.send = send;
	}
	public ISend getSend() {
		return send;
	}
}
