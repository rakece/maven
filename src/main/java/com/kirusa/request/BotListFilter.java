package com.kirusa.request;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class BotListFilter {

	ArrayList<String> category;
	ArrayList<String> type;
	@SerializedName("search_key")
	String searchKey;
	
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public ArrayList<String> getCategory() {
		return category;
	}
	public void setCategory(ArrayList<String> category) {
		this.category = category;
	}
	public ArrayList<String> getType() {
		return type;
	}
	public void setType(ArrayList<String> type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BotListFilter [category=" + category + ", type=" + type + ", searchKey=" + searchKey + "]";
	}
	public BotListFilter(ArrayList<String> category, ArrayList<String> type) {
		super();
		this.category = category;
		this.type = type;
	}
	
}
