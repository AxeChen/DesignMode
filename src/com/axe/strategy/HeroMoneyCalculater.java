package com.axe.strategy;

/**
 * Ӣ���ͽ������
 * 
 * @author 11373
 *
 */
public class HeroMoneyCalculater implements GetMoney {

	@Override
	public int getMoney(int count) {
		return count * 300;
	}

}
