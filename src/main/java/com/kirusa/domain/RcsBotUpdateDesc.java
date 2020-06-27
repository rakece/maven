
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
		@NamedQuery(name = "findAllRcsBotUpdateDescs", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc"),
		@NamedQuery(name = "findRcsBotUpdateDescByCreateDate", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.createDate = ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescByDescription", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.description = ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescByDescriptionContaining", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.description like ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescById", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.id = ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescByLang", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.lang = ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescByLangContaining", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.lang like ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescByLastUpdate", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotUpdateDescByPrimaryKey", query = "select myRcsBotUpdateDesc from RcsBotUpdateDesc myRcsBotUpdateDesc where myRcsBotUpdateDesc.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_update_desc")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotUpdateDesc")

public class RcsBotUpdateDesc implements Serializable {
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

	@Column(name = "description", length = 2048)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "lang", length = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lang;
	
	@Column(name = "status", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String status;
	
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
	public RcsBotUpdateDesc() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotUpdateDesc that) {
		setId(that.getId());
		setDescription(that.getDescription());
		setLang(that.getLang());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBot(that.getRcsBot());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("lang=[").append(lang).append("] ");
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
		if (!(obj instanceof RcsBotUpdateDesc))
			return false;
		RcsBotUpdateDesc equalCheck = (RcsBotUpdateDesc) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
