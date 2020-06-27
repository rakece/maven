package com.kirusa.util;


import static org.imgscalr.Scalr.resize;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.exception.ConstraintViolationException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.image.ImageMgr;
import com.kirusa.logs.LogConstants;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;


public class Common {
	
	
	private static Gson gson = new Gson();

	protected static final IvLogger logger = LoggerFactory.getLogger(Common.class);
	

	public static String ISO_8859_1 = "ISO-8859-1";
	public static String UTF_8 = "UTF_8";

	private static final long HR_IN_MILLIS = 60 * 60 * 1000;

	private static String profileDefaultPic = null;

	public static int MAX_MEM_SIZE = 100000000;
	public static int MAX_REQUEST_SIZE = 100000000;

	// For File upload
	public static final String KEY_MAX_MEM_SIZE = "max.mem.size";
	public static final String KEY_MAX_REQ_SIZE = "max.req.size";
	public static final String KEY_MIN_BYTES_FOR_PROGRESS = "min.bytes.progress";



	public static final String ACTION_STATUS_SUCCESS = "SUCCESS";
	public static final String ACTION_STATUS_ERROR = "ERROR";

	
	/**
	 * The progressListener will update the status only when specified bytes
	 * have been read
	 */
	public static int UPDATE_STATUS_MIN_BYTES = 100000;
	private static SimpleDateFormat blogDtFormatter = null;

	public static String ADV_SCHEDULE_DATE_FORMAT_STR = new String("yyyy-MM-dd");
	public static SimpleDateFormat TIME_AMPM_FORMATTER = new SimpleDateFormat("hh:mm a");
	public static SimpleDateFormat ADV_SCHEDULE_DATE_FORMATTER = new SimpleDateFormat(ADV_SCHEDULE_DATE_FORMAT_STR);

	public static String ADV_SCHEDULE_DATE_FORMAT_TIME_STR = new String("yyyy-MM-dd HH:mm");
	public static SimpleDateFormat ADV_SCHEDULE_DATE_TIME_FORMATTER = new SimpleDateFormat(
			ADV_SCHEDULE_DATE_FORMAT_TIME_STR);

	public static String APP_TRACKER_EVENT_DATE_FORMAT_TIME_STR = new String("yyyy-MM-dd HH:mm:ss");
	public static SimpleDateFormat APP_TRACKER_EVENT_DATE_FORMAT_TIME_FORMATTER = new SimpleDateFormat(
			APP_TRACKER_EVENT_DATE_FORMAT_TIME_STR);

	public static String RFI_DATE_FORMAT_TIME_STR = new String("yyyy-MM-dd HH:mm");
	public static SimpleDateFormat RFI_DATE_FORMAT_TIME_FORMATTER = new SimpleDateFormat(RFI_DATE_FORMAT_TIME_STR);

	public static String RFI_TIME_FORMAT_STR = new String("HH:mm");
	public static SimpleDateFormat RFI_TIME_FORMAT_FORMATTER = new SimpleDateFormat(RFI_TIME_FORMAT_STR);

	public static String RFI_SCHEDULE_DATE_FORMAT_STR = new String("yyyy-MM-dd");
	public static SimpleDateFormat RFI_SCHEDULE_DATE_FORMATTER = new SimpleDateFormat(RFI_SCHEDULE_DATE_FORMAT_STR);

	public static String RFI_BASE_DATE_STR = new String("2016-08-01");
	
	private static DecimalFormat df = new DecimalFormat("0.0");

	public static Locale getUserLocale(HttpServletRequest request) {
		return Locale.getDefault();
	}


	public static boolean checkIsLongNumber(String toCheck) {
		try {
			Long.parseLong(toCheck);
			return true;
		} catch (NumberFormatException numForEx) {
			return false;
		}
	}
	
	public static void isFromGreaterThanTo(Calendar fdt, Calendar tdt, String prefix, String fieldName)
			throws InputDataValidationException {
		if (fdt != null && tdt != null) {
			if (tdt.compareTo(fdt) < 0) {
				throw new InputDataValidationException(prefix + ".input." + fieldName + ".greater");
			}
		}
	}

	public static void isNegative(Integer value, String prefix, String fieldName) throws InputDataValidationException {
		if (value != null) {
			if (value < 0)
				throw new InputDataValidationException(prefix + ".input." + fieldName + ".negative");
		}
	}

	public static void isFromGreaterThanTo(Integer lowestMoq, Integer highestMoq, String prefix, String fieldName)
			throws InputDataValidationException {
		if (lowestMoq != null && highestMoq != null) {
			if (lowestMoq > highestMoq)
				throw new InputDataValidationException(prefix + ".input." + fieldName + ".greater");
		}
	}

	public static void isNullValue(Integer value, String prefix, String fieldName) throws InputDataValidationException {
		if (value == null) {
			throw new InputDataValidationException(prefix + ".input." + fieldName + ".missing");
		}
	}

	public static void isNullValue(String value, String prefix, String fieldName) throws InputDataValidationException {
		if (value == null || value.trim().length() == 0) {
			throw new InputDataValidationException(prefix + ".input." + fieldName + ".missing");
		}
	}

	public static void isNullValue(BigDecimal value, String prefix, String fieldName)
			throws InputDataValidationException {
		if (value == null) {
			throw new InputDataValidationException(prefix + ".input." + fieldName + ".missing");
		}
	}

	public static void isNegative(BigDecimal value, String prefix, String fieldName)
			throws InputDataValidationException {
		if (value != null) {
			if (value.floatValue() < 0)
				throw new InputDataValidationException(prefix + ".input." + fieldName + ".negative");
		}
	}

	public static void isZero(BigDecimal value, String prefix, String fieldName) throws InputDataValidationException {
		if (value != null) {
			if (value.floatValue() == 0)
				throw new InputDataValidationException(prefix + ".input." + fieldName + ".negative");
		}
	}

	/**
	 * Return the current date.
	 * 
	 * @return
	 */
	public static Calendar getCurrentDate() {
		return getTimestamp();
	}

	public static String toDateStringWithTime(Calendar dt) {
		String str;

		try {
			str = dt.get(Calendar.YEAR) + "-" + (dt.get(Calendar.MONTH) + 1) + "-" + dt.get(Calendar.DAY_OF_MONTH) + " "
					+ dt.get(Calendar.HOUR_OF_DAY) + ":" + dt.get(Calendar.MINUTE) + ":" + dt.get(Calendar.SECOND);

		} catch (Exception e) {
			str = "";
		}
		return str;
	}

	public static String dateToDateStr(Calendar dt, String format) {

		String str = null;
		try {
			// blogDtFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			blogDtFormatter = new SimpleDateFormat(format);
			str = blogDtFormatter.format(dt.getTime());
		} catch (Exception e) {
			str = "";
		}
		return str;
	}

	public static String toDateStr(Calendar dt) {
		String str;

		try {
			str = (dt.get(Calendar.MONTH) + 1) + "/" + dt.get(Calendar.DAY_OF_MONTH) + "/" + dt.get(Calendar.YEAR);
		} catch (Exception e) {
			str = "";
		}
		return str;
	}

	public static String getDateFormat(HttpServletRequest request) {
		return AppConfig.getDateFormat();
	}

	public static Calendar StringToCalender(String format, String dtStr) {
		if (dtStr == null)
			return null;
		try {
			DateFormat formatter;
			Date date;
			formatter = new SimpleDateFormat(format);
			date = formatter.parse(dtStr);
			// Calendar cal = Calendar.getInstance();
			Calendar cal = getCurrentDateUTC();
			cal.setTime(date);
			return cal;
		} catch (Exception e) {
			return null;
		}
	}

