package com.axe.oberver;

/**
 * 观察者实现类
 * @author 11373
 *
 */
public class GaLenObserverImpl implements Observer{

	@Override
	public void hit(String name) {
		System.out.println("我是盖伦，"+name+"复活了，快打他");
	}

}
