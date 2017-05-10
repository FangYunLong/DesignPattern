package cn.fyl.factory;

import cn.fyl.abstract_factory.MailSender;
import cn.fyl.abstract_factory.Sender;

/*
 * 静态工厂方法模式
 */
public class SenderFactory {

		public static Sender produceMail(){
			
			return new MailSender();
			
		}
		
		public static Sender produceSms(){
			
			return new SmsSender();
			
		}
	
}
