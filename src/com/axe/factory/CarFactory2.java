package com.axe.factory;

public class CarFactory2 {
	public static <T extends Car> T createCar(Class<T> clz) {
		Car car = null;
		try {
			car = (Car) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return (T) car;
	}
}
