package cn.fyl.decorator;
/*
 * 具体装饰者(ConcreteDecorator):通过持有具体构件，附加给具体构件一些方法和属性
 */
public class Milk extends Decorator {

	String description = "加了牛奶";
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	//被装饰者描述加上装饰着描述
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;
	}

	//加牛奶的5块，加上里面beverage的价格
	public double cost(){
		return 5+beverage.cost();
	}
	
}
