package org.jzl.behavior.command;

public class Soldier implements Invoker {
	
	ICommand command;
	IReceive receive;
	public Soldier(IReceive receive) {
		this.receive = receive;
	}
	
	public void receive(ICommand command) {
		if (receive != null) {
			System.out.println("士兵传递命了");
			receive.receive(command);
			return;
		}
		this.command = command;
		invoker();
	}

	public void invoker() {
		if (command != null) {
			System.out.println("士兵执行命了");
			command.exe();
		}
	}

}
