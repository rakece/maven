package com.kirusa.response;

public class BotWebContentResponse {

	String cmd;
	String status;
	String error_code;
	String error_key;
	String error_desc;
	BotWebContentData data = new BotWebContentData();
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	public String getError_key() {
		return error_key;
	}
	public void setError_key(String error_key) {
		this.error_key = error_key;
	}
	public String getError_desc() {
		return error_desc;
	}
	public void setError_desc(String error_desc) {
		this.error_desc = error_desc;
	}
	public BotWebContentData getData() {
		return data;
	}
	public void setData(BotWebContentData data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "BotWebContentResponse [cmd=" + cmd + ", status=" + status + ", error_code=" + error_code
				+ ", error_key=" + error_key + ", error_desc=" + error_desc + ", data=" + data + "]";
	}
	
	
}
