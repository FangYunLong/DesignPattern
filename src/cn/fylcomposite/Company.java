package cn.fylcomposite;
/*
 * 抽象构件(Component):为所有子类声明行为，
 * 客户端只调用该抽象类的方法，
 * 不用关心具体操作的是节点还是叶子节点。
 */
public abstract class Company {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//增加
	public abstract void add(Company c);
	//移除
	public abstract void remove(Company c);
	//显示
	public abstract void display(int depth);
	
	public Company() {
		
	}
	
	public Company(String name) {
		this.name = name;
	}
	
}
