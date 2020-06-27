package com.kirusa.common.cmdhandler;

public interface Cmd {

	public static final String FLD_CMD = "cmd";
	public static final String CMD_BOT_LIST = "bot_list";
	public static final String CMD_BOT_DETAILS = "bot_detail";
	public static final String CMD_BOT_WEB_CONTENT = "bot_web_content";
	public static final String CMD_BOT_SEARCH = "bot_search";
	public static final String CMD_UPLOAD_IMG = "upload_img";
	public static final String CMD_USER_SETTING = "user_setting";
	public static final String FLD_ACTION = "action";
	public static final String FLD_CREATE_USER = "update_user";
	public static final String CMD_BOT_SETTING = "bot_setting";
	public static final String FLD_CREATE_BOT = "update_bot";
	public static final String CMD_BOT_BILLING_SETTING = "bot_billing_setting";
	public static final String FLD_CREATE_BOT_BILLLING = "update_bot_billing";
	public static final String FLD_GET_ALL_BOT_LIST = "get_all_bot_list";
	public static final String FLD_GET_BOT_DETAIL="get_bot_detail";
	public static final String FLD_GET_ALL_TYPE="get_all_type";
	public static final String FLD_GET_ALL_COUNTRY="get_all_country";
	public static final String FLD_GET_ALL_CATGORY="get_all_category";
	public static final String FLD_GET_ALL_CARRIER="get_all_carrier";
	public static final String FLD_UPDATE_BOT_STATUS="update_bot_status";
	public static final String CMD_BOT_SEARCH_AUTOCOMPLETE="bot_search_autocomplete";
	public static final String CMD_BOTS_FOR_CARRIER="bots_for_carrier";
	public static final String CMD_BOTS_FOR_COUNTRY="bots_for_country";
	
	
	
}
