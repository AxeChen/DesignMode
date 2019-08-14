package com.axe.duty;

/**
 * �쵼��
 * 
 * @author 11373
 *
 */
public abstract class Leader {

	/**
	 * ��һ��ִ����
	 */
	public Leader nextHanlder;

	/**
	 * �����ܹ���������ٽ��
	 * 
	 * @return
	 */
	public abstract int limit();

	/**
	 * �������ķ���
	 * 
	 * @param money
	 */
	public abstract void handle(int money);

	/**
	 * ����������������
	 * 
	 * @param money
	 */
	public final void handleRequest(int money) {
		if (money <= limit()) {
			handle(money);
		} else {
			nextHanlder.handleRequest(money);
		}
	}
}
