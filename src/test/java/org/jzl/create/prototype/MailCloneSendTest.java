package org.jzl.create.prototype;

import org.junit.Test;
import org.jzl.create.factory.IFactory;
import org.jzl.create.singleton.FactoryManager;

public class MailCloneSendTest {
	@Test
	public void test(){
		FactoryManager manager = FactoryManager.getInstance();
		manager.addFactory(MailCloneSend.class, new IFactory<MailCloneSend>() {

			public MailCloneSend produce() {
				return new MailCloneSend();
			}
			
		});
		
		MailCloneSend send = (MailCloneSend) manager.getSend(MailCloneSend.class);
		send.send();
		try {
			MailCloneSend send2 = (MailCloneSend) send.clone();
			send2.send();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
