
package com.kirusa.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

/**
 */

@Entity
@DynamicInsert
@DynamicUpdate
@SelectBeforeUpdate
@NamedQueries({
		@NamedQuery(name = "findAllRcsBots", query = "select myRcsBot from RcsBot myRcsBot"),
		@NamedQuery(name = "findRcsBotByCreateDate", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.createDate = ?1"),
		@NamedQuery(name = "findRcsBotById", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.id = ?1"),
		@NamedQuery(name = "findRcsBotByLastUpdate", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotByLogoImageName", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.logoImageName = ?1"),
		@NamedQuery(name = "findRcsBotByLogoImageNameContaining", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.logoImageName like ?1"),
		@NamedQuery(name = "findRcsBotByPlatform", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.platform = ?1"),
		@NamedQuery(name = "findRcsBotByPlatformContaining", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.platform like ?1"),
		@NamedQuery(name = "findRcsBotByPrimaryKey", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.id = ?1"),
		@NamedQuery(name = "findRcsBotByPrivacyUrl", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.privacyUrl = ?1"),
		@NamedQuery(name = "findRcsBotByPrivacyUrlContaining", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.privacyUrl like ?1"),
		@NamedQuery(name = "findRcsBotByStatus", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.status = ?1"),
		@NamedQuery(name = "findRcsBotByStatusContaining", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.status like ?1"),
		@NamedQuery(name = "findRcsBotByTermAndConditionUrl", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.termAndConditionUrl = ?1"),
		@NamedQuery(name = "findRcsBotByTermAndConditionUrlContaining", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.termAndConditionUrl like ?1"),
		@NamedQuery(name = "findRcsBotByWebsiteUrl", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.websiteUrl = ?1"),
		@NamedQuery(name = "findRcsBotByWebsiteUrlContaining", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.websiteUrl like ?1"),
		@NamedQuery(name = "findRcsBotByRcsBotCategoryId", query = "select myRcsBot from RcsBot myRcsBot where myRcsBot.rcsBotCategory.id = ?1"),		
})



@Table(catalog = "rcsbotdirectory", name = "rcs_bot")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBot")
@XmlRootElement(namespace = "rcsbotdirectory/com/kirusa/domain")
public class RcsBot implements Serializable {
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

	@Column(name = "platform", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String platform;
	/**
	 */

	@Column(name = "privacy_url", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String privacyUrl;
	/**
	 */

	@Column(name = "website_url", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String websiteUrl;
	/**
	 */

	@Column(name = "term_and_condition_url", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String termAndConditionUrl;
	
	/**
	 * 
	 */
	@Column(name = "register_url", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String registerUrl;
	
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

	@Column(name = "logo_image_name", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String logoImageName;

/**
	 */

	@Column(name = "opt_in", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String optIn;

	/**
	 */

	@Column(name = "opt_in_url", length = 128)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String optInUrl;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBotUser rcsBotUser;
	/**
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_category_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBotCategory rcsBotCategory;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot", cascade = { CascadeType.REMOVE },fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotDesc> rcsBotDescs;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",   cascade = { CascadeType.REMOVE },fetch = FetchType.EAGER)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotAvailable> rcsBotAvailables;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",  cascade = { CascadeType.REMOVE },fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotImage> rcsBotImages;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",  cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotVideo> rcsBotVideos;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",  cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotBilling> rcsBotBillings;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",  cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotComment> rcsBotComments;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",  cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotTags> rcsBotTagses;
	/**
	 */
	@OneToMany(mappedBy = "rcsBot",  cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.kirusa.domain.RcsBotUpdateDesc> rcsBotUpdatesDesc;

	
	@Transient
	private String type;

	
	public String getOptIn() {
		return optIn;
	}

	public void setOptIn(String optIn) {
		this.optIn = optIn;
	}

	public String getOptInUrl() {
		return optInUrl;
	}

	public void setOptInUrl(String optInUrl) {
		this.optInUrl = optInUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 */
	public String getPlatform() {
		return this.platform;
	}

	/**
	 */
	public void setPrivacyUrl(String privacyUrl) {
		this.privacyUrl = privacyUrl;
	}

	/**
	 */
	public String getPrivacyUrl() {
		return this.privacyUrl;
	}

	/**
	 */
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	/**
	 */
	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	/**
	 */
	public void setTermAndConditionUrl(String termAndConditionUrl) {
		this.termAndConditionUrl = termAndConditionUrl;
	}

	/**
	 */
	public String getTermAndConditionUrl() {
		return this.termAndConditionUrl;
	}

	
	
	public String getRegisterUrl() {
		return registerUrl;
	}

	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
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
	public void setLogoImageName(String logoImageName) {
		this.logoImageName = logoImageName;
	}

	/**
	 */
	public String getLogoImageName() {
		return this.logoImageName;
	}

	/**
	 */
	public void setRcsBotUser(RcsBotUser rcsBotUser) {
		this.rcsBotUser = rcsBotUser;
	}

	/**
	 */
	public RcsBotUser getRcsBotUser() {
		return rcsBotUser;
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
	public void setRcsBotDescs(Set<RcsBotDesc> rcsBotDescs) {
		this.rcsBotDescs = rcsBotDescs;
	}

	/**
	 */
	public Set<RcsBotDesc> getRcsBotDescs() {
		if (rcsBotDescs == null) {
			rcsBotDescs = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotDesc>();
		}
		return rcsBotDescs;
	}

	/**
	 */
	public void setRcsBotAvailables(Set<RcsBotAvailable> rcsBotAvailables) {
		this.rcsBotAvailables = rcsBotAvailables;
	}

	/**
	 */
	public Set<RcsBotAvailable> getRcsBotAvailables() {
		if (rcsBotAvailables == null) {
			rcsBotAvailables = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotAvailable>();
		}
		return rcsBotAvailables;
	}

	/**
	 */
	public void setRcsBotImages(Set<RcsBotImage> rcsBotImages) {
		this.rcsBotImages = rcsBotImages;
	}

	/**
	 */
	public Set<RcsBotImage> getRcsBotImages() {
		if (rcsBotImages == null) {
			rcsBotImages = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotImage>();
		}
		return rcsBotImages;
	}

	/**
	 */
	public void setRcsBotVideos(Set<RcsBotVideo> rcsBotVideos) {
		this.rcsBotVideos = rcsBotVideos;
	}

	/**
	 */
	public Set<RcsBotVideo> getRcsBotVideos() {
		if (rcsBotVideos == null) {
			rcsBotVideos = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotVideo>();
		}
		return rcsBotVideos;
	}

	/**
	 */
	public void setRcsBotBillings(Set<RcsBotBilling> rcsBotBillings) {
		this.rcsBotBillings = rcsBotBillings;
	}

	/**
	 */
	public Set<RcsBotBilling> getRcsBotBillings() {
		if (rcsBotBillings == null) {
			rcsBotBillings = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotBilling>();
		}
		return rcsBotBillings;
	}

	/**
	 */
	public void setRcsBotComments(Set<RcsBotComment> rcsBotComments) {
		this.rcsBotComments = rcsBotComments;
	}

	/**
	 */
	public Set<RcsBotComment> getRcsBotComments() {
		if (rcsBotComments == null) {
			rcsBotComments = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotComment>();
		}
		return rcsBotComments;
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
	public void setRcsBotUpdatesDesc(Set<RcsBotUpdateDesc> rcsBotUpdatesDesc) {
		this.rcsBotUpdatesDesc = rcsBotUpdatesDesc;
	}

	/**
	 */
	public Set<RcsBotUpdateDesc> getRcsBotUpdatesDesc() {
		if (rcsBotUpdatesDesc == null) {
			rcsBotUpdatesDesc = new java.util.LinkedHashSet<com.kirusa.domain.RcsBotUpdateDesc>();
		}
		return rcsBotUpdatesDesc;
	}

	/**
	 */
	public RcsBot() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBot that) {
		setId(that.getId());
		setPlatform(that.getPlatform());
		setPrivacyUrl(that.getPrivacyUrl());
		setWebsiteUrl(that.getWebsiteUrl());
		setTermAndConditionUrl(that.getTermAndConditionUrl());
		setRegisterUrl(that.getRegisterUrl());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setStatus(that.getStatus());
		setLogoImageName(that.getLogoImageName());
		setRcsBotUser(that.getRcsBotUser());
		setRcsBotCategory(that.getRcsBotCategory());
		setRcsBotDescs(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotDesc>(that.getRcsBotDescs()));
		setRcsBotAvailables(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotAvailable>(that.getRcsBotAvailables()));
		setRcsBotImages(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotImage>(that.getRcsBotImages()));
		setRcsBotVideos(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotVideo>(that.getRcsBotVideos()));
		setRcsBotBillings(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotBilling>(that.getRcsBotBillings()));
		setRcsBotComments(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotComment>(that.getRcsBotComments()));
		setRcsBotTagses(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotTags>(that.getRcsBotTagses()));
		setRcsBotUpdatesDesc(new java.util.LinkedHashSet<com.kirusa.domain.RcsBotUpdateDesc>(that.getRcsBotUpdatesDesc()));
		setType(that.getType());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("platform=[").append(platform).append("] ");
		buffer.append("privacyUrl=[").append(privacyUrl).append("] ");
		buffer.append("websiteUrl=[").append(websiteUrl).append("] ");
		buffer.append("termAndConditionUrl=[").append(termAndConditionUrl).append("] ");
		buffer.append("registerUrl=[").append(registerUrl).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("lastUpdate=[").append(lastUpdate).append("] ");
		buffer.append("status=[").append(status).append("] ");
		buffer.append("logoImageName=[").append(logoImageName).append("] ");

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
		if (!(obj instanceof RcsBot))
			return false;
		RcsBot equalCheck = (RcsBot) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
