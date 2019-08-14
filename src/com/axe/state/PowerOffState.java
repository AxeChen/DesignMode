package com.axe.state;

/**
 * 状态模式 ：当电脑电源关闭之后的操作
 * @author 11373
 *
 */
public class PowerOffState implements IComputerActivity{

	@Override
	public void playGame() {
		System.out.println("请开机玩游戏");
	}

	@Override
	public void watchMovie() {
		System.out.println("请开机看电影");
	}

}
