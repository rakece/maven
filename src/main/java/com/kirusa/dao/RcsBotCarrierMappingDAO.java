
package com.kirusa.dao;

import com.kirusa.domain.RcsBotCarrier;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.dto.RcsBotCarrierMappingDTO;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotCarrierMapping entities.
 * 
 */
public interface RcsBotCarrierMappingDAO extends JpaDao<RcsBotCarrierMapping> {

	/**
	 * JPQL Query - findRcsBotCarrierMappingById
	 *
	 */
	public RcsBotCarrierMapping findRcsBotCarrierMappingById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingById
	 *
	 */
	public RcsBotCarrierMapping findRcsBotCarrierMappingById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByPrimaryKey
	 *
	 */
	public RcsBotCarrierMapping findRcsBotCarrierMappingByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByPrimaryKey
	 *
	 */
	public RcsBotCarrierMapping findRcsBotCarrierMappingByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotCarrierId
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotCarrierId(Integer rcsBotCarrierId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotCarrierId
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotCarrierId(Integer rcsBotCarrierId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotId
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotId(Integer rcsBotId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotId
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCarrierMappings
	 *
	 */
	public Set<RcsBotCarrierMapping> findAllRcsBotCarrierMappings() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCarrierMappings
	 *
	 */
	public Set<RcsBotCarrierMapping> findAllRcsBotCarrierMappings(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByCreateDate
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByCreateDate
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByLastUpdate
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCarrierMappingByLastUpdate
	 *
	 */
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);
	public List<RcsBotCarrier> findRcsBotCarrierByBotId(Integer rcs_bot_id, int startResult, int maxRows);
	public List<RcsBotCarrierMappingDTO> findAllRcsBotCarrierMappingByRcsBot();
	

}