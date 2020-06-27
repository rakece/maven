package com.kirusa.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.codehaus.jettison.json.JSONException;

import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.logs.LogConstants;


public class CompressionUtil {
	
	private static IvLogger logger = LoggerFactory.getLogger(CompressionUtil.class);
	
	private static int MAX_BUFF_SIZE = 32 * 1024;

	public static byte[] unZip(byte[] zippedArr) throws IOException {

		if (zippedArr == null) {
			return null;
		}
		GZIPInputStream zins = null;
		try {
			Long stime = System.currentTimeMillis();

			ByteArrayInputStream bytesIn = new ByteArrayInputStream(zippedArr);
			zins = new GZIPInputStream(bytesIn);
			ByteArrayOutputStream contents = new ByteArrayOutputStream();
			int bufferSize = Math.min(zippedArr.length, MAX_BUFF_SIZE);
			byte[] buf = new byte[bufferSize];
			int len;
			while ((len = zins.read(buf)) > 0) {
				contents.write(buf, 0, len);
			}
			byte[] unzipData = contents.toByteArray();

			return unzipData;
		} catch (Exception e) {
			logger.error()
				.field(LogConstants.METHOD,"unZip")
				.exception(LogConstants.EXCEPTION, e).logOpr();
		} finally {
			if (zins != null) {
				zins.close();
			}
		}
		return null;
	}

	public static byte[] zip(InputStream inputStream) throws IOException {

		GZIPOutputStream zos = null;
		try {
			Long stime = System.currentTimeMillis();
			int available = inputStream.available();
			ByteArrayOutputStream baos = new ByteArrayOutputStream(available);
			zos = new GZIPOutputStream(baos);

			int bufferSize = Math.min(available, MAX_BUFF_SIZE);
			byte[] buffer = new byte[bufferSize];
			int bytesRead;
			// read file and write it into form...
			while ((bytesRead = inputStream.read(buffer, 0, bufferSize)) > 0) {
				zos.write(buffer, 0, bytesRead);
			}
			zos.finish();
			byte[] zipData = baos.toByteArray();

			return zipData;
		} catch (Exception e) {
			logger.error()
				.field(LogConstants.METHOD,"zip")
				.exception(LogConstants.EXCEPTION, e).logOpr();

			return null;
		} finally {
			if (zos != null) {
				zos.close();
			}
		}
	}

