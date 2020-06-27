
package com.kirusa.dao;

import com.kirusa.domain.RcsBotCategoryDesc;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotCategoryDesc entities.
 * 
 */
public interface RcsBotCategoryDescDAO extends JpaDao<RcsBotCategoryDesc> {

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayName
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayName(String displayName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayName
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayName(String displayName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescById
	 *
	 */
	public RcsBotCategoryDesc findRcsBotCategoryDescById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescById
	 *
	 */
	public RcsBotCategoryDesc findRcsBotCategoryDescById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByCreateDate
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByCreateDate
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByPrimaryKey
	 *
	 */
	public RcsBotCategoryDesc findRcsBotCategoryDescByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByPrimaryKey
	 *
	 */
	public RcsBotCategoryDesc findRcsBotCategoryDescByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescription
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescription
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByLastUpdate
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByLastUpdate
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByLang
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLang(String lang) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByLang
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLang(String lang, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByLangContaining
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLangContaining(String lang_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByLangContaining
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLangContaining(String lang_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayNameContaining
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayNameContaining(String displayName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayNameContaining
	 *
	 */
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayNameContaining(String displayName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCategoryDescs
	 *
	 */
	public Set<RcsBotCategoryDesc> findAllRcsBotCategoryDescs() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCategoryDescs
	 *
	 */
	public Set<RcsBotCategoryDesc> findAllRcsBotCategoryDescs(int startResult, int maxRows) throws DataAccessException;
	
	public List<RcsBotCategoryDesc> findRcsBotCategoryDescByLangAndById(int id,String lang,int startResult, int maxRows) throws DataAccessException;
	
	

}