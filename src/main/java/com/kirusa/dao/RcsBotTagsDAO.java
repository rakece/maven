
package com.kirusa.dao;

import com.kirusa.domain.RcsBotTags;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotTags entities.
 * 
 */
public interface RcsBotTagsDAO extends JpaDao<RcsBotTags> {

	/**
	 * JPQL Query - findRcsBotTagsById
	 *
	 */
	public RcsBotTags findRcsBotTagsById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsById
	 *
	 */
	public RcsBotTags findRcsBotTagsById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsByPrimaryKey
	 *
	 */
	public RcsBotTags findRcsBotTagsByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsByPrimaryKey
	 *
	 */
	public RcsBotTags findRcsBotTagsByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotTagss
	 *
	 */
	public Set<RcsBotTags> findAllRcsBotTagss() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotTagss
	 *
	 */
	public Set<RcsBotTags> findAllRcsBotTagss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsByCreateDate
	 *
	 */
	public Set<RcsBotTags> findRcsBotTagsByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsByCreateDate
	 *
	 */
	public Set<RcsBotTags> findRcsBotTagsByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsByLastUpdate
	 *
	 */
	public Set<RcsBotTags> findRcsBotTagsByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotTagsByLastUpdate
	 *
	 */
	public Set<RcsBotTags> findRcsBotTagsByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);

}