package com.axe.oberver;

import java.util.ArrayList;
import java.util.List;

/**
 * 易大师，被观察者
 * 
 * @author 11373
 *
 */
public class YiObserableImpl implements Obserable {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	@Override
	public void resurgence(String name) {
		for (Observer observer : observers) {
			observer.hit(name);
		}
	}

}
