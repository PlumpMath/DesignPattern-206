package org.jzl.structure.bridge;

import org.junit.Test;
import org.jzl.ISend;
import org.jzl.MailSender;
import org.jzl.SmsSender;
import org.jzl.create.singleton.FactoryManager;


public class MySendToolTest {
	@Test
	public void test() {
		MySendTool tool = new MySendTool();
		FactoryManager manager = FactoryManager.getInstance();
		
		ISend iSend = manager.getSend(SmsSender.class);
		tool.setSend(iSend);
		tool.send();
		System.out.println("--------------");		
		iSend = manager.getSend(MailSender.class);
		tool.setSend(iSend);
		tool.send();
		System.out.println("--------------");
		
		iSend = manager.getSend(null);
		tool.setSend(iSend);
		tool.send();
		
	}
}
