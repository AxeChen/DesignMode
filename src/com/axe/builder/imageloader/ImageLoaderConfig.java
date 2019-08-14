package com.axe.builder.imageloader;

/**
 * ͼƬ���ؿ�ܵ�����
 * 
 * @author 11373
 *
 */
public class ImageLoaderConfig {

	/**
	 * ʹ���ڴ滺��
	 */
	public boolean useMemoryCache = false;

	/**
	 * ʹ���Զ�����ڴ滺��
	 */
	public boolean useCustomMemoryCache = false;

	/**
	 * ʹ�ô��̻���
	 */
	public boolean useDiskCache = false;

	/**
	 * ʹ���Զ���Ĵ��̻���
	 */
	public boolean useCustomDiskCache = false;

	/**
	 * �Ƿ�ʹ���Զ����������
	 */
	public boolean useCustomDownLoader = false;

	/**
	 * �ڴ滺��
	 */
	public Cache memoryCache;

	/**
	 * ���̻���
	 */
	public Cache diskCache;

	/**
	 * ������
	 */
	public DownLoader downLoader;

	/**
	 * ������
	 * 
	 * @author 11373
	 *
	 */
	public static class Builder {

		/**
		 * �ڴ滺��
		 */
		public Cache memoryCache;

		/**
		 * ���̻���
		 */
		public Cache diskCache;

		/**
		 * ������
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
					// ����ⲿû�д����Լ����ڴ滺����ԣ���ʹ��Ĭ�ϵ�
					config.memoryCache = new MemoryCache();
				}
			}

			if (useDiskCache) {
				config.useDiskCache = true;
				if (diskCache != null) {
					config.diskCache = diskCache;
				} else {
					// ����ⲿû�д����Լ����ڴ滺����ԣ���ʹ��Ĭ�ϵ�
					config.diskCache = new DiskCache();
				}
			}

			if (downLoader != null) {
				config.downLoader = downLoader;
				config.useCustomDownLoader = true;
			} else {
				// ����ⲿû�д����Լ����ڴ滺�棬��ʹ��Ĭ�ϵ�
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
