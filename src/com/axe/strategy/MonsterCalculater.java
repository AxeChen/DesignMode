package com.axe.strategy;

/**
 * Ò°¹ÖÉÍ½ğ¼ÆËãÆ÷
 * @author 11373
 *
 */
public class MonsterCalculater implements GetMoney {

	@Override
	public int getMoney(int count) {
		return count * 50;
	}

}
