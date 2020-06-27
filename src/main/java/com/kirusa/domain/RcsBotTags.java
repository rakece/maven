
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
		@NamedQuery(name = "findAllRcsBotTagss", query = "select myRcsBotTags from RcsBotTags myRcsBotTags"),
		@NamedQuery(name = "findRcsBotTagsByCreateDate", query = "select myRcsBotTags from RcsBotTags myRcsBotTags where myRcsBotTags.createDate = ?1"),
		@NamedQuery(name = "findRcsBotTagsById", query = "select myRcsBotTags from RcsBotTags myRcsBotTags where myRcsBotTags.id = ?1"),
		@NamedQuery(name = "findRcsBotTagsByLastUpdate", query = "select myRcsBotTags from RcsBotTags myRcsBotTags where myRcsBotTags.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotTagsByPrimaryKey", query = "select myRcsBotTags from RcsBotTags myRcsBotTags where myRcsBotTags.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_tags")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotTags")

public class RcsBotTags implements Serializable {
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_category_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBotCategory rcsBotCategory;

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
	public void setRcsBotCategory(RcsBotCategory rcsBotCategory) {
		this.rcsBotCategory = rcsBotCategory;
	}

	/**
	 */
	public RcsBotCategory getRcsBotCategory() {
		return rcsBotCategory;
	}

	/**
	 */
	public RcsBotTags() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotTags that) {
		setId(that.getId());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBot(that.getRcsBot());
		setRcsBotCategory(that.getRcsBotCategory());
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
		if (!(obj instanceof RcsBotTags))
			return false;
		RcsBotTags equalCheck = (RcsBotTags) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
