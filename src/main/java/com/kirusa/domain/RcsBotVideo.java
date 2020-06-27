
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
		@NamedQuery(name = "findAllRcsBotVideos", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo"),
		@NamedQuery(name = "findRcsBotVideoByCreateDate", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.createDate = ?1"),
		@NamedQuery(name = "findRcsBotVideoByDescription", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.description = ?1"),
		@NamedQuery(name = "findRcsBotVideoByDescriptionContaining", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.description like ?1"),
		@NamedQuery(name = "findRcsBotVideoById", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.id = ?1"),
		@NamedQuery(name = "findRcsBotVideoByLastUpdate", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotVideoByPrimaryKey", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.id = ?1"),
		@NamedQuery(name = "findRcsBotVideoByStatus", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.status = ?1"),
		@NamedQuery(name = "findRcsBotVideoByStatusContaining", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.status like ?1"),
		@NamedQuery(name = "findRcsBotVideoByVideoName", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.videoName = ?1"),
		@NamedQuery(name = "findRcsBotVideoByVideoNameContaining", query = "select myRcsBotVideo from RcsBotVideo myRcsBotVideo where myRcsBotVideo.videoName like ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_video")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotVideo")

public class RcsBotVideo implements Serializable {
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

	@Column(name = "video_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String videoName;
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
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	/**
	 */
	public String getVideoName() {
		return this.videoName;
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
	public RcsBotVideo() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotVideo that) {
		setId(that.getId());
		setVideoName(that.getVideoName());
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
		buffer.append("videoName=[").append(videoName).append("] ");
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
		if (!(obj instanceof RcsBotVideo))
			return false;
		RcsBotVideo equalCheck = (RcsBotVideo) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
