package com.kirusa.request;

public class BotCarrier {

	Integer id;
	Integer rcs_bot_carrier_id;
	String action;
	Integer rcs_bot_id;
	
	@Override
	public String toString() {
		return "BotCarrier [id=" + id + ", rcs_bot_carrier_id=" + rcs_bot_carrier_id + ", action=" + action + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRcs_bot_carrier_id() {
		return rcs_bot_carrier_id;
	}

	public void setRcs_bot_carrier_id(Integer rcs_bot_carrier_id) {
		this.rcs_bot_carrier_id = rcs_bot_carrier_id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getRcs_bot_id() {
		return rcs_bot_id;
	}

	public void setRcs_bot_id(Integer rcs_bot_id) {
		this.rcs_bot_id = rcs_bot_id;
	}
	
}
