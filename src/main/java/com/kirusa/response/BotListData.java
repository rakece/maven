package com.kirusa.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BotListData {

	@SerializedName("bot_list")
	ArrayList<BotSummary> botList=new ArrayList<BotSummary>();

	@SerializedName("bots_by_type")
	ArrayList<BotByTypes> BotByYypes=new ArrayList<BotByTypes> ();

	public ArrayList<BotSummary> getBotList() {
		return botList;
	}

	public void setBotList(ArrayList<BotSummary> botList) {
		this.botList = botList;
	}

	public ArrayList<BotByTypes> getBotByYypes() {
		return BotByYypes;
	}

	public void setBotByYypes(ArrayList<BotByTypes> botByYypes) {
		BotByYypes = botByYypes;
	}

	BotListData(){}
	@Override
	public String toString() {
		return "BotListData [botList=" + botList + ", BotByYypes=" + BotByYypes + "]";
	}

	public BotListData(ArrayList<BotSummary> botList, ArrayList<BotByTypes> botByYypes) {
		super();
		this.botList = botList;
		BotByYypes = botByYypes;
	}

}
