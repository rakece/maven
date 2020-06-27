
package com.kirusa.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

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
		@NamedQuery(name = "findAllRcsBotTypes", query = "select myRcsBotType from RcsBotType myRcsBotType"),
		@NamedQuery(name = "findRcsBotTypeByCreateDate", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.createDate = ?1"),
		@NamedQuery(name = "findRcsBotTypeById", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.id = ?1"),
		@NamedQuery(name = "findRcsBotTypeByLastUpdate", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotTypeByPrimaryKey", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.id = ?1"),
		@NamedQuery(name = "findRcsBotTypeByRcsBotCategoryId", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.rcsBotCategoryId = ?1"),
		@NamedQuery(name = "findRcsBotTypeByRcsBotId", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.rcsBotId = ?1"),
		@NamedQuery(name = "findRcsBotTypeByType", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.type = ?1 order by lastUpdate desc"),
		@NamedQuery(name = "findRcsBotTypeByTypeContaining", query = "select myRcsBotType from RcsBotType myRcsBotType where myRcsBotType.type like ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_type")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotType")

public class RcsBotType implements Serializable {
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

	@Column(name = "type", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String type;
	/**
	 */

	@Column(name = "rcs_bot_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotId;
	/**
	 */

	@Column(name = "rcs_bot_category_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotCategoryId;
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
	public void setType(String type) {
		this.type = type;
	}

	/**
	 */
	public String getType() {
		return this.type;
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
	public void setRcsBotCategoryId(Integer rcsBotCategoryId) {
		this.rcsBotCategoryId = rcsBotCategoryId;
	}

	/**
	 */
	public Integer getRcsBotCategoryId() {
		return this.rcsBotCategoryId;
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
	public RcsBotType() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotType that) {
		setId(that.getId());
		setType(that.getType());
		setRcsBotId(that.getRcsBotId());
		setRcsBotCategoryId(that.getRcsBotCategoryId());
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
		buffer.append("type=[").append(type).append("] ");
		buffer.append("rcsBotId=[").append(rcsBotId).append("] ");
		buffer.append("rcsBotCategoryId=[").append(rcsBotCategoryId).append("] ");
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
		if (!(obj instanceof RcsBotType))
			return false;
		RcsBotType equalCheck = (RcsBotType) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
