package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotRequired {
	
	@SerializedName("id")
	Integer botId;
	
	@SerializedName("bot_name")
	String botName;

	public Integer getBotId() {
		return botId;
	}

	public void setBotId(Integer botId) {
		this.botId = botId;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}
	
}
