package cn.fyl.adapter;
/*
 * 适配者(Adaptee)：需要适配器转换的对象
 */
public class YeDuck implements Duck {

	@Override
	public void gaga() {
		System.out.println("嘎嘎叫");
	}

	@Override
	public void fly() {
		System.out.println("鸭飞");
	}

}
