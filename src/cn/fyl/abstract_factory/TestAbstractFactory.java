package cn.fyl.abstract_factory;

import org.junit.Test;
/*
 * 工厂方法模式：类的创建依赖工厂类，需要拓展，则要修改工厂类，违反闭包原则。
 * 抽象工厂模式：建立多个工厂，实现共有的接口。新增产品时，即增加工厂实现接口和新增该产品即可。
 */
public class TestAbstractFactory {
		
		@Test
		public void test(){
			
			//构造出需要的工厂
			Provider provider = new SenderSmsFactory();
			//使用该工厂返回需要的产品
			Sender sender = provider.produce();
			//使用该产品
			sender.Send();

		}
	
}
