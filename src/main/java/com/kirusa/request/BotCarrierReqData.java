package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotCarrierReqData {

	@SerializedName("locale")
	private String locale;
	
	@SerializedName("carrier_id")
	private Integer carrierId;
	
	@SerializedName("country_iso")
	private String countryIso;

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	
	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public String getCountryIso() {
		return countryIso;
	}

	public void setCountryIso(String countryIso) {
		this.countryIso = countryIso;
	} 
	
	
}
