package com.kirusa.response;

public class BotListResponse {

	String cmd;
	String status;
	String error_code;
	String error_key;
	String error_desc;
	BotListData data = new BotListData();
	String msisdn;
	
	@Override
	public String toString() {
		return "BotListResponse [cmd=" + cmd + ", status=" + status + ", error_code=" + error_code + ", error_key="
				+ error_key + ", error_desc=" + error_desc + ", data=" + data + "]";
	}
	public BotListResponse(String cmd, String status, String error_code, String error_key, String error_desc,
			BotListData data) {
		super();
		this.cmd = cmd;
		this.status = status;
		this.error_code = error_code;
		this.error_key = error_key;
		this.error_desc = error_desc;
		this.data = data;
	}
	public BotListResponse() {
		// TODO Auto-generated constructor stub
	}
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
	public BotListData getData() {
		return data;
	}
	public void setData(BotListData data) {
		this.data = data;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
}
