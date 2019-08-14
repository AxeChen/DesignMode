package com.axe.oberver;

/**
 * 艾希观察者
 * @author 11373
 *
 */
public class AichObserverlmpl implements Observer{

	@Override
	public void hit(String name) {
		System.out.println("我是艾希，"+name+"复活了，快打他");
	}

}
