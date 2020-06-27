package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotDataDetails {
	
	@SerializedName("bot_content")
	BotContent botContent;

	public BotContent getBotContent() {
		return botContent;
	}

	public void setBotContent(BotContent botContent) {
		this.botContent = botContent;
	}

}