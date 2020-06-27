
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
		@NamedQuery(name = "findAllRcsBotCarrierMappings", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping"),
		@NamedQuery(name = "findRcsBotCarrierMappingByCreateDate", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping where myRcsBotCarrierMapping.createDate = ?1"),
		@NamedQuery(name = "findRcsBotCarrierMappingById", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping where myRcsBotCarrierMapping.id = ?1"),
		@NamedQuery(name = "findRcsBotCarrierMappingByLastUpdate", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping where myRcsBotCarrierMapping.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotCarrierMappingByPrimaryKey", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping where myRcsBotCarrierMapping.id = ?1"),
		@NamedQuery(name = "findRcsBotCarrierMappingByRcsBotCarrierId", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping where myRcsBotCarrierMapping.rcsBotCarrierId = ?1"),
		@NamedQuery(name = "findRcsBotCarrierMappingByRcsBotId", query = "select myRcsBotCarrierMapping from RcsBotCarrierMapping myRcsBotCarrierMapping where myRcsBotCarrierMapping.rcsBotId = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_carrier_mapping")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotCarrierMapping")

public class RcsBotCarrierMapping implements Serializable {
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

	@Column(name = "rcs_bot_carrier_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotCarrierId;
	/**
	 */

	@Column(name = "rcs_bot_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotId;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@CreationTimestamp
	@XmlElement
	Calendar createDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@UpdateTimestamp
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
	public void setRcsBotCarrierId(Integer rcsBotCarrierId) {
		this.rcsBotCarrierId = rcsBotCarrierId;
	}

	/**
	 */
	public Integer getRcsBotCarrierId() {
		return this.rcsBotCarrierId;
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
	public RcsBotCarrierMapping() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotCarrierMapping that) {
		setId(that.getId());
		setRcsBotCarrierId(that.getRcsBotCarrierId());
		setRcsBotId(that.getRcsBotId());
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
		buffer.append("rcsBotCarrierId=[").append(rcsBotCarrierId).append("] ");
		buffer.append("rcsBotId=[").append(rcsBotId).append("] ");
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
		if (!(obj instanceof RcsBotCarrierMapping))
			return false;
		RcsBotCarrierMapping equalCheck = (RcsBotCarrierMapping) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