	public static Calendar stringToCalender(String dateFormat, String dtStr) throws Exception {

		if (dtStr == null)
			return null;
		try {
			DateFormat formatter;
			Date date;
			if (Common.isEmpty(dateFormat))
				formatter = new SimpleDateFormat("dd-mm-yyyy");
			else
				formatter = new SimpleDateFormat(dateFormat);
			date = formatter.parse(dtStr);
			// Calendar cal = Calendar.getInstance();
			Calendar cal = getCurrentDateUTC();
			// changed - 4 ART
			cal.setTime(date);
			return cal;
		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 * Return true if given string is null or length is 0
	 */
	public static boolean isEmpty(String val) {
		return (val == null || val.length() == 0);
	}
	
	public static boolean isEmptyTrim(String val) {
		return (val == null || val.trim().length() == 0);
	}

	public static void isFromGreaterThanTo(BigDecimal value1, BigDecimal value2, String errKeyPrefix, String fieldName)
			throws InputDataValidationException {
		if (value1 != null && value2 != null) {
			if (value1.compareTo(value2) > 0)
				throw new InputDataValidationException(errKeyPrefix + ".input." + fieldName + ".greater");
		}
	}

	public static void isNullValue(Calendar value, String errKeyPrefix, String fieldName)
			throws InputDataValidationException {

		if (value == null) {
			throw new InputDataValidationException(errKeyPrefix + ".input." + fieldName + ".missing");
		}

	}

	
	public static boolean isDuplicateKeyException(Throwable e) {

		// BUGBUG:
		// This condition is not sufficient to check duplicate key.
		// Any constraint error is returned true by this function.
		return (e instanceof DuplicateKeyException || e.getMessage().contains("ConstraintViolationException")
				|| e instanceof ConstraintViolationException);
	}

	public static Integer toInteger(String s) {
		Integer i;
		try {
			i = Integer.parseInt(s);
		} catch (Exception e) {
			return null;
		}
		// TODO Auto-generated method stub
		return i;
	}

	public static String toPattren(String value, Integer patternType) {

		int type = patternType.intValue();
		String prefix = "";
		String postfix = "";
		String wildChar = "%";
		switch (type) {
		case 1: // Contains
			prefix = wildChar;
			postfix = wildChar;
			break;
		case 2: // Ends with
			prefix = wildChar;
			break;
		case 3: // Exact match
			break;
		default:// Starts with
			postfix = wildChar;
			break;
		}
		return prefix + value + postfix;// "Silver Ring with Diamonds-2"; //;
	}

	public static boolean toBoolean(String str) {
		return ("true".equalsIgnoreCase(str) || "y".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str));
	}

	public static BigDecimal toBigDecimal(String str) {

		BigDecimal val;

		try {
			val = new BigDecimal(str);
		} catch (Exception e) {
			val = null;
		}
		// TODO Auto-generated method stub
		return val;
	}

	public static Date convertStringToDate(String dt) {
		return convertStringToDate(dt, "MM/dd/yyyy");
	}

	public static Date convertStringToDate(String dt, String dateFormat) {
		if (dt == null)
			return null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		try {
			Date date = simpleDateFormat.parse(dt);
			return date;
		} catch (ParseException e) {
			return null;
		}
	}

	public static Integer getHour(Calendar dt) {

		if (dt == null)
			return null;
		else
			return dt.get(Calendar.HOUR_OF_DAY);
	}

	public static Integer getMinute(Calendar dt) {

		if (dt == null)
			return null;
		else
			return dt.get(Calendar.MINUTE);
	}

	/*
	 * public static Calendar toTimestamp(HttpServletRequest request, String
	 * dtStr, String hh, String mm) { if (dtStr == null) return null; try {
	 * DateFormat formatter; Date date; formatter = new
	 * SimpleDateFormat(getDateFormat(request)); date = formatter.parse(dtStr);
	 * Calendar cal = Calendar.getInstance(); cal.setTime(date); // Set Hour and
	 * Minute Integer val = Common.toInteger(hh); if (val != null)
	 * cal.set(Calendar.HOUR, val); val = Common.toInteger(mm); if (val != null)
	 * cal.set(Calendar.MINUTE, val); return cal; } catch (Exception e) { return
	 * null; } }
	 */

	/**
	 * Generates the thumbnail for the passed image.
	 * 
	 * @param imageName
	 *            The image name for which the thumbnail to be generated
	 * 
	 * @return The value returned from the process.
	 */
	public static int generateThumbNail(String mediapath, String thumbNailBasePath, String thumbNailScriptPathName,
			String imageName) {

		/**
		 * for testing on windows uncomment this one
		 */
		// String command[] =
		// {"cmd","/c",thumbNailScriptPathName,mediapath,thumbNailBasePath,imageName};
		String command[] = { thumbNailScriptPathName, mediapath, thumbNailBasePath, imageName };
		int returnValue = 0;
		Process pr;
		try {
			Common.createDir(thumbNailBasePath);
			ProcessBuilder pb = new ProcessBuilder(command);
			pr = pb.start();
			returnValue = pr.waitFor();
		} catch (IOException | InterruptedException e) {
			logger.error().field(LogConstants.METHOD, "generateThumbNail").exception(LogConstants.EXCEPTION, e)
					.logOpr();
		}

		logger.debug().field(LogConstants.METHOD, "generateThumbNail")
				.message("The return value is [" + returnValue + "]").log();
		return returnValue;
	}


	public static String getProfileThumbnailImage(String folderName, String imageName)
			throws UnsupportedEncodingException {

		return (AppConfig.getRcsProfileImageThumbnailURL(folderName)
				+ URLEncoder.encode(imageName, RCSConstant.UTF_8));
	}

	public static String getProfileImage(String folderName, String imageName) throws UnsupportedEncodingException {
		return (AppConfig.getRcsUserProfileImageURL(folderName) + URLEncoder.encode(imageName, RCSConstant.UTF_8));
		/*
		 * String filePath = AppConfig.getrcsUserProfileImageURL(folderName) +
		 * URLEncoder .encode(imageName, RCSConstant.UTF_8); File source = new
		 * File(filePath); if (!source.exists()) { filePath = null; } return
		 * filePath;
		 */
	}
	

	
	public static void creatThumNailOld(String newFileName, String sourceFolder, String thumbnailFolder) {

		String inFileName = sourceFolder + newFileName;
		String thumbNameFileName = thumbnailFolder + newFileName;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(inFileName));
		} catch (IOException e) {
			logger.error().field(LogConstants.METHOD, "creatThumNailOld").exception(LogConstants.EXCEPTION, e)
					.message("Not able to read image: " + inFileName).logOpr();
			return;
		}
		int imgWidth = img.getWidth();
		int imgHeight = img.getHeight();

