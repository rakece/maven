package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotReqData {

	@SerializedName("locale")
	String locale;
	
	@SerializedName("country_iso")
	String countryIso;
	
	@SerializedName("bot")
	BotRequired botRequired;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getCountryIso() {
		return countryIso;
	}

	public void setCountryIso(String countryIso) {
		this.countryIso = countryIso;
	}

	public BotRequired getBotRequired() {
		return botRequired;
	}

	public void setBotRequired(BotRequired botRequired) {
		this.botRequired = botRequired;
	}
	
	
}
