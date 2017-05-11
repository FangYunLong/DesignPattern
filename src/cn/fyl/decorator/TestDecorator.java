package cn.fyl.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		//选择咖啡豆
		Beverage coffee = new CoffeeBean();
		//加摩卡
		coffee = new Mocha(coffee);
		//加牛奶
		coffee = new Milk(coffee);
		System.out.println(coffee.getDescription());
		System.out.println("一共需要支付："+coffee.cost());
				
	}
	
}
