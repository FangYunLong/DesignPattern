package cn.fyl.static_proxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		
		Hello proxy = new HelloProxy();
		proxy.say();
		
	}
	
}
