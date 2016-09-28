package org.jzl.create.builder;

import java.util.List;

import org.junit.Test;
import org.jzl.ISend;
import org.jzl.MailSender;
import org.jzl.SmsSender;
import org.jzl.create.builder.Builder;

public class BuilderTest {
	@Test
	public void test(){
		Builder builder = new Builder();
		List<ISend> sends = builder.produce(SmsSender.class, 10);
		for (ISend iSend : sends) {
			iSend.send();
		}
		System.out.println("----------------");
		
		builder = new Builder();
		sends = builder.produce(MailSender.class, 10);
		for (ISend iSend : sends) {
			iSend.send();
		}
		System.out.println("----------------");
		builder = new Builder();
		sends = builder.produce( null, 10);
		for (ISend iSend : sends) {
			iSend.send();
		}
	}
}
