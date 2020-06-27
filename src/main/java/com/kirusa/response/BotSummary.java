package com.kirusa.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BotSummary {

	@SerializedName("bot_id")
	Integer botId;
	String name;
	@SerializedName("display_name")
	String dispalyName;
	String logo;
	String rating;
	@SerializedName("max_rating")
	String maxRating;
	String feature;
	@SerializedName("short_desc")
	String shortDesc;
	ArrayList<String> tags= new ArrayList<String>();
	
	
	public Integer getBotId() {
		return botId;
	}
	public void setBotId(Integer botId) {
		this.botId = botId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDispalyName() {
		return dispalyName;
	}
	public void setDispalyName(String dispalyName) {
		this.dispalyName = dispalyName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getMaxRating() {
		return maxRating;
	}
	public void setMaxRating(String maxRating) {
		this.maxRating = maxRating;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "BotSummary [botId=" + botId + ", name=" + name + ", dispalyName=" + dispalyName + ", logo=" + logo
				+ ", rating=" + rating + ", maxRating=" + maxRating + ", feature=" + feature + ", shortDesc="
				+ shortDesc + ", tags=" + tags + "]";
	}
	
	public BotSummary(Integer botId, String name, String dispalyName, String logo, String rating, String maxRating,
			String feature, String shortDesc, ArrayList<String> tags) {
		super();
		this.botId = botId;
		this.name = name;
		this.dispalyName = dispalyName;
		this.logo = logo;
		this.rating = rating;
		this.maxRating = maxRating;
		this.feature = feature;
		this.shortDesc = shortDesc;
		this.tags = tags;
	}
	public BotSummary() {
		// TODO Auto-generated constructor stub
	}
	
	
}
