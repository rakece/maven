
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllRcsBotSnapNumbers", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber"),
		@NamedQuery(name = "findRcsBotSnapNumberByCreateDate", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.createDate = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberById", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.id = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberByLastUpdate", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberByPrimaryKey", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.id = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberByRcsBotId", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.rcsBotId = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapCallNumber", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapCallNumber = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapCallNumberContaining", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapCallNumber like ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapCountryCode", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapCountryCode = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapCountryIso", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapCountryIso = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapCountryIsoContaining", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapCountryIso like ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapNumberDesc", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapNumberDesc = ?1"),
		@NamedQuery(name = "findRcsBotSnapNumberBySnapNumberDescContaining", query = "select myRcsBotSnapNumber from RcsBotSnapNumber myRcsBotSnapNumber where myRcsBotSnapNumber.snapNumberDesc like ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_snap_number")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotSnapNumber")

public class RcsBotSnapNumber implements Serializable {
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

	@Column(name = "rcs_bot_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotId;
	/**
	 */

	@Column(name = "snap_call_number", length = 20, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String snapCallNumber;
	/**
	 */

	@Column(name = "snap_country_code", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer snapCountryCode;
	/**
	 */

	@Column(name = "snap_country_iso", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String snapCountryIso;
	/**
	 */

	@Column(name = "snap_number_desc", length = 500)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String snapNumberDesc;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false)
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
	public void setSnapCallNumber(String snapCallNumber) {
		this.snapCallNumber = snapCallNumber;
	}

	/**
	 */
	public String getSnapCallNumber() {
		return this.snapCallNumber;
	}

	/**
	 */
	public void setSnapCountryCode(Integer snapCountryCode) {
		this.snapCountryCode = snapCountryCode;
	}

	/**
	 */
	public Integer getSnapCountryCode() {
		return this.snapCountryCode;
	}

	/**
	 */
	public void setSnapCountryIso(String snapCountryIso) {
		this.snapCountryIso = snapCountryIso;
	}

	/**
	 */
	public String getSnapCountryIso() {
		return this.snapCountryIso;
	}

	/**
	 */
	public void setSnapNumberDesc(String snapNumberDesc) {
		this.snapNumberDesc = snapNumberDesc;
	}

	/**
	 */
	public String getSnapNumberDesc() {
		return this.snapNumberDesc;
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
	public RcsBotSnapNumber() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotSnapNumber that) {
		setId(that.getId());
		setRcsBotId(that.getRcsBotId());
		setSnapCallNumber(that.getSnapCallNumber());
		setSnapCountryCode(that.getSnapCountryCode());
		setSnapCountryIso(that.getSnapCountryIso());
		setSnapNumberDesc(that.getSnapNumberDesc());
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
		buffer.append("rcsBotId=[").append(rcsBotId).append("] ");
		buffer.append("snapCallNumber=[").append(snapCallNumber).append("] ");
		buffer.append("snapCountryCode=[").append(snapCountryCode).append("] ");
		buffer.append("snapCountryIso=[").append(snapCountryIso).append("] ");
		buffer.append("snapNumberDesc=[").append(snapNumberDesc).append("] ");
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
		if (!(obj instanceof RcsBotSnapNumber))
			return false;
		RcsBotSnapNumber equalCheck = (RcsBotSnapNumber) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
