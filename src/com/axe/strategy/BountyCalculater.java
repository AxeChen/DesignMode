package com.axe.strategy;

/**
 * �ͽ������
 * 
 * @author 11373
 *
 */
public class BountyCalculater {
	private GetMoney getMoney;

	public int getBountyMoney(int count) {
		return getMoney.getMoney(count);
	}

	public void setGetMoney(GetMoney getMoney) {
		this.getMoney = getMoney;
	}
}
