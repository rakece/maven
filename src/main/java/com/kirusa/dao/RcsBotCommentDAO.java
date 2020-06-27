
package com.kirusa.dao;

import com.kirusa.domain.RcsBotComment;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotComment entities.
 * 
 */
public interface RcsBotCommentDAO extends JpaDao<RcsBotComment> {

	/**
	 * JPQL Query - findRcsBotCommentById
	 *
	 */
	public RcsBotComment findRcsBotCommentById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentById
	 *
	 */
	public RcsBotComment findRcsBotCommentById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByCommenttext
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByCommenttext(String commenttext) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByCommenttext
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByCommenttext(String commenttext, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByCreateDate
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByCreateDate
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByCreateDate(Calendar createDate, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByNegativeCount
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByNegativeCount(Integer negativeCount) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByNegativeCount
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByNegativeCount(Integer negativeCount, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByStatus
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByStatus(String status) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByStatus
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByStatus(String status, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByRcsBotUserId
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByRcsBotUserId(Integer rcsBotUserId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByRcsBotUserId
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByRcsBotUserId(Integer rcsBotUserId, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByLastUpdate
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByLastUpdate
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByLastUpdate(Calendar lastUpdate, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotComments
	 *
	 */
	public Set<RcsBotComment> findAllRcsBotComments() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotComments
	 *
	 */
	public Set<RcsBotComment> findAllRcsBotComments(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByStatusContaining
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByStatusContaining(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByStatusContaining
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByStatusContaining(String status_1, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByLangContaining
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByLangContaining(String lang) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByLangContaining
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByLangContaining(String lang, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByPrimaryKey
	 *
	 */
	public RcsBotComment findRcsBotCommentByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByPrimaryKey
	 *
	 */
	public RcsBotComment findRcsBotCommentByPrimaryKey(Integer id_1, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByRating
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByRating(Integer rating) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByRating
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByRating(Integer rating, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByCommenttextContaining
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByCommenttextContaining(String commenttext_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByCommenttextContaining
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByCommenttextContaining(String commenttext_1, int startResult,
			int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByLang
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByLang(String lang_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByLang
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByLang(String lang_1, int startResult, int maxRows)
			throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByPositiveCount
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByPositiveCount(Integer positiveCount) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCommentByPositiveCount
	 *
	 */
	public Set<RcsBotComment> findRcsBotCommentByPositiveCount(Integer positiveCount, int startResult, int maxRows)
			throws DataAccessException;

	public void deletebyRcsBotId(Integer botId);
}