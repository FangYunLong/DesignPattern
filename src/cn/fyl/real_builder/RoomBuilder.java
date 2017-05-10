package cn.fyl.real_builder;

/*
 * 开发中使用的建造者模式，无抽象建造者，无设计师
 */
public class RoomBuilder{
	
	private RoomParms parms= new RoomParms();
	
	public RoomBuilder(){
//		this.parms = new RoomParms();
	}
	
	public RoomBuilder makeWindow(String window) {
		parms.window = window;
		return this;
	}

	public RoomBuilder makeFloor(String floor) {
		parms.floor = floor;
		return this;
	}

	public Room build() {
		Room room = new Room();
		room.apply(parms);
		return room;
	}


class RoomParms{
	public String window;
	public String floor;
}

}