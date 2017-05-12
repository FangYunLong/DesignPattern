package cn.fyl.adapter;
/*
 * 客户端(Client):客户端只看到目标接口
 */
public class TestAdapter {

	public static void main(String[] args) {
		
		Duck duck = new YeDuck();
		Chook duckToChook = new DuckToChookAdapter(duck);
		System.out.println("客户端调用的是目标接口的方法："+"\n"+"duckToChook.gege()"+"\n"+"duckToChook.fyl()");
		duckToChook.gege();
		duckToChook.fyl();
		System.out.println("实际使用的还是不兼容接口的方法!");
		
		
	}
	
}
