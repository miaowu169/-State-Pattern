package com.game.test;

import com.game.LifeManager.LifeManager;

public class LifeManagerTest {
	public static void main(String[] args) {
		LifeManager lm = new LifeManager(126);
		for(int i=0;i<15;i++) {
			lm.beAttacked();
		}
	}
}
