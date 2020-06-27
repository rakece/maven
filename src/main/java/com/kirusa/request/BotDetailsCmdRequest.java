package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotDetailsCmdRequest {

	@SerializedName("cmd")
	private String cmd;
	
	@SerializedName("msisdn")
	private String msisdn;
	
	@SerializedName("timestamp")
	private String timestamp;
	
	@SerializedName("source")
	private String source;
	
	@SerializedName("data")
	private BotReqData reqData;

	public String getCmd() {
		return cmd;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public BotReqData getReqData() {
		return reqData;
	}

	public void setReqData(BotReqData reqData) {
		this.reqData = reqData;
	}

}
