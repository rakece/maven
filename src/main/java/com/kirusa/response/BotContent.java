package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotContent {
	
	@SerializedName("bot_info")
	BotInfo botInfo;
	
	@SerializedName("bot_multimedia")
	BotMultimedia botMultimedia;
	
	@SerializedName("bot_description")
	BotDescription botDescription;
	
	@SerializedName("max_rating")
	private Float botMaxRating;
	
	@SerializedName("curent_rating")
	private Float botCurentRating;
	
	@SerializedName("opt_in")
	private Boolean botOptIn;
	
	@SerializedName("opit_url")
	private String opitUrl;

	public BotInfo getBotInfo() {
		return botInfo;
	}

	public void setBotInfo(BotInfo botInfo) {
		this.botInfo = botInfo;
	}

	public BotMultimedia getBotMultimedia() {
		return botMultimedia;
	}

	public void setBotMultimedia(BotMultimedia botMultimedia) {
		this.botMultimedia = botMultimedia;
	}

	public BotDescription getBotDescription() {
		return botDescription;
	}

	public void setBotDescription(BotDescription botDescription) {
		this.botDescription = botDescription;
	}

	public Float getBotMaxRating() {
		return botMaxRating;
	}

	public void setBotMaxRating(Float botMaxRating) {
		this.botMaxRating = botMaxRating;
	}

	public Float getBotCurentRating() {
		return botCurentRating;
	}

	public void setBotCurentRating(Float botCurentRating) {
		this.botCurentRating = botCurentRating;
	}

	public boolean isBotOptIn() {
		return botOptIn;
	}

	public void setBotOptIn(boolean botOptIn) {
		this.botOptIn = botOptIn;
	}

	public String getOpitUrl() {
		return opitUrl;
	}

	public void setOpitUrl(String opitUrl) {
		this.opitUrl = opitUrl;
	}
}