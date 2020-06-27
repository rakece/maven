
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.xml.bind.annotation.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;

/**
 */

@Entity
@DynamicInsert
@DynamicUpdate
@SelectBeforeUpdate
@NamedQueries({
		@NamedQuery(name = "findAllRcsBotBillings", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling"),
		@NamedQuery(name = "findRcsBotBillingByAccountType", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.accountType = ?1"),
		@NamedQuery(name = "findRcsBotBillingByAccountTypeContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.accountType like ?1"),
		@NamedQuery(name = "findRcsBotBillingByAddressLine1", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.addressLine1 = ?1"),
		@NamedQuery(name = "findRcsBotBillingByAddressLine1Containing", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.addressLine1 like ?1"),
		@NamedQuery(name = "findRcsBotBillingByAddressLine2", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.addressLine2 = ?1"),
		@NamedQuery(name = "findRcsBotBillingByAddressLine2Containing", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.addressLine2 like ?1"),
		@NamedQuery(name = "findRcsBotBillingByAltContactNo", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.altContactNo = ?1"),
		@NamedQuery(name = "findRcsBotBillingByAltContactNoContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.altContactNo like ?1"),
		@NamedQuery(name = "findRcsBotBillingByCity", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.city = ?1"),
		@NamedQuery(name = "findRcsBotBillingByCityContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.city like ?1"),
		@NamedQuery(name = "findRcsBotBillingByCompanyName", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.companyName = ?1"),
		@NamedQuery(name = "findRcsBotBillingByCompanyNameContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.companyName like ?1"),
		@NamedQuery(name = "findRcsBotBillingByContactNo", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.contactNo = ?1"),
		@NamedQuery(name = "findRcsBotBillingByContactNoContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.contactNo like ?1"),
		@NamedQuery(name = "findRcsBotBillingByCountry", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.country = ?1"),
		@NamedQuery(name = "findRcsBotBillingByCountryContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.country like ?1"),
		@NamedQuery(name = "findRcsBotBillingByCreateDate", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.createDate = ?1"),
		@NamedQuery(name = "findRcsBotBillingByEmail", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.email = ?1"),
		@NamedQuery(name = "findRcsBotBillingByEmailContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.email like ?1"),
		@NamedQuery(name = "findRcsBotBillingById", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.id = ?1"),
		@NamedQuery(name = "findRcsBotBillingByLastUpdate", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotBillingByPrimaryKey", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.id = ?1"),
		@NamedQuery(name = "findRcsBotBillingByState", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.state = ?1"),
		@NamedQuery(name = "findRcsBotBillingByStateContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.state like ?1"),
		@NamedQuery(name = "findRcsBotBillingByUserName", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.userName = ?1"),
		@NamedQuery(name = "findRcsBotBillingByUserNameContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.userName like ?1"),
		@NamedQuery(name = "findRcsBotBillingByZip", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.zip = ?1"),
		@NamedQuery(name = "findRcsBotBillingByZipContaining", query = "select myRcsBotBilling from RcsBotBilling myRcsBotBilling where myRcsBotBilling.zip like ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_billing")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotBilling")

public class RcsBotBilling implements Serializable {
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

	@Column(name = "user_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userName;
	/**
	 */

	@Column(name = "company_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String companyName;
	/**
	 */

	@Column(name = "email", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	 */

	@Column(name = "account_type", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String accountType;
	/**
	 */

	@Column(name = "contact_no", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contactNo;
	/**
	 */

	@Column(name = "alt_contact_no", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String altContactNo;
	/**
	 */

	@Column(name = "address_line1", length = 1024, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String addressLine1;
	/**
	 */

	@Column(name = "address_line2", length = 1024)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String addressLine2;
	/**
	 */

	@Column(name = "city", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String city;
	/**
	 */

	@Column(name = "state", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String state;
	/**
	 */

	@Column(name = "zip", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String zip;
	/**
	 */

	@Column(name = "country", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String country;
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBotUser rcsBotUser;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBot rcsBot;

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
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 */
	public String getUserName() {
		return this.userName;
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
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 */
	public String getAccountType() {
		return this.accountType;
	}

	/**
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 */
	public String getContactNo() {
		return this.contactNo;
	}

	/**
	 */
	public void setAltContactNo(String altContactNo) {
		this.altContactNo = altContactNo;
	}

	/**
	 */
	public String getAltContactNo() {
		return this.altContactNo;
	}

	/**
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 */
	public String getAddressLine1() {
		return this.addressLine1;
	}

	/**
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 */
	public String getAddressLine2() {
		return this.addressLine2;
	}

	/**
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 */
	public String getState() {
		return this.state;
	}

	/**
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 */
	public String getCountry() {
		return this.country;
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
	public void setRcsBotUser(RcsBotUser rcsBotUser) {
		this.rcsBotUser = rcsBotUser;
	}

	/**
	 */
	public RcsBotUser getRcsBotUser() {
		return rcsBotUser;
	}

	/**
	 */
	public void setRcsBot(RcsBot rcsBot) {
		this.rcsBot = rcsBot;
	}

	/**
	 */
	public RcsBot getRcsBot() {
		return rcsBot;
	}

	/**
	 */
	public RcsBotBilling() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotBilling that) {
		setId(that.getId());
		setUserName(that.getUserName());
		setCompanyName(that.getCompanyName());
		setEmail(that.getEmail());
		setAccountType(that.getAccountType());
		setContactNo(that.getContactNo());
		setAltContactNo(that.getAltContactNo());
		setAddressLine1(that.getAddressLine1());
		setAddressLine2(that.getAddressLine2());
		setCity(that.getCity());
		setState(that.getState());
		setZip(that.getZip());
		setCountry(that.getCountry());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBotUser(that.getRcsBotUser());
		setRcsBot(that.getRcsBot());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("userName=[").append(userName).append("] ");
		buffer.append("companyName=[").append(companyName).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("accountType=[").append(accountType).append("] ");
		buffer.append("contactNo=[").append(contactNo).append("] ");
		buffer.append("altContactNo=[").append(altContactNo).append("] ");
		buffer.append("addressLine1=[").append(addressLine1).append("] ");
		buffer.append("addressLine2=[").append(addressLine2).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("state=[").append(state).append("] ");
		buffer.append("zip=[").append(zip).append("] ");
		buffer.append("country=[").append(country).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("lastUpdate=[").append(lastUpdate).append("] ");

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
		if (!(obj instanceof RcsBotBilling))
			return false;
		RcsBotBilling equalCheck = (RcsBotBilling) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
