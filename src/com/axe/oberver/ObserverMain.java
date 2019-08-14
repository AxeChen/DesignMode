package com.axe.oberver;

public class ObserverMain {
	public static void main(String[] args) {
		Observer aich = new AichObserverlmpl();
		Observer galen = new GaLenObserverImpl();
		Obserable yi = new YiObserableImpl();
		yi.addObserver(aich);
		yi.addObserver(galen);
		yi.resurgence("Ò×´óÊ¦");
	}
}
