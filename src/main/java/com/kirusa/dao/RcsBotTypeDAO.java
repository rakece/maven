
package com.kirusa.dao;

import com.kirusa.domain.RcsBotType;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotType entities.
 * 
 */
public interface RcsBotTypeDAO extends JpaDao<RcsBotType> {

	/**
	 * JPQL Query - findRcsBotTypeByType
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByType(String type) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByType
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByType(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByTypeContaining
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByTypeContaining(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByTypeContaining
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByTypeContaining(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByCreateDate
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByCreateDate
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotTypes
	 *
	 */
	public Set<RcsBotType> findAllRcsBotTypes() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotTypes
	 *
	 */
	public Set<RcsBotType> findAllRcsBotTypes(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotCategoryId
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByRcsBotCategoryId(Integer rcsBotCategoryId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotCategoryId
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByRcsBotCategoryId(Integer rcsBotCategoryId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeById
	 *
	 */
	public RcsBotType findRcsBotTypeById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeById
	 *
	 */
	public RcsBotType findRcsBotTypeById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByLastUpdate
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByLastUpdate
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByPrimaryKey
	 *
	 */
	public RcsBotType findRcsBotTypeByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByPrimaryKey
	 *
	 */
	public RcsBotType findRcsBotTypeByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotId
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByRcsBotId(Integer rcsBotId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotId
	 *
	 */
	public Set<RcsBotType> findRcsBotTypeByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);

}