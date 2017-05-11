package cn.fyl.decorator;

public class Mocha extends Decorator {

	String description = "加了摩卡";
			
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	//被装饰者描述加上装饰着描述
	@Override
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;
	}
	
	//加摩卡的3块，加上里面beverage的价格
		public double cost(){
			return 3+beverage.cost();
		}

}
