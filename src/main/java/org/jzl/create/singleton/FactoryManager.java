package org.jzl.create.singleton;

import java.util.HashMap;
import java.util.Map;

import org.jzl.ISend;
import org.jzl.MailSender;
import org.jzl.SmsSender;
import org.jzl.create.factory.IFactory;
import org.jzl.create.factory.MailFactory;
import org.jzl.create.factory.SmsFactory;

public class FactoryManager {
	Map<Class<? extends ISend>, IFactory<? extends ISend>> factorys;
	
	private static FactoryManager instance = new FactoryManager();
	
	
	private FactoryManager(){
		factorys = new HashMap<Class<? extends ISend>, IFactory<? extends ISend>>();
		factorys.put(DefaultSend.class, new DefaultFactory());
		addFactory(MailSender.class, new MailFactory());
		addFactory(SmsSender.class, new SmsFactory());
	}
	public static FactoryManager getInstance() {
		return instance;
	}
	public void addFactory(Class<? extends ISend> type, IFactory<? extends ISend> factory){
		factorys.put(type, factory);
	}
	
	public ISend getSend(Class<? extends ISend> type){
		IFactory<? extends ISend> factory = factorys.get(type);
		if (factory == null) {
			factory = factorys.get(DefaultSend.class);
		}
		return factory.produce();
	}
	
	//小面是默认的工厂和实现类
	//-----------------------
	class DefaultFactory implements IFactory<DefaultSend>{
		public DefaultSend produce() {
			return new DefaultSend();
		}
	}
	
	class DefaultSend implements ISend{

		public void send() {
			System.out.println("--- 默认发送 ---");
		}
		
	}
}
