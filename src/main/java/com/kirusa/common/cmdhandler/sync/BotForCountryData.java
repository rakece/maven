package com.kirusa.common.cmdhandler.sync;

public class BotForCountryData {

	private String locale;
	private Integer country_id;
	private String country_iso;


	// Getter Methods 

	public String getLocale() {
		return locale;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public String getCountry_iso() {
		return country_iso;
	}

	// Setter Methods 

	public void setLocale( String locale ) {
		this.locale = locale;
	}

	public void setCountry_id( Integer country_id ) {
		this.country_id = country_id;
	}

	public void setCountry_iso( String country_iso ) {
		this.country_iso = country_iso;
	}

	public Object getFilter() {
		// TODO Auto-generated method stub
		return null;
	}

}
