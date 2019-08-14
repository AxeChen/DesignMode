package com.axe.proxy;

/**
 * ��������Ϸ�������Ϸ����
 * 
 * @author 11373
 *
 */
public class PlayerProxy implements IPlay {

	private IPlay player;

	public void setIPlyer(IPlay player) {
		this.player = player;
	}

	@Override
	public void loginGame() {
		player.loginGame();
	}

	@Override
	public void play() {
		player.play();
	}

	@Override
	public void winGame() {
		player.winGame();
	}

}
