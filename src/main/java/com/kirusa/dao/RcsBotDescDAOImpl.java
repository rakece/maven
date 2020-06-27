
package com.kirusa.dao;

import com.kirusa.domain.RcsBotDesc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RcsBotDesc entities.
 * 
 */
@Repository("RcsBotDescDAO")

@Transactional
public class RcsBotDescDAOImpl extends AbstractJpaDao<RcsBotDesc> implements RcsBotDescDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotDesc.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	//@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Autowired
    private NamedParameterJdbcTemplate namedjdbcTemplate;
	

	/**
	 * Instantiates a new RcsBotDescDAOImpl
	 *
	 */
	public RcsBotDescDAOImpl() {
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
	 * JPQL Query - findRcsBotDescByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotDescByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByBotNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotNameContaining(String botName) throws DataAccessException {

		return findRcsBotDescByBotNameContaining(botName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByBotNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotNameContaining(String botName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByBotNameContaining", startResult, maxRows, botName);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByLang
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByLang(String lang) throws DataAccessException {

		return findRcsBotDescByLang(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByLang
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByLang(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByLang", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByLangContaining
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByLangContaining(String lang) throws DataAccessException {

		return findRcsBotDescByLangContaining(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByLangContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByLangContaining", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByBotSummaryContaining
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotSummaryContaining(String botSummary) throws DataAccessException {

		return findRcsBotDescByBotSummaryContaining(botSummary, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByBotSummaryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotSummaryContaining(String botSummary, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByBotSummaryContaining", startResult, maxRows, botSummary);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotDescs
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findAllRcsBotDescs() throws DataAccessException {

		return findAllRcsBotDescs(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotDescs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findAllRcsBotDescs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotDescs", startResult, maxRows);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByBotSummary
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotSummary(String botSummary) throws DataAccessException {

		return findRcsBotDescByBotSummary(botSummary, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByBotSummary
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotSummary(String botSummary, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByBotSummary", startResult, maxRows, botSummary);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotDescByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescById
	 *
	 */
	@Transactional
	public RcsBotDesc findRcsBotDescById(Integer id) throws DataAccessException {

		return findRcsBotDescById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescById
	 *
	 */

	@Transactional
	public RcsBotDesc findRcsBotDescById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotDescById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotDescByBotName
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotName(String botName) throws DataAccessException {

		return findRcsBotDescByBotName(botName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByBotName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByBotName(String botName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByBotName", startResult, maxRows, botName);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotDesc findRcsBotDescByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotDescByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotDesc findRcsBotDescByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotDescByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotDescByDisplayName
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDisplayName(String displayName) throws DataAccessException {

		return findRcsBotDescByDisplayName(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByDisplayName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDisplayName(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByDisplayName", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDescription(String description) throws DataAccessException {

		return findRcsBotDescByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotDescByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotDescByDisplayNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDisplayNameContaining(String displayName) throws DataAccessException {

		return findRcsBotDescByDisplayNameContaining(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotDescByDisplayNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotDesc> findRcsBotDescByDisplayNameContaining(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotDescByDisplayNameContaining", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotDesc entity) {
		return true;
	}
	public Set<RcsBotDesc> findRcsBotDescByLangAndSummary(String locale, String key,int startResult, int maxRows)
	{
		Query query = createNamedQuery("findRcsBotDescByLangAndSummary", startResult, maxRows, locale,key);
		return new LinkedHashSet<RcsBotDesc>(query.getResultList());
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_desc  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
