package com.axe.strategy;

/**
 * Ó¢ĞÛÉÍ½ğ¼ÆËãÆ÷
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
