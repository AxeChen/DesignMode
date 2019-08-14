package com.axe.singtone;

/**
 * Created by Axe on 2017/8/29.
 * <p>
 * ����ģʽ - ����ģʽ
 *  ��򵥵ĵ���ģʽ�����е���ģʽ����������
 *  ȱ�㣺
 *  1���������ʱ�ͻ��ʼ����Ա���������ܻ��˷���Դ��
 *  2���ڶ��߳�����£�����ȫ���޷���֤����Ψһ��
 */

public class HungryModeSingleton {

    private static final HungryModeSingleton singleton = new HungryModeSingleton();

    private HungryModeSingleton() {
    }

    public static HungryModeSingleton getInstance() {
        return singleton;
    }
}


