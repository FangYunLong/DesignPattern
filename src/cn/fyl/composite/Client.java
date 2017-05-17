package cn.fyl.composite;

public class Client {
	
	public static void main(String[] args) {
		Company root =  new ConcreteCompany();
		root.setName("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		Company guangzhou = new ConcreteCompany("广州分公司");
		guangzhou.add(new HRDepartment("广州分公司人力资源部"));
		guangzhou.add(new FinanceDepartment("广州分公司财务部"));
		Company tianhe = new ConcreteCompany("天河办事处");
		tianhe.add(new HRDepartment("天河办事处人力资源部"));
		tianhe.add(new FinanceDepartment("天河办事处财务部"));
		root.add(guangzhou);
		guangzhou.add(tianhe);
		root.display(0);
	}
	
}
