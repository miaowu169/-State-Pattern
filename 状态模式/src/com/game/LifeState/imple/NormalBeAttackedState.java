package com.game.LifeState.imple;

import com.game.LifeManager.LifeManager;
import com.game.LifeState.LifeState;

public class NormalBeAttackedState implements LifeState{
	public void beAttacked(int life, LifeManager lifeManager) {
		int newLife = lifeManager.getLife() - lifeManager.getHeroHurt();
		System.out.print("英雄项羽正受到" + lifeManager.getHeroHurt()+"点伤害,");
		System.out.println("当前生命值为:"+newLife);
		lifeManager.setLife(newLife);
	}
	
}
