package com.axe.prototype;

import java.util.ArrayList;

/**
 * Word文档  原型模式
 * 
 * @author 11373
 *
 */
public class WordDocument implements Cloneable {

	private String mText;
	private ArrayList<String> images = new ArrayList();

	@Override
	protected Object clone() {
		try {
			WordDocument doc = (WordDocument) super.clone();
			doc.mText = this.mText;
			doc.images = this.images;
			// 如何使用深拷贝  
//			doc.images = (ArrayList<String>) this.images.clone();
			return doc;
		} catch (Exception e) {

		}
		return null;
	}

	public String getmText() {
		return mText;
	}

	public void setmText(String mText) {
		this.mText = mText;
	}

	public ArrayList<String> getInts() {
		return images;
	}

	public void setInts(ArrayList<String> ints) {
		this.images = ints;
	}

	public void showDocment() {
		System.out.println("打印文档中");
		System.out.println(mText);
		for (String it : images) {
			System.out.println(it);
		}
		System.out.println("文档打印完毕");
	}
}
