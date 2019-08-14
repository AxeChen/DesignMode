package com.axe.proxy;

/**
 * 游戏玩家类，实际要赢得游戏的玩家
 * @author 11373
 *
 */
public class GamePlayer implements IPlay{

	@Override
	public void loginGame() {
		System.out.println("游戏玩家登录游戏");
	}

	@Override
	public void play() {
		System.out.println("游戏玩家开始打游戏");
	}

	@Override
	public void winGame() {
		System.out.println("游戏玩家赢得了比赛");
	}

}
