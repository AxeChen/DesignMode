package com.axe.builder;

import com.axe.builder.imageloader.ImageLoader;
import com.axe.builder.imageloader.ImageLoaderConfig;
import com.axe.builder.imageloader.ImageLoaderConfig.Builder;

public class BuilderMain {

	public static void main(String[] args) {
		ImageLoaderConfig config = new Builder()
				.setDiskCache(new AxeDiskCache())
				.setMemoryCache(new AxeMemoryCache())
				.useDiskCache(true)
				.userMemoryCache(true)
				.setDownLoader(new AxeImageLoader())
				.create();
		ImageLoader loader = ImageLoader.getInstance();
		loader.init(config);
		// สนำร
		loader.displayImage("", null);
	}
}
