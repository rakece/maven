package com.kirusa.request;

public class BotsCountry {

	Integer id;
	Integer rcs_country_id;
	String action;
	
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRcs_country_id() {
		return rcs_country_id;
	}
	public void setRcs_country_id(Integer rcs_country_id) {
		this.rcs_country_id = rcs_country_id;
	}
	@Override
	public String toString() {
		return "BotsCountry [id=" + id + ", rcs_country_id=" + rcs_country_id + ", action=" + action + "]";
	}
}
