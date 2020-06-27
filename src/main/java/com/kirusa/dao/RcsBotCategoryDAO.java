
package com.kirusa.dao;

import com.kirusa.domain.RcsBotCategory;
import com.kirusa.response.BotWebContent;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotCategory entities.
 * 
 */
public interface RcsBotCategoryDAO extends JpaDao<RcsBotCategory> {

	/**
	 * JPQL Query - findRcsBotCategoryByLastUpdate
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByLastUpdate
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByCreateDate
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByCreateDate
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByImageName
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByImageName(String imageName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByImageName
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByImageName(String imageName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryNameContaining
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryNameContaining(String categoryName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryNameContaining
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryNameContaining(String categoryName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryById
	 *
	 */
	public RcsBotCategory findRcsBotCategoryById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryById
	 *
	 */
	public RcsBotCategory findRcsBotCategoryById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByImageNameContaining
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByImageNameContaining(String imageName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByImageNameContaining
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByImageNameContaining(String imageName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByPrimaryKey
	 *
	 */
	public RcsBotCategory findRcsBotCategoryByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByPrimaryKey
	 *
	 */
	public RcsBotCategory findRcsBotCategoryByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryName
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryName(String categoryName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryName
	 *
	 */
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryName(String categoryName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCategorys
	 *
	 */
	public Set<RcsBotCategory> findAllRcsBotCategorys() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotCategorys
	 *
	 */
	public Set<RcsBotCategory> findAllRcsBotCategorys(int startResult, int maxRows) throws DataAccessException;
	public List<BotWebContent> findRcsCategory(String lang);

}