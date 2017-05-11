package cn.fyl.decorator;
/*
 * 装饰角色(Decorator):一般装饰者，具体给具体构件装饰的任务延迟到具体装饰者
 */
public class Decorator implements Beverage {

	String description = "unknow 装饰";
	Beverage beverage;
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return 0;			//由子类决定具体价格
	}

}
