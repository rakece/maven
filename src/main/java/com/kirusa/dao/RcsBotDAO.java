
package com.kirusa.dao;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;
import org.springframework.dao.DataAccessException;

import com.kirusa.domain.RcsBot;

/**
 * DAO to manage RcsBot entities.
 * 
 */
public interface RcsBotDAO extends JpaDao<RcsBot> {

	/**
	 * JPQL Query - findRcsBotByLogoImageNameContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByLogoImageNameContaining(String logoImageName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByLogoImageNameContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByLogoImageNameContaining(String logoImageName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByStatus
	 *
	 */
	public Set<RcsBot> findRcsBotByStatus(String status) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByStatus
	 *
	 */
	public Set<RcsBot> findRcsBotByStatus(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrlContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByTermAndConditionUrlContaining(String termAndConditionUrl) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrlContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByTermAndConditionUrlContaining(String termAndConditionUrl, int startResult, int maxRows) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByRcsBotCategoryId
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByRcsBotCategoryId(Integer rcsBotCategoryId) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByRcsBotCategoryId
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByRcsBotCategoryId(Integer rcsBotCategoryId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPlatform
	 *
	 */
	public Set<RcsBot> findRcsBotByPlatform(String platform) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPlatform
	 *
	 */
	public Set<RcsBot> findRcsBotByPlatform(String platform, int startResult, int maxRows) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptInUrlContaining
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptInUrlContaining(String optInUrl) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptInUrlContaining
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptInUrlContaining(String optInUrl, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByCreateDate
	 *
	 */
	public Set<RcsBot> findRcsBotByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByCreateDate
	 *
	 */
	public Set<RcsBot> findRcsBotByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByLastUpdate
	 *
	 */
	public Set<RcsBot> findRcsBotByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByLastUpdate
	 *
	 */
	public Set<RcsBot> findRcsBotByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptInUrl
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptInUrl(String optInUrl_1) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptInUrl
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptInUrl(String optInUrl_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPlatformContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByPlatformContaining(String platform_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPlatformContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByPlatformContaining(String platform_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBots
	 *
	 */
	public Set<RcsBot> findAllRcsBots() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBots
	 *
	 */
	public Set<RcsBot> findAllRcsBots(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPrivacyUrl
	 *
	 */
	public Set<RcsBot> findRcsBotByPrivacyUrl(String privacyUrl) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPrivacyUrl
	 *
	 */
	public Set<RcsBot> findRcsBotByPrivacyUrl(String privacyUrl, int startResult, int maxRows) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptInContaining
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptInContaining(String optIn) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptInContaining
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptInContaining(String optIn, int startResult, int maxRows) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptIn
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptIn(String optIn_1) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByOptIn
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByOptIn(String optIn_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByWebsiteUrl
	 *
	 */
	public Set<RcsBot> findRcsBotByWebsiteUrl(String websiteUrl) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByWebsiteUrl
	 *
	 */
	public Set<RcsBot> findRcsBotByWebsiteUrl(String websiteUrl, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPrimaryKey
	 *
	 */
	public RcsBot findRcsBotByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPrimaryKey
	 *
	 */
	public RcsBot findRcsBotByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotById
	 *
	 */
	public RcsBot findRcsBotById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotById
	 *
	 */
	public RcsBot findRcsBotById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByRcsBotUserId
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByRcsBotUserId(Integer rcsBotUserId) throws DataAccessException;

	/**
	       * JPQL Query - findRcsBotByRcsBotUserId
	       *
	   	 	 */
	public Set<RcsBot> findRcsBotByRcsBotUserId(Integer rcsBotUserId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByLogoImageName
	 *
	 */
	public Set<RcsBot> findRcsBotByLogoImageName(String logoImageName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByLogoImageName
	 *
	 */
	public Set<RcsBot> findRcsBotByLogoImageName(String logoImageName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByStatusContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByStatusContaining(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByStatusContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByStatusContaining(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByWebsiteUrlContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByWebsiteUrlContaining(String websiteUrl_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByWebsiteUrlContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByWebsiteUrlContaining(String websiteUrl_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPrivacyUrlContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByPrivacyUrlContaining(String privacyUrl_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByPrivacyUrlContaining
	 *
	 */
	public Set<RcsBot> findRcsBotByPrivacyUrlContaining(String privacyUrl_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrl
	 *
	 */
	public Set<RcsBot> findRcsBotByTermAndConditionUrl(String termAndConditionUrl_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrl
	 *
	 */
	public Set<RcsBot> findRcsBotByTermAndConditionUrl(String termAndConditionUrl_1, int startResult, int maxRows) throws DataAccessException;
	
}