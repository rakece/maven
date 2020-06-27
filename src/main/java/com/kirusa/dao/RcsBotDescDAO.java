
package com.kirusa.dao;

import com.kirusa.domain.RcsBotDesc;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotDesc entities.
 * 
 */
public interface RcsBotDescDAO extends JpaDao<RcsBotDesc> {

	/**
	 * JPQL Query - findRcsBotDescByLastUpdate
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByLastUpdate
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotNameContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotNameContaining(String botName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotNameContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotNameContaining(String botName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByLang
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByLang(String lang) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByLang
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByLang(String lang, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByLangContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByLangContaining(String lang_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByLangContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByLangContaining(String lang_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotSummaryContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotSummaryContaining(String botSummary) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotSummaryContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotSummaryContaining(String botSummary, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotDescs
	 *
	 */
	public Set<RcsBotDesc> findAllRcsBotDescs() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotDescs
	 *
	 */
	public Set<RcsBotDesc> findAllRcsBotDescs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotSummary
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotSummary(String botSummary_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotSummary
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotSummary(String botSummary_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByCreateDate
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByCreateDate
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescById
	 *
	 */
	public RcsBotDesc findRcsBotDescById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescById
	 *
	 */
	public RcsBotDesc findRcsBotDescById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotName
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotName(String botName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByBotName
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByBotName(String botName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByPrimaryKey
	 *
	 */
	public RcsBotDesc findRcsBotDescByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByPrimaryKey
	 *
	 */
	public RcsBotDesc findRcsBotDescByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDisplayName
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDisplayName(String displayName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDisplayName
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDisplayName(String displayName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDescription
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDescription
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDescriptionContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDisplayNameContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDisplayNameContaining(String displayName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotDescByDisplayNameContaining
	 *
	 */
	public Set<RcsBotDesc> findRcsBotDescByDisplayNameContaining(String displayName_1, int startResult, int maxRows) throws DataAccessException;
	
	public Set<RcsBotDesc> findRcsBotDescByLangAndSummary(String locale, String key,int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);

}