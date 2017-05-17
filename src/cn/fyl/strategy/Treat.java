package cn.fyl.strategy;
/*
 * 具体实现类：治疗
 */
public class Treat implements SummonerSkill {

	@Override
	public void Skill() {
		System.out.println("为你的英雄和附近友军回复生命值！");
	}

}
