package com.game.LifeManager;

import com.game.LifeState.LifeState;
import com.game.LifeState.imple.AttackedUnderPassiveState;
import com.game.LifeState.imple.DieState;
import com.game.LifeState.imple.NormalBeAttackedState;

public class LifeManager {
	private LifeState state = null;
	private int life = 1000;
	
	public int heroHurt = 0;
	
	public LifeManager(int heroHurt) {
		this.heroHurt = heroHurt;
	}

	public LifeState getState() {
		return state;
	}

	public void setState(LifeState state) {
		this.state = state;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getHeroHurt() {
		return heroHurt;
	}

	public void setHeroHurt(int heroHurt) {
		this.heroHurt = heroHurt;
	}
	
	public void beAttacked() {
		if(life > 500) {
			state = new NormalBeAttackedState();
		}else if(life > 0 && life <= 500) {
			state = new AttackedUnderPassiveState();
		}else if(life <= 0) {
			state = DieState.getInstance();
		}
		state.beAttacked(life, this);
	}
}
