package com.axe.strategy;

/**
 * ´óÁúÉÍ½ğ¼ÆËãÆ÷
 * 
 * @author 11373
 *
 */
public class DragonCalculater implements GetMoney {

	@Override
	public int getMoney(int count) {
		return count * 500;
	}

}
