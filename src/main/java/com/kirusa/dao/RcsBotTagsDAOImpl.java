
package com.kirusa.dao;

import com.kirusa.domain.RcsBotTags;

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
 * DAO to manage RcsBotTags entities.
 * 
 */
@Repository("RcsBotTagsDAO")

@Transactional
public class RcsBotTagsDAOImpl extends AbstractJpaDao<RcsBotTags> implements RcsBotTagsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotTags.class }));

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
	 * Instantiates a new RcsBotTagsDAOImpl
	 *
	 */
	public RcsBotTagsDAOImpl() {
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
	 * JPQL Query - findRcsBotTagsById
	 *
	 */
	@Transactional
	public RcsBotTags findRcsBotTagsById(Integer id) throws DataAccessException {

		return findRcsBotTagsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTagsById
	 *
	 */

	@Transactional
	public RcsBotTags findRcsBotTagsById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotTagsById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotTags) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotTagsByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotTags findRcsBotTagsByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotTagsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTagsByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotTags findRcsBotTagsByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotTagsByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotTags) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllRcsBotTagss
	 *
	 */
	@Transactional
	public Set<RcsBotTags> findAllRcsBotTagss() throws DataAccessException {

		return findAllRcsBotTagss(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotTagss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTags> findAllRcsBotTagss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotTagss", startResult, maxRows);
		return new LinkedHashSet<RcsBotTags>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTagsByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotTags> findRcsBotTagsByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotTagsByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTagsByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTags> findRcsBotTagsByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTagsByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotTags>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTagsByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotTags> findRcsBotTagsByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotTagsByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTagsByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTags> findRcsBotTagsByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTagsByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotTags>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotTags entity) {
		return true;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_tags  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
