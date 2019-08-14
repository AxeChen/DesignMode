package com.axe.prototype;

import java.util.ArrayList;

/**
 * 原型模式
 * @author 11373
 *
 */
public class PrototypeMain {

	public static void main(String[] args) {
		WordDocument doc = new WordDocument();
		ArrayList<String> images = new ArrayList();
		images.add("图片一");
		images.add("图片二");
		images.add("图片三");
		doc.setInts(images);
		doc.setmText("这是文字");
		doc.showDocment();
		
		// 通过拷贝生成第二个对象
		WordDocument doc2 = (WordDocument) doc.clone();
		doc2.setmText("这是第二篇文字");
		doc2.showDocment();
	}
}