	public static byte[] zip(String filePath) throws IOException {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(filePath));
			return zip(fis);
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}

	/*
	 * public static String compress(String text) { ByteArrayOutputStream baos =
	 * new ByteArrayOutputStream(); try { OutputStream out = new
	 * DeflaterOutputStream(baos); out.write(text.getBytes("UTF-8"));
	 * out.close(); return bytesToString(baos.toByteArray()); } catch
	 * (IOException e) { throw new AssertionError(e); } }
	 * 
	 * public static String bytesToString(byte[] data) { try { return new
	 * String(data, "UTF-8"); } catch (Exception e) { 
	 * return null; } }
	 */
	/*
	 * public static String compress(String text) { ByteArrayOutputStream baos =
	 * new ByteArrayOutputStream(); try { OutputStream out = new
	 * DeflaterOutputStream(baos); out.write(text.getBytes("UTF-8"));
	 * out.close(); } catch (IOException e) { throw new AssertionError(e); } try
	 * { return new String(baos.toByteArray(),"UTF-8"); } catch
	 * (UnsupportedEncodingException e) { return null; } }
	 * 
	 * public static String decompress(String text) { InputStream in = null; try
	 * { in = new InflaterInputStream(new ByteArrayInputStream(
	 * text.getBytes("UTF-8"))); } catch (UnsupportedEncodingException e1) {
	 *  } ByteArrayOutputStream baos = new
	 * ByteArrayOutputStream(); try { byte[] buffer = new byte[8192]; int len;
	 * while ((len = in.read(buffer)) > 0) baos.write(buffer, 0, len); return
	 * new String(baos.toByteArray(), "UTF-8"); } catch (IOException e) { throw
	 * new AssertionError(e); } }
	 */

	public static String compress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(str.getBytes());
		gzip.close();
		String outStr = out.toString("ISO-8859-1");
		return outStr;
	}

	public static String decompress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return str;
		}
		GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(
				str.getBytes("ISO-8859-1")));
		BufferedReader bf = new BufferedReader(new InputStreamReader(gis,
				"ISO-8859-1"));
		String outStr = "";
		String line;
		while ((line = bf.readLine()) != null) {
			outStr += line;
		}
		return outStr;
	}

	public static void main(String[] args) throws JSONException, IOException {
		String s = "10-03 15:47:40.047: I/SHORTREQUESTNC(9120): NetworkController handleEvent() : bean to json 10-03 15:47:40.047: I/SHORTREQUESTNC(9120): NetworkController handleEvent() : bean to json 10-03 15:47:40.047: I/SHORTREQUESTNC(9120): NetworkController handleEvent() : bean to json";

		// String s1 =
		// "{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}{\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} {\"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841} \"cmd\":\"send_voice\",\"status\":\"ok\",\"actions_required\":\"set_device_info, fetch_contacts, sign_in,set_device_info\",\"last_fetched_msg_id\":94645,\"msgs\":[{\"msg_id\":94645,\"msg_dt\":1393924014000,\"source_app_type\":\"ivc\",\"msg_flow\":\"s\",\"from_iv_user_id\":2624841}";
		String s1 = "Ajay 20-Feb feedback:  1) Different name in title and in associated conversation page. 2) Native Address book phone category should be shown as it is in InstaVoice"
				+ "3) Voice message play shows downloading, should be quick for most recent received messages."
				+ "4) Streaming support for OPUS during play."
				+ "5) Tiles of main page position should be maintained."
				+ "6) Playing of messages in call mode/speaker mode."
				+ "7) Group pictures are not shown when Groups list displayed."
				+ "8) Monitoring data and memory utilization in app itself."
				+ "9) Slider feature for pause, forward, backward etc while playing audio."
				+ "10) Profile pic update tracking."
				+ "11) Download time"
				+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
		+ "3) Voice message play shows downloading, should be quick for most recent received messages."
		+ "4) Streaming support for OPUS during play."
		+ "5) Tiles of main page position should be maintained."
		+ "6) Playing of messages in call mode/speaker mode."
		+ "7) Group pictures are not shown when Groups list displayed."
		+ "8) Monitoring data and memory utilization in app itself."
		+ "9) Slider feature for pause, forward, backward etc while playing audio."
		+ "10) Profile pic update tracking."
		+ "11) Download time"
		+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
		+ "3) Voice message play shows downloading, should be quick for most recent received messages."
		+ "4) Streaming support for OPUS during play."
		+ "5) Tiles of main page position should be maintained."
		+ "6) Playing of messages in call mode/speaker mode."
		+ "7) Group pictures are not shown when Groups list displayed."
		+ "8) Monitoring data and memory utilization in app itself."
		+ "9) Slider feature for pause, forward, backward etc while playing audio."
		+ "10) Profile pic update tracking."
		+ "11) Download time"
		+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
		+ "3) Voice message play shows downloading, should be quick for most recent received messages."
		+ "4) Streaming support for OPUS during play."
		+ "5) Tiles of main page position should be maintained."
		+ "6) Playing of messages in call mode/speaker mode."
		+ "7) Group pictures are not shown when Groups list displayed."
		+ "8) Monitoring data and memory utilization in app itself."
		+ "9) Slider feature for pause, forward, backward etc while playing audio."
		+ "10) Profile pic update tracking."
		+ "11) Download time"
		+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
+ "3) Voice message play shows downloading, should be quick for most recent received messages."
+ "4) Streaming support for OPUS during play."
+ "5) Tiles of main page position should be maintained."
+ "6) Playing of messages in call mode/speaker mode."
+ "7) Group pictures are not shown when Groups list displayed."
+ "8) Monitoring data and memory utilization in app itself."
+ "9) Slider feature for pause, forward, backward etc while playing audio."
+ "10) Profile pic update tracking."
+ "11) Download time"
+ "12) Replace Vobolo name with Blogs and logo in Android and iOS."
		+ "13) Delete account number." + "14) Tranfer mobile number. Prashant";

		long stime = System.currentTimeMillis();
		String s2 = CompressionUtil.compress(s1);

		String s3 = CompressionUtil.decompress(s2);

		
//		long etime = System.currentTimeMillis() - stime;

//
//		stime = System.currentTimeMillis();
//		String s3 = CompressionUtil.decompress(s2);
//		etime = System.currentTimeMillis() - stime;


	}
}
