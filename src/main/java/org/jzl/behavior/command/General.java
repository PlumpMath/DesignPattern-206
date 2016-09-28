package org.jzl.behavior.command;

public class General implements IReceive {
	IReceive receive;
	ICommand command;

	public General(IReceive receive) {
		this.receive = receive;
	}

	public void receive(ICommand command) {
		System.out.println("将军下达命了");
		receive.receive(command);
	}

	protected void createCommand() {
		ICommand command = new ICommand() {
			public void exe() {
				System.out.println("执行命了！");
			}
		};
		this.command = command;
	}
	
	public void issued(){
		createCommand();
		receive(command);
	}
}
