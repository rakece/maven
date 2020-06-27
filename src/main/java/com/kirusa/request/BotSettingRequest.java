package com.kirusa.request;

public class BotSettingRequest {
	String cmd;
	String action;
	BotSettingData data;

	public BotSettingRequest(String cmd, String action, BotSettingData data) {
		super();
		this.cmd = cmd;
		this.action = action;
		this.data = data;
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

	

	public BotSettingData getData() {
		return data;
	}

	public void setData(BotSettingData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BotSettingRequest [cmd=" + cmd + ", action=" + action + ", data=" + data + "]";
	}
}
