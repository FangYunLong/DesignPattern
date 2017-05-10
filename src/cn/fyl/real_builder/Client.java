package cn.fyl.real_builder;

import org.junit.Test;
/*
 * RoomBuilder有一个Room所有属性的备份的内部类
 * 对Room属性的赋值就是通过内部类赋值间接完成
 */
public class Client {

	@Test
	public void test(){
		Room room = ((new RoomBuilder()).makeFloor("黄色地板").makeWindow("蓝色玻璃")).build();
		System.out.println(room);
	}
	
}
