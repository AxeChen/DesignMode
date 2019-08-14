package com.axe.builder.imageloader;

/**
 * ImageLoader 的下载器
 * 开发者可以通过自己的需求去继承它下载
 * @author 11373
 *
 */
public interface DownLoader {
	public void downloadImage(String url);
}
