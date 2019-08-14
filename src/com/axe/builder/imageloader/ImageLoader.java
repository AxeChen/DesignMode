package com.axe.builder.imageloader;

/**
 * 图片下载器
 * 
 * @author 11373
 *
 */
public class ImageLoader {

	private ImageLoaderConfig config;

	private static ImageLoader imageLoader;

	private ImageLoader() {
	}

	public static ImageLoader getInstance() {
		if (imageLoader == null) {
			synchronized (ImageLoader.class) {
				if (imageLoader == null) {
					imageLoader = new ImageLoader();
				}
			}
		}
		return imageLoader;
	}

	// 初始化
	public void init(ImageLoaderConfig config) {
		this.config = config;
	}

	public void displayImage(String url, ImageView image) {
		Bitmap bitmap = null;
		// 如果设置了内存缓存，就使用内存缓存。
		if (bitmap == null && config.useMemoryCache) {
			bitmap = config.memoryCache.getBitmap(url);
		}
		// 设置了磁盘缓存，就是使用磁盘缓存。
		if (bitmap == null && config.useDiskCache) {
			bitmap = config.diskCache.getBitmap(url);
		}
		// 如果内存和磁盘都找不到图片，那就去下载
		if (bitmap == null) {
			config.downLoader.downloadImage(url);
		}
		image.setBitmap(bitmap);
	}
}
