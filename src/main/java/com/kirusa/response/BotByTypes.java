package com.kirusa.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BotByTypes {

	String type;

	@SerializedName("bot_list")
	ArrayList<BotSummary> botList= new ArrayList<BotSummary>();

	public BotByTypes(String type, ArrayList<BotSummary> botList) {
		super();
		this.type = type;
		this.botList = botList;
	}

	public BotByTypes() {}
	@Override
	public String toString() {
		return "BotByTypes [type=" + type + ", botList=" + botList + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<BotSummary> getBotList() {
		return botList;
	}

	public void setBotList(ArrayList<BotSummary> botList) {
		this.botList = botList;
	}

}
