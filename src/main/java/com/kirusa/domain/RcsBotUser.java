
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.annotation.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

/**
 */

@Entity
@DynamicInsert
@DynamicUpdate
@SelectBeforeUpdate 
@NamedQueries({
		@NamedQuery(name = "findAllRcsBotUsers", query = "select myRcsBotUser from RcsBotUser myRcsBotUser"),
		@NamedQuery(name = "findRcsBotUserByAltPhone", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.altPhone = ?1"),
		@NamedQuery(name = "findRcsBotUserByAltPhoneContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.altPhone like ?1"),
		@NamedQuery(name = "findRcsBotUserByCompanyName", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.companyName = ?1"),
		@NamedQuery(name = "findRcsBotUserByCompanyNameContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.companyName like ?1"),
		@NamedQuery(name = "findRcsBotUserByCreateDate", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.createDate = ?1"),
		@NamedQuery(name = "findRcsBotUserByEmail", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.email = ?1"),
		@NamedQuery(name = "findRcsBotUserByEmailContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.email like ?1"),
		@NamedQuery(name = "findRcsBotUserByFname", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.fname = ?1"),
		@NamedQuery(name = "findRcsBotUserByFnameContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.fname like ?1"),
		@NamedQuery(name = "findRcsBotUserByGpsLocation", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.gpsLocation = ?1"),
		@NamedQuery(name = "findRcsBotUserByGpsLocationContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.gpsLocation like ?1"),
		@NamedQuery(name = "findRcsBotUserById", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.id = ?1"),
		@NamedQuery(name = "findRcsBotUserByLang", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lang = ?1"),
		@NamedQuery(name = "findRcsBotUserByLangContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lang like ?1"),
		@NamedQuery(name = "findRcsBotUserByLastLoginTime", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lastLoginTime = ?1"),
		@NamedQuery(name = "findRcsBotUserByLastUpdate", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotUserByLat", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lat = ?1"),
		@NamedQuery(name = "findRcsBotUserByLname", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lname = ?1"),
		@NamedQuery(name = "findRcsBotUserByLnameContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lname like ?1"),
		@NamedQuery(name = "findRcsBotUserByLoginCount", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.loginCount = ?1"),
		@NamedQuery(name = "findRcsBotUserByLoginSource", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.loginSource = ?1"),
		@NamedQuery(name = "findRcsBotUserByLoginSourceContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.loginSource like ?1"),
		@NamedQuery(name = "findRcsBotUserByLon", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.lon = ?1"),
		@NamedQuery(name = "findRcsBotUserByMobileNo", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.mobileNo = ?1"),
		@NamedQuery(name = "findRcsBotUserByMobileNoContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.mobileNo like ?1"),
		@NamedQuery(name = "findRcsBotUserByOtp", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.otp = ?1"),
		@NamedQuery(name = "findRcsBotUserByOtpContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.otp like ?1"),
		@NamedQuery(name = "findRcsBotUserByPassword", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.password = ?1"),
		@NamedQuery(name = "findRcsBotUserByPasswordContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.password like ?1"),
		@NamedQuery(name = "findRcsBotUserByPrimaryKey", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.id = ?1"),
		@NamedQuery(name = "findRcsBotUserByProfileImageName", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.profileImageName = ?1"),
		@NamedQuery(name = "findRcsBotUserByProfileImageNameContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.profileImageName like ?1"),
		@NamedQuery(name = "findRcsBotUserByUserStatus", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.userStatus = ?1"),
		@NamedQuery(name = "findRcsBotUserByUserStatusContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.userStatus like ?1"),
		@NamedQuery(name = "findRcsBotUserByUserType", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.userType = ?1"),
		@NamedQuery(name = "findRcsBotUserByUserTypeContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.userType like ?1"),
		@NamedQuery(name = "findRcsBotUserByVerifiedEmail", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.verifiedEmail = ?1"),
		@NamedQuery(name = "findRcsBotUserByVerifiedEmailContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.verifiedEmail like ?1"),
		@NamedQuery(name = "findRcsBotUserByVerifiedPhone", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.verifiedPhone = ?1"),
		@NamedQuery(name = "findRcsBotUserByVerifiedPhoneContaining", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.verifiedPhone like ?1"),
		@NamedQuery(name = "findRcsBotUserByWrongPasswordCount", query = "select myRcsBotUser from RcsBotUser myRcsBotUser where myRcsBotUser.wrongPasswordCount = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_user")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotUser")
@XmlRootElement(namespace = "rcsbotdirectory/com/kirusa/domain")
public class RcsBotUser implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@SerializedName("mobile_no")
	@Column(name = "mobile_no",nullable = false,columnDefinition = "varchar(128) default 'notset'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String mobileNo;
	/**
	 */

	@SerializedName("login_source")
	@Column(name = "login_source",nullable = false,columnDefinition = "varchar(128) default 'notset'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String loginSource;
	/**
	 */

	@Column(name = "email", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	 */

	@SerializedName("verified_email")
	@Column(name = "verified_email", nullable = false,columnDefinition = "char(1) default 'N'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String verifiedEmail;
	/**
	 */

	@SerializedName("verified_phone")
	@Column(name = "verified_phone", nullable = false,columnDefinition = "char(1) default 'N'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String verifiedPhone;
	/**
	 */

	@SerializedName("gps_location")
	@Column(name = "gps_location", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String gpsLocation;
	/**
	 */

	
	@Column(name = "lon", precision = 22,columnDefinition = "DOUBLE default '0.0'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal lon;
	/**
	 */

	@Column(name = "lat", precision = 22,columnDefinition = "DOUBLE default '0.0'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal lat;
	/**
	 */

	@SerializedName("alt_phone")
	@Column(name = "alt_phone", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String altPhone;
	/**
	 */

	@Column(name = "password", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String password;
	/**
	 */

	@Column(name = "fname", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String fname;
	/**
	 */

	@Column(name = "lname", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lname;
	/**
	 */

	@SerializedName("user_status")
	@Column(name = "user_status",nullable = false,columnDefinition = "varchar(128) default 'ACTIVE'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userStatus;
	/**
	 */

	@SerializedName("user_type")	
	@Column(name = "user_type",nullable = false,columnDefinition = "varchar(128) default 'notset'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userType;
	/**
	 */
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login_time", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar lastLoginTime;
	/**
	 */

	@SerializedName("login_count")
	@Column(name = "login_count")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer loginCount;
	/**
	 */

	@SerializedName("wrong_password_count")
	@Column(name = "wrong_password_count", nullable = false,columnDefinition = "tinyint default '4'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean wrongPasswordCount;
	/**
	 */

	@Column(name = "otp", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String otp;
	/**
	 */

	@Column(name = "lang",columnDefinition = "varchar(128) default 'en_US'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lang;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false,updatable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar createDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar lastUpdate;
	/**
	 */

	@SerializedName("profile_image_name")
	@Column(name = "profile_image_name",columnDefinition = "varchar(128) default 'default.png'")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String profileImageName;
	/**
	 */

	@SerializedName("company_name")
	@Column(name = "company_name", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String companyName;

	/**
	 */
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rcs_country_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsCountryList rcsCountryList;
	/**
	 */
	@OneToMany(mappedBy = "rcsBotUser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBot> rcsBots;
	/**
	 */
	@OneToMany(mappedBy = "rcsBotUser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotBilling> rcsBotBillings;
	/**
	 */
	@OneToMany(mappedBy = "rcsBotUser", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotUserrole> rcsBotUserroles;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 */
	public String getMobileNo() {
		return this.mobileNo;
	}

	/**
	 */
	public void setLoginSource(String loginSource) {
		this.loginSource = loginSource;
	}

	/**
	 */
	public String getLoginSource() {
		return this.loginSource;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setVerifiedEmail(String verifiedEmail) {
		this.verifiedEmail = verifiedEmail;
	}

	/**
	 */
	public String getVerifiedEmail() {
		return this.verifiedEmail;
	}

	/**
	 */
	public void setVerifiedPhone(String verifiedPhone) {
		this.verifiedPhone = verifiedPhone;
	}

	/**
	 */
	public String getVerifiedPhone() {
		return this.verifiedPhone;
	}

	/**
	 */
	public void setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	/**
	 */
	public String getGpsLocation() {
		return this.gpsLocation;
	}

	/**
	 */
	public void setLon(BigDecimal lon) {
		this.lon = lon;
	}

	/**
	 */
	public BigDecimal getLon() {
		return this.lon;
	}

	/**
	 */
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	/**
	 */
	public BigDecimal getLat() {
		return this.lat;
	}

	/**
	 */
	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}

	/**
	 */
	public String getAltPhone() {
		return this.altPhone;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 */
	public String getFname() {
		return this.fname;
	}

	/**
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 */
	public String getLname() {
		return this.lname;
	}

	/**
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	/**
	 */
	public String getUserStatus() {
		return this.userStatus;
	}

	/**
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 */
	public String getUserType() {
		return this.userType;
	}

	/**
	 */
	public void setLastLoginTime(Calendar lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 */
	public Calendar getLastLoginTime() {
		return this.lastLoginTime;
	}

	/**
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 */
	public Integer getLoginCount() {
		return this.loginCount;
	}

	/**
	 */
	public void setWrongPasswordCount(Boolean wrongPasswordCount) {
		this.wrongPasswordCount = wrongPasswordCount;
	}

	/**
	 */
	public Boolean getWrongPasswordCount() {
		return this.wrongPasswordCount;
	}

	/**
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	/**
	 */
	public String getOtp() {
		return this.otp;
	}

	/**
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
	 */
	public String getLang() {
		return this.lang;
	}

	/**
	 */
	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	/**
	 */
	public Calendar getCreateDate() {
		return this.createDate;
	}

	/**
	 */
	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 */
	public Calendar getLastUpdate() {
		return this.lastUpdate;
	}

	/**
	 */
	public void setProfileImageName(String profileImageName) {
		this.profileImageName = profileImageName;
	}

	/**
	 */
	public String getProfileImageName() {
		return this.profileImageName;
	}

	/**
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 */
	public String getCompanyName() {
		return this.companyName;
	}

	/**
	 */
	public void setRcsCountryList(RcsCountryList rcsCountryList) {
		this.rcsCountryList = rcsCountryList;
	}

	/**
	 */
	public RcsCountryList getRcsCountryList() {
		return rcsCountryList;
	}

	/**
	 */
	public void setRcsBots(Set<RcsBot> rcsBots) {
		this.rcsBots = rcsBots;
	}

	/**
	 */
	public Set<RcsBot> getRcsBots() {
		if (rcsBots == null) {
			rcsBots = new java.util.LinkedHashSet<com.kirusa.domain.RcsBot>();
		}
		return rcsBots;
	}

	/**
	 */
	public void setRcsBotBillings(Set<RcsBotBilling> rcsBotBillings) {
		this.rcsBotBillings = rcsBotBillings;
	}

	/**
	 */
	public Set<RcsBotBilling> getRcsBotBillings() {
		if (rcsBotBillings == null) {
			rcsBotBillings = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotBilling>();
		}
		return rcsBotBillings;
	}

	/**
	 */
	public void setRcsBotUserroles(Set<RcsBotUserrole> rcsBotUserroles) {
		this.rcsBotUserroles = rcsBotUserroles;
	}

	/**
	 */
	public Set<RcsBotUserrole> getRcsBotUserroles() {
		if (rcsBotUserroles == null) {
			rcsBotUserroles = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotUserrole>();
		}
		return rcsBotUserroles;
	}

	/**
	 */
	public RcsBotUser() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotUser that) {
		setId(that.getId());
		setMobileNo(that.getMobileNo());
		setLoginSource(that.getLoginSource());
		setEmail(that.getEmail());
		setVerifiedEmail(that.getVerifiedEmail());
		setVerifiedPhone(that.getVerifiedPhone());
		setGpsLocation(that.getGpsLocation());
		setLon(that.getLon());
		setLat(that.getLat());
		setAltPhone(that.getAltPhone());
		setPassword(that.getPassword());
		setFname(that.getFname());
		setLname(that.getLname());
		setUserStatus(that.getUserStatus());
		setUserType(that.getUserType());
		setLastLoginTime(that.getLastLoginTime());
		setLoginCount(that.getLoginCount());
		setWrongPasswordCount(that.getWrongPasswordCount());
		setOtp(that.getOtp());
		setLang(that.getLang());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setProfileImageName(that.getProfileImageName());
		setCompanyName(that.getCompanyName());
		setRcsCountryList(that.getRcsCountryList());
		setRcsBots(new java.util.LinkedHashSet<com.kirusa.domain.RcsBot>(that.getRcsBots()));
		setRcsBotBillings(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotBilling>(that.getRcsBotBillings()));
		setRcsBotUserroles(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotUserrole>(that.getRcsBotUserroles()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("mobileNo=[").append(mobileNo).append("] ");
		buffer.append("loginSource=[").append(loginSource).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("verifiedEmail=[").append(verifiedEmail).append("] ");
		buffer.append("verifiedPhone=[").append(verifiedPhone).append("] ");
		buffer.append("gpsLocation=[").append(gpsLocation).append("] ");
		buffer.append("lon=[").append(lon).append("] ");
		buffer.append("lat=[").append(lat).append("] ");
		buffer.append("altPhone=[").append(altPhone).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("fname=[").append(fname).append("] ");
		buffer.append("lname=[").append(lname).append("] ");
		buffer.append("userStatus=[").append(userStatus).append("] ");
		buffer.append("userType=[").append(userType).append("] ");
		buffer.append("lastLoginTime=[").append(lastLoginTime).append("] ");
		buffer.append("loginCount=[").append(loginCount).append("] ");
		buffer.append("wrongPasswordCount=[").append(wrongPasswordCount).append("] ");
		buffer.append("otp=[").append(otp).append("] ");
		buffer.append("lang=[").append(lang).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("lastUpdate=[").append(lastUpdate).append("] ");
		buffer.append("profileImageName=[").append(profileImageName).append("] ");
		buffer.append("companyName=[").append(companyName).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof RcsBotUser))
			return false;
		RcsBotUser equalCheck = (RcsBotUser) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
