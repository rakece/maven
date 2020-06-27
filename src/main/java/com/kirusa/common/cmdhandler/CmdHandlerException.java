/*
 * Copyright (c) 2012 Kirusa, Inc.
 * All rights reserved. Patents pending.
 *
 * This software is the confidential and proprietary information of
 * Kirusa, Inc.  Use it only in accordance with the terms of the
 * license agreement with Kirusa.
 *
 * KIRUSA MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE, EITHER EXPRESSED OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. KIRUSA
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A
 * RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 *
 * File: CmdHandlerException.java
 * Author: Archana Thapar 
 * Created on 4 July, 2012
 */
package com.kirusa.common.cmdhandler;

import org.codehaus.jettison.json.JSONObject;


import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.util.Common;
import com.kirusa.util.RCSConstant;


public class CmdHandlerException extends Exception {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private static final IvLogger logger = LoggerFactory
			.getLogger(CmdHandlerException.class);

	public static final int ERRCODE_SYSTEM = 1;
	
	public static final int ERRCODE_UNSUPPORTED_CMD = 1001;
	
	public static final int ERRCODE_NON_EXISTING_IDENTITY = 1000;
	public static final int ERRCODE_REQUIRED_FIELD_MISSING = 1002;
	
	public static String ERRMSG_CONTACT_ALREADY_IN_USE = "already in use.";

	public static String ERRMSG_SYSTEM = "System Error: ";

	public static String ERRMSG_UNSUPPORTED_VALUE = ERRMSG_SYSTEM
			+ "In cmd [%s], field [%s], value [%s] is not allowed. Allowed values are %s";
	public static final String ERRMSG_NOTES_VB = "'notes' and 'vb'";

