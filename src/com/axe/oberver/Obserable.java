package com.axe.oberver;

/**
 * ���۲���
 * 
 * @author 11373
 *
 */
public interface Obserable {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);

	public void resurgence(String name);
}
