package cn.fyl.builder;

/*
 * 房子类
 * 房子有什么需要工人建造
 * 其属性
 */
public class Room {
	
	private String window;
	private String floor;
	public String getWindow() {
		return window;
	}
	public void setWindow(String window) {
		this.window = window;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	@Override
	public String toString(){
		return "--->floor:"+floor+"   window:"+window;
		
	}
	
}
