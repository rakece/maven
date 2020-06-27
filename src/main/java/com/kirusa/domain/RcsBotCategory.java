
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
		@NamedQuery(name = "findAllRcsBotCategorys", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory"),
		@NamedQuery(name = "findRcsBotCategoryByCategoryName", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.categoryName = ?1"),
		@NamedQuery(name = "findRcsBotCategoryByCategoryNameContaining", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.categoryName like ?1"),
		@NamedQuery(name = "findRcsBotCategoryByCreateDate", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.createDate = ?1"),
		@NamedQuery(name = "findRcsBotCategoryById", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.id = ?1"),
		@NamedQuery(name = "findRcsBotCategoryByImageName", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.imageName = ?1"),
		@NamedQuery(name = "findRcsBotCategoryByImageNameContaining", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.imageName like ?1"),
		@NamedQuery(name = "findRcsBotCategoryByLastUpdate", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotCategoryByPrimaryKey", query = "select myRcsBotCategory from RcsBotCategory myRcsBotCategory where myRcsBotCategory.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_category")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotCategory")
@XmlRootElement(namespace = "rcsbotdirectory/com/kirusa/domain")
public class RcsBotCategory implements Serializable {
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

	@Column(name = "category_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String categoryName;
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
	@Column(name = "last_update", nullable = false,updatable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar lastUpdate;
	/**
	 */

	@Column(name = "image_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String imageName;

	/**
	 */
	@OneToMany(mappedBy = "rcsBotCategory", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBot> rcsBots;
	/**
	 */
	@OneToMany(mappedBy = "rcsBotCategory", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotTags> rcsBotTagses;
	/**
	 */
	@OneToMany(mappedBy = "rcsBotCategory", cascade = { CascadeType.REMOVE }, fetch = FetchType.EAGER)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotCategoryDesc> rcsBotCategoryDescs;

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
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 */
	public String getCategoryName() {
		return this.categoryName;
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
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 */
	public String getImageName() {
		return this.imageName;
	}

	/**
	 */
	public void setRcsBots(Set<RcsBot> rcsBots) {
		this.rcsBots = rcsBots;
	}

	/**
	 */
	public Set<RcsBot> getRcsBots() {
		if (rcsBots == null) {
			rcsBots = new java.util.LinkedHashSet<com.kirusa.domain.RcsBot>();
		}
		return rcsBots;
	}

	/**
	 */
	public void setRcsBotTagses(Set<RcsBotTags> rcsBotTagses) {
		this.rcsBotTagses = rcsBotTagses;
	}

	/**
	 */
	public Set<RcsBotTags> getRcsBotTagses() {
		if (rcsBotTagses == null) {
			rcsBotTagses = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotTags>();
		}
		return rcsBotTagses;
	}

	/**
	 */
	public void setRcsBotCategoryDescs(Set<RcsBotCategoryDesc> rcsBotCategoryDescs) {
		this.rcsBotCategoryDescs = rcsBotCategoryDescs;
	}

	/**
	 */
	public Set<RcsBotCategoryDesc> getRcsBotCategoryDescs() {
		if (rcsBotCategoryDescs == null) {
			rcsBotCategoryDescs = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotCategoryDesc>();
		}
		return rcsBotCategoryDescs;
	}

	/**
	 */
	public RcsBotCategory() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotCategory that) {
		setId(that.getId());
		setCategoryName(that.getCategoryName());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setImageName(that.getImageName());
		setRcsBots(new java.util.LinkedHashSet<com.kirusa.domain.RcsBot>(that.getRcsBots()));
		setRcsBotTagses(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotTags>(that.getRcsBotTagses()));
		setRcsBotCategoryDescs(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotCategoryDesc>(that.getRcsBotCategoryDescs()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("categoryName=[").append(categoryName).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("lastUpdate=[").append(lastUpdate).append("] ");
		buffer.append("imageName=[").append(imageName).append("] ");

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
		if (!(obj instanceof RcsBotCategory))
			return false;
		RcsBotCategory equalCheck = (RcsBotCategory) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
