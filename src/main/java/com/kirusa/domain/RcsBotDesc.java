
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
		@NamedQuery(name = "findAllRcsBotDescs", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc"),
		@NamedQuery(name = "findRcsBotDescByBotName", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.botName = ?1"),
		@NamedQuery(name = "findRcsBotDescByBotNameContaining", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.botName like ?1"),
		@NamedQuery(name = "findRcsBotDescByBotSummary", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.botSummary = ?1"),
		@NamedQuery(name = "findRcsBotDescByBotSummaryContaining", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.botSummary like ?1"),
		@NamedQuery(name = "findRcsBotDescByCreateDate", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.createDate = ?1"),
		@NamedQuery(name = "findRcsBotDescByDescription", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.description = ?1"),
		@NamedQuery(name = "findRcsBotDescByDescriptionContaining", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.description like ?1"),
		@NamedQuery(name = "findRcsBotDescByDisplayName", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.displayName = ?1"),
		@NamedQuery(name = "findRcsBotDescByDisplayNameContaining", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.displayName like ?1"),
		@NamedQuery(name = "findRcsBotDescById", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.id = ?1"),
		
		@NamedQuery(name = "findRcsBotDescByLang", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.lang = ?1"),
		
		@NamedQuery(name = "findRcsBotDescByLangAndSummary", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.lang = ?1 and myRcsBotDesc.botSummary like ?2"),
		
		@NamedQuery(name = "findRcsBotDescByLangContaining", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.lang like ?1"),
		@NamedQuery(name = "findRcsBotDescByLastUpdate", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotDescByPrimaryKey", query = "select myRcsBotDesc from RcsBotDesc myRcsBotDesc where myRcsBotDesc.id = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_desc")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotDesc")

public class RcsBotDesc implements Serializable {
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

	@Column(name = "bot_name", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String botName;
	/**
	 */

	@Column(name = "bot_summary", length = 1024, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String botSummary;
	/**
	 */

	@Column(name = "display_name", length = 1024, nullable = false)
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
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBot rcsBot;

	
	@Column(name = "bot_feature", length = 1024, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String botFeature;
	
	
	
	
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
	public void setBotName(String botName) {
		this.botName = botName;
	}

	/**
	 */
	public String getBotName() {
		return this.botName;
	}

	/**
	 */
	public void setBotSummary(String botSummary) {
		this.botSummary = botSummary;
	}

	/**
	 */
	public String getBotSummary() {
		return this.botSummary;
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
	public RcsBotDesc() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotDesc that) {
		setId(that.getId());
		setBotName(that.getBotName());
		setBotSummary(that.getBotSummary());
		setDisplayName(that.getDisplayName());
		setDescription(that.getDescription());
		setLang(that.getLang());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setRcsBot(that.getRcsBot());
		setBotFeature(that.getBotFeature());
		
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("botName=[").append(botName).append("] ");
		buffer.append("botSummary=[").append(botSummary).append("] ");
		buffer.append("botFeature=[").append(botFeature).append("] ");
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
		if (!(obj instanceof RcsBotDesc))
			return false;
		RcsBotDesc equalCheck = (RcsBotDesc) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}

	public String getBotFeature() {
		return botFeature;
	}

	public void setBotFeature(String botFeature) {
		this.botFeature = botFeature;
	}
	
}
