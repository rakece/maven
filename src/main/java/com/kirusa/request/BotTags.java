package com.kirusa.request;

public class BotTags {

	Integer id;
	Integer rcs_bot_category_id;
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
	public Integer getRcs_bot_category_id() {
		return rcs_bot_category_id;
	}
	public void setRcs_bot_category_id(Integer rcs_bot_category_id) {
		this.rcs_bot_category_id = rcs_bot_category_id;
	}
	@Override
	public String toString() {
		return "BotTags [id=" + id + ", rcs_bot_category_id=" + rcs_bot_category_id + ", action=" + action + "]";
	}
	
	
}
