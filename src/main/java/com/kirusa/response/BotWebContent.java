package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotWebContent {

	public BotWebContent() {
		
		// TODO Auto-generated constructor stub
	}
	public BotWebContent(Integer id, String name, String displayName) {
		super();
		this.id = id;
		this.name = name;
		this.displayName = displayName;
	}
	Integer id;
	String name;
	@SerializedName("display_name")
	String displayName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	@Override
	public String toString() {
		return "BotWebContent [id=" + id + ", name=" + name + ", displayName=" + displayName + "]";
	}
	
	
	
}
