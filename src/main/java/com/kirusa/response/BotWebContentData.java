package com.kirusa.response;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BotWebContentData {

	String rcsDirectoryLogo;
	@SerializedName("bot_type")
	List<BotWebContent> botType= new ArrayList<BotWebContent>() ;
	@SerializedName("bot_category")
	List<BotWebContent> botCategory =new ArrayList<BotWebContent>() ;
	@Override
	public String toString() {
		return "BotWebContentData [rcsDirectoryLogo=" + rcsDirectoryLogo + ", botType=" + botType + ", botCategory="
				+ botCategory + "]";
	}
	public String getRcsDirectoryLogo() {
		return rcsDirectoryLogo;
	}
	public void setRcsDirectoryLogo(String rcsDirectoryLogo) {
		this.rcsDirectoryLogo = rcsDirectoryLogo;
	}
	public List<BotWebContent> getBotType() {
		return botType;
	}
	public void setBotType(List<BotWebContent> botType) {
		this.botType = botType;
	}
	public List<BotWebContent> getBotCategory() {
		return botCategory;
	}
	public void setBotCategory(List<BotWebContent> botCategory) {
		this.botCategory = botCategory;
	}
	
	
	
}

