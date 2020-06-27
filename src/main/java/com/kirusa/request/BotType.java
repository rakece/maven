package com.kirusa.request;

public class BotType {

	Integer id;
	String type;
	Integer rcs_bot_id;
	Integer rcs_bot_category_id;
	String action;
	
	@Override
	public String toString() {
		return "BotType [id=" + id + ", type=" + type + ", rcs_bot_id=" + rcs_bot_id + ", rcs_bot_category_id="
				+ rcs_bot_category_id + ", action=" + action + "]";
	}
	public Integer getId() {
		return id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getRcs_bot_id() {
		return rcs_bot_id;
	}
	public void setRcs_bot_id(Integer rcs_bot_id) {
		this.rcs_bot_id = rcs_bot_id;
	}
	public Integer getRcs_bot_category_id() {
		return rcs_bot_category_id;
	}
	public void setRcs_bot_category_id(Integer rcs_bot_category_id) {
		this.rcs_bot_category_id = rcs_bot_category_id;
	}
	
}
