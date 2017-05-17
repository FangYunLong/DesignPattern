package cn.fyl.composite;

import java.util.ArrayList;
import java.util.List;

/*
 * 容器构件(Composite):具体子公司部门，节点
 */
public class ConcreteCompany extends Company {
	//节点包含的信息
	private List<Company> cList;
	
	public ConcreteCompany() {
		cList = new ArrayList<Company>();
	}

	public ConcreteCompany(String name) {
		super(name);
		cList = new ArrayList<Company>();
	}

	@Override
	public void add(Company c) {
		cList.add(c);
	}

	@Override
	public void remove(Company c) {
		cList.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		
		System.out.println(new String(sb) + this.getName());
		
		for (Company c : cList) {
			c.display(depth + 2);
		}
	}

}
