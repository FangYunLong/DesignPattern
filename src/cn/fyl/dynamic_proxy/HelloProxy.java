package cn.fyl.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 动态代理类，由于静态代理类，一个代理类只能为一个接口服务，扩展时会产生过多代理类
 * 动态代理就是一个代理类完成所有的代理
 */
public class HelloProxy implements InvocationHandler {

	//委托者
	private Object consignor;
	
	//绑定委托者，并返回一个代理对象
	public Object bind(Object consignor){
		
		this.consignor = consignor;
		return Proxy.newProxyInstance(consignor.getClass().getClassLoader(), consignor.getClass().getInterfaces(), this);
		/*
         *Proxy.newProxyInstance(loader, interfaces, h)
         *loader:类加载器
         *interfaces:委托类的接口，这也是JDK代理的缺点--委托类一定要实现一个接口
         *h:InvocationHandler接口的实现类
         */
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		before();
		method.invoke(consignor, args);
		after();

		return null;
	}
	
	public void before(){
		System.out.println("Before");
	}
	
	public void after(){
		System.out.println("After");
	}


}
