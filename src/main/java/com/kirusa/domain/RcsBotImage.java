
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
		@NamedQuery(name = "findAllRcsBotImages", query = "select myRcsBotImage from RcsBotImage myRcsBotImage"),
		@NamedQuery(name = "findRcsBotImageByCreateDate", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.createDate = ?1"),
		@NamedQuery(name = "findRcsBotImageByDescription", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.description = ?1"),
		@NamedQuery(name = "findRcsBotImageByDescriptionContaining", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.description like ?1"),
		@NamedQuery(name = "findRcsBotImageById", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.id = ?1"),
		@NamedQuery(name = "findRcsBotImageByImageName", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.imageName = ?1"),
		@NamedQuery(name = "findRcsBotImageByImageNameContaining", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.imageName like ?1"),
		@NamedQuery(name = "findRcsBotImageByLastUpdate", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotImageByPrimaryKey", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.id = ?1"),
		@NamedQuery(name = "findRcsBotImageByStatus", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.status = ?1"),
		@NamedQuery(name = "findRcsBotImageByStatusContaining", query = "select myRcsBotImage from RcsBotImage myRcsBotImage where myRcsBotImage.status like ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_image")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotImage")

public class RcsBotImage implements Serializable {
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

	@Column(name = "image_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String imageName;
	/**
	 */

	@Column(name = "description", length = 4000)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
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

	@Column(name = "status", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String status;

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
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 */
	public String getStatus() {
		return this.status;
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
	public RcsBotImage() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotImage that) {
		setId(that.getId());
		setImageName(that.getImageName());
		setDescription(that.getDescription());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setStatus(that.getStatus());
		setRcsBot(that.getRcsBot());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("imageName=[").append(imageName).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("lastUpdate=[").append(lastUpdate).append("] ");
		buffer.append("status=[").append(status).append("] ");

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
		if (!(obj instanceof RcsBotImage))
			return false;
		RcsBotImage equalCheck = (RcsBotImage) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
