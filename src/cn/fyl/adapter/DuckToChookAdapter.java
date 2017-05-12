package cn.fyl.adapter;
/*
 * 适配器(Adpater):将待适配者转换为目标对象
 * 将转进来的鸭对象包装成鸡
 */
public class DuckToChookAdapter implements Chook {
	
	private Duck duck;
	
	public DuckToChookAdapter(Duck duck) {
		this.duck=duck;
	}

	@Override
	public void gege() {
		duck.gaga();
	}

	@Override
	public void fyl() {
		duck.fly();
	}

}
