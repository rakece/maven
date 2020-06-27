package com.kirusa.request;

public class BotBillingRequest {

	String cmd;
	String action;
	BotBillingData data;
	@Override
	public String toString() {
		return "BotBillingRequest [cmd=" + cmd + ", action=" + action + ", data=" + data + "]";
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public BotBillingData getData() {
		return data;
	}
	public void setData(BotBillingData data) {
		this.data = data;
	}
	
	
}
