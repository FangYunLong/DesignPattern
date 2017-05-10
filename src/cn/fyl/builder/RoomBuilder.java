package cn.fyl.builder;

/*
 * 具体工人，按既有方法建造房子
 */
public class RoomBuilder implements Builder {
	
	private Room room = new Room();
	
	@Override
	public void makeWindow() {
		room.setWindow("window");
	}

	@Override
	public void makeFloor() {
		room.setFloor("floor");
	}

	@Override
	public Room submitRoom() {
		return room;
	}

}
