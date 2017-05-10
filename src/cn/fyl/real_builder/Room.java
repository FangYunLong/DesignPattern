package cn.fyl.real_builder;

/*
 * 房子类
 * 房子有什么需要工人建造
 * 其属性
 */
public class Room {
	
	private String window;
	private String floor;
	
	@Override
	public String toString(){
		return "--->floor:"+floor+"   window:"+window;
	}
	
	public void apply(RoomBuilder.RoomParms parms){
		floor = parms.floor;
		window = parms.window;
	}
	
}
