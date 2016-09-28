package org.jzl.create.singleton;

import org.junit.Test;
import org.jzl.MailSender;
import org.jzl.SmsSender;
import org.jzl.create.factory.MailFactory;
import org.jzl.create.factory.SmsFactory;

//单例模式	测试
public class FactoryManagerTest {
	
	@Test
	public void test(){
		FactoryManager manager = FactoryManager.getInstance();
		manager.addFactory(MailSender.class, new MailFactory());
		manager.addFactory(SmsSender.class, new SmsFactory());
		
		
		manager.getSend(MailSender.class).send();
		manager.getSend(SmsSender.class).send();
		manager.getSend(null).send();
	}
}
