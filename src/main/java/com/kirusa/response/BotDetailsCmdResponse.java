package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotDetailsCmdResponse {

	@SerializedName("cmd")
	private String cmd;
	
	@SerializedName("msisdn")
	private String msisdn;
	
	@SerializedName("status")
	private String status;
	
	@SerializedName("error_code")
	private String error_code;
	
	@SerializedName("error_key")
	private String error_key;
	
	@SerializedName("error_desc")
	private String error_desc;
	
	@SerializedName("data")
	private BotDataDetails botDataDetails;


	// Getter Methods 

	public String getCmd() {
		return cmd;
	}

	public String getStatus() {
		return status;
	}

	public String getError_code() {
		return error_code;
	}

	public String getError_key() {
		return error_key;
	}

	public String getError_desc() {
		return error_desc;
	}

	public BotDataDetails getBotDataDetails() {
		return botDataDetails;
	}

	// Setter Methods 

	public void setBotDataDetails(BotDataDetails botDataDetails) {
		this.botDataDetails = botDataDetails;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public void setError_key(String error_key) {
		this.error_key = error_key;
	}

	public void setError_desc(String error_desc) {
		this.error_desc = error_desc;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

}