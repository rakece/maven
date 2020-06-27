package com.kirusa.dto;

public class RcsBotCarrierMappingDTO {

	Integer id;
	Integer rcs_bot_id;
	Integer rcs_bot_carrier_id;
	Integer rcs_country_id;
	String name;
	String displayName;
	String description;
	@Override
	public String toString() {
		return "RcsBotCarrierMappingDTO [id=" + id + ", rcs_bot_id=" + rcs_bot_id + ", rcs_bot_carrier_id="
				+ rcs_bot_carrier_id + ", rcs_country_id=" + rcs_country_id + ", name=" + name + ", displayName="
				+ displayName + ", desc=" + description + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRcs_bot_id() {
		return rcs_bot_id;
	}
	public void setRcs_bot_id(Integer rcs_bot_id) {
		this.rcs_bot_id = rcs_bot_id;
	}
	public Integer getRcs_bot_carrier_id() {
		return rcs_bot_carrier_id;
	}
	public void setRcs_bot_carrier_id(Integer rcs_bot_carrier_id) {
		this.rcs_bot_carrier_id = rcs_bot_carrier_id;
	}
	public Integer getRcs_country_id() {
		return rcs_country_id;
	}
	public void setRcs_country_id(Integer rcs_country_id) {
		this.rcs_country_id = rcs_country_id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
