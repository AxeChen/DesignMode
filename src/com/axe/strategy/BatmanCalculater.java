package com.axe.strategy;

/**
 * С���ͽ������
 * @author 11373
 *
 */
public class BatmanCalculater implements GetMoney {

	@Override
	public int getMoney(int count) {
		return count * 30;
	}

}
