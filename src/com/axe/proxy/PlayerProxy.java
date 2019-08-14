package com.axe.proxy;

/**
 * 靠代打游戏生存的游戏代打
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
