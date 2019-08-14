package com.axe.strategy;

/**
 * 赏金类
 * 
 * @author 11373
 *
 */
public class Bounty {

	/**
	 * 小兵
	 */
	public static final int TYPE_BATMAM = 0;

	/**
	 * 英雄
	 */
	public static final int TYPE_HERO = 1;

	/**
	 * 野怪
	 */
	public static final int TYPE_MONSTER = 2;

	/**
	 * 大龙
	 */
	public static final int TYPE_DRAGON = 3;

	/**
	 * 获取赏金的方法
	 * 
	 * @param type  类型
	 * @param count 数量
	 * @return
	 */
	public int killGetMoney(int type, int count) {
		int sum = 0;
		if (type == TYPE_BATMAM) {
			sum += getBatmanMoney(count);
		} else if (type == TYPE_HERO) {
			sum += getHeroMoney(count);
		} else if (type == TYPE_MONSTER) {
			sum += getMonsterMoney(count);
		} else if (type == TYPE_DRAGON) {
			sum += getDragonMoney(count);
		}
		return sum;
	}

	/**
	 * 获取小兵的钱
	 * 
	 * @param count
	 * @return
	 */
	private int getBatmanMoney(int count) {
		return count * 30;
	}

	/**
	 * 获取英雄的钱
	 * 
	 * @param count
	 * @return
	 */
	private int getHeroMoney(int count) {
		return count * 300;
	}

	/**
	 * 获取野怪的钱
	 * 
	 * @param count
	 * @return
	 */
	private int getMonsterMoney(int count) {
		return count * 50;
	}
	
	/**
	 * 获取大龙的钱
	 * @param count
	 * @return
	 */
	private int getDragonMoney(int count) {
		return count * 500;
	}

}
