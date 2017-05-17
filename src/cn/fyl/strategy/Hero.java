package cn.fyl.strategy;
/*
 * 规定英雄的共同特点
 */
public interface Hero {
	public void Skill1();
	public void Skill2();
	public void Skill3();
	public void Skill4();
	//多用组合，少用继承
	public void SummonerSkill(SummonerSkill Skill);
}
