package cn.fyl.cglib_proxy;

public class TestCGlibProxy {

	public static void main(String[] args) {
		//通过生成子类创建代理类
		Hello helloproxy = CGlibProxy.getInstance().getProxy(Hello.class);
		helloproxy.say();
	}
	
}
