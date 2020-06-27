
package com.kirusa.dao;

import com.kirusa.domain.RcsBotComment;

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
 * DAO to manage RcsBotComment entities.
 * 
 */
@Repository("RcsBotCommentDAO")

@Transactional
public class RcsBotCommentDAOImpl extends AbstractJpaDao<RcsBotComment> implements RcsBotCommentDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotComment.class }));

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
	 * Instantiates a new RcsBotCommentDAOImpl
	 *
	 */
	public RcsBotCommentDAOImpl() {
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
	 * JPQL Query - findRcsBotCommentById
	 *
	 */
	@Transactional
	public RcsBotComment findRcsBotCommentById(Integer id) throws DataAccessException {

		return findRcsBotCommentById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentById
	 *
	 */

	@Transactional
	public RcsBotComment findRcsBotCommentById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCommentById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotComment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCommentByCommenttext
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByCommenttext(String commenttext) throws DataAccessException {

		return findRcsBotCommentByCommenttext(commenttext, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByCommenttext
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByCommenttext(String commenttext, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByCommenttext", startResult, maxRows, commenttext);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotCommentByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByNegativeCount
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByNegativeCount(Integer negativeCount) throws DataAccessException {

		return findRcsBotCommentByNegativeCount(negativeCount, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByNegativeCount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByNegativeCount(Integer negativeCount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByNegativeCount", startResult, maxRows, negativeCount);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByStatus
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByStatus(String status) throws DataAccessException {

		return findRcsBotCommentByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByStatus", startResult, maxRows, status);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByRcsBotUserId
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByRcsBotUserId(Integer rcsBotUserId) throws DataAccessException {

		return findRcsBotCommentByRcsBotUserId(rcsBotUserId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByRcsBotUserId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByRcsBotUserId(Integer rcsBotUserId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByRcsBotUserId", startResult, maxRows, rcsBotUserId);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotCommentByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotComments
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findAllRcsBotComments() throws DataAccessException {

		return findAllRcsBotComments(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotComments
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findAllRcsBotComments(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotComments", startResult, maxRows);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByStatusContaining
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByStatusContaining(String status) throws DataAccessException {

		return findRcsBotCommentByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByLangContaining
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByLangContaining(String lang) throws DataAccessException {

		return findRcsBotCommentByLangContaining(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByLangContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByLangContaining", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotComment findRcsBotCommentByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotCommentByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotComment findRcsBotCommentByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCommentByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotComment) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCommentByRating
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByRating(Integer rating) throws DataAccessException {

		return findRcsBotCommentByRating(rating, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByRating
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByRating(Integer rating, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByRating", startResult, maxRows, rating);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByCommenttextContaining
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByCommenttextContaining(String commenttext) throws DataAccessException {

		return findRcsBotCommentByCommenttextContaining(commenttext, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByCommenttextContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByCommenttextContaining(String commenttext, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByCommenttextContaining", startResult, maxRows, commenttext);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByLang
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByLang(String lang) throws DataAccessException {

		return findRcsBotCommentByLang(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByLang
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByLang(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByLang", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCommentByPositiveCount
	 *
	 */
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByPositiveCount(Integer positiveCount) throws DataAccessException {

		return findRcsBotCommentByPositiveCount(positiveCount, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCommentByPositiveCount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotComment> findRcsBotCommentByPositiveCount(Integer positiveCount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCommentByPositiveCount", startResult, maxRows, positiveCount);
		return new LinkedHashSet<RcsBotComment>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotComment entity) {
		return true;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_comment  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
