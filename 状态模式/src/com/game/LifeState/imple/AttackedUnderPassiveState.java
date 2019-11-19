package com.game.LifeState.imple;

import com.game.LifeManager.LifeManager;
import com.game.LifeState.LifeState;

public class AttackedUnderPassiveState implements LifeState {
	public void beAttacked(int life, LifeManager lifeManager) {
		int newHeroHurt = lifeManager.getHeroHurt()/2;
		int newLife = lifeManager.getLife() - newHeroHurt;
		if(newLife>0) {
			System.out.println("英雄项羽激发被动陷阵之志，所受伤害减半");
			System.out.print("英雄项羽正受到:"+newHeroHurt+"点伤害,");
			System.out.println("当前的生命值为:"+newLife);
			lifeManager.setLife(newLife);
		}else {
			System.out.println("英雄项羽已死亡！");
		}
	}
}
