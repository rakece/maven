package com.kirusa.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class AppConfig implements EnvironmentAware {

    private static Environment environment;
    
//    static private  Environment tempenv;
    
    private static String dateFormat = null;
    private static String profileImageBaseURL = null;
    private static String profileThumbNailImageBaseURL = null;
    private static int profileImageResizeWidth = RCSConstant.UNINITIALIZED_INT;
    private static int profileImageResizeHeight = RCSConstant.UNINITIALIZED_INT;
	private static int profileThumbnailResizeWidth = RCSConstant.UNINITIALIZED_INT;
	private static int profileThumbnailResizeHeight = RCSConstant.UNINITIALIZED_INT;
	private static int imageMsgThumbnailResizeWidth = RCSConstant.UNINITIALIZED_INT;
	private static int imageMsgThumbnailResizeHeight = RCSConstant.UNINITIALIZED_INT;
	private static String profileDefaultPic = null;
	private static String profileDefaultThumbnailPic = null;
	private static String profileDefaultMcThumbnailPic = null;
	private static int readTimeout = RCSConstant.UNINITIALIZED_INT;
	private static int connectionTimeout = RCSConstant.UNINITIALIZED_INT;
	private static Integer maxImageVoboloBlogSize = null;
	private static int maxMemorySize = RCSConstant.UNINITIALIZED_INT;
	private static String blogDateFormat = null;
	private static String storePath = null;
	private static String videoPath = null;
	private static String botLogoImagePath = null;
	private static String botScreenImagePath = null;
	private static String botDirectoryImagePath = null;
	private static String botDirectoryBaseUrl = null;
	private static String botScreenVideoPath = null;
	private static String tempDirPath = null;
	
	/*
	 * @PostConstruct void init() { tempenv=env; }
	 */
	
	public static Environment getEnvironment() 
	{
		return environment;
	}
    
    public static String getValue(String key) {

		return getEnvironment().getProperty(key);
	}
	
	public static String getDateFormat() {
		if (dateFormat == null) {
			dateFormat = getValue("date.format");
		}
		return dateFormat;
	}
	public static String getProfileImageBaseURL() {
		if (profileImageBaseURL == null)
			profileImageBaseURL = getValue("profile.image.base.url");
		return profileImageBaseURL;
	}
	public static String getRcsUserProfileImageURL(String folderName) {
		if (folderName == null) {
			return profileImageBaseURL;
		} else {
			return profileImageBaseURL + folderName;
		}
	}
	public static String getProfileImageThumbnailBaseURL() {
		if (profileThumbNailImageBaseURL == null)
			profileThumbNailImageBaseURL = getValue("profile.image.thumbnail.base.url");
		return profileThumbNailImageBaseURL;
	}
	public static String getRcsProfileImageThumbnailURL(String folderName) {
		if (folderName == null) {
			return profileThumbNailImageBaseURL;
		} else {
			return profileThumbNailImageBaseURL + folderName;
		}
	}
	public static int getProfileImageResizeWidth() {
		if (profileImageResizeWidth == RCSConstant.UNINITIALIZED_INT) {
			profileImageResizeWidth = getIntValue("profile.image.resize.width");
		}
		return profileImageResizeWidth;
	}

	public static int getProfileImageResizeHeight() {
		if (profileImageResizeHeight == RCSConstant.UNINITIALIZED_INT) {
			profileImageResizeHeight = getIntValue("profile.image.resize.height");
		}
		return profileImageResizeHeight;
	}

	public static int getProfileThumbnailResizeWidth() {
		if (profileThumbnailResizeWidth == RCSConstant.UNINITIALIZED_INT) {
			profileThumbnailResizeWidth = getIntValue("profile.thumbnail.resize.width");
		}
		return profileThumbnailResizeWidth;
	}

	public static int getProfileThumbnailResizeHeight() {
		if (profileThumbnailResizeHeight == RCSConstant.UNINITIALIZED_INT) {
			profileThumbnailResizeHeight = getIntValue("profile.thumbnail.resize.height");
		}
		return profileThumbnailResizeHeight;
	}

	public static int getImageMsgThumbnailResizeWidth() {
		if (imageMsgThumbnailResizeWidth == RCSConstant.UNINITIALIZED_INT) {
			imageMsgThumbnailResizeWidth = getIntValue("image.thumbnail.resize.width");
		}
		return imageMsgThumbnailResizeWidth;
	}

	public static int getImageMsgThumbnailResizeHeight() {
		if (imageMsgThumbnailResizeHeight == RCSConstant.UNINITIALIZED_INT) {
			imageMsgThumbnailResizeHeight = getIntValue("image.thumbnail.resize.height");
		}
		return imageMsgThumbnailResizeHeight;
	}
	
	private static int getIntValue(String key) {

		return Common.toInteger(getValue(key));
	}
	public static String getProfileDefaultImage() {

		if (profileDefaultPic == null) {
			profileDefaultPic = getValue("profile.default.pic.uri");
		}
		return profileDefaultPic;
	}
	
	public static String getProfileDefaultThumbnailImage() {

		if (profileDefaultThumbnailPic == null) {
			profileDefaultThumbnailPic = getValue("profile.default.pic.thumbnail.uri");
		}
		return profileDefaultThumbnailPic;
	}
	public static int getConnectionTimeout() {
		if (connectionTimeout == RCSConstant.UNINITIALIZED_INT) {
			connectionTimeout = getIntValue("connection.timeout");
		}
		return connectionTimeout;
	}
	public static Integer getMaxImageVoboloBlogSize() {
		if (maxImageVoboloBlogSize == null) {
			maxImageVoboloBlogSize = getIntValue("vobolo.blog.image.max.size");
		}
		return maxImageVoboloBlogSize;
	}

	public static int getReadTimeout() {
		if (readTimeout == RCSConstant.UNINITIALIZED_INT) {
			readTimeout = getIntValue("read.timeout");
		}
		return readTimeout;
	}
	/**
	 * The maximum memory to be used for file upload.
	 * 
	 * @param request
	 * @return
	 */
	public static int getFileUploadMaxMemSize() {
		if (maxMemorySize == RCSConstant.UNINITIALIZED_INT) {
			maxMemorySize = getIntValue("max.mem.size");
		}
		return maxMemorySize;
	}

	public static String getBlogDateFormat() {
		if (blogDateFormat == null) {
			blogDateFormat = getValue("blog.date.format");
		}
		return blogDateFormat;
	}
	
	
	public static String getStorePath() {
		if (storePath == null) {
			storePath = getValue("rcsbotdirectory.storepath");
		}
		return storePath;
	}
	
	public static String getVideoPath() {
		if (videoPath == null) {
			videoPath = getValue("rcsbotdirectory.video");
		}
		return videoPath;
	}
	
	public static String getBotLogoImage(Integer id) {
		String formatpath=null;
		if (botLogoImagePath == null) {
			botLogoImagePath = getValue("rcsbotdirectory.image.bot.id.logoimage");
			
		}
		formatpath=String.format(botLogoImagePath,id);
		return formatpath;
	}
	public static String getBotScrenImage(Integer id) {
		String formatpath=null;
		if (botScreenImagePath == null) {
			botScreenImagePath = getValue("rcsbotdirectory.image.bot.id.screenimage");
			
		}
		formatpath=String.format(botScreenImagePath,id);
		return formatpath;
	}
	
	public static String getBotDirectoryLogo() {
		if (botDirectoryImagePath == null) {
			botDirectoryImagePath = getValue("rcsbotdirectory.logoimage");
		}
		return botDirectoryImagePath;
	}
	
	
	public static String getBotDirectoryBaseUrl() {
		if (botDirectoryBaseUrl == null) {
			botDirectoryBaseUrl = getValue("rcsbotdirectory.base.imageurl");
		}
		return botDirectoryBaseUrl;
	}
	
	public static String getRcsBotLogoImageURL(Integer folderName) {
		if (folderName == null) {
			return botDirectoryBaseUrl;
		} else {
			return getBotDirectoryBaseUrl()+ getBotLogoImage(folderName);
		}
	}
	
	public static String getRcsBotScreenImageURL(Integer folderName) {
		if (folderName == null) {
			return botDirectoryBaseUrl;
		} else {
			return getBotDirectoryBaseUrl()+ getBotScrenImage(folderName);
		}
	}
	
	public static String getBotScreenVideo(Integer id) {
		String formatpath=null;
		if (botScreenVideoPath == null) {
			botScreenVideoPath = getValue("rcsbotdirectory.video.bot.id.screenvideo");
			
		}
		formatpath=String.format(botScreenVideoPath,id);
		return formatpath;
	}
	
	public static String getBotScreenVideoURL(Integer folderName) {
		if (folderName == null) {
			return botDirectoryBaseUrl;
		} else {
			return getBotDirectoryBaseUrl()+ getBotScreenVideo(folderName);
		}
	}
	
	public static String getTempDirectoryPath() {
		
		if (tempDirPath == null) {
			tempDirPath = getValue("rcsbotdirectory.image.temp");
		}
		return getStorePath()+"/"+tempDirPath;
	}

	@Override
	public void setEnvironment(Environment env) {
		environment = env;
	}
	
}
