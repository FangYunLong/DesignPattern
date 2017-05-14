package cn.fylcomposite;
/*
 * 具体部门：人力资源部门，叶子节点
 */
public class HRDepartment  extends Company {

	public HRDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public HRDepartment(String name){
		super(name);
	}
	
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		
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
