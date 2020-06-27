
package com.kirusa.dao;

import com.kirusa.domain.RcsBotImage;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotImage entities.
 * 
 */
public interface RcsBotImageDAO extends JpaDao<RcsBotImage> {

	/**
	 * JPQL Query - findRcsBotImageByStatusContaining
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByStatusContaining(String status) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByStatusContaining
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageById
	 *
	 */
	public RcsBotImage findRcsBotImageById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageById
	 *
	 */
	public RcsBotImage findRcsBotImageById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByImageNameContaining
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByImageNameContaining(String imageName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByImageNameContaining
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByImageNameContaining(String imageName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByLastUpdate
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByLastUpdate
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByCreateDate
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByCreateDate
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByPrimaryKey
	 *
	 */
	public RcsBotImage findRcsBotImageByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByPrimaryKey
	 *
	 */
	public RcsBotImage findRcsBotImageByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByDescriptionContaining
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByDescriptionContaining
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotImages
	 *
	 */
	public Set<RcsBotImage> findAllRcsBotImages() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotImages
	 *
	 */
	public Set<RcsBotImage> findAllRcsBotImages(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByDescription
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByDescription
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByImageName
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByImageName(String imageName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByImageName
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByImageName(String imageName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByStatus
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByStatus(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotImageByStatus
	 *
	 */
	public Set<RcsBotImage> findRcsBotImageByStatus(String status_1, int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);

}