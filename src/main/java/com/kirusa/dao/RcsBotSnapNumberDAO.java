
package com.kirusa.dao;

import com.kirusa.domain.RcsBotSnapNumber;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotSnapNumber entities.
 * 
 */
public interface RcsBotSnapNumberDAO extends JpaDao<RcsBotSnapNumber> {

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDescContaining
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDescContaining(String snapNumberDesc) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDescContaining
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDescContaining(String snapNumberDesc, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByRcsBotId
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByRcsBotId(Integer rcsBotId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByRcsBotId
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIso
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIso(String snapCountryIso) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIso
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIso(String snapCountryIso, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByLastUpdate
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByLastUpdate
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIsoContaining
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIsoContaining(String snapCountryIso_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIsoContaining
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIsoContaining(String snapCountryIso_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotSnapNumbers
	 *
	 */
	public Set<RcsBotSnapNumber> findAllRcsBotSnapNumbers() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotSnapNumbers
	 *
	 */
	public Set<RcsBotSnapNumber> findAllRcsBotSnapNumbers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByPrimaryKey
	 *
	 */
	public RcsBotSnapNumber findRcsBotSnapNumberByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByPrimaryKey
	 *
	 */
	public RcsBotSnapNumber findRcsBotSnapNumberByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByCreateDate
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberByCreateDate
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumberContaining
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumberContaining(String snapCallNumber) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumberContaining
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumberContaining(String snapCallNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDesc
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDesc(String snapNumberDesc_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDesc
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDesc(String snapNumberDesc_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberById
	 *
	 */
	public RcsBotSnapNumber findRcsBotSnapNumberById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberById
	 *
	 */
	public RcsBotSnapNumber findRcsBotSnapNumberById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumber
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumber(String snapCallNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumber
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumber(String snapCallNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryCode
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryCode(Integer snapCountryCode) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryCode
	 *
	 */
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryCode(Integer snapCountryCode, int startResult, int maxRows) throws DataAccessException;

}