
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

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
		@NamedQuery(name = "findAllRcsBotAvailables", query = "select myRcsBotAvailable from RcsBotAvailable myRcsBotAvailable"),
		@NamedQuery(name = "findRcsBotAvailableByCreateDate", query = "select myRcsBotAvailable from RcsBotAvailable myRcsBotAvailable where myRcsBotAvailable.createDate = ?1"),
		@NamedQuery(name = "findRcsBotAvailableById", query = "select myRcsBotAvailable from RcsBotAvailable myRcsBotAvailable where myRcsBotAvailable.id = ?1"),
		@NamedQuery(name = "findRcsBotAvailableByLastUpdate", query = "select myRcsBotAvailable from RcsBotAvailable myRcsBotAvailable where myRcsBotAvailable.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotAvailableByPrimaryKey", query = "select myRcsBotAvailable from RcsBotAvailable myRcsBotAvailable where myRcsBotAvailable.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_available")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotAvailable")

public class RcsBotAvailable implements Serializable {
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
	@JoinColumns({ @JoinColumn(name = "rcs_bot_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBot rcsBot;
	/**
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "rcs_country_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsCountryList rcsCountryList;

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
	public RcsBotAvailable() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotAvailable that) {
		setId(that.getId());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBot(that.getRcsBot());
		setRcsCountryList(that.getRcsCountryList());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
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
		if (!(obj instanceof RcsBotAvailable))
			return false;
		RcsBotAvailable equalCheck = (RcsBotAvailable) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
