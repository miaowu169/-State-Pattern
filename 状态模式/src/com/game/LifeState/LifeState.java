package com.game.LifeState;

import com.game.LifeManager.LifeManager;
/*
 * Ӣ���������Ϸ״̬�ӿ�
 * @param life ��ǰ����ֵ
 * @parm lifeManager ״̬�����ģ�������ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ�򣬿��Իص��������е�����
 */

public interface LifeState {
	//Ӣ�����𱻹�����״̬
	void beAttacked(int life,LifeManager lifeManager);
}
