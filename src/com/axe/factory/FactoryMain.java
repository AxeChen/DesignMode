package com.axe.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory benziFactory = new BenziFactory();
		benziFactory.createCar().drive();
		
		Factory bwmFactory = new BWMCarFactory();
		bwmFactory.createCar().drive();
		
		Factory2 factory2 = new CarFactory();
		factory2.createCar("benzi").drive();
		factory2.createCar("bwm").drive();
		
		CarFactory2 factory3 = new CarFactory2();
		factory3.createCar(BenziCar.class).drive();
		factory3.createCar(BWMCar.class).drive();
				
		
		System.out.println("创建宝马车");
		Factory3 bwFactory = new BWMCarsFactory();
		bwFactory.createEngine().getEngine();
		bwFactory.createWheel().getWheel();
	
		
		System.out.println("创建奔驰车");
		Factory3 bzFactory = new BenziCarFactory();
		bzFactory.createEngine().getEngine();
		bzFactory.createWheel().getWheel();
	}
}
