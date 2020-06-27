package com.kirusa.response;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class BotInfo {
	
	@SerializedName("bot_id")
	private Integer botId;
	
	@SerializedName("bot_name")
	private String botName;
	
	@SerializedName("bot_display_name")
	private String botDisplayName;
	
	@SerializedName("bot_country_available")
	private boolean botCountryAvailable;
	
	@SerializedName("bot_image")
	private String botImage;
	
	@SerializedName("short_desc")
	private String botShortDesc;
	
	@SerializedName("rating_count")
	private float botRatingCount;
	
	@SerializedName("tags")
	ArrayList< String > tagsList = new ArrayList < String > ();
	
	@SerializedName("carrier")
	ArrayList< String > carrierList = new ArrayList < String > ();

	public ArrayList<String> getCarrierList() {
		return carrierList;
	}

	public void setCarrierList(ArrayList<String> carrierList) {
		this.carrierList = carrierList;
	}

	@SerializedName("available_countries")
	ArrayList< String > botCountriesList;
	
	@SerializedName("snap_call_numbers")
	ArrayList<String> snapNumbersList;
	
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

	public String getBotDisplayName() {
		return botDisplayName;
	}

	public void setBotDisplayName(String botDisplayName) {
		this.botDisplayName = botDisplayName;
	}

	public boolean isBotCountryAvailable() {
		return botCountryAvailable;
	}

	public void setBotCountryAvailable(boolean botCountryAvailable) {
		this.botCountryAvailable = botCountryAvailable;
	}

	public String getBotImage() {
		return botImage;
	}

	public void setBotImage(String botImage) {
		this.botImage = botImage;
	}

	public String getBotShortDesc() {
		return botShortDesc;
	}

	public void setBotShortDesc(String botShortDesc) {
		this.botShortDesc = botShortDesc;
	}

	public float getBotRatingCount() {
		return botRatingCount;
	}

	public void setBotRatingCount(float botRatingCount) {
		this.botRatingCount = botRatingCount;
	}

	public ArrayList<String> getTagsList() {
		return tagsList;
	}

	public void setTagsList(ArrayList<String> tagsList) {
		this.tagsList = tagsList;
	}

	public ArrayList<String> getBotCountriesList() {
		return botCountriesList;
	}

	public void setBotCountriesList(ArrayList<String> botCountriesList) {
		this.botCountriesList = botCountriesList;
	}

	public ArrayList<String> getSnapNumbersList() {
		return snapNumbersList;
	}

	public void setSnapNumbersList(ArrayList<String> snapNumbersList) {
		this.snapNumbersList = snapNumbersList;
	}
	
}