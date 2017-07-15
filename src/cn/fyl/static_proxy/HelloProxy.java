package cn.fyl.static_proxy;
/*
 * 静态代理类，代委托类实现其自身的方法
 */
public class HelloProxy implements Hello {
	
	private Hello hello;
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		if(hello == null){
				hello = new HelloImpl();
		}
	
		before();
		hello.say();
		after();
	}
	
	public void before(){
		System.out.println("Before");
	}
	
	public void after(){
		System.out.println("After");
	}

}
