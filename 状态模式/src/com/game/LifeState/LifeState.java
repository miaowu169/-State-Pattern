package com.game.LifeState;

import com.game.LifeManager.LifeManager;
/*
 * 英雄项羽的游戏状态接口
 * @param life 当前生命值
 * @parm lifeManager 状态上下文，用来在实现状态相应的功能处理的时候，可以回调上下文中的数据
 */

public interface LifeState {
	//英雄项羽被攻击的状态
	void beAttacked(int life,LifeManager lifeManager);
}
