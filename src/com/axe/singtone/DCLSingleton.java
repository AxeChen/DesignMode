package com.axe.singtone;

/**
 * Created by Axe on 2017/8/29.
 * <p>
 * Double Check Lock (˫����ͬ��ģʽ)
 */

public class DCLSingleton {
    private static DCLSingleton singleton = null;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
