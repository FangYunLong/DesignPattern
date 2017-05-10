package cn.fyl.factory;

import org.junit.Test;

import cn.fyl.abstract_factory.Sender;

/*
 * 有大量的产品需要创建，且有共同接口，可用工厂模式
 */
public class TestFactory {

		@Test
		public void test(){
			
			Sender sender = SenderFactory.produceMail();
			sender.Send();
			
		}
	
}