		BufferedImage bi = null;
		if (imgWidth < 500 && imgHeight < 500) {
			bi = resize(img, 200, imgWidth * 200 / imgHeight);
		} else if (imgWidth < 800 && imgHeight < 800) {
			bi = resize(img, 300, imgWidth * 300 / imgHeight);
		} else {
			bi = resize(img, 400, imgWidth * 400 / imgHeight);
		}
		String extension[] = thumbNameFileName.split("\\.");
		File outputfile = new File(thumbNameFileName);
		try {
			ImageIO.write(bi, extension[extension.length - 1], outputfile);
		} catch (IOException e) {
			logger.error().field(LogConstants.METHOD, "creatThumNailOld").exception(LogConstants.EXCEPTION, e)
					.message("Unable to write image: " + thumbNameFileName).logOpr();
		}
		/*
		 * if (logger.isDebugEnabled()){
		 * logger.debug("creatThumNail() of ["+inFileName
		 * +"] at "+thumbNameFileName); }
		 */
	}

	public static void creatThumNail(String newFileName, String sourceFolder, String thumbnailFolder, boolean square,
			boolean picQuality) {

		ImageMgr.createThumNail(newFileName, newFileName, sourceFolder, thumbnailFolder, square, picQuality);
	}

	public static void removeFile(String fileName) {
		try {
			// remove old file name
			File file = new File(fileName);
			file.delete();
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "removeFile").exception(LogConstants.EXCEPTION, e)
					.message(" removeFile file name [" + fileName + "]").logOpr();
		}
	}

	public static String getProfileImageURI(String folderName, String picName) {
		if ((picName == null) || (picName.length() == 0)) {
			return AppConfig.getProfileDefaultImage();
		} else {
			try {
				return Common.getProfileImage(folderName, picName);
			} catch (UnsupportedEncodingException e) {
				logger.error().field(LogConstants.METHOD, "getProfileImageURI").exception(LogConstants.EXCEPTION, e)
						.message("returning default image").logOpr();
				return AppConfig.getProfileDefaultImage();
			}
		}
	}

	public static String getProfileThumbnailImageURI(String folderName, String picName) {
		if ((picName == null) || (picName.length() == 0)) {
			return AppConfig.getProfileDefaultThumbnailImage();
		} else {
			try {
				return Common.getProfileThumbnailImage(folderName, picName);
			} catch (UnsupportedEncodingException e) {
				logger.error().field(LogConstants.METHOD, "getProfileThumbnailImageURI")
						.exception(LogConstants.EXCEPTION, e).message("returning default image").logOpr();
				return AppConfig.getProfileDefaultThumbnailImage();
			}
		}
	}

	

	public static JSONObject toJSONObject(String jsonString) throws JSONException {
		return new JSONObject(jsonString);
	}

	
	public static String getCountryCode(String msgId) {

		try {
			return msgId.substring(0, 3).toLowerCase(); // extract country code
														// - first 3
			// chars
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getCountryCode").exception(LogConstants.EXCEPTION, e)
					.message("msgId[" + msgId + "]").logOpr();
			return null;
		}
	}

	

	public static String getTimeStamp(String msgId) {
		/*
		 * 1. First 3 digits stands for country code 2. Next 2 digit stands for
		 * the Carrier code assigned by Kirusa 3. Next 3 digits contain the
		 * Kvsms node id 4. Next 12 digits contains the yymmddhhmmss 5. Rest
		 * contains the sequence number, which is long number (mod of 0XFFFF).
		 */
		try {
			return msgId.substring(8, 20); // extract timestamp
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getTimeStamp").exception(LogConstants.EXCEPTION, e)
					.message("msgId[" + msgId + "]").logOpr();
			return null;
		}
	}

	public static String getString(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getString(key);
		} catch (JSONException je) {
			return "";
		}
	}

	public static Boolean getBool(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getBoolean(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static Integer getInt(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getInt(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static int getIntAsZero(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getInt(key);
		} catch (JSONException je) {
			return 0;
		}
	}


	public static void createDir(String newPath) {
		File directory = new File(newPath);
		if (!directory.exists())
			directory.mkdirs();
	}

	
	public static Calendar getCurrentDateUTC() {

		DateTimeZone tz = DateTimeZone.getDefault();
		Date utcDate = new Date(tz.convertLocalToUTC(System.currentTimeMillis(), false));
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		cal.setTimeInMillis(utcDate.getTime());
		return cal;
	}

	public static Calendar getDateUTC(Date date) {
		// TBD: Check the correctness of UTC time.
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.setTime(date);
		return cal;
	}

	public static String getCurrentDateUTCStr() {
		return (Common.toDateStringWithTime(Common.getCurrentDateUTC()));
	}

	public static Calendar getTimestamp() {

		return getCurrentDateUTC();

	}


	public static Long getUTCDateLongVal(Timestamp timestamp) {
		// TBD: need to check the correct of sending UTC time.
		Calendar date = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		date.setTimeInMillis(timestamp.getTime());

		DateTime dateT = new DateTime(date.getTime());
		dateT = dateT.withZoneRetainFields(DateTimeZone.forID("UTC"));

		return dateT.getMillis();
	}

	public static Long getLong(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getLong(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static long getLongAsZero(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getLong(key);
		} catch (JSONException je) {
			return 0L;
		}
	}

	public static Calendar toCalendar(Timestamp timestamp) {
		if (timestamp == null) {
			return null;
		}

		// Calendar cal = Calendar.getInstance();
		// changed 1 - ART
		Calendar cal = getCurrentDateUTC();
		cal.setTime(timestamp);
		return cal;
	}

	
	public static HttpURLConnection getHttpURLConnection(String urlStr, Integer readTimeout, Integer connectionTimeOut)
			throws Exception {

		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			if (readTimeout == null)
				conn.setReadTimeout(AppConfig.getReadTimeout());
			else
				conn.setReadTimeout(readTimeout.intValue());
			if (connectionTimeOut == null)
				conn.setConnectTimeout(AppConfig.getConnectionTimeout());
			else
				conn.setConnectTimeout(connectionTimeOut);

		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getConnection").exception(LogConstants.EXCEPTION, e).logOpr();
			throw e;
		}
		return conn;
	}

	public static HttpURLConnection getHttpURLConnection(String urlStr) throws Exception {

		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			conn.setReadTimeout(AppConfig.getReadTimeout());
			conn.setConnectTimeout(AppConfig.getConnectionTimeout());
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getConnection").exception(LogConstants.EXCEPTION, e).logOpr();
			throw e;
		}
		return conn;
	}

	public static byte[] getMediaData(String mediaUri) throws Exception {

		HttpURLConnection conn = null;
		DataInputStream is = null;
		ByteArrayOutputStream bos = null;
		byte file_data[] = null;
		try {
			// Connect to the media server. This needs to be optimized.
			conn = getHttpURLConnection(mediaUri);
			conn.connect();

			// Make sure that we got back a 200 OK response.
			// Throw an IOException if we get anything else.
			int rc = conn.getResponseCode();
			if (rc != HttpURLConnection.HTTP_OK) {
				String errCode = "HTTP Error code:" + rc;
				if (rc == HttpURLConnection.HTTP_NOT_FOUND || rc == HttpURLConnection.HTTP_MOVED_TEMP
						|| rc == HttpURLConnection.HTTP_MOVED_PERM) {
					throw new FileNotFoundException(errCode);
				}
				if ((rc >= 500 && rc < 600) || rc == HttpURLConnection.HTTP_FORBIDDEN) {
					String err = "mediaUri[" + mediaUri + "] rc[" + rc + "]";
					logger.error().field(LogConstants.METHOD, "getMediaData").message(err).logOpr();
					throw new ServerUnavailableException(err);
				}
				throw new IOException(errCode);
			}

			// Read response
			is = new DataInputStream(conn.getInputStream());
			// ContentConnection includes a length method
			int length = (int) conn.getContentLength();
			if (length != -1) {
				file_data = new byte[length];

				// Read image into an array
				is.readFully(file_data);
			} else { // Length is not available
				bos = new ByteArrayOutputStream();
				int ch;
				while ((ch = is.read()) != -1) {
					bos.write(ch);
				}

				file_data = bos.toByteArray();
				bos.close();
			}
		} catch (MalformedURLException e) {
			logger.error().field(LogConstants.METHOD, "getMediaData").exception(LogConstants.EXCEPTION, e)
					.message("media uri [" + mediaUri + "]").logOpr();
			// this means calling routine should skip this url like resource not
			// found
			throw new FileNotFoundException(e.getMessage());
		} catch (ConnectException e) {
			logger.error().field(LogConstants.METHOD, "getMediaData").exception(LogConstants.EXCEPTION, e)
					.message("media uri [" + mediaUri + "]").logOpr();
			throw new ServerUnavailableException(e.getMessage());
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getMediaData").exception(LogConstants.EXCEPTION, e)
					.message("media uri [" + mediaUri + "]").logOpr();
			throw e;
		} finally {
			// Clean up
			if (is != null)
				is.close();
			if (bos != null)
				bos.close();
			if (conn != null)
				conn.disconnect();
		}

		return file_data;

	}// --End of downloadFile(String)

	

	public static JSONArray getJSONArrayAsNull(JSONObject jsonObject, String key) {

		try {
			return (jsonObject.getJSONArray(key));
		} catch (JSONException e) {
			return null;
		}
	}

	public static JSONArray getJSONArrayAsBLANK(JSONObject jsonObject, String key) {

		try {
			return (jsonObject.getJSONArray(key));
		} catch (JSONException e) {
			return new JSONArray();
		}
	}

	public static JSONObject getJSONObjectAsNull(JSONObject jsonObject, String key) {

		try {
			return (jsonObject.getJSONObject(key));
		} catch (JSONException e) {
			return null;
		}
	}

	public static String getStringAsNull(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getString(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static Long getLongAsNull(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getLong(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static Integer getIntegerAsNull(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getInt(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static Boolean getBooleanAsNull(JSONObject jsonObject, String key) {
		try {
			return jsonObject.getBoolean(key);
		} catch (JSONException je) {
			return null;
		}
	}

	public static byte[] readOneMultipartBinaryData(FileItem fileItem, String audioZipped) {
		String errorStatus = null;
		try {
			logger.debug().field(LogConstants.METHOD, "readMultipartBinaryData").message(
					"Content Type [" + fileItem.getContentType() + "] the file name is [" + fileItem.getName() + "]")
					.logOpr();
			if (fileItem.getName() != null && fileItem.getName().length() > 0) {
				if (fileItem.isFormField()) {
					processFormField(fileItem);
				} else {
					byte[] data = fileItem.get();
					// check if JSON Data is in zipped form.
					if (audioZipped != null && audioZipped.equals("y")) {
						return CompressionUtil.unZip(data);
					} else {
						return data;
					}
				}
			}
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "readOneMultipartBinaryData").exception(LogConstants.EXCEPTION, e)
					.logOpr();
		}
		return null;
	}

	private static void processFormField(FileItem fileItem) {
		// TODO Auto-generated method stub
	}
	
	public static byte[] readMultipartBinaryData(HttpServletRequest request, String sourceAppType, String messageType) {
		return readMultipartBinaryData(request,AppConfig.getFileUploadMaxMemSize());
	}

	
	
	public static byte[] readMultipartBinaryData(HttpServletRequest request, int maxFileSize) {

		long stime = System.currentTimeMillis();
		byte[] data = null;

		String errorStatus = null;
		try {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// Set factory constraints
			factory.setSizeThreshold(maxFileSize);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Check that we have a file upload request
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) {
				// Note: Used the same limits as used in media upload
				upload.setSizeMax(maxFileSize);
				// Parse the request
				try {
					String audioZipped = request.getParameter(RCSConstant.FLD_AUDIO_ZIPPED);
					if (audioZipped == null) {
						audioZipped = request.getHeader(RCSConstant.FLD_AUDIO_ZIPPED);
					}
					String imageZipped = request.getParameter(RCSConstant.FLD_IMAGE_ZIPPED);
					if (imageZipped == null) {
						imageZipped = request.getHeader(RCSConstant.FLD_IMAGE_ZIPPED);
					}
					List<FileItem> items = upload.parseRequest(request);
					for (FileItem fileItem : items) {
						logger.debug()
								.field(LogConstants.METHOD, "readMultipartBinaryData").message("Content Type ["
										+ fileItem.getContentType() + "] the file name is [" + fileItem.getName() + "]")
								.logOpr();
						if (fileItem.getName() != null && fileItem.getName().length() > 0) {
							if (fileItem.isFormField()) {
								processFormField(fileItem);
							} else {
								data = fileItem.get();
								// check if JSON Data is in zipped form.
								if (audioZipped != null && audioZipped.equals("y")) {
									return CompressionUtil.unZip(data);
								} else {
									return data;
								}
							}
						}
					}
				} catch (FileUploadException e) {
					logger.error().field(LogConstants.METHOD, "readMultipartBinaryData")
							.exception(LogConstants.EXCEPTION, e).logOpr();
				}
			} else {
				errorStatus = "Incorrect web request for file upload. No file contents sent by the client.";// multi
				logger.error().field(LogConstants.METHOD, "readMultipartBinaryData").message(errorStatus).logOpr();
			}
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "readMultipartBinaryData").exception(LogConstants.EXCEPTION, e)
					.message(errorStatus).logOpr();
		} finally {
			logger.info().field(LogConstants.METHOD, "readMultipartBinaryData")
					.field(LogConstants.RESPONSE_TIME, System.currentTimeMillis() - stime)
					.message(" size[" + ((data == null) ? null : data.length) + "]").logOpr();
		}
		return null;
	}

	private static HashMap<String, Object> readAudioMultipartBinaryData(HttpServletRequest request,
			String sourceAppType) {

		String errorStatus = null;
		try {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// Set factory constraints
			int maxFileSize = (!Util.isEmpty(sourceAppType)
					&& sourceAppType.equals(RCSConstant.VAL_SOURCE_APP_TYPE_WEB))
							? AppConfig.getMaxImageVoboloBlogSize() : AppConfig.getFileUploadMaxMemSize();

			factory.setSizeThreshold(maxFileSize);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Check that we have a file upload request
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) {
				// Note: Used the same limits as used in media upload
				upload.setSizeMax(maxFileSize);
				// Parse the request
				try {
					String audioZipped = request.getParameter(RCSConstant.FLD_AUDIO_ZIPPED);
					if (audioZipped == null) {
						audioZipped = request.getHeader(RCSConstant.FLD_AUDIO_ZIPPED);
					}

					List<FileItem> items = upload.parseRequest(request);
					HashMap<String, Object> dataSet = new HashMap<String, Object>();
					ArrayList<String> multiPartKeysOrder = new ArrayList<String>();
					byte[] data = null;
					for (FileItem fileItem : items) {
						logger.debug()
								.field(LogConstants.METHOD, "readAudioMultipartBinaryData").message("Content Type ["
										+ fileItem.getContentType() + "] the file name is [" + fileItem.getName() + "]")
								.logOpr();
						String fileName = fileItem.getName();
						String contentType = null;
						if (fileName != null && fileName.length() > 0) {
							if (fileItem.isFormField()) {
								processFormField(fileItem);
							} else {

								contentType = RCSConstant.IMAGE_MSG_IMAGE;
								data = fileItem.get();

								// check if JSON Data is in zipped form.
								if (contentType.equals(RCSConstant.IMAGE_MSG_AUDIO)
										&& (audioZipped != null && audioZipped.equals("y"))) {
									data = CompressionUtil.unZip(data);
								}
							}
							dataSet.put(fileName, data);
							multiPartKeysOrder.add(fileName);
						}
					}

					if (multiPartKeysOrder.size() > 0) {
						dataSet.put(RCSConstant.FLD_MULTIPART_KEYS_ORDER, multiPartKeysOrder);
					}
					return dataSet;
				} catch (FileUploadException e) {
					logger.error().field(LogConstants.METHOD, "readManyMultipartBinaryData")
							.exception(LogConstants.EXCEPTION, e).logOpr();
				}
			} else {
				errorStatus = "Incorrect web request for file upload. No file contents sent by the client.";// multi
																											// part
			}
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "readManyMultipartBinaryData")
					.exception(LogConstants.EXCEPTION, e).logOpr();
		}
		return null;
	}

	


	public static HashMap<String, Object> readManyMultipartBinaryData(HttpServletRequest request, String sourceAppType,
			String messageType) {
		return readManyMultipartBinaryData(request, AppConfig.getFileUploadMaxMemSize());
	}

	/*
	 * Note: To retain order in which files are uploaded, hashMap contains key
	 * RCSConstant.FLD_MULTIPART_KEYS_ORDER and value ArrayList<filename>.
	 * 
	 * That is why key value is changed from byte[] to Object.
	 */
	public static HashMap<String, Object> readManyMultipartBinaryData(HttpServletRequest request, int maxFileSize) {

		String errorStatus = null;
		try {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// Set factory constraints

			factory.setSizeThreshold(maxFileSize);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Check that we have a file upload request
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) {
				// Note: Used the same limits as used in media upload
				upload.setSizeMax(maxFileSize);
				// Parse the request
				try {
					String audioZipped = request.getParameter(RCSConstant.FLD_AUDIO_ZIPPED);
					if (audioZipped == null) {
						audioZipped = request.getHeader(RCSConstant.FLD_AUDIO_ZIPPED);
					}
					String imageZipped = request.getParameter(RCSConstant.FLD_IMAGE_ZIPPED);
					if (imageZipped == null) {
						imageZipped = request.getHeader(RCSConstant.FLD_IMAGE_ZIPPED);
					}
					List<FileItem> items = upload.parseRequest(request);
					HashMap<String, Object> dataSet = new HashMap<String, Object>();
					ArrayList<String> multiPartKeysOrder = new ArrayList<String>();
					byte[] data = null;
					for (FileItem fileItem : items) {
						logger.debug().field(LogConstants.METHOD, "readMultipartBinaryData")
								.message("Content Type [" + fileItem.getContentType() + "] the file name is ["
										+ fileItem.getName() + "],fileItem.size[" + fileItem.getSize()
										+ "],fileItem.isFormField[" + fileItem.isFormField() + "]")
								.logOpr();
						String fileName = fileItem.getName();
						String contentType = null;
						if (fileName != null && fileName.length() > 0) {
							if (fileItem.isFormField()) {
								processFormField(fileItem);
							} else {
								if (fileName.startsWith(RCSConstant.IMAGE_FILE_PREFIX)
										|| fileName.startsWith(RCSConstant.VAL_SLASH + RCSConstant.IMAGE_FILE_PREFIX))
									contentType = RCSConstant.IMAGE_MSG_IMAGE;
								else if (fileName.startsWith(RCSConstant.AUDIO_FILE_PREFIX)
										|| fileName.startsWith(RCSConstant.VAL_SLASH + RCSConstant.AUDIO_FILE_PREFIX))
									contentType = RCSConstant.IMAGE_MSG_AUDIO;
								else
									contentType = RCSConstant.IMAGE_MSG_IMAGE;

								data = fileItem.get();
								// check if JSON Data is in zipped form.

								if (contentType.equals(RCSConstant.IMAGE_MSG_IMAGE)
										&& (imageZipped != null && imageZipped.equals("y"))) {
									data = CompressionUtil.unZip(data);
								} else if (contentType.equals(RCSConstant.IMAGE_MSG_AUDIO)
										&& (audioZipped != null && audioZipped.equals("y"))) {
									data = CompressionUtil.unZip(data);
								}
							}
							dataSet.put(fileName, data);
							multiPartKeysOrder.add(fileName);
						}
					}

					if (multiPartKeysOrder.size() > 0) {
						dataSet.put(RCSConstant.FLD_MULTIPART_KEYS_ORDER, multiPartKeysOrder);
					}
					return dataSet;
				} catch (FileUploadException e) {
					logger.error().field(LogConstants.METHOD, "readManyMultipartBinaryData")
							.exception(LogConstants.EXCEPTION, e).logOpr();
				}
			} else {
				errorStatus = "Incorrect web request for file upload. No file contents sent by the client.";// multi
																											// part
			}
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "readManyMultipartBinaryData")
					.exception(LogConstants.EXCEPTION, e).message(errorStatus).logOpr();
		}
		return null;
	}

	
	
	public static String readFile(String fileName) {

		BufferedReader br = null;
		String contents = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder(512);
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			contents = sb.toString();
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "readFile").exception(LogConstants.EXCEPTION, e).log();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					logger.error().field(LogConstants.METHOD, "readFile").exception(LogConstants.EXCEPTION, e).log();
				}
			}
		}
		return contents;
	}

	public static Long toLong(String s) {
		Long l;
		try {
			l = Long.parseLong(s);
		} catch (Exception e) {
			return null;
		}
		return l;
	}



	public static void WriteToFile(String fullPath, byte[] data) throws Exception {
		OutputStream output = null;
		try {
			logger.debug().field(LogConstants.METHOD, "WriteToFile").message("path [" + fullPath + "]").logOpr();
			// Common.createDir(baseMedaiPath);
			output = new BufferedOutputStream(new FileOutputStream(fullPath));
			output.write(data);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "WriteToFile").exception(LogConstants.EXCEPTION, e)
					.message("path [" + fullPath + "]").logOpr();
			throw e;
		} finally {
			if (output != null)
				output.close();
		}
	}

	public static String toDateStr(Calendar dt, String strFormat) {
		String str;

		SimpleDateFormat df = new SimpleDateFormat(strFormat);

		try {
			str = df.format(dt.getTime());
		} catch (Exception e) {
			str = "";
		}
		return str;
	}

	

	public static String trimTo999(Integer count) {
		if (count >= 1000)
			return ("[999<span class=\"vobolocountplus\">+</span>]");
		return "[" + count + "]";
	}

	public static void createPicFile(String nameURL, String profilePicPathName) throws IOException {

		URL url = null;
		FileOutputStream fos = null;
		try {
			url = new URL(nameURL);
			InputStream stream = url.openStream();
			int ch;
			fos = new FileOutputStream(profilePicPathName); // "c:/temp/pic.jpeg");
			while ((ch = stream.read()) != -1) {
				fos.write(ch);
			}
			fos.flush();
		} finally {
			if (fos != null) {
				fos.close();
				fos = null;
			}
			url = null;
		}
	}



	/**
	 * @param parameter
	 * @return
	 */
	public static String getNullIfEmpty(String parameter) {
		if (parameter.trim().length() == 0)
			return null;
		else
			return parameter;
	}

	

	public static JSONArray readPageInfo(String urlString) throws IOException, JSONException {

		URL url = new URL(urlString);
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		StringBuilder sb = new StringBuilder(512);

		String inputLine;

		while ((inputLine = in.readLine()) != null)
			sb.append(inputLine);
		in.close();
		JSONObject response = new JSONObject(sb.toString());
		JSONArray array = (JSONArray) response.get("data");

		// String sb
		// ="[{"category":"Community","name":"Nirbhaya","access_token":"CAACIfLVD318BAADXC3CRup6ZATTNWG1D6FmKTvh0dZCOwg4qrZABxSbUKupMiPMUkzVMixtZBzUYhHpzmFBB2mlv7pUIfBeLSHfZBVhpavXeH4BZAfl9v8rkoZAtaZBd5Ckj5OSHzQvABmaulJZBLfXP4tSiypQFjCRxe1Uf1XqGWn1NtbYb6NcZCJ8h3xjWMsmZBkZD","perms":["ADMINISTER","EDIT_PROFILE","CREATE_CONTENT","MODERATE_CONTENT","CREATE_ADS","BASIC_ADMIN"],"id":"465521570179382"}]";
		// JSONArray array = (JSONArray) sb;
		// "","paging":{"next":"https:\/\/graph.facebook.com\/1006013851\/accounts?access_token=CAACIfLVD318BAJUtzxyLtI6RxlXpbiNpeGN3EZArkmdCuTXuKyxbeZCYrx7ePtXCexZAtfu5qDcvs3nOfIru2ClmXhjgBrwtu9zvBzF4ecOO6718xs40oIPNuR1UtlwcSEbfiafjXfRzJbpfff4FuNpNS9UHrRr0xfLgpzpOeMqpX9LofZBK&limit=5000&offset=5000&__after_id=465521570179382"}}

		int arrayLen = array.length();
		for (int i = 0; i < arrayLen; i++) {
			JSONObject pageObject = (JSONObject) array.get(i);
			String name = pageObject.getString("name"); // (String)subArray.get(0);
			String token = pageObject.getString("access_token"); // (String)subArray.get(0);
			String pid = pageObject.getString("id"); // (String)subArray.get(0);
		}
		url = null;
		return array;
	}

	public static String generateGUIDforReceivedIVMsgs(Long fromUserId) {

		return generateGUIDforReceivedIVMsgs(fromUserId + "");
	}

	public static String generateGUIDforReceivedIVMsgs(String fromUserId) {

		return "srv-" + fromUserId + "-" + UUID.randomUUID().getMostSignificantBits() + "-"
				+ System.currentTimeMillis();
	}

	
	
	// when we read boolean from result set, it returns false if the value in db
	// is null
	// This function will return null if db value is null
	public static Boolean getBooleanAsNull(Object obj) {
		try {
			if (obj == null)
				return null;
			else
				return ((Integer) obj == 0 ? false : true);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getBooleanAsNull").exception(LogConstants.EXCEPTION, e).log();
			return null;
		}
	}

	public static Boolean getBooleanAsNull(String obj) {
		try {
			if (isEmpty(obj))
				return null;
			else
				return Boolean.valueOf(obj);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getBooleanAsNull").exception(LogConstants.EXCEPTION, e).logOpr();
			return null;
		}
	}

	// when we read Integer from result set, it returns 0 if the value in db is
	// null
	// This function will return null if db value is null
	public static Integer getIntegerAsNull(Object obj) {
		try {
			if (obj == null)
				return null;
			else
				return ((Integer) obj);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getIntegerAsNull").exception(LogConstants.EXCEPTION, e).logOpr();
			return null;
		}
	}

	public static Integer getIntegerAsNull(String obj) {
		try {
			if (isEmpty(obj))
				return null;
			else
				return (Integer.valueOf(obj));
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getIntegerAsNull").exception(LogConstants.EXCEPTION, e).logOpr();
			return null;
		}
	}

	public static String hitUrl(String url, String data, String method) throws MalformedURLException, Exception {
		String response = null;
		// Make the connection to Authorize.net
		StringBuilder aResponse = new StringBuilder(512);

		InputStream resultStream = null;
		HttpURLConnection aConnection = null;
		int rc = -1;

		try {
			URL aURL = new URL(url);
			aConnection = (HttpURLConnection) aURL.openConnection();
			aConnection.setDoOutput(true);
			aConnection.setDoInput(true);
			aConnection.setRequestMethod(method);
			aConnection.setAllowUserInteraction(false);

			if (method.equals("POST")) {
				// POST the data
				OutputStreamWriter streamToAuthorize = new java.io.OutputStreamWriter(aConnection.getOutputStream());

				if (data != null)
					streamToAuthorize.write(data);

				streamToAuthorize.flush();
				streamToAuthorize.close();
			}

			rc = aConnection.getResponseCode();

			resultStream = aConnection.getInputStream();
			BufferedReader aReader = new java.io.BufferedReader(new java.io.InputStreamReader(resultStream));

			String aLine = null;
			while ((aLine = aReader.readLine()) != null) {
				aResponse.append(aLine);
			}
			response = aResponse.toString();
			logger.info().field(LogConstants.METHOD, "hitUrl").message("url[" + url + "], data [" + data + "], method ["
					+ method + "] rc [" + rc + "] response [" + response + "]").log();
			return response;
		} catch (MalformedURLException ex) {
			logger.error().field(LogConstants.METHOD, "hitUrl").exception(LogConstants.EXCEPTION, ex)
					.message("url[" + url + "], data [" + data + "], method [" + method + "] rc [" + rc + "]").log();
			throw new MalformedURLException(ex.getMessage());
		} catch (Exception ex) {
			logger.error().field(LogConstants.METHOD, "hitUrl").exception(LogConstants.EXCEPTION, ex)
					.message("url[" + url + "], data [" + data + "], method [" + method + "] rc [" + rc + "]").log();
			throw new Exception(ex);
		} finally {
			try {
				if (resultStream != null) {
					resultStream.close();
				}

				if (aConnection != null) {
					aConnection.disconnect();
				}
			} catch (Exception ex) {
			}
		}
	}

	public static String generateGUIDforTrans() {
		long uid = UUID.randomUUID().getMostSignificantBits();
		uid = (uid < 0) ? (-1 * uid) : uid;

		return Long.toString(uid) + "_" + System.currentTimeMillis();
	}

	private static String PREFIX = "\\u";

	public static String native2Ascii(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			sb.append(char2Ascii(chars[i]));
		}
		return sb.toString();
	}

	private static String char2Ascii(char c) {
		if (c > 127) {
			StringBuilder sb = new StringBuilder();
			sb.append(PREFIX);
			int code = (c >> 8);
			String tmp = Integer.toHexString(code);
			if (tmp.length() == 1) {
				sb.append("0");
			}
			sb.append(tmp);
			code = (c & 0xFF);
			tmp = Integer.toHexString(code);
			if (tmp.length() == 1) {
				sb.append("0");
			}
			sb.append(tmp);
			return sb.toString();
		} else {
			return Character.toString(c);
		}
	}



	public static String getDateByTimeZone(String blDate, String zone, String dateFormat) {

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

		Date bdate = null;

		TimeZone tZone = TimeZone.getDefault();

		if (!Util.isEmpty(zone)) {
			zone = zone.substring(zone.indexOf(")") + 1);
			zone = zone.trim();
			tZone = TimeZone.getTimeZone(zone);
		}

		try {
			bdate = formatter.parse(blDate);
		} catch (ParseException e) {
			logger.error().field(LogConstants.METHOD, "getDateByTimeZone").exception(LogConstants.EXCEPTION, e).log();
		}

		Calendar blogDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		blogDate.setTimeInMillis(bdate.getTime());
		String rv = getDateStringFromUtc(blogDate, tZone, dateFormat);
		return rv;
	}


	public static String getDateByTimeZone(String blDate, String zone) {

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

		Date bdate = null;

		TimeZone tZone = TimeZone.getDefault();

		if (!Util.isEmpty(zone)) {
			zone = zone.substring(zone.indexOf(")") + 1);
			zone = zone.trim();
			tZone = TimeZone.getTimeZone(zone);
		}

		try {
			bdate = formatter.parse(blDate);
		} catch (ParseException e) {
			logger.error().field(LogConstants.METHOD, "getDateByTimeZone").exception(LogConstants.EXCEPTION, e).log();
		}

		Calendar blogDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		blogDate.setTimeInMillis(bdate.getTime());
		String rv = getDateStringFromUtc(blogDate, tZone);
		return rv;
	}

	public static String getDateStringFromUtc(Calendar dt, TimeZone timeZone) {

		return getDateStringFromUtc(dt, timeZone, AppConfig.getBlogDateFormat());

	}
	

	public static String getAgeByTimeZone(long utcMillis, String zone, String dateFormat) {
		// String str_date="11-June-07"; 2012-01-23 16:43:24.0
		TimeZone tZone = TimeZone.getDefault();

		if (zone != null) {
			zone = zone.substring(zone.indexOf(")") + 1);
			zone = zone.trim();
			tZone = TimeZone.getTimeZone(zone);
		}

		// Calendar
		// blogDate=GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
		// blogDate.setTimeInMillis(utcMillis);

		Calendar today = getCurrentDateUTC();

		long milliseconds1 = today.getTimeInMillis();
		long milliseconds2 = utcMillis;
		long diff = milliseconds1 - milliseconds2;
		long diffHours = TimeUnit.MILLISECONDS.toHours(diff);
		long diffMinutes = 0;
		// long diffSeconds;
		String rv;
		if (diffHours < 24) {
			if (diffHours > 0)
				rv = diffHours + " Hours ago";
			else {
				diffMinutes = TimeUnit.MILLISECONDS.toMinutes(diff) - TimeUnit.HOURS.toMinutes(diffHours);
				if (diffMinutes > 0)
					rv = diffMinutes + " Minutes ago";
				else {
					// diffSeconds = TimeUnit.MILLISECONDS.toSeconds(diff) -
					// TimeUnit.HOURS.toSeconds(diffHours) -
					// TimeUnit.HOURS.toMinutes(diffMinutes);
					rv = " Few Seconds ago";
				}
			}
		} else {

			rv = getDateStringFromUtc(utcMillis, tZone, dateFormat);
		}
		// logger.info(Common.toDateStr(blogDate));
		return rv;
	}

	public static String getDateStringFromUtc(Calendar dt, TimeZone timeZone, String format) {

		String str = null;
		try {
			DateTime dateT = new DateTime(dt.getTime());
			dateT = dateT.withZoneRetainFields(DateTimeZone.forID("UTC"));
			dateT = dateT.toDateTime(DateTimeZone.forID(timeZone.getID()));
			ZonedDateTime zonedDateTime = dateT.toGregorianCalendar().toZonedDateTime();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern(format);
			str = fmt.format(zonedDateTime);
		} catch (Exception e) {
			str = "";
		}
		return str;

	}

	public static String getDateStringFromUtc(Calendar dt, String format) {
		TimeZone tZone = TimeZone.getTimeZone("UTC");
		return getDateStringFromUtc(dt, tZone, format);
	}


	public static String getDateStringFromUtc(long utcMillis, TimeZone timeZone, String dateFormat) {

		String str = null;
		try {
			DateTime dateT = new DateTime(utcMillis);
			dateT = dateT.withZoneRetainFields(DateTimeZone.forID("UTC"));
			dateT = dateT.toDateTime(DateTimeZone.forID(timeZone.getID()));
			ZonedDateTime zonedDateTime = dateT.toGregorianCalendar().toZonedDateTime();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern(dateFormat);
			str = fmt.format(zonedDateTime);
		} catch (Exception e) {
			str = "";
		}
		return str;
	}

	public static boolean isValidContact(String contactId) {
		// Note use EmailValidator ev = new EmailValidator(); to validate email
		// address
		return isValidPhone(contactId) || contactId.contains("@");
	}

	public static boolean isValidPhone(String phone) {
		if (phone == null || phone.length() <= 5) {
			return false;
		}
		return Common.isDigits(phone);
	}

	public static boolean isDigits(String s) {
		return s.matches("[0-9]+");
	}
	
	/**
	 * @param inviteConfigObj
	 * @param inviteConfigDtl
	 */
	public static void appendJSON(JSONObject destJSON, JSONObject srcJSON) {


		try {
			Iterator<String> keysItr = srcJSON.keys();
			while (keysItr.hasNext()) {
				String key = keysItr.next();
				Object value;
				value = srcJSON.get(key);
				destJSON.put(key, value);
			}
		} catch (JSONException e) {
			logger.error().field(LogConstants.METHOD, "appendJSON").exception(LogConstants.EXCEPTION, e).log();
		}
	}


	public static HashMap<String, Object> readBulkUploadMultipartData(HttpServletRequest request,
			String sourceAppType) {

		String errorStatus = null;
		try {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// Set factory constraints
			int maxFileSize = 100000000;

			factory.setSizeThreshold(maxFileSize);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Check that we have a file upload request
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) {
				// Note: Used the same limits as used in media upload
				upload.setSizeMax(maxFileSize);
				// Parse the request
				try {

					List<FileItem> items = upload.parseRequest(request);

					HashMap<String, Object> dataSet = new HashMap<String, Object>();
					byte[] data = null;
					for (FileItem fileItem : items) {
						logger.debug()
								.field(LogConstants.METHOD, "readBulkUploadMultipartData").message("Content Type ["
										+ fileItem.getContentType() + "] the file name is [" + fileItem.getName() + "]")
								.logOpr();
						String fileName = fileItem.getName();
						if (fileName != null && fileName.length() > 0) {
							if (fileItem.isFormField()) {
								processFormField(fileItem);
							} else {
								data = fileItem.get();
							}
							dataSet.put(fileName, data);
						}
					}

					return dataSet;
				} catch (FileUploadException e) {
					logger.error().field(LogConstants.METHOD, "readBulkUploadMultipartData")
							.exception(LogConstants.EXCEPTION, e).logOpr();
				}
			} else {
				logger.error().field(LogConstants.METHOD, "readBulkUploadMultipartData")
						.message("Incorrect web request for file upload. No file contents sent by the client.")
						.logOpr();
			}
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "readBulkUploadMultipartData")
					.exception(LogConstants.EXCEPTION, e).logOpr();
		}
		return null;
	}


	public static byte[] getFileData(String filePath) throws Exception {

		// Read file
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);

		ByteArrayOutputStream bos = null;
		byte file_data[] = null;
		try {
			// ContentConnection includes a length method
			int length = (int) file.length();
			if (length != -1) {
				file_data = new byte[length];

				// Read image into an array
				fis.read(file_data);
			} else { // Length is not available
				bos = new ByteArrayOutputStream();

				int ch;
				while ((ch = fis.read()) != -1) {
					bos.write(ch);
				}

				file_data = bos.toByteArray();
				bos.close();
			}

		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getFileData").exception(LogConstants.EXCEPTION, e).log();
		} finally {
			// Clean up
			if (fis != null)
				fis.close();

			if (bos != null)
				bos.close();
		}

		return file_data;

	}

	public static Calendar getDateByTimeZoneFromUTC(String dateUTC, String zone) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

		Date bdate = null;

		TimeZone tZone = TimeZone.getDefault();

		if (!Util.isEmpty(zone)) {
			zone = zone.substring(zone.indexOf(")") + 1);
			zone = zone.trim();
			tZone = TimeZone.getTimeZone(zone);
		}

		try {
			bdate = formatter.parse(dateUTC);
		} catch (ParseException e) {
			logger.error().field(LogConstants.METHOD, "getDateByTimeZoneFromUTC").exception(LogConstants.EXCEPTION, e)
					.log();
		}

		try {
			DateTime dateT = new DateTime(bdate.getTime());
			dateT = dateT.withZoneRetainFields(DateTimeZone.forID("UTC"));
			dateT = dateT.toDateTime(DateTimeZone.forID(tZone.getID()));
			return dateT.toGregorianCalendar();
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getDateByTimeZoneFromUTC").exception(LogConstants.EXCEPTION, e)
					.log();
		}

		return null;

	}

	public static Calendar getCurrentDateUtcByTimeZone(String zone) {

		TimeZone tZone = TimeZone.getDefault();
		Calendar dt = getCurrentDateUTC();
		if (!Util.isEmpty(zone)) {
			zone = zone.substring(zone.indexOf(")") + 1);
			zone = zone.trim();
			tZone = TimeZone.getTimeZone(zone);
		}

		try {
			DateTime dateT = new DateTime(dt.getTime());
			dateT = dateT.withZoneRetainFields(DateTimeZone.forID("UTC"));
			dateT = dateT.toDateTime(DateTimeZone.forID(tZone.getID()));
			return dateT.toGregorianCalendar();
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getCurrentDateUtcByTimeZone")
					.exception(LogConstants.EXCEPTION, e).log();
		}

		return null;

	}

	public static String getDateString(Calendar cal) {
		return (cal == null) ? null
				: (cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH)
						+ " " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
						+ cal.get(Calendar.SECOND) + " " + cal.getTimeZone().getID());
	}

	public static String getDateStringNoZone(Calendar cal) {
		return (cal == null) ? null
				: (cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH)
						+ " " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
						+ cal.get(Calendar.SECOND));
	}


	public static boolean fileExists(String filePath) {
		File source = new File(filePath);
		if (!source.exists()) {
			try {
				throw new FileNotFoundException(filePath);
			} catch (FileNotFoundException e) {
				logger.error().field(LogConstants.METHOD, "fileExists").exception(LogConstants.EXCEPTION, e).log();
				return false;
			}
		}
		return true;
	}


	public static ArrayList<String> StrToArrayList(String str, String separator) {
		ArrayList<String> arrList = new ArrayList<String>();
		String[] strArr = str.split(separator);
		for (int i = 0; i < strArr.length; i++)
			arrList.add(strArr[i]);
		return arrList;
	}

	public static ArrayList<String> toArrayList(JSONArray ja) {
		ArrayList<String> list = new ArrayList<String>();
		if (ja != null) {
			int len = ja.length();
			for (int i = 0; i < len; i++) {
				try {
					list.add(ja.getString(i));
				} catch (JSONException e) {
					continue;
				}
			}
		}
		return list;
	}

	public static String[] toArray(JSONArray ja) {
		if (ja != null) {
			String list[] = new String[ja.length()];
			int len = ja.length();
			for (int i = 0; i < len; i++) {
				try {
					list[i] = ja.getString(i);
				} catch (JSONException e) {
					continue;
				}
			}
			return list;
		}
		return new String[0];
	}

	// convert from UTF-8 -> internal Java String format
	public static String convertFromUTF8(String s) {
		String out = null;
		try {
			out = new String(s.getBytes(ISO_8859_1), UTF_8);
		} catch (java.io.UnsupportedEncodingException e) {
			logger.error().field(LogConstants.METHOD, "convertFromUTF8").exception(LogConstants.EXCEPTION, e).log();
			return s;
		}
		return out;
	}

	// convert from internal Java String format -> UTF-8
	public static String convertToUTF8(String s) {
		String out = null;
		try {
			out = new String(s.getBytes(UTF_8), ISO_8859_1);
		} catch (java.io.UnsupportedEncodingException e) {
			logger.error().field(LogConstants.METHOD, "convertToUTF8").exception(LogConstants.EXCEPTION, e).log();
			return s;
		}
		return out;
	}

	public static String getRequestHeadersString(HttpServletRequest request) {
		String header = "";
		Enumeration<String> enHeaderNames = request.getHeaderNames();
		while (enHeaderNames.hasMoreElements()) {
			String headerName = enHeaderNames.nextElement();
			header += (headerName + " >> " + request.getHeader(headerName) + "\n");
		}

		return header;

	}

	
	public static HashMap<String, Object> toHashMap(JSONObject value) {
		HashMap<String, Object> resMap = new HashMap<String, Object>();
		if (value != null) {
			Iterator<String> keys = value.keys();
			while (keys.hasNext()) {
				String jKey = keys.next();
				try {
					resMap.put(jKey, value.get(jKey));
				} catch (Exception e) {
					logger.error().field(LogConstants.METHOD, "toHashMap").exception(LogConstants.EXCEPTION, e).log();
				}
			}
		}
		return resMap;
	}

	
	public static byte[] readDiskFileData(String fullPath) throws IOException {

		File tempFile = new File(fullPath);

		return Files.readAllBytes(tempFile.toPath());

	}

	


	public static String toTimeAmPm(Long date) {
		return TIME_AMPM_FORMATTER.format(new Date(date));
	}

	public static Map<String, Object> jsonToMap(JSONObject json) throws JSONException {
		Map<String, Object> retMap = new HashMap<String, Object>();

		if (json != JSONObject.NULL) {
			retMap = toMap(json);
		}
		return retMap;
	}

	public static Map<String, Object> jsonToMap(String jsonStr) throws JSONException {

		try {
			if (jsonStr != null)
				return toMap(new JSONObject(jsonStr));
		} catch (JSONException je) {
			logger.info().message("jsonToMap(string): ERROR[" + je.getMessage() + "]").logOpr();
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> toMap(JSONObject object) throws JSONException {
		Map<String, Object> map = new HashMap<String, Object>();

		Iterator<String> keysItr = object.keys();
		while (keysItr.hasNext()) {
			String key = keysItr.next();
			Object value = object.get(key);

			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			}

			else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			map.put(key, value);
		}
		return map;
	}

	public static List<Object> toList(JSONArray array) throws JSONException {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.length(); i++) {
			Object value = array.get(i);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			}

			else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			list.add(value);
		}
		return list;
	}


	public static String trimToLength(final String text, int maxLen, String suffix) {

		if (!isEmpty(text) && text.length() > maxLen) {
			// get first maxlen string.
			String tmpText = text.substring(0, maxLen);
			// find last space or work ending.
			int lastWordPos = tmpText.lastIndexOf(' ');
			if (lastWordPos != -1) {
				tmpText = tmpText.substring(0, lastWordPos);
			}
			tmpText = tmpText + suffix;

			return tmpText;
		}

		return text;
	}

	public static String getCorrelationID() {
		return UUID.randomUUID().toString();
	}
	
	public static void setMDCCorrelationID(JSONObject jObj) {
		
		if(jObj.has(RCSConstant.CORRELATION_ID)){
			return;
		}
		
		String crId = org.slf4j.MDC.get(RCSConstant.CORRELATION_ID);
		crId = (crId != null)?crId:getCorrelationID();
		
		try {
			jObj.put(RCSConstant.CORRELATION_ID, crId);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void setCorrelationIdToMDC(String jsonStr){
		try{
			JSONObject jObj = new JSONObject(jsonStr);
			setCorrelationIdToMDC(jObj);
		}catch(Exception ex){
			setCorrelationIdToMDC(new JSONObject());
		}
	}
	
	public static void setCorrelationIdToMDC(JSONObject jsonObj) {
		String crId = Common.getStringAsNull(jsonObj, RCSConstant.CORRELATION_ID);
		crId = (crId==null)?org.slf4j.MDC.get(RCSConstant.CORRELATION_ID):crId;
		crId  = (crId==null)?Common.getCorrelationID():crId;
		org.slf4j.MDC.put(RCSConstant.CORRELATION_ID, crId);
	}
	
	public static Map json2Map(String jsonData) {
		
		try {
			return jsonToMap(jsonData);
			//return gson.fromJson(isEmpty(jsonData) ? "{}" : jsonData, Map.class);
		} catch (Exception ex) {
			Map m = gson.fromJson("{}", Map.class);
			m.put("data_str", jsonData);
			return m;
		}
	}

	public static Map json2Map(JSONObject jsonObject) {
		return json2Map((jsonObject == null) ? "{}" : jsonObject.toString());
	}
	

	public static Calendar TimestampToCalender(Timestamp ts) {
		if (ts == null)
			return null;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(ts.getTime());
			return cal;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Calendar LongToCalender(long ts) {
		if (ts == 0L)
			return null;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(ts);
			return cal;
		} catch (Exception e) {
			return null;
		}
	}
	

	public static String getDayNumberSuffix(int day) {
	    if (day >= 11 && day <= 13) {
	        return "th";
	    }
	    switch (day % 10) {
	    case 1:
	        return "st";
	    case 2:
	        return "nd";
	    case 3:
	        return "rd";
	    default:
	        return "th";
	    }
	}
	
	public static Float getRoundOfValue(Float origVal) {
		df.setRoundingMode(RoundingMode.UP);
		return Float.parseFloat(df.format(origVal));
	}
	
	public static String formatPhoneNumber(String canonicalPhNo, String iso2) {

		if (!Common.isDigits(canonicalPhNo)) {
			return canonicalPhNo;
		}

		String formattedPhone = null;

		try {

			if (iso2 != null) {
				PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
				PhoneNumber phoneNumber = getPhoneNumber(canonicalPhNo, iso2);
				if (phoneNumber == null) {
					logger.error().field(LogConstants.METHOD, "formatPhoneNumber")
							.message("not a valid phone " + canonicalPhNo).logOpr();
					return null;
				}
				if (phoneNumberUtil.isValidNumber(phoneNumber)) {
					formattedPhone = getFormattedPh(phoneNumber);
				}
			}
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "formatPhoneNumber").exception(LogConstants.EXCEPTION, e)
					.logOpr();
		}

		if (formattedPhone == null) {
			formattedPhone = "+" + canonicalPhNo;
			logger.debug().field(LogConstants.METHOD, "formatPhoneNumber")
					.message("countryIso2 not found for canonicalPhNo " + canonicalPhNo).logOpr();
		}
		logger.debug().field(LogConstants.METHOD, "formatPhoneNumber")
				.message("formatPhoneNumber():numberFormatted[" + formattedPhone + "]");

		return formattedPhone;
	}

	public static String getFormattedPh(PhoneNumber phone) {
		if (phone == null) {
			logger.debug().field(LogConstants.METHOD, "getFormattedPh").message("PhoneNumber is null");
			return null;
		}

		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		try {
			return phoneUtil.format(phone, PhoneNumberFormat.INTERNATIONAL);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getFormattedPh").exception(LogConstants.EXCEPTION, e)
					.message(" phone " + phone).logOpr();
		}
		return String.valueOf(phone.getNationalNumber());
	}
	
	private static PhoneNumber getPhoneNumber(String phone, String countryIso2) {

		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		try {
			return phoneUtil.parse(phone, countryIso2);
		} catch (Exception e) {
			logger.error().field(LogConstants.METHOD, "getPhoneNumber").exception(LogConstants.EXCEPTION, e)
					.message("phone " + phone + " country " + countryIso2).logOpr();
		}
		return null;
	}

	
	public static String getSubmitMailSubject(String botName) {
		String subject = "%s has been submitted for verification";
		return String.format(subject, botName);
	}
	
	public static String getSubmitMailDetails(ArrayList<String> data) {
		String body = "Hi %s\n\n" +
			"Your bot details have been successfully captured for submission to the DotGo RCS directory.\n\n" +
			"Developer Details:\n" +
			"First Name : %s\n" +
			"Last Name : %s\n" + 
			"Company Name : %s\n" + 
			"Designation : %s\n" + 
			"Email ID: %s\n" + 
			"Phone Number: %s\n\n" +
			"Bot Details: \n" + 
			"Bot Name : %s\n" + 
			"Short Description : %s\n" + 
			"Category : %s\n" + 
			"Supported Countries: %s\n" + 
			"Description: %s\n" + 
			"Platform: %s\n" + 
			"Privacy Policy URL: %s\n" + 
			"Terms of Use URL: %s\n" + 
			"First Message URL: %s\n" + 
			"Request for Access URL: %s\n\n" +
			"We will verify your Bot details and publish it on Dotgo RCS Directories. You will be notified once your Bot is published.\n" + 
			"\n" + 
			"Feel free to contact us on %s if you have any queries.\n" + 
			"\n" + 
			"Thank You!";
		
		return String.format(body, data.stream().toArray(String[] ::new));
	}
	
	public static String getPublishedMailSubject(String botName) {
		String subject = "Congratulations! %s has been published on Dotgo RCS Directory";
		return String.format(subject, botName);
	}
	
	public static String getPublishedMailDetails(ArrayList<String> data) {
		String body = "Hi %s\n\n" +
			"Your Bot has been published on Dotgo RCS Directory. Anyone visiting Dotgo RCS Directory will be able to discover your Bot!.\n\n" +
			"Developer Details:\n" +
			"First Name : %s\n" +
			"Last Name : %s\n" + 
			"Company Name : %s\n" + 
			"Designation : %s\n" + 
			"Email ID: %s\n" + 
			"Phone Number: %s\n\n" +
			"Bot Details: \n" + 
			"Bot Name : %s\n" + 
			"Short Description : %s\n" + 
			"Category : %s\n" + 
			"Supported Countries: %s\n" + 
			"Description: %s\n" + 
			"Platform: %s\n" + 
			"Privacy Policy URL: %s\n" + 
			"Terms of Use URL: %s\n" + 
			"First Message URL: %s\n" + 
			"Request for Access URL: %s\n\n" +
			"Feel free to contact us on %s if you have any queries.\n" + 
			"\n" + 
			"Thank You!";
		
		return String.format(body, data.stream().toArray(String[] ::new));
	}
}