package com.axe.singtone;

/**
 * Created by Axe on 2017/8/29.
 * <p>
 * ��̬�ڲ��൥��ģʽ
 */

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

}
