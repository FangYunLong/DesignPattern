package cn.fyl.strategy;
/*
 * 具体实现类：传送
 */
public class Transfer implements SummonerSkill {

	@Override
	public void Skill() {
		System.out.println("将英雄传送到你所指定的位置！");
	}

}
