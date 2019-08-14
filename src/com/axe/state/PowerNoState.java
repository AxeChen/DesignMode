package com.axe.state;

public class PowerNoState implements IComputerActivity{

	@Override
	public void playGame() {
		System.out.println("正在打英雄联盟");
	}

	@Override
	public void watchMovie() {
		System.out.println("正在看火影忍者");
		
	}

}
