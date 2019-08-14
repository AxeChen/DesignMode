package com.axe.builder.imageloader;

/**
 * 图片下载框架的配置
 * 
 * @author 11373
 *
 */
public class ImageLoaderConfig {

	/**
	 * 使用内存缓存
	 */
	public boolean useMemoryCache = false;

	/**
	 * 使用自定义的内存缓存
	 */
	public boolean useCustomMemoryCache = false;

	/**
	 * 使用磁盘缓存
	 */
	public boolean useDiskCache = false;

	/**
	 * 使用自定义的磁盘缓存
	 */
	public boolean useCustomDiskCache = false;

	/**
	 * 是否使用自定义的下载器
	 */
	public boolean useCustomDownLoader = false;

	/**
	 * 内存缓存
	 */
	public Cache memoryCache;

	/**
	 * 磁盘缓存
	 */
	public Cache diskCache;

	/**
	 * 下载器
	 */
	public DownLoader downLoader;

	/**
	 * 构造者
	 * 
	 * @author 11373
	 *
	 */
	public static class Builder {

		/**
		 * 内存缓存
		 */
		public Cache memoryCache;

		/**
		 * 磁盘缓存
		 */
		public Cache diskCache;

		/**
		 * 下载器
		 */
		public DownLoader downLoader;

		public boolean useMemoryCache = false;

		public boolean useDiskCache = false;

		public Builder setDownLoader(DownLoader downLoader) {
			this.downLoader = downLoader;
			return this;
		}

		public Builder setMemoryCache(Cache memoryCache) {
			this.memoryCache = memoryCache;
			return this;
		}

		public Builder setDiskCache(Cache diskCache) {
			this.diskCache = diskCache;
			return this;
		}

		public Builder userMemoryCache(boolean flag) {
			this.useMemoryCache = flag;
			return this;
		}

		public Builder useDiskCache(boolean flag) {
			this.useDiskCache = flag;
			return this;
		}

		public void applyConfig(ImageLoaderConfig config) {

			if (useMemoryCache) {
				config.useMemoryCache = true;
				if (memoryCache != null) {
					config.memoryCache = memoryCache;
				} else {
					// 如果外部没有传入自己的内存缓存策略，则使用默认的
					config.memoryCache = new MemoryCache();
				}
			}

			if (useDiskCache) {
				config.useDiskCache = true;
				if (diskCache != null) {
					config.diskCache = diskCache;
				} else {
					// 如果外部没有传入自己的内存缓存策略，则使用默认的
					config.diskCache = new DiskCache();
				}
			}

			if (downLoader != null) {
				config.downLoader = downLoader;
				config.useCustomDownLoader = true;
			} else {
				// 如果外部没有传入自己的内存缓存，则使用默认的
				config.downLoader = new DeFaultDownLoader();
			}
		}

		public ImageLoaderConfig create() {
			ImageLoaderConfig config = new ImageLoaderConfig();
			applyConfig(config);
			return config;
		}
	}

}
