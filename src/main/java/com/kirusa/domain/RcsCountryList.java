
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
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
		@NamedQuery(name = "findAllRcsCountryLists", query = "select myRcsCountryList from RcsCountryList myRcsCountryList"),
		@NamedQuery(name = "findRcsCountryListByCountryIsoName", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.countryIsoName = ?1"),
		@NamedQuery(name = "findRcsCountryListByCountryIsoNameContaining", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.countryIsoName like ?1"),
		@NamedQuery(name = "findRcsCountryListByCountryName", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.countryName = ?1"),
		@NamedQuery(name = "findRcsCountryListByCountryNameContaining", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.countryName like ?1"),
		@NamedQuery(name = "findRcsCountryListByCreateDate", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.createDate = ?1"),
		@NamedQuery(name = "findRcsCountryListById", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.id = ?1"),
		@NamedQuery(name = "findRcsCountryListByLastUpdate", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsCountryListByPrimaryKey", query = "select myRcsCountryList from RcsCountryList myRcsCountryList where myRcsCountryList.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_country_list")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsCountryList")
@XmlRootElement(namespace = "rcsbotdirectory/com/kirusa/domain")
public class RcsCountryList implements Serializable,Comparable<RcsCountryList> {
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

	@Column(name = "country_iso_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String countryIsoName;
	/**
	 */

	@Column(name = "country_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String countryName;
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
	@OneToMany(mappedBy = "rcsCountryList", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotUser> rcsBotUsers;
	/**
	 */
	@OneToMany(mappedBy = "rcsCountryList", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotAvailable> rcsBotAvailables;

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
	public void setCountryIsoName(String countryIsoName) {
		this.countryIsoName = countryIsoName;
	}

	/**
	 */
	public String getCountryIsoName() {
		return this.countryIsoName;
	}

	/**
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 */
	public String getCountryName() {
		return this.countryName;
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
	public void setRcsBotUsers(Set<RcsBotUser> rcsBotUsers) {
		this.rcsBotUsers = rcsBotUsers;
	}

	/**
	 */
	public Set<RcsBotUser> getRcsBotUsers() {
		if (rcsBotUsers == null) {
			rcsBotUsers = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotUser>();
		}
		return rcsBotUsers;
	}

	/**
	 */
	public void setRcsBotAvailables(Set<RcsBotAvailable> rcsBotAvailables) {
		this.rcsBotAvailables = rcsBotAvailables;
	}

	/**
	 */
	public Set<RcsBotAvailable> getRcsBotAvailables() {
		if (rcsBotAvailables == null) {
			rcsBotAvailables = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotAvailable>();
		}
		return rcsBotAvailables;
	}

	/**
	 */
	public RcsCountryList() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsCountryList that) {
		setId(that.getId());
		setCountryIsoName(that.getCountryIsoName());
		setCountryName(that.getCountryName());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBotUsers(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotUser>(that.getRcsBotUsers()));
		setRcsBotAvailables(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotAvailable>(that.getRcsBotAvailables()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("countryIsoName=[").append(countryIsoName).append("] ");
		buffer.append("countryName=[").append(countryName).append("] ");
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
		if (!(obj instanceof RcsCountryList))
			return false;
		RcsCountryList equalCheck = (RcsCountryList) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
	
	@Override
    public int compareTo(RcsCountryList rcsCountryList) {
        return this.countryName.compareTo(rcsCountryList.countryName);
    }
}
