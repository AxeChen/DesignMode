package com.axe.proxy;

/**
 * 代理模式
 * 
 * @author 11373
 *
 */
public class ProxyMain {

	public static void main(String[] args) {
		
		// 实际要打游戏的游戏玩家
		GamePlayer axeChen = new GamePlayer();
		
		// 游戏代打
		PlayerProxy gameProxy = new PlayerProxy();
		
		// 游戏代打知道要为谁代打游戏
		gameProxy.setIPlyer(axeChen);
		
		// 代打开始登录游戏
		gameProxy.loginGame();
		// 代打开始打游戏
		gameProxy.play();
		// 代打赢得了比赛
		gameProxy.winGame();
	}
}
