package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotForCarrierRequest {
	
	@SerializedName("cmd")
	private String cmd;

	@SerializedName("msisdn")
	private String msisdn;
	
	@SerializedName("source")
	private String source;
	
	@SerializedName("data")
	private BotCarrierReqData data;

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public BotCarrierReqData getData() {
		return data;
	}

	public void setData(BotCarrierReqData data) {
		this.data = data;
	}
	
}
