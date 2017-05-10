package cn.fyl.builder;

/*
 * 指导者角色
 * 指挥工人如何建造房子
 */
public class Designer {
	
	public void order(Builder builder){
		builder.makeFloor();
		builder.makeWindow();
	}
	
}
