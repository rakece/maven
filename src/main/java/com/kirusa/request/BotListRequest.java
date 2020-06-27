package com.kirusa.request;

public class BotListRequest {

	String cmd;
	String msisdn;
	String timestamp;
	String source;
	BotListRequestData data;
	
	@Override
	public String toString() {
		return "BotListRequest [cmd=" + cmd + ", timestamp=" + timestamp + ", source=" + source + ", data=" + data
				+ "]";
	}
	public String getCmd() {
		return cmd;
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
	public BotListRequestData getData() {
		return data;
	}
	public void setData(BotListRequestData data) {
		this.data = data;
	}
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public BotListRequest(String cmd, String timestamp, String source, String msisdn, BotListRequestData data) {
		super();
		this.cmd = cmd;
		this.timestamp = timestamp;
		this.source = source;
		this.msisdn = msisdn;
		this.data = data;
	}
	
}
