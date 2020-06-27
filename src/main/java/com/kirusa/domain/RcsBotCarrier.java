
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
		@NamedQuery(name = "findAllRcsBotCarriers", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier"),
		@NamedQuery(name = "findRcsBotCarrierByCreateDate", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.createDate = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByDescription", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.description = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByDescriptionContaining", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.description like ?1"),
		@NamedQuery(name = "findRcsBotCarrierByDisplayName", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.displayName = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByDisplayNameContaining", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.displayName like ?1"),
		@NamedQuery(name = "findRcsBotCarrierById", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.id = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByLastUpdate", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByName", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.name = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByNameContaining", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.name like ?1"),
		@NamedQuery(name = "findRcsBotCarrierByPrimaryKey", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.id = ?1"),
		@NamedQuery(name = "findRcsBotCarrierByRcsCountryId", query = "select myRcsBotCarrier from RcsBotCarrier myRcsBotCarrier where myRcsBotCarrier.rcsCountryId = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_carrier")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotCarrier")

public class RcsBotCarrier implements Serializable, Comparable<RcsBotCarrier> {
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

	@Column(name = "rcs_country_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsCountryId;
	/**
	 */

	@Column(name = "name", length = 1024, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	 */

	@Column(name = "display_name", length = 1024, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String displayName;
	/**
	 */

	@Column(name = "description", length = 2048)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
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
	public void setRcsCountryId(Integer rcsCountryId) {
		this.rcsCountryId = rcsCountryId;
	}

	/**
	 */
	public Integer getRcsCountryId() {
		return this.rcsCountryId;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 */
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
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
	public RcsBotCarrier() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotCarrier that) {
		setId(that.getId());
		setRcsCountryId(that.getRcsCountryId());
		setName(that.getName());
		setDisplayName(that.getDisplayName());
		setDescription(that.getDescription());
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
		buffer.append("rcsCountryId=[").append(rcsCountryId).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("displayName=[").append(displayName).append("] ");
		buffer.append("description=[").append(description).append("] ");
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
		if (!(obj instanceof RcsBotCarrier))
			return false;
		RcsBotCarrier equalCheck = (RcsBotCarrier) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	@Override
	public int compareTo(RcsBotCarrier o) {
		return this.name.compareTo(o.name);
	}
}
