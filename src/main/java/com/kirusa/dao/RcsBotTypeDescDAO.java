
package com.kirusa.dao;

import com.kirusa.domain.RcsBotTypeDesc;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotTypeDesc entities.
 * 
 */
public interface RcsBotTypeDescDAO extends JpaDao<RcsBotTypeDesc> {

	/**
	 * JPQL Query - findRcsBotTypeDescByPrimaryKey
	 *
	 */
	public RcsBotTypeDesc findRcsBotTypeDescByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByPrimaryKey
	 *
	 */
	public RcsBotTypeDesc findRcsBotTypeDescByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayNameContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayNameContaining(String displayName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayNameContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayNameContaining(String displayName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByNameContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByNameContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDescription
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDescription
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayName
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayName(String displayName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayName
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayName(String displayName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByName
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByName
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotTypeDescs
	 *
	 */
	public Set<RcsBotTypeDesc> findAllRcsBotTypeDescs() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotTypeDescs
	 *
	 */
	public Set<RcsBotTypeDesc> findAllRcsBotTypeDescs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByCreateDate
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByCreateDate
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByLang
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLang(String lang) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByLang
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLang(String lang, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByLangContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLangContaining(String lang_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByLangContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLangContaining(String lang_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByLastUpdate
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescByLastUpdate
	 *
	 */
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescById
	 *
	 */
	public RcsBotTypeDesc findRcsBotTypeDescById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTypeDescById
	 *
	 */
	public RcsBotTypeDesc findRcsBotTypeDescById(Integer id_1, int startResult, int maxRows) throws DataAccessException;
	public List<RcsBotTypeDesc> findRcsBotTypeDescByNameAndLang(String name,String lang,int startResult, int maxRows) throws DataAccessException;
	
	
	
}