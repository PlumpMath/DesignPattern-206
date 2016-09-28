package org.jzl.create.factory;

import org.jzl.SmsSender;

public class SmsFactory implements IFactory<SmsSender> {

	public SmsSender produce() {
		return new SmsSender();
	}
	
}
