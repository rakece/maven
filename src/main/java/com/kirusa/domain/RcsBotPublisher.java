
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.xml.bind.annotation.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllRcsBotPublishers", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher"),
		@NamedQuery(name = "findRcsBotPublisherByCompanyName", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.companyName = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByCompanyNameContaining", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.companyName like ?1"),
		@NamedQuery(name = "findRcsBotPublisherByCreateDate", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.createDate = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByEmail", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.email = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByEmailContaining", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.email like ?1"),
		@NamedQuery(name = "findRcsBotPublisherByFirstName", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.firstName = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByFirstNameContaining", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.firstName like ?1"),
		@NamedQuery(name = "findRcsBotPublisherById", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.id = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByLastName", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.lastName = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByLastNameContaining", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.lastName like ?1"),
		@NamedQuery(name = "findRcsBotPublisherByLastUpdate", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByPhoneNumber", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.phoneNumber = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByPhoneNumberContaining", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.phoneNumber like ?1"),
		@NamedQuery(name = "findRcsBotPublisherByPrimaryKey", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.id = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByRcsBotId", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.rcsBotId = ?1"),
		@NamedQuery(name = "findRcsBotPublisherByRcsBotUserId", query = "select myRcsBotPublisher from RcsBotPublisher myRcsBotPublisher where myRcsBotPublisher.rcsBotUserId = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_publisher")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotPublisher")

public class RcsBotPublisher implements Serializable {
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

	@Column(name = "company_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String companyName;
	/**
	 */

	@Column(name = "first_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "last_name", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "email", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String email;
	/**
	 */

	@Column(name = "phone_number", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String phoneNumber;
	/**
	 */

	@Column(name = "rcs_bot_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotId;
	/**
	 */

	@Column(name = "rcs_bot_user_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotUserId;
	
	
	@Column(name = "role", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String role;
	
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, updatable = false)
	@CreationTimestamp
	Calendar createDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	@UpdateTimestamp
	Calendar lastUpdate;

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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
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
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 */
	public void setRcsBotId(Integer rcsBotId) {
		this.rcsBotId = rcsBotId;
	}

	/**
	 */
	public Integer getRcsBotId() {
		return this.rcsBotId;
	}

	/**
	 */
	public void setRcsBotUserId(Integer rcsBotUserId) {
		this.rcsBotUserId = rcsBotUserId;
	}

	/**
	 */
	public Integer getRcsBotUserId() {
		return this.rcsBotUserId;
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
	public RcsBotPublisher() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotPublisher that) {
		setId(that.getId());
		setCompanyName(that.getCompanyName());
		setFirstName(that.getFirstName());
		setLastName(that.getLastName());
		setEmail(that.getEmail());
		setPhoneNumber(that.getPhoneNumber());
		setRcsBotId(that.getRcsBotId());
		setRcsBotUserId(that.getRcsBotUserId());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("companyName=[").append(companyName).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("phoneNumber=[").append(phoneNumber).append("] ");
		buffer.append("rcsBotId=[").append(rcsBotId).append("] ");
		buffer.append("rcsBotUserId=[").append(rcsBotUserId).append("] ");
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
		if (!(obj instanceof RcsBotPublisher))
			return false;
		RcsBotPublisher equalCheck = (RcsBotPublisher) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
