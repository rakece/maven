package com.kirusa.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BotListRequestData {

	@SerializedName("start_index")
	String startIndex;
	@SerializedName("end_index")
	String endIndex;
	
	String locale;
	
	
	BotListFilter filter;
	
	@Override
	public String toString() {
		return "BotListRequestData [startIndex=" + startIndex + ", endIndex=" + endIndex + ", locale=" + locale
				 +", filter=" + filter + "]";
	}
	public BotListRequestData(String startIndex, String endIndex, String locale, String searchKey,
			BotListFilter filter) {
		super();
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.locale = locale;
		
		this.filter = filter;
	}
	public String getStartIndex() {
		return startIndex;
	}
	
	public void setStartIndex(String startIndex) {
		this.startIndex = startIndex;
	}
	public String getEndIndex() {
		return endIndex;
	}
	
	public void setEndIndex(String endIndex) {
		this.endIndex = endIndex;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	public BotListFilter getFilter() {
		return filter;
	}
	public void setFilter(BotListFilter filter) {
		this.filter = filter;
	}
	

}
