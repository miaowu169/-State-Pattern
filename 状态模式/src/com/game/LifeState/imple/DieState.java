package com.game.LifeState.imple;

import com.game.LifeManager.LifeManager;
import com.game.LifeState.LifeState;

public class DieState implements LifeState {
	private static DieState UniqueInstance = null;
	private DieState() {}
	public static DieState getInstance() {
			synchronized (DieState.class) {
			UniqueInstance = new DieState();
		}
		return UniqueInstance;
	}
	
	public void beAttacked(int life, LifeManager lifeManager) {
		System.out.println("Ó¢ĞÛÏîÓğÒÑËÀÍö!");
	}
}
