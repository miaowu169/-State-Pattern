package com.game.LifeState.imple;

import com.game.LifeManager.LifeManager;
import com.game.LifeState.LifeState;

public class AttackedUnderPassiveState implements LifeState {
	public void beAttacked(int life, LifeManager lifeManager) {
		int newHeroHurt = lifeManager.getHeroHurt()/2;
		int newLife = lifeManager.getLife() - newHeroHurt;
		if(newLife>0) {
			System.out.println("Ӣ�����𼤷���������֮־�������˺�����");
			System.out.print("Ӣ���������ܵ�:"+newHeroHurt+"���˺�,");
			System.out.println("��ǰ������ֵΪ:"+newLife);
			lifeManager.setLife(newLife);
		}else {
			System.out.println("Ӣ��������������");
		}
	}
}
