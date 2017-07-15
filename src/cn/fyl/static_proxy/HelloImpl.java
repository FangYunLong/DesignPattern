package cn.fyl.static_proxy;
/*
 * 委托类，将自身方法请求代理类实现
 */
public class HelloImpl implements Hello {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Hello Static_Proxy!");
	}

}
