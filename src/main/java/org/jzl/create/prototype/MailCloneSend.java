package org.jzl.create.prototype;

import org.jzl.MailSender;

public class MailCloneSend extends MailSender implements Cloneable {
	private String data = "我是原始对象。";
	@Override
	public void send() {
		System.out.println(data);
		super.send();
	}
	
	//这是浅复制 ， 可以通过io达到深复制
	public Object clone() throws CloneNotSupportedException{
		MailCloneSend object = (MailCloneSend) super.clone();
		object.data = "我是通过clone来的对象。";
		return object;
	}
}
