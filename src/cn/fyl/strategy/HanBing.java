package cn.fyl.strategy;

import java.rmi.server.Skeleton;

public class HanBing implements Hero {

	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Skill2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Skill3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Skill4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SummonerSkill(SummonerSkill skill) {
		skill.Skill();
	}

}
