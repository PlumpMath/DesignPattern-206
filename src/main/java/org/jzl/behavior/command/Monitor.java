package org.jzl.behavior.command;

public class Monitor implements IReceive {
	IReceive receive;
	public Monitor(IReceive receive){
		this.receive = receive;
	}
	public void receive(ICommand command) {
		if (receive != null) {
			System.out.println("班长传递命了！");
			receive.receive(command);
		}
	}

}
