package com.axe.builder.imageloader;

/**
 * ͼƬ������
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

	// ��ʼ��
	public void init(ImageLoaderConfig config) {
		this.config = config;
	}

	public void displayImage(String url, ImageView image) {
		Bitmap bitmap = null;
		// ����������ڴ滺�棬��ʹ���ڴ滺�档
		if (bitmap == null && config.useMemoryCache) {
			bitmap = config.memoryCache.getBitmap(url);
		}
		// �����˴��̻��棬����ʹ�ô��̻��档
		if (bitmap == null && config.useDiskCache) {
			bitmap = config.diskCache.getBitmap(url);
		}
		// ����ڴ�ʹ��̶��Ҳ���ͼƬ���Ǿ�ȥ����
		if (bitmap == null) {
			config.downLoader.downloadImage(url);
		}
		image.setBitmap(bitmap);
	}
}
