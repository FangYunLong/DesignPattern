package cn.fyl.builder;

/*
 * 建造者角色
 * 工人接口，定义工人需要进行的工作
 * 不负责具体的建造工作
 * 最后提交货
 */
public interface Builder {
	
	public void makeWindow();
	
	public void makeFloor();
	
	public Room  submitRoom();
	
}
