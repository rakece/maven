
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
		@NamedQuery(name = "findAllRcsBotUserroles", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole"),
		@NamedQuery(name = "findRcsBotUserroleByCreateDate", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.createDate = ?1"),
		@NamedQuery(name = "findRcsBotUserroleById", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.id = ?1"),
		@NamedQuery(name = "findRcsBotUserroleByLastUpdate", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.lastUpdate = ?1"),
		@NamedQuery(name = "findRcsBotUserroleByPrimaryKey", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.id = ?1"),
		@NamedQuery(name = "findRcsBotUserroleByRoleDescription", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.roleDescription = ?1"),
		@NamedQuery(name = "findRcsBotUserroleByRoleDescriptionContaining", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.roleDescription like ?1"),
		@NamedQuery(name = "findRcsBotUserroleByUserRoleType", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.userRoleType = ?1"),
		@NamedQuery(name = "findRcsBotUserroleByUserRoleTypeContaining", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.userRoleType like ?1"),
		@NamedQuery(name = "findRcsBotUserroleByValidFrom", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.validFrom = ?1"),
		@NamedQuery(name = "findRcsBotUserroleByValidTo", query = "select myRcsBotUserrole from RcsBotUserrole myRcsBotUserrole where myRcsBotUserrole.validTo = ?1") })

@Table(catalog = "rcsbotdirectory", name = "rcs_bot_userrole")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "rcsbotdirectory/com/kirusa/domain", name = "RcsBotUserrole")

public class RcsBotUserrole implements Serializable {
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

	@Column(name = "user_role_type", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userRoleType;
	/**
	 */

	@Column(name = "role_description", length = 128, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String roleDescription;
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "valid_from", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar validFrom;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "valid_to", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar validTo;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "rcs_bot_user_id", referencedColumnName = "id", nullable = false) })
	@XmlTransient
	RcsBotUser rcsBotUser;

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
	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}

	/**
	 */
	public String getUserRoleType() {
		return this.userRoleType;
	}

	/**
	 */
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	/**
	 */
	public String getRoleDescription() {
		return this.roleDescription;
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
	public void setValidFrom(Calendar validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 */
	public Calendar getValidFrom() {
		return this.validFrom;
	}

	/**
	 */
	public void setValidTo(Calendar validTo) {
		this.validTo = validTo;
	}

	/**
	 */
	public Calendar getValidTo() {
		return this.validTo;
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
	public RcsBotUserrole() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(RcsBotUserrole that) {
		setId(that.getId());
		setUserRoleType(that.getUserRoleType());
		setRoleDescription(that.getRoleDescription());
		setCreateDate(that.getCreateDate());
		setLastUpdate(that.getLastUpdate());
		setValidFrom(that.getValidFrom());
		setValidTo(that.getValidTo());
		setRcsBotUser(that.getRcsBotUser());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("userRoleType=[").append(userRoleType).append("] ");
		buffer.append("roleDescription=[").append(roleDescription).append("] ");
		buffer.append("createDate=[").append(createDate).append("] ");
		buffer.append("lastUpdate=[").append(lastUpdate).append("] ");
		buffer.append("validFrom=[").append(validFrom).append("] ");
		buffer.append("validTo=[").append(validTo).append("] ");

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
		if (!(obj instanceof RcsBotUserrole))
			return false;
		RcsBotUserrole equalCheck = (RcsBotUserrole) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
