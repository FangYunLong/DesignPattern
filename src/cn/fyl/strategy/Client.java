package cn.fyl.strategy;

public class Client {

	public static void main(String[] args) {
		//选择并创建需要的策略对象
		SummonerSkill myTreat = new Treat();
		SummonerSkill myTransfer = new Transfer();
		//创建环境
		Hero hanbing = new HanBing();
		Hero gailun = new GaiLun();
		//使用策略
		System.out.println("为盖伦选择召唤师技能：");
		gailun.SummonerSkill(myTransfer);
		System.out.println("为寒冰选择召唤师技能：");
		hanbing.SummonerSkill(myTreat);
	}
	
}
