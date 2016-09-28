package org.jzl.create.factory;

import org.jzl.MailSender;

public class MailFactory implements IFactory<MailSender> {

	public MailSender produce() {
		return new MailSender();
	}


}
