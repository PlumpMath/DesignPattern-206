package org.jzl.create.factory;

import org.junit.BeforeClass;
import org.junit.Test;
import org.jzl.MailSender;
import org.jzl.SmsSender;
import org.jzl.create.factory.IFactory;
import org.jzl.create.factory.MailFactory;
import org.jzl.create.factory.SendFactory;
import org.jzl.create.factory.SmsFactory;


//工厂模式 测试
public class SendFactoryTest {
	static SendFactory factory;
	
	@BeforeClass
	public static void before(){
		factory = new SendFactory();
	}
	
	@Test
	public void test(){
		factory.produce(SmsSender.class).send();
		factory.produce(MailSender.class).send();
		
		System.out.println("-----------");
		IFactory factory = new MailFactory();
		factory.produce().send();
		factory = new SmsFactory();
		factory.produce().send();
		
	}
}
