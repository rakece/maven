
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
		@NamedQuery(name = "findAllRcsBotCategoryDescs", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc"),
		@NamedQuery(name = "findRcsBotCategoryDescByCreateDate", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.createDate = ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByDescription", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.description = ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByDescriptionContaining", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.description like ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByDisplayName", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.displayName = ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByDisplayNameContaining", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.displayName like ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescById", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.id = ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByLang", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.lang = ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByLangContaining", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.lang like ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByLastUpdate", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotCategoryDescByLangAndByCategotyId", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.rcsBotCategory.id = ?1 and myRcsBotCategoryDesc.lang = ?2"),
		@NamedQuery(name = "findRcsBotCategoryDescByPrimaryKey", query = "select myRcsBotCategoryDesc from RcsBotCategoryDesc myRcsBotCategoryDesc where myRcsBotCategoryDesc.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_category_desc")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotCategoryDesc")

public class RcsBotCategoryDesc implements Serializable {
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

	@Column(name = "display_name", length = 128, nullable = false)
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

	@Column(name = "lang", length = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String lang;
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
	public RcsBotCategoryDesc() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotCategoryDesc that) {
		setId(that.getId());
		setDisplayName(that.getDisplayName());
		setDescription(that.getDescription());
		setLang(that.getLang());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBotCategory(that.getRcsBotCategory());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("displayName=[").append(displayName).append("] ");
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
		if (!(obj instanceof RcsBotCategoryDesc))
			return false;
		RcsBotCategoryDesc equalCheck = (RcsBotCategoryDesc) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
