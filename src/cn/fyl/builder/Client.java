package cn.fyl.builder;

import org.junit.Test;

public class Client {

	@Test
	public void test(){
		//获取工人对象
		Builder builder = new RoomBuilder();
		//获取设计师对象
		Designer designer = new Designer();
		//设计师指挥工人工作
		designer.order(builder);
		System.out.println(builder.submitRoom());
	}
	
}
