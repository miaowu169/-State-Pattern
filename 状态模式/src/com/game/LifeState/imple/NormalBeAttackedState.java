package com.game.LifeState.imple;

import com.game.LifeManager.LifeManager;
import com.game.LifeState.LifeState;

public class NormalBeAttackedState implements LifeState{
	public void beAttacked(int life, LifeManager lifeManager) {
		int newLife = lifeManager.getLife() - lifeManager.getHeroHurt();
		System.out.print("Ӣ���������ܵ�" + lifeManager.getHeroHurt()+"���˺�,");
		System.out.println("��ǰ����ֵΪ:"+newLife);
		lifeManager.setLife(newLife);
	}
	
}
