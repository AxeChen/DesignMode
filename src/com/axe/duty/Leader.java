package com.axe.duty;

/**
 * 领导类
 * 
 * @author 11373
 *
 */
public abstract class Leader {

	/**
	 * 下一个执行者
	 */
	public Leader nextHanlder;

	/**
	 * 自身能够处理的最少金额
	 * 
	 * @return
	 */
	public abstract int limit();

	/**
	 * 报销金额的方法
	 * 
	 * @param money
	 */
	public abstract void handle(int money);

	/**
	 * 控制责任链的条件
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
