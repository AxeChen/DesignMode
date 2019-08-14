package com.axe.singtone;

/**
 * Created by Axe on 2017/8/29. 
 * 1������ģʽֻ�е��õ�ʱ��ų�ʼ������ʡ�˿�֧��
 * 2������ģʽ��֤���̰߳�ȫ
 * ȱ�㣺
 * ÿ�γ�ʼ�������ͬ���������Ĳ���Ҫ����Դ
 */

public class LazyModeSingleton {

    private static LazyModeSingleton singleton;

    private LazyModeSingleton() {
    }

    public static synchronized LazyModeSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyModeSingleton();
        }
        return singleton;
    }

}
