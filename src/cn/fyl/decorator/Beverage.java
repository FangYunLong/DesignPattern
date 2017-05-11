package cn.fyl.decorator;
/*
 * 抽象构件(Component):规范准备添加附加责任的对象
 */
public interface Beverage {

	String description = "Unknow beverage";
	
	//返回描述
	public String getDescription();
	//返回花费
	public double cost();
	
}
