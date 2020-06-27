
package com.kirusa.dao;

import com.kirusa.domain.RcsBotUserrole;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotUserrole entities.
 * 
 */
public interface RcsBotUserroleDAO extends JpaDao<RcsBotUserrole> {

	/**
	 * JPQL Query - findRcsBotUserroleByPrimaryKey
	 *
	 */
	public RcsBotUserrole findRcsBotUserroleByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByPrimaryKey
	 *
	 */
	public RcsBotUserrole findRcsBotUserroleByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleTypeContaining
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleTypeContaining(String userRoleType) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleTypeContaining
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleTypeContaining(String userRoleType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotUserroles
	 *
	 */
	public Set<RcsBotUserrole> findAllRcsBotUserroles() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotUserroles
	 *
	 */
	public Set<RcsBotUserrole> findAllRcsBotUserroles(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescription
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescription(String roleDescription) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescription
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescription(String roleDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByLastUpdate
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByLastUpdate
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescriptionContaining
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescriptionContaining(String roleDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescriptionContaining
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescriptionContaining(String roleDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByCreateDate
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByCreateDate
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleById
	 *
	 */
	public RcsBotUserrole findRcsBotUserroleById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleById
	 *
	 */
	public RcsBotUserrole findRcsBotUserroleById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleType
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleType(String userRoleType_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleType
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleType(String userRoleType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByValidTo
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByValidTo(java.util.Calendar validTo) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByValidTo
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByValidTo(Calendar validTo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByValidFrom
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByValidFrom(java.util.Calendar validFrom) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserroleByValidFrom
	 *
	 */
	public Set<RcsBotUserrole> findRcsBotUserroleByValidFrom(Calendar validFrom, int startResult, int maxRows) throws DataAccessException;

}