	public static String ERRMSG_INCORRECT_APP_SECURE_KEY = "Invalid application secure key.";
	public static String ERRMSG_INCORRECT_REG_SECURE_KEY = "Invalid registration secure key.";
	public static String ERRMSG_INCORRECT_USER_SECURE_KEY = "Invalid or expired device token. Please contact InstaVoice Support";
	public static String ERRMSG_REQUIRED_FIELD_MISSING = "The required parameter [%s] is missing.";
	public static String ERRMSG_REG_EXPIRED = "Registration key expired.";
	public static String ERRMSG_REG_NOT_FOUND = "Wrong registration secure key is used.";
	public static String ERRMSG_INVALID_PIN = "Invalid PIN.";
	public static String ERRMSG_EMPTY_AUDIO_CONTENT = "Audio message cannot be empty.";
	public static String ERRMSG_INVALID_JSON_DATA = "Invalid JSON data [%s].";
	public static String ERRMSG_UNSUPPORTED_NETWORK = "Unsupported Network MCC-MNC [%s].";
	public static final String ERRMSG_UNSUPPORTED_ISO = "Unsupported Country ISO [%s].";
	public static final String ERRMSG_UNSUPPORTED_CMD = "Unsupported cmd [%s].";
	public static final String ERRMSG_PCM_FORMAT_ERROR = "PCM to a-law conversion error [%s].";
	public static final String ERRMSG_AUDIO_FILE_CREATION = "Error in creating audio file. Reason: [%s].";
	public static final String ERRMSG_INVALID_IV_USER_ID = "The IV id does not exist or not allowed.";
	public static final String ERRMSG_UNREGISTERED_DEVICE = "Contact has not registered any device.";
	public static final String ERRMSG_NO_RECIPIENT = "All recipient ids are invalid.";
	public static final String ERRMSG_NO_COUNTRY_EXISTS = "No Country found.";
	public static final String ERRMSG_NO_CARRIER_EXISTS = "No Carrier data found.";
	public static final String ERRMSG_INVALID_COUNTRY_CODE = "Invalid Country Code [%s].";
	public static final String ERRMSG_UNSUPPORTED_CONTACT_OPERATION = "Invalid contact operation specifier [%s].";
	public static final String ERRMSG_ERROR_IN_DELETION = "Error in deletion: [%s].";
	public static final String ERRMSG_ERROR_IN_UPDATION = "Error in updation: [%s].";
	public static final String ERRMSG_ERROR_IN_CREATION = "Error in creation: [%s].";
	public static final String ERRMSG_INVALID_LOGIN_ID = "No user found with the given credentials [%s].";
	public static final String ERRMSG_MSG_USER_MISMATCH = "Message and User mismatch [%s].";
	public static final String ERRMSG_SECURE_KEY_DEVICE_ID_MISSING = "user_secure_key or device_id is must for Sign-in.";
	public static final String ERRMSG_DEVICE_ALREADY_ASSIGNED = "This device is already assigned to another Insta Voice User.";
	public static final String ERRMSG_USER_DEVICE_NOT_FOUND = "User device Id [%d] does not exist.";
	public static final String ERRMSG_ERROR_IN_SECUREKEY_GENERATION = "Error in generating user secure key.";
	public static final String ERRMSG_ERROR_IN_FBDISCONNECT = "Error in Facebook Disconnect.";
	public static final String ERRMSG_CONTACT_ID_ALREADY_IN_USE = "Contact Id [%s], already in use.";
	public static final String ERRMSG_REG_PIN_EXPIRED = "Registration expired.";
	public static final String ERRMSG_ERROR_IN_FACEBOOK_POST = "Error in Facebook Post.";
	public static final String ERRMSG_NOT_CONNECTED_TO_FACEBOOK = "You are not connected to Facebook, please connect.";
	public static final String ERRMSG_PRIMARY_CONTACT_NOT_FOUND = "No contact found with contact Id [%s].";
	public static final String ERRMSG_INVALID_DATE_FORMAT = "Invalid date format [%s].";
	public static final String ERRMSG_INVALID_PASSWORD = "Invalid credentials.";
	public static final String ERRMSG_ERROR_IN_APP_TYPE = "Error in App Type specification [%s].";
	public static final String ERRMSG_ERROR_IN_TWDISCONNECT = "Error in Twitter Disconnect.";
	public static final String ERRMSG_NOT_CONNECTED_TO_TWITTER = "You are not connected to Twitter, please connect.";
	public static final String ERRMSG_ERROR_NOT_CONNECTED_TO_APP = "You are not connected to [%s].";
	public static final String ERRMSG_NO_CELEBRITY_FOUND = "No celebrity found for country [%s].";
	public static final String ERRMSG_NO_MSG_EXISTS = "No message exists with Msg Id [%d].";
	public static final String ERRMSG_EMPTY_PROFILE_PIC_CONTENT = "Profile picture content is empty.";
	public static final String ERRMSG_PROFILE_PIC_FILE_CREATION = "Error in creating profile pic file.";
	public static final String ERRMSG_FACEBOOK_POST_NOT_ENABLED = "Posting on your Facebook wall is not enabled.";
	public static final String ERRMSG_TWITTER_POST_NOT_ENABLED = "Posting on your Twitter wall is not enabled.";
	public static final String ERRMSG_INVALID_FOLLOWER_USER_ID = "Non-Existing follower User Id [%s].";
	public static final String ERRMSG_INVALID_FOLLOWING_USER_ID = "Non-Existing following User Id [%s].";;
	public static final String ERRMSG_INVALID_FOLLOWER_FOLLOWING_PAIR = "Non-Existing follower/following Pair [%s].";
	public static final String ERRMSG_NON_EXISTING_SUBSCRIBER = "Non-Existing Subscriber Id [%s].";
	public static final String ERRMSG_INVALID_SUBSCRIPTION = "Subscription allowed for phone users only.";
	public static final String ERRMSG_INVALID_SUBSCRIPTION_PARAMETER = "Invalid subscription parameter: Pass 'S' to subscribe, 'U' to Unsubscribe.";
	public static final String ERRMSG_INVALID_SUBSCRIPTION_ID = "Invalid Subscription service Id [%s].";
	public static final String ERRMSG_NON_EXISTING_USER_ID = "No user exists for User Id [%s].";
	public static final String ERRMSG_ERROR_READING_AUDI_FILE = "Error in reading audio file of Msg Id [%d].";
	public static final String ERRMSG_NON_EXISTING_BLOGGER = "No user exists with phone# [%s].";
	public static final String ERRMSG_NON_EXISTING_BLOGGER_CONTACT = "No user contact existing for a given phone# [%s].";
	public static final String ERRMSG_NON_EXISTING_FOLLOWER = "User with contact number [%s] is not a follower.";
	public static final String ERRMSG_INVALID_EXTERNAL_APP = "Invalid external app [%s] specification.";
	public static final String ERRMSG_UNSUPPORTED_COUNTRY_CODE = "Unsupported Country Code [%s].";
	public static final String ERRMSG_INCORRECT_MSG_TYPE = "Unsupported Msg Type [%s]. Allowed types are iv or vb.";
	public static final String ERRMSG_POST_DISABLED = "Posting on %s wall is disabled.";
	public static final String ERRMSG_AUTHENTICATION_REQUIRED = "Authentication to [%s] is required.";
	public static final String ERRMSG_NON_EXISTING_FB_USER_ID = "User is not connected to Facebook [%s].";
	public static final String ERRMSG_INCORRECT_CONATCT_OPEARTION = "Unsupported operation [%s]. Allowed types are b or u.";
	public static final String ERRMSG_INVALID_VALIDATION_CODE = "Invalid or expired validation code [%s].";
	public static final String ERRMSG_DB_ERROR = "Data is not saved on the server.";
	public static final String ERRMSG_PER_USER_VSMS_LIMIT_REACHED = "You have already sent the maximum allowed VSMS to this user, please wait for a VSMS reply.";
	public static final String ERRMSG_VSMS_LIMIT_REACHED = "You have already sent the maximum allowed VSMS to different users, please wait for a VSMS reply.";
	public static final String ERRMSG_IOEXCEPTION = "Requested resource is not available on the server.";
	public static final String ERRMSG_MAX_ALLOWED_DEVICES = "You have signed in from maximum number of allowed devices. Please disconnect from an unused device.";
	public static final String ERRMSG_FACEBOOK_AUTHENTICATION_ERROR = "Authentication Error: You have changed your Facebook password. Please re-connect to Facebook.";
	public static final String ERRMSG_ERROR_IN_TWITTER_POST = "Error in Twitter post [%s]";
	public static final String ERRMSG_UNREGISTERED_PHONE = "[%s] phone number is not registered with InstaVoice.";
	public static final String ERRMSG_IMAGE_POST_ERROR = "Image IV cannot be shared on external apps";
	public static final String ERRMSG_IMAGE_FILE_CREATION = "Error in creating image file. Reason: [%s].";
	public static final String ERRMSG_VIDEO_FILE_CREATION = "Error in creating video file. Reason: [%s].";
	public static final String ERRMSG_EMPTY_IMAGE_CONTENT = "Image message cannot be empty.";
	public static final String ERRMSG_GROUPID_OR_ALL = "Both group number and fetch all groups cannot be null";
	public static final String ERRMSG_INVALID_GROUPID = "Invalid Group Id [%s]";
	public static final String ERRMSG_NOT_PRIMARY_CONTACT = "Not a Primary Contact [%s]";
	public static final String ERRMSG_REVOKE_NOT_ALLOWED = "Invalid Owner, revoke not allowed";
	public static final String ERRMSG_REVOKE_TIME_ELAPSED = "Revoke allowed within [%s] minutes only";
	public static final String ERRMSG_NON_SUPPORT_BLOGGER = "Not a valid support user [%s]";
	public static final String ERRMSG_RING_CONNECTED = "Ring already connected on Phone Number [%s]";
	public static final String ERRMSG_CREDIT_PURCHASE_DUP_ERROR = "Duplicate Credit purchase. [%s]";
	public static final String ERRMSG_CREDIT_PURCHASE_VER_ERROR = "Credit purchase validation failed. [%s]";

