package com.axe.duty;

/**
 * ������ģʽ
 * 
 * @author 11373
 *
 */
public class DutyMain {

	public static void main(String[] args) {
		CEO ceo = new CEO();
		CTO cto = new CTO();
		Manager manager = new Manager();
		manager.nextHanlder = cto;
		cto.nextHanlder = ceo;
		manager.handleRequest(5000);
	}
}
