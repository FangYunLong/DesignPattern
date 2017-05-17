package cn.fyl.prototype;

import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		WeekLog log_previous,log_new = null;
		//创建原型对象
		log_previous = new WeekLog();
		//创建附件对象
		Attachment attachment = new Attachment();
		//将附件添加到周报中,原型对象中的引用对象
		log_previous.setAttachment(attachment);
		
		try {
			log_new = log_previous.deepClone();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("周报是否相同？"+(log_previous == log_new));
		System.out.println("附件是否相同？"+(log_previous.getAttachment() == log_new.getAttachment()));
		
	}
	
	
	
}
