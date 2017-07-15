package cn.fyl.dynamic_proxy;

public class TestDynamicProxy {

	public static void main(String[] args) {
		
		HelloProxy proxy =  new HelloProxy();
		Hello  helloProxy = (Hello)proxy.bind(new HelloImpl());
		helloProxy.say();

	}
	
}
