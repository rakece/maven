package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotDesc {

	Integer id;
	String bot_name;
	String bot_summary;
	String display_name;
	String description;
	String locale;
	String bot_feature;
	String action;
	
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "BotDesc [id=" + id + ", bot_name=" + bot_name + ", bot_summary=" + bot_summary + ", display_name="
				+ display_name + ", description=" + description + ", locale=" + locale + ", bot_feature=" + bot_feature
				+ ", action=" + action + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBot_name() {
		return bot_name;
	}
	public void setBot_name(String bot_name) {
		this.bot_name = bot_name;
	}
	public String getBot_summary() {
		return bot_summary;
	}
	public void setBot_summary(String bot_summary) {
		this.bot_summary = bot_summary;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getBot_feature() {
		return bot_feature;
	}
	public void setBot_feature(String bot_feature) {
		this.bot_feature = bot_feature;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	
	
}
