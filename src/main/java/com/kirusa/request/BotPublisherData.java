package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class BotPublisherData {

	@SerializedName("company_name")
	String companyName;
	
	@SerializedName("first_name")
	String firstName;
	
	@SerializedName("last_name")
	String lastName;
	
	@SerializedName("email")
	String email;
	
	@SerializedName("phone_number")
	String	phoneNumber;
	
	@SerializedName("role")
	String role;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