	// System error
	public static final String ERRMSG_UNSUPPORTED_CMD_PARAMETER = "Unsupported command parameter [%s].";
	public static final String ERRMSG_BOTH_PIN_SELFVERIFIED_NULL = "Both pin and self_verified cannot be null";
	public static final String ERRMSG_USER_DEVICE_OWNER_MISMATCH = "Device doesnot belong to [%s].";
	public static final String ERRMSG_NOT_A_GROUP_MEMBER = "IV cannot be delivered, because you are not a member of group id [%s].";
	public static final String ERRMSG_INACTIVE_GROUP = "IV cannot be delivered to an inactive group id [%s].";
	public static final String ERRMSG_PASSWORD_NOTSET = "Invalid Credentials. Password not set";
	public static final String ERRMSG_PRIMARY_CONTACT_DELETION_NOTALLOWED = "Primary contact cannot be deleted";
	public static final String ERRMSG_DUPLICATE_BLOG_CONTENT = "Duplicate blog content";
	public static final String ERRMSG_SEND_PIN_BY_VOICE_NOTSUPPORTED = "No KVSMS Node defined to send pin by Voice";
	public static final String ERRMSG_VALIDATION_CODE_DELIVERY_FAILED = "Validation code delivery by [%s] to [%s] failed";
	public static final String ERRMSG_SEND_PASSWORD = "Invalid Credentials. Password not sent";
	public static final String ERRMSG_INVALID_GUID = "Invalid IV Guid [%s] value";
	public static final String ERRMSG_ATTEMPT_LIMIT_EXCEEDED = "attempt_limit_reached";
	public static final String ERRMSG_HANDLE_EXISTS = "Handle Already Exists";
	public static final String ERRMSG_NONEXISTING_GREETING = "Greeting does not exist. [%s]";
	public static final String ERRMSG_GREETING_ERROR = "Error in Greeting. [%s]";
	public static final String ERRMSG_NOT_RING_CONTACT = "Invalid Ring contact [%s]";
	public static final String ERRMSG_INVALID_PHONE_USER = "IV user and phone number donot match [%s]";
	public static final String ERRMSG_CALLFORWARD_NOT_ENABLED = "Call Forward not enabled for phone network [%s]";
	public static final String ERRMSG_CALLFORWARD_ERROR = "Error reported by Call Forward, reason [%s]";
	public static final String ERRMSG_CREDITS_NOT_SET = "Credits not available";
	public static final String ERRMSG_CREDITS_INSUFFICIENT = "Insufficient credits";

