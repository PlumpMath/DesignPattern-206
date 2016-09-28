package org.jzl.create.factory;

import org.jzl.ISend;
import org.jzl.MailSender;
import org.jzl.SmsSender;

public class SendFactory {
	public ISend produce(Class<?> type){
		if (type == MailSender.class) {
			return new MailSender();
		}else if(type == SmsSender.class){
			return new SmsSender();
		}else{
			return null;
		}
	}
}	
