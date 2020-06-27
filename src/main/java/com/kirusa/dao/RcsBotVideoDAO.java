
package com.kirusa.dao;

import com.kirusa.domain.RcsBotVideo;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotVideo entities.
 * 
 */
public interface RcsBotVideoDAO extends JpaDao<RcsBotVideo> {

	/**
	 * JPQL Query - findRcsBotVideoByLastUpdate
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByLastUpdate
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByStatusContaining
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByStatusContaining(String status) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByStatusContaining
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByDescription
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByDescription
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotVideos
	 *
	 */
	public Set<RcsBotVideo> findAllRcsBotVideos() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotVideos
	 *
	 */
	public Set<RcsBotVideo> findAllRcsBotVideos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByPrimaryKey
	 *
	 */
	public RcsBotVideo findRcsBotVideoByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByPrimaryKey
	 *
	 */
	public RcsBotVideo findRcsBotVideoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByCreateDate
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByCreateDate
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByStatus
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByStatus(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByStatus
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByStatus(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByVideoName
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByVideoName(String videoName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByVideoName
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByVideoName(String videoName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByDescriptionContaining
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByDescriptionContaining
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByVideoNameContaining
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByVideoNameContaining(String videoName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoByVideoNameContaining
	 *
	 */
	public Set<RcsBotVideo> findRcsBotVideoByVideoNameContaining(String videoName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoById
	 *
	 */
	public RcsBotVideo findRcsBotVideoById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotVideoById
	 *
	 */
	public RcsBotVideo findRcsBotVideoById(Integer id_1, int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);

}