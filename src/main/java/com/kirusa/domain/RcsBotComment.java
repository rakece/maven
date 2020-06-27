
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
		@NamedQuery(name = "findAllRcsBotComments", query = "select myRcsBotComment from RcsBotComment myRcsBotComment"),
		@NamedQuery(name = "findRcsBotCommentByCommenttext", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.commenttext = ?1"),
		@NamedQuery(name = "findRcsBotCommentByCommenttextContaining", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.commenttext like ?1"),
		@NamedQuery(name = "findRcsBotCommentByCreateDate", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.createDate = ?1"),
		@NamedQuery(name = "findRcsBotCommentById", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.id = ?1"),
		@NamedQuery(name = "findRcsBotCommentByLang", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.lang = ?1"),
		@NamedQuery(name = "findRcsBotCommentByLangContaining", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.lang like ?1"),
		@NamedQuery(name = "findRcsBotCommentByLastUpdate", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotCommentByNegativeCount", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.negativeCount = ?1"),
		@NamedQuery(name = "findRcsBotCommentByPositiveCount", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.positiveCount = ?1"),
		@NamedQuery(name = "findRcsBotCommentByPrimaryKey", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.id = ?1"),
		@NamedQuery(name = "findRcsBotCommentByRating", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.rating = ?1"),
		@NamedQuery(name = "findRcsBotCommentByRcsBotUserId", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.rcsBotUserId = ?1"),
		@NamedQuery(name = "findRcsBotCommentByStatus", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.status = ?1"),
		@NamedQuery(name = "findRcsBotCommentByStatusContaining", query = "select myRcsBotComment from RcsBotComment myRcsBotComment where myRcsBotComment.status like ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_comment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotComment")

public class RcsBotComment implements Serializable {
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

	@Column(name = "rcs_bot_user_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rcsBotUserId;
	/**
	 */

	@Column(name = "commenttext", length = 1024)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String commenttext;
	/**
	 */

	@Column(name = "status", length = 200)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String status;
	/**
	 */

	@Column(name = "rating", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer rating;
	/**
	 */

	@Column(name = "positive_count", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer positiveCount;
	/**
	 */

	@Column(name = "negative_count", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer negativeCount;
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
	public void setRcsBotUserId(Integer rcsBotUserId) {
		this.rcsBotUserId = rcsBotUserId;
	}

	/**
	 */
	public Integer getRcsBotUserId() {
		return this.rcsBotUserId;
	}

	/**
	 */
	public void setCommenttext(String commenttext) {
		this.commenttext = commenttext;
	}

	/**
	 */
	public String getCommenttext() {
		return this.commenttext;
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
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 */
	public Integer getRating() {
		return this.rating;
	}

	/**
	 */
	public void setPositiveCount(Integer positiveCount) {
		this.positiveCount = positiveCount;
	}

	/**
	 */
	public Integer getPositiveCount() {
		return this.positiveCount;
	}

	/**
	 */
	public void setNegativeCount(Integer negativeCount) {
		this.negativeCount = negativeCount;
	}

	/**
	 */
	public Integer getNegativeCount() {
		return this.negativeCount;
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
	public RcsBotComment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotComment that) {
		setId(that.getId());
		setRcsBotUserId(that.getRcsBotUserId());
		setCommenttext(that.getCommenttext());
		setStatus(that.getStatus());
		setRating(that.getRating());
		setPositiveCount(that.getPositiveCount());
		setNegativeCount(that.getNegativeCount());
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
		buffer.append("rcsBotUserId=[").append(rcsBotUserId).append("] ");
		buffer.append("commenttext=[").append(commenttext).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("rating=[").append(rating).append("] ");
		buffer.append("positiveCount=[").append(positiveCount).append("] ");
		buffer.append("negativeCount=[").append(negativeCount).append("] ");
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
		if (!(obj instanceof RcsBotComment))
			return false;
		RcsBotComment equalCheck = (RcsBotComment) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
