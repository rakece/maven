package com.kirusa.image;

import static org.imgscalr.Scalr.resize;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;

import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;

import com.kirusa.logs.LogConstants;


import com.kirusa.util.*;

public class ImageMgr {

	private static final IvLogger logger = LoggerFactory
			.getLogger(ImageMgr.class);

	public static final boolean imgMgsThumbnailSquare = true;
	public static final boolean ImgMgsThumbnailQuality = true;

	private static final int IMG_WIDTH_PROFILE_PIC = AppConfig
			.getProfileImageResizeWidth();
	private static final int IMG_HEIGHT_PROFILE_PIC = AppConfig
			.getProfileImageResizeHeight();

	private static final int IMG_WIDTH_THUMBNAIL = AppConfig
			.getProfileThumbnailResizeWidth();
	private static final int IMG_HEIGHT_THUMBNAIL = AppConfig
			.getProfileThumbnailResizeHeight();

	public static final int IMGMSG_WIDTH_THUMBNAIL = AppConfig
			.getImageMsgThumbnailResizeWidth();
	public static final int IMGMSG_HEIGHT_THUMBNAIL = AppConfig
			.getImageMsgThumbnailResizeHeight();

	public static final String MEDIA_FORMAT_PNG = "png";
	public static final String MEDIA_FORMAT_JPEG = "jpeg";
	public static final String MEDIA_FORMAT_JPG = "jpg";

	public static final String PNG = ".png";
	public static final String JPEG = ".jpeg";
	public static final String JPG = ".jpg";

	
	public static String getFileNameExt(String sourceFilePath, int extIdx) {
		return sourceFilePath.substring(extIdx + 1);
	}

	public static String getFileNameWithExt(String sourceFilePath) {

		int fileIdx = sourceFilePath.lastIndexOf("/");
		return sourceFilePath.substring(fileIdx + 1);
	}

	public static void createThumNail(String sourceFileName,
			String thumbFileName, String profilePicFolderPath,
			String thumbnailFolderPath, boolean square, boolean picQuality) {

		try {
			String sourceFilePath = profilePicFolderPath + sourceFileName;
			String thumbNameFileName = thumbnailFolderPath + thumbFileName;

			int extIdx = sourceFilePath.lastIndexOf(".");
			String sourceFileNamePath = removeFileExt(sourceFilePath, extIdx);
			String sourceFileExt = getFileNameExt(sourceFilePath, extIdx);

			String backupFileNamePath = generateUplodeFileName(
					sourceFileNamePath, sourceFileExt);

			// Note: create thumbnail from the actual uploaded image than
			// resized one.
			resizeImage(backupFileNamePath, thumbNameFileName,
					IMG_WIDTH_THUMBNAIL, IMG_HEIGHT_THUMBNAIL, square,
					picQuality);
		} catch (IOException e) {
			logger.error()
				.field(LogConstants.METHOD, "creatThumNail")
				.exception(LogConstants.EXCEPTION, e).logOpr();
		}
	}
	/**
	 * @param sourceFilePath
	 * @return
	 */
	public static String removeFileExt(String sourceFilePath, int extIdx) {
		return sourceFilePath.substring(0, extIdx);
	}
	/**
	 * @param sourceFileName
	 * @param sourceFileExt
	 * @return
	 */
	private static String generateUplodeFileName(String sourceFileName,
			String sourceFileExt) {
		return sourceFileName + "_uploded." + sourceFileExt;
	}
	/**
	 * @param sourceFilePath
	 *            - source file path of the file to resize.
	 * @param targetFilePath
	 *            - target file path of resized file. This file can be same as
	 *            sourceFilePath
	 */
	public static void resizeImage(String sourceFilePath,
			String targetFilePath, int resizeWidth, int resizeHeight,
			boolean square, boolean quality) throws IOException {

		File sourceFile = new File(sourceFilePath);
		
		logger.debug()
			.message("resizeImage(): sourceFilePath[" + sourceFilePath
				+ "],exists[" + sourceFile.exists()+",targetFilePath[" + targetFilePath
				+ "]").log();

		BufferedImage img = ImageIO.read(sourceFile);

		int height = img.getHeight();
		int width = img.getWidth();
		// make image square using Crop
		if (square && height != width) {
			int x = height;
			if (height > width) {
				x = width;
			} else {
				x = height;
			}
			// Crop if dimensions are > IMG_WIDTH
			img = Scalr.crop(img, x, x); // square
			height = x;
			width = x;
		} else {
			int perChange = 0;
			int min = (height > width ? width : height);
			if ((height > resizeWidth || width > resizeWidth)
					&& (min > resizeWidth)) { // resizeWidth and resizeHeight
												// are same
				if (height > width) {
					perChange = (resizeWidth * 100) / width;
				} else {
					perChange = (resizeHeight * 100) / height;
				}
				resizeWidth = (width * perChange) / 100;
				resizeHeight = (height * perChange) / 100;
			} else {
				resizeHeight = height;
				resizeWidth = width;
			}
		}

		Method picQuality;

		if (quality)
			picQuality = Scalr.Method.ULTRA_QUALITY;
		else {
			picQuality = Scalr.Method.SPEED;
		}

		img = resize(img, picQuality, Scalr.Mode.AUTOMATIC, resizeWidth,
				resizeHeight, Scalr.OP_ANTIALIAS);
		String extension[] = targetFilePath.split("\\.");
		File outputfile = new File(targetFilePath);
		ImageIO.write(img, extension[extension.length - 1], outputfile);
	}


}
