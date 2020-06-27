
package com.kirusa.dao;

import com.kirusa.domain.RcsBotCarrier;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotCarrier entities.
 * 
 */
public interface RcsBotCarrierDAO extends JpaDao<RcsBotCarrier> {

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayNameContaining
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayNameContaining(String displayName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayNameContaining
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayNameContaining(String displayName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByLastUpdate
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByLastUpdate
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDescriptionContaining
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDescriptionContaining
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierById
	 *
	 */
	public RcsBotCarrier findRcsBotCarrierById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierById
	 *
	 */
	public RcsBotCarrier findRcsBotCarrierById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayName
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayName(String displayName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayName
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayName(String displayName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByPrimaryKey
	 *
	 */
	public RcsBotCarrier findRcsBotCarrierByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByPrimaryKey
	 *
	 */
	public RcsBotCarrier findRcsBotCarrierByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByRcsCountryId
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByRcsCountryId(Integer rcsCountryId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByRcsCountryId
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByRcsCountryId(Integer rcsCountryId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByCreateDate
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByCreateDate
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCarriers
	 *
	 */
	public Set<RcsBotCarrier> findAllRcsBotCarriers() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCarriers
	 *
	 */
	public Set<RcsBotCarrier> findAllRcsBotCarriers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByNameContaining
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByNameContaining
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDescription
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByDescription
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByName
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierByName
	 *
	 */
	public Set<RcsBotCarrier> findRcsBotCarrierByName(String name_1, int startResult, int maxRows) throws DataAccessException;

}