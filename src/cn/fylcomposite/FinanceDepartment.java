package cn.fylcomposite;
/*
 * 具体部门：财政部门，叶子节点
 */
public class FinanceDepartment extends Company {

	public FinanceDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public FinanceDepartment(String name){
		super(name);
	}
	
	//叶子不能添加节点
	@Override
	public void add(Company c) {
		
	}

	@Override
	public void remove(Company c) {
		
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		
		System.out.println(new String(sb) + this.getName());
		
	}

}
