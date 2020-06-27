
package com.kirusa.dao;

import com.kirusa.domain.RcsBotAvailable;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotAvailable entities.
 * 
 */
public interface RcsBotAvailableDAO extends JpaDao<RcsBotAvailable> {

	/**
	 * JPQL Query - findRcsBotAvailableByPrimaryKey
	 *
	 */
	public RcsBotAvailable findRcsBotAvailableByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableByPrimaryKey
	 *
	 */
	public RcsBotAvailable findRcsBotAvailableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableByCreateDate
	 *
	 */
	public Set<RcsBotAvailable> findRcsBotAvailableByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableByCreateDate
	 *
	 */
	public Set<RcsBotAvailable> findRcsBotAvailableByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableByLastUpdate
	 *
	 */
	public Set<RcsBotAvailable> findRcsBotAvailableByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableByLastUpdate
	 *
	 */
	public Set<RcsBotAvailable> findRcsBotAvailableByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotAvailables
	 *
	 */
	public Set<RcsBotAvailable> findAllRcsBotAvailables() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotAvailables
	 *
	 */
	public Set<RcsBotAvailable> findAllRcsBotAvailables(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableById
	 *
	 */
	public RcsBotAvailable findRcsBotAvailableById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotAvailableById
	 *
	 */
	public RcsBotAvailable findRcsBotAvailableById(Integer id_1, int startResult, int maxRows) throws DataAccessException;
	
	public void deletebyRcsBotId(Integer Id);
	
	
	/**
	 * JPQL Query - findRcsBotAvailableByRcsBotId
	 *
	 */
	public RcsBotAvailable findRcsBotAvailableByRcsBotId(Integer rcs_bot_id) throws DataAccessException;
	
	public List<Integer>  findRcsBotAvailableByRcsBotCountryId(Integer countryId) throws DataAccessException;


}