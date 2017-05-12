package cn.fyl.decorator;

public class Soy extends Decorator {

	String description = "加了豆浆";
			
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	//被装饰者描述加上装饰着描述
	public String getDescription(){
		return beverage.getDescription()+"\n"+description;
	}
	
	//加豆浆的4块，加上里面beverage的价格
		public double cost(){
			return 4+beverage.cost();
		}
		
}
