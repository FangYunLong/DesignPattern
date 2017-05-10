package cn.fyl.factory;

import cn.fyl.abstract_factory.Sender;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("This is SmsSender");	
	}

}
