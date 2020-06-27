
package com.kirusa.dao;


import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.response.BotDescription;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotUpdateDesc entities.
 * 
 */
public interface RcsBotUpdateDescDAO extends JpaDao<RcsBotUpdateDesc> {

	/**
	 * JPQL Query - findRcsBotUpdateDescById
	 *
	 */
	public RcsBotUpdateDesc findRcsBotUpdateDescById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescById
	 *
	 */
	public RcsBotUpdateDesc findRcsBotUpdateDescById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByPrimaryKey
	 *
	 */
	public RcsBotUpdateDesc findRcsBotUpdateDescByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByPrimaryKey
	 *
	 */
	public RcsBotUpdateDesc findRcsBotUpdateDescByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByLang
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLang(String lang) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByLang
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLang(String lang, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotUpdateDescs
	 *
	 */
	public Set<RcsBotUpdateDesc> findAllRcsBotUpdateDescs() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotUpdateDescs
	 *
	 */
	public Set<RcsBotUpdateDesc> findAllRcsBotUpdateDescs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByCreateDate
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByCreateDate
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescription
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescription
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByLastUpdate
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByLastUpdate
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByLangContaining
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLangContaining(String lang_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUpdateDescByLangContaining
	 *
	 */
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLangContaining(String lang_1, int startResult, int maxRows) throws DataAccessException;
	
	/**
	 * JPQL Query - findRcsBotUpdateByRcsBotId
	 *
	 */
	public BotDescription findMostRecentUpdateByRcsBotId(Integer botId, String lang) throws DataAccessException;
	
	public void deletebyRcsBotId(Integer botId);

}