package cn.fyl.decorator;
/*
 * 具体构件(ConcreteComponent):一个将要接受附加方法属性的类
 */
public class CoffeeBean implements Beverage {

	String description ="选了咖啡豆：";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		return 30;		//基本价格
	}
	
}
