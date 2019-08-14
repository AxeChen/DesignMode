package com.axe.proxy;

/**
 * ����ģʽ
 * 
 * @author 11373
 *
 */
public class ProxyMain {

	public static void main(String[] args) {
		
		// ʵ��Ҫ����Ϸ����Ϸ���
		GamePlayer axeChen = new GamePlayer();
		
		// ��Ϸ����
		PlayerProxy gameProxy = new PlayerProxy();
		
		// ��Ϸ����֪��ҪΪ˭������Ϸ
		gameProxy.setIPlyer(axeChen);
		
		// ����ʼ��¼��Ϸ
		gameProxy.loginGame();
		// ����ʼ����Ϸ
		gameProxy.play();
		// ����Ӯ���˱���
		gameProxy.winGame();
	}
}
