package com.axe.prototype;

import java.util.ArrayList;

/**
 * ԭ��ģʽ
 * @author 11373
 *
 */
public class PrototypeMain {

	public static void main(String[] args) {
		WordDocument doc = new WordDocument();
		ArrayList<String> images = new ArrayList();
		images.add("ͼƬһ");
		images.add("ͼƬ��");
		images.add("ͼƬ��");
		doc.setInts(images);
		doc.setmText("��������");
		doc.showDocment();
		
		// ͨ���������ɵڶ�������
		WordDocument doc2 = (WordDocument) doc.clone();
		doc2.setmText("���ǵڶ�ƪ����");
		doc2.showDocment();
	}
}
