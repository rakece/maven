package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotDescription {
	
	@SerializedName("desc")
	private String botDescription;
	
	@SerializedName("upadte_date")
	private String botUpadtionDate;
	
	@SerializedName("upadte_desc")
	private String upadteDescription;

	public String getBotDescription() {
		return botDescription;
	}

	public void setBotDescription(String botDescription) {
		this.botDescription = botDescription;
	}

	public String getBotUpadtionDate() {
		return botUpadtionDate;
	}

	public void setBotUpadtionDate(String botUpadtionDate) {
		this.botUpadtionDate = botUpadtionDate;
	}

	public String getUpadteDescription() {
		return upadteDescription;
	}

	public void setUpadteDescription(String upadteDescription) {
		this.upadteDescription = upadteDescription;
	}
}