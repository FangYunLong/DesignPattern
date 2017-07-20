package cn.fyl.cglib_proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/*
 * CGlib代理可以代理没有接口的，使用字节码技术为一个类创建子类，
 * 并在子类中采用方法拦截的技术拦截所有父类方法的调用。
 * CGlib代理比JDK自带代理性能高，创建对象时间比JDK长，适用单例对象，
 * 无需频繁创建对象，CGlib代理适合，反之，JDK适合代理
 */
public class CGlibProxy implements MethodInterceptor {
	
	private static CGlibProxy instance = new CGlibProxy();
	
	private CGlibProxy() {
		
	}
	
	public static CGlibProxy getInstance(){
		return instance;
	}
	
	public <T> T getProxy(Class<T> cls){
		//通过字节码技术动态生成子类实例
		return (T)Enhancer.create(cls, this);
	}
	
	@Override
	//拦截目标类的所有方法调用
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		/*
		 * objcet：目标类实例
		 * method：目标类方法反射的对象
		 * agrs：方法的动态传参
		 * proxy：代理类的实例
		 */
		before();
		//通过代理类调用父类的方法
		proxy.invokeSuper(object, args);
		after();
		return null;
	}

	public void before(){
		System.out.println("before proxy!");
	}
	
	public void after(){
		System.out.println("after proxy!");
	}
	
}
