package com.axe.strategy;

/**
 * Ұ���ͽ������
 * @author 11373
 *
 */
public class MonsterCalculater implements GetMoney {

	@Override
	public int getMoney(int count) {
		return count * 50;
	}

}
