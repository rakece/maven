
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
		@NamedQuery(name = "findAllRcsBotTypeDescs", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc"),
		@NamedQuery(name = "findRcsBotTypeDescByCreateDate", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.createDate = ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByDescription", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.description = ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByDescriptionContaining", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.description like ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByDisplayName", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.displayName = ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByDisplayNameContaining", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.displayName like ?1"),
		@NamedQuery(name = "findRcsBotTypeDescById", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.id = ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByLang", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.lang = ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByLangContaining", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.lang like ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByLastUpdate", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.lastUpdate = ?1"),
		
		@NamedQuery(name = "findRcsBotTypeDescByName", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.name = ?1"),
		
		@NamedQuery(name = "findRcsBotTypeDescByNameAndLang", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.name = ?1 and myRcsBotTypeDesc.lang = ?2"),

		
		@NamedQuery(name = "findRcsBotTypeDescByNameContaining", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.name like ?1"),
		@NamedQuery(name = "findRcsBotTypeDescByPrimaryKey", query = "select myRcsBotTypeDesc from RcsBotTypeDesc myRcsBotTypeDesc where myRcsBotTypeDesc.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_type_desc")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotTypeDesc")

public class RcsBotTypeDesc implements Serializable {
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

	@Column(name = "description", length = 2048, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "lang", length = 128, nullable = false)
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
	public RcsBotTypeDesc() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotTypeDesc that) {
		setId(that.getId());
		setName(that.getName());
		setDisplayName(that.getDisplayName());
		setDescription(that.getDescription());
		setLang(that.getLang());
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
		buffer.append("name=[").append(name).append("] ");
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
		if (!(obj instanceof RcsBotTypeDesc))
			return false;
		RcsBotTypeDesc equalCheck = (RcsBotTypeDesc) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
