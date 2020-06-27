
package com.kirusa.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kirusa.domain.RcsBot;

/**
 * DAO to manage RcsBot entities.
 * 
 */
@Repository("RcsBotDAO")

@Transactional
public class RcsBotDAOImpl extends AbstractJpaDao<RcsBot> implements RcsBotDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBot.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	//@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
    JdbcTemplate jdbcTemplate;

	/**
	 * Instantiates a new RcsBotDAOImpl
	 *
	 */
	public RcsBotDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findRcsBotByLogoImageNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByLogoImageNameContaining(String logoImageName) throws DataAccessException {

		return findRcsBotByLogoImageNameContaining(logoImageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByLogoImageNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByLogoImageNameContaining(String logoImageName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByLogoImageNameContaining", startResult, maxRows, logoImageName);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByStatus
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByStatus(String status) throws DataAccessException {

		return findRcsBotByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByStatus", startResult, maxRows, status);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrlContaining
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByTermAndConditionUrlContaining(String termAndConditionUrl) throws DataAccessException {

		return findRcsBotByTermAndConditionUrlContaining(termAndConditionUrl, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrlContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByTermAndConditionUrlContaining(String termAndConditionUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByTermAndConditionUrlContaining", startResult, maxRows, termAndConditionUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	* JPQL Query - findRcsBotByRcsBotCategoryId
	*
	*/
	@Transactional
	public Set<RcsBot> findRcsBotByRcsBotCategoryId(Integer rcsBotCategoryId) throws DataAccessException {

		return findRcsBotByRcsBotCategoryId(rcsBotCategoryId, -1, -1);
	}

	/**
	* JPQL Query - findRcsBotByRcsBotCategoryId
	*
	*/

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByRcsBotCategoryId(Integer rcsBotCategoryId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByRcsBotCategoryId", startResult, maxRows, rcsBotCategoryId);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByPlatform
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByPlatform(String platform) throws DataAccessException {

		return findRcsBotByPlatform(platform, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByPlatform
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByPlatform(String platform, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByPlatform", startResult, maxRows, platform);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	* JPQL Query - findRcsBotByOptInUrlContaining
	*
	*/
	@Transactional
	public Set<RcsBot> findRcsBotByOptInUrlContaining(String optInUrl) throws DataAccessException {

		return findRcsBotByOptInUrlContaining(optInUrl, -1, -1);
	}

	/**
	* JPQL Query - findRcsBotByOptInUrlContaining
	*
	*/

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByOptInUrlContaining(String optInUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByOptInUrlContaining", startResult, maxRows, optInUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	* JPQL Query - findRcsBotByOptInUrl
	*
	*/
	@Transactional
	public Set<RcsBot> findRcsBotByOptInUrl(String optInUrl) throws DataAccessException {

		return findRcsBotByOptInUrl(optInUrl, -1, -1);
	}

	/**
	* JPQL Query - findRcsBotByOptInUrl
	*
	*/

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByOptInUrl(String optInUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByOptInUrl", startResult, maxRows, optInUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByPlatformContaining
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByPlatformContaining(String platform) throws DataAccessException {

		return findRcsBotByPlatformContaining(platform, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByPlatformContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByPlatformContaining(String platform, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByPlatformContaining", startResult, maxRows, platform);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBots
	 *
	 */
	@Transactional
	public Set<RcsBot> findAllRcsBots() throws DataAccessException {

		return findAllRcsBots(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBots
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findAllRcsBots(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBots", startResult, maxRows);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByPrivacyUrl
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByPrivacyUrl(String privacyUrl) throws DataAccessException {

		return findRcsBotByPrivacyUrl(privacyUrl, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByPrivacyUrl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByPrivacyUrl(String privacyUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByPrivacyUrl", startResult, maxRows, privacyUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	* JPQL Query - findRcsBotByOptInContaining
	*
	*/
	@Transactional
	public Set<RcsBot> findRcsBotByOptInContaining(String optIn) throws DataAccessException {

		return findRcsBotByOptInContaining(optIn, -1, -1);
	}

	/**
	* JPQL Query - findRcsBotByOptInContaining
	*
	*/

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByOptInContaining(String optIn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByOptInContaining", startResult, maxRows, optIn);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	* JPQL Query - findRcsBotByOptIn
	*
	*/
	@Transactional
	public Set<RcsBot> findRcsBotByOptIn(String optIn) throws DataAccessException {

		return findRcsBotByOptIn(optIn, -1, -1);
	}

	/**
	* JPQL Query - findRcsBotByOptIn
	*
	*/

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByOptIn(String optIn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByOptIn", startResult, maxRows, optIn);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByWebsiteUrl
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByWebsiteUrl(String websiteUrl) throws DataAccessException {

		return findRcsBotByWebsiteUrl(websiteUrl, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByWebsiteUrl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByWebsiteUrl(String websiteUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByWebsiteUrl", startResult, maxRows, websiteUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBot findRcsBotByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBot findRcsBotByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBot) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotById
	 *
	 */
	@Transactional
	public RcsBot findRcsBotById(Integer id) throws DataAccessException {

		return findRcsBotById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotById
	 *
	 */

	@Transactional
	public RcsBot findRcsBotById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBot) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	* JPQL Query - findRcsBotByRcsBotUserId
	*
	*/
	@Transactional
	public Set<RcsBot> findRcsBotByRcsBotUserId(Integer rcsBotUserId) throws DataAccessException {

		return findRcsBotByRcsBotUserId(rcsBotUserId, -1, -1);
	}

	/**
	* JPQL Query - findRcsBotByRcsBotUserId
	*
	*/

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByRcsBotUserId(Integer rcsBotUserId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByRcsBotUserId", startResult, maxRows, rcsBotUserId);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByLogoImageName
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByLogoImageName(String logoImageName) throws DataAccessException {

		return findRcsBotByLogoImageName(logoImageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByLogoImageName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByLogoImageName(String logoImageName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByLogoImageName", startResult, maxRows, logoImageName);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByStatusContaining
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByStatusContaining(String status) throws DataAccessException {

		return findRcsBotByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByWebsiteUrlContaining
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByWebsiteUrlContaining(String websiteUrl) throws DataAccessException {

		return findRcsBotByWebsiteUrlContaining(websiteUrl, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByWebsiteUrlContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByWebsiteUrlContaining(String websiteUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByWebsiteUrlContaining", startResult, maxRows, websiteUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByPrivacyUrlContaining
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByPrivacyUrlContaining(String privacyUrl) throws DataAccessException {

		return findRcsBotByPrivacyUrlContaining(privacyUrl, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByPrivacyUrlContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByPrivacyUrlContaining(String privacyUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByPrivacyUrlContaining", startResult, maxRows, privacyUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrl
	 *
	 */
	@Transactional
	public Set<RcsBot> findRcsBotByTermAndConditionUrl(String termAndConditionUrl) throws DataAccessException {

		return findRcsBotByTermAndConditionUrl(termAndConditionUrl, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotByTermAndConditionUrl
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBot> findRcsBotByTermAndConditionUrl(String termAndConditionUrl, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotByTermAndConditionUrl", startResult, maxRows, termAndConditionUrl);
		return new LinkedHashSet<RcsBot>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBot entity) {
		return true;
	}
}
