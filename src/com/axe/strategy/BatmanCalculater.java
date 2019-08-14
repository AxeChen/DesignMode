package com.axe.strategy;

/**
 * Ğ¡±øÉÍ½ğ¼ÆËãÆ÷
 * @author 11373
 *
 */
public class BatmanCalculater implements GetMoney {

	@Override
	public int getMoney(int count) {
		return count * 30;
	}

}
