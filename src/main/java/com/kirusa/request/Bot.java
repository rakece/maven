package com.kirusa.request;

public class Bot {

	Integer bot_id;
	Integer rcs_bot_category_id;
	Integer rcs_bot_user_id;
	String platform;
	String privacy_url;
	String website_url;
	String term_and_condition_url;
	String register_url;
	String opt_in;
	String opt_in_url;
	String logo_image;
	String status;
	String action;
	
	public Integer getBot_id() {
		return bot_id;
	}
	public void setBot_id(Integer bot_id) {
		this.bot_id = bot_id;
	}
	public Integer getRcs_bot_category_id() {
		return rcs_bot_category_id;
	}
	public void setRcs_bot_category_id(Integer rcs_bot_category_id) {
		this.rcs_bot_category_id = rcs_bot_category_id;
	}
	public Integer getRcs_bot_user_id() {
		return rcs_bot_user_id;
	}
	public void setRcs_bot_user_id(Integer rcs_bot_user_id) {
		this.rcs_bot_user_id = rcs_bot_user_id;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPrivacy_url() {
		return privacy_url;
	}
	public void setPrivacy_url(String privacy_url) {
		this.privacy_url = privacy_url;
	}
	public String getWebsite_url() {
		return website_url;
	}
	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}
	public String getTerm_and_condition_url() {
		return term_and_condition_url;
	}
	public void setTerm_and_condition_url(String term_and_condition_url) {
		this.term_and_condition_url = term_and_condition_url;
	}
	public String getOpt_in() {
		return opt_in;
	}
	public void setOpt_in(String opt_in) {
		this.opt_in = opt_in;
	}
	public String getOpt_in_url() {
		return opt_in_url;
	}
	public void setOpt_in_url(String opt_in_url) {
		this.opt_in_url = opt_in_url;
	}
	public String getLogo_image() {
		return logo_image;
	}
	public void setLogo_image(String logo_image) {
		this.logo_image = logo_image;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getRegister_url() {
		return register_url;
	}
	public void setRegister_url(String register_url) {
		this.register_url = register_url;
	}
	
	@Override
	public String toString() {
		return "Bot [bot_id=" + bot_id + ", rcs_bot_category_id=" + rcs_bot_category_id + ", rcs_bot_user_id="
				+ rcs_bot_user_id + ", platform=" + platform + ", privacy_url=" + privacy_url + ", website_url="
				+ website_url + ", term_and_condition_url=" + term_and_condition_url + ", register_url=" + register_url
				+ ", opt_in=" + opt_in + ", opt_in_url=" + opt_in_url + ", logo_image=" + logo_image + ", status="
				+ status + ", action=" + action + ", getBot_id()=" + getBot_id() + ", getRcs_bot_category_id()="
				+ getRcs_bot_category_id() + ", getRcs_bot_user_id()=" + getRcs_bot_user_id() + ", getPlatform()="
				+ getPlatform() + ", getPrivacy_url()=" + getPrivacy_url() + ", getWebsite_url()=" + getWebsite_url()
				+ ", getTerm_and_condition_url()=" + getTerm_and_condition_url() + ", getOpt_in()=" + getOpt_in()
				+ ", getOpt_in_url()=" + getOpt_in_url() + ", getLogo_image()=" + getLogo_image() + ", getStatus()="
				+ getStatus() + ", getAction()=" + getAction() + ", getRegister_url()=" + getRegister_url()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
