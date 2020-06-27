package com.kirusa.request;

public class BotBillingData {

	Integer id;
	Integer bot_id;
	Integer rcs_bot_user_id;
	
	String user_name;
	String company_name;
	String email;
	String account_type;
	String contact_no;
	String alt_contact_no;
	String address_line1;
	String address_line2;
	String city;
	String state;
	String zip;
	String country;
	
	@Override
	public String toString() {
		return "BotBillingRequset [id=" + id + ", bot_id=" + bot_id + ", rcs_bot_user_id=" + rcs_bot_user_id
				+ ", user_name=" + user_name + ", company_name=" + company_name + ", email=" + email + ", account_type="
				+ account_type + ", contact_no=" + contact_no + ", alt_contact_no=" + alt_contact_no
				+ ", address_line1=" + address_line1 + ", address_line2=" + address_line2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBot_id() {
		return bot_id;
	}
	public void setBot_id(Integer bot_id) {
		this.bot_id = bot_id;
	}
	public Integer getRcs_bot_user_id() {
		return rcs_bot_user_id;
	}
	public void setRcs_bot_user_id(Integer rcs_bot_user_id) {
		this.rcs_bot_user_id = rcs_bot_user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAlt_contact_no() {
		return alt_contact_no;
	}
	public void setAlt_contact_no(String alt_contact_no) {
		this.alt_contact_no = alt_contact_no;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
