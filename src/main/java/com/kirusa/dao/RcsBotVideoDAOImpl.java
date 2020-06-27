
package com.kirusa.dao;

import com.kirusa.domain.RcsBotVideo;

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
 * DAO to manage RcsBotVideo entities.
 * 
 */
@Repository("RcsBotVideoDAO")

@Transactional
public class RcsBotVideoDAOImpl extends AbstractJpaDao<RcsBotVideo> implements RcsBotVideoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotVideo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
//	@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Autowired
    private NamedParameterJdbcTemplate namedjdbcTemplate;
	

	/**
	 * Instantiates a new RcsBotVideoDAOImpl
	 *
	 */
	public RcsBotVideoDAOImpl() {
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
	 * JPQL Query - findRcsBotVideoByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotVideoByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByStatusContaining
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByStatusContaining(String status) throws DataAccessException {

		return findRcsBotVideoByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByDescription(String description) throws DataAccessException {

		return findRcsBotVideoByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotVideos
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findAllRcsBotVideos() throws DataAccessException {

		return findAllRcsBotVideos(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotVideos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findAllRcsBotVideos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotVideos", startResult, maxRows);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotVideo findRcsBotVideoByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotVideoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotVideo findRcsBotVideoByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotVideoByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotVideo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotVideoByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotVideoByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByStatus
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByStatus(String status) throws DataAccessException {

		return findRcsBotVideoByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByStatus", startResult, maxRows, status);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByVideoName
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByVideoName(String videoName) throws DataAccessException {

		return findRcsBotVideoByVideoName(videoName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByVideoName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByVideoName(String videoName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByVideoName", startResult, maxRows, videoName);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotVideoByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoByVideoNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByVideoNameContaining(String videoName) throws DataAccessException {

		return findRcsBotVideoByVideoNameContaining(videoName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoByVideoNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotVideo> findRcsBotVideoByVideoNameContaining(String videoName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotVideoByVideoNameContaining", startResult, maxRows, videoName);
		return new LinkedHashSet<RcsBotVideo>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotVideoById
	 *
	 */
	@Transactional
	public RcsBotVideo findRcsBotVideoById(Integer id) throws DataAccessException {

		return findRcsBotVideoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotVideoById
	 *
	 */

	@Transactional
	public RcsBotVideo findRcsBotVideoById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotVideoById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotVideo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotVideo entity) {
		return true;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_video  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
