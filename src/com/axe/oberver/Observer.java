package com.axe.oberver;

/**
 * 观察者
 * @author 11373
 *
 */
public interface Observer {
	/**
	 * 每一个观察者都有一个攻击的方法
	 * @param name
	 */
	public void hit(String name);
}