	public static final String ERRMSG_MSG_TYPE_TRANS_NOT_SUPPORTED = "[%s] type not supported for transcription.";
	public static final String ERRMSG_NETWORK_TRANS_NOT_SUPPORTED = "User network not supported";
	public static final String ERRMSG_FAILED_TRANS_PROVIDER = "Transicription failure by provider";
	public static final String ERRMSG_FAILED_TRANS_REQUEST_TIMEOUT = "Request Timed Out";

	public static final String ERRMSG_FAILED_TRANS_REQUEST_INTERNAL = "Transicription processing failed";

	// public static final String ERRMSG_EMPTY_GREETING_ID =
	// "greeting id to be deleted cannot be empty";
	public static final String ERRMSG_INVALID_DATA_VALUE = "Incorrect data value of [%s] field";

	public static final String ERRMSG_FCM_TOPIC_SUBSCRIPTION = "Unable to subscribe device [%s] for topic [%s]";

	public static final String ERRMSG_INVALID_CONTENT_DATA = "Invalid/Missing content data";
	public static final String ERRMSG_BUNDLE_PURCHASE_INVALID = "Invalid bundle/pack [%s]";
	public static final String ERRMSG_BUNDLE_PURCHASE_CANNOT_RENEW = "Bundle cannot be renewed";
	public static final String ERRMSG_BUNDLE_PURCHASE_PENDING = "Your last ReachMe Pack purchase request is still being processed. Please try again after some time";
	
