
package com.kirusa.dao;

import com.kirusa.domain.RcsCountryList;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsCountryList entities.
 * 
 */
public interface RcsCountryListDAO extends JpaDao<RcsCountryList> {

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoName
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryIsoName(String countryIsoName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoName
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryIsoName(String countryIsoName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListById
	 *
	 */
	public RcsCountryList findRcsCountryListById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListById
	 *
	 */
	public RcsCountryList findRcsCountryListById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByLastUpdate
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByLastUpdate
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByPrimaryKey
	 *
	 */
	public RcsCountryList findRcsCountryListByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByPrimaryKey
	 *
	 */
	public RcsCountryList findRcsCountryListByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoNameContaining
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryIsoNameContaining(String countryIsoName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoNameContaining
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryIsoNameContaining(String countryIsoName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryNameContaining
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryNameContaining(String countryName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryNameContaining
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryNameContaining(String countryName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryName
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryName(String countryName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCountryName
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCountryName(String countryName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsCountryLists
	 *
	 */
	public Set<RcsCountryList> findAllRcsCountryLists() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsCountryLists
	 *
	 */
	public Set<RcsCountryList> findAllRcsCountryLists(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCreateDate
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsCountryListByCreateDate
	 *
	 */
	public Set<RcsCountryList> findRcsCountryListByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

}