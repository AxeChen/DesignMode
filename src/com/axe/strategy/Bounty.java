package com.axe.strategy;

/**
 * �ͽ���
 * 
 * @author 11373
 *
 */
public class Bounty {

	/**
	 * С��
	 */
	public static final int TYPE_BATMAM = 0;

	/**
	 * Ӣ��
	 */
	public static final int TYPE_HERO = 1;

	/**
	 * Ұ��
	 */
	public static final int TYPE_MONSTER = 2;

	/**
	 * ����
	 */
	public static final int TYPE_DRAGON = 3;

	/**
	 * ��ȡ�ͽ�ķ���
	 * 
	 * @param type  ����
	 * @param count ����
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
	 * ��ȡС����Ǯ
	 * 
	 * @param count
	 * @return
	 */
	private int getBatmanMoney(int count) {
		return count * 30;
	}

	/**
	 * ��ȡӢ�۵�Ǯ
	 * 
	 * @param count
	 * @return
	 */
	private int getHeroMoney(int count) {
		return count * 300;
	}

	/**
	 * ��ȡҰ�ֵ�Ǯ
	 * 
	 * @param count
	 * @return
	 */
	private int getMonsterMoney(int count) {
		return count * 50;
	}
	
	/**
	 * ��ȡ������Ǯ
	 * @param count
	 * @return
	 */
	private int getDragonMoney(int count) {
		return count * 500;
	}

}