	public static final String ERRMSG_BUNDLE_PURCHASE_EXPIRED= "Your ReachMe Pack is expired.";
	
	public static final String ERRMSG_BUNDLE_INSUFFICIENT_OUT= "Your ReachMe Pack doens't have sufficient balance to make calls.";
	public static final String ERRMSG_BUNDLE_INSUFFICIENT_IN= "Your ReachMe Pack doens't have sufficient balance to receive calls.";
	public static final String ERRMSG_BUNDLE_COUNTRY_NOTALLOWED= "Your ReachMe Pack doens't allow to call  this country's number.";
	public static final String ERRMSG__BUNDLE_FUP_FAILURE= "You have reached FUP limit";
	public static final String ERRMSG_BUNDLE_PURCHASE_NOPURCHASE= "You don't have a ReachMe Pack. Please purchase.";
	public static final String ERRMSG_BUNDLE_PURCHASE_INACTIVE= "Your ReachMe Pack is not active. Please activate.";
	
	public static final String ERRMSG_KONNECT_ALERT_RECIPIENT_NON_IV = "Recipient cannot be non-iv for alert msg [%s]";
	public static final String ERRMSG_KONNECT_SUMMARY = "Error in finding summary [%s]";

	public static final String ERRMSG_COUPON_INVALID = "Invalid coupon code";
	public static final String ERRMSG_REACHME_SUMMARY = "Error in fetching Reachme Summary [%s]";
	public static final String ERRMSG_VN_SUB_EMPTY_LIST = "No subscription products exist";
	public static final String ERRMSG_INVALID_LOCK_DATA = "Invalid lock data [%s]";
	public static final String ERRMSG_VN_IN_USE = "Virtual number is in use [%s]";
	public static final String ERRMSG_VN_IN_LOCK = "Virtual number is locked by some other user [%s]";
	
	public static final String ERRMSG_SUB_PURCHASE_DUP_ERROR = "Duplicate purchase for token [%s]";
	public static final String ERRMSG_SUB_PURCHASE_IV_ERROR = "Subscription request from IV App is not allowed [%s]";
	public static final String ERRMSG_SUB_PURCHASE_VER_ERROR = "Subscription purchase validation failed. [%s]";
	public static final String ERRMSG_VN_NOT_AVAILABLE_ERROR = "No Virtual Number available[%s]";

	
	public static final String ERRMSG_INVALID_CAPTCHA_ERROR = "Invalid captcha";
	
	public static final String ERRMSG_NON_EXISTING_RCS_CONTACT = "No rcs contact existing for a given phone# [%s].";
	
	public static String ERRMSG_EMPTY_IDENTITY = "Identity does not exist";
	
	public int errCode = 1;// system error

	public CmdHandlerException(String msg) {
		super(msg);
		logger.error()
			.message(msg).logOpr();
	}

	public CmdHandlerException(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
		// logger.error(errCode + ":" + msg);
	}

	/**
	 * @param e
	 */
	public CmdHandlerException(Throwable e) {
		this(CmdHandlerException.ERRCODE_SYSTEM,
				CmdHandlerException.ERRMSG_SYSTEM + e.getMessage());
	}

	public static String getMsgUnsupportedValueMsg(JSONObject jsonObject,
			String fieldName, String receivedVal, String supportedValues) {

		String cmd = Common.getStringAsNull(jsonObject, RCSConstant.FLD_CMD);
		if (cmd == null) {
			cmd = "unknown";
		}
		return String.format(ERRMSG_UNSUPPORTED_VALUE, cmd, fieldName,
				receivedVal, supportedValues);
	}
}
