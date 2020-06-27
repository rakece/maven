
package com.kirusa.dao;

import com.kirusa.domain.RcsBotImage;

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
 * DAO to manage RcsBotImage entities.
 * 
 */
@Repository("RcsBotImageDAO")

@Transactional
public class RcsBotImageDAOImpl extends AbstractJpaDao<RcsBotImage> implements RcsBotImageDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotImage.class }));

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
	 * Instantiates a new RcsBotImageDAOImpl
	 *
	 */
	public RcsBotImageDAOImpl() {
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
	 * JPQL Query - findRcsBotImageByStatusContaining
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByStatusContaining(String status) throws DataAccessException {

		return findRcsBotImageByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageById
	 *
	 */
	@Transactional
	public RcsBotImage findRcsBotImageById(Integer id) throws DataAccessException {

		return findRcsBotImageById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageById
	 *
	 */

	@Transactional
	public RcsBotImage findRcsBotImageById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotImageById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotImage) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotImageByImageNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByImageNameContaining(String imageName) throws DataAccessException {

		return findRcsBotImageByImageNameContaining(imageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByImageNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByImageNameContaining(String imageName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByImageNameContaining", startResult, maxRows, imageName);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotImageByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotImageByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotImage findRcsBotImageByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotImageByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotImage findRcsBotImageByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotImageByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotImage) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotImageByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotImageByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotImages
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findAllRcsBotImages() throws DataAccessException {

		return findAllRcsBotImages(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotImages
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findAllRcsBotImages(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotImages", startResult, maxRows);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByDescription(String description) throws DataAccessException {

		return findRcsBotImageByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageByImageName
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByImageName(String imageName) throws DataAccessException {

		return findRcsBotImageByImageName(imageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByImageName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByImageName(String imageName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByImageName", startResult, maxRows, imageName);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotImageByStatus
	 *
	 */
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByStatus(String status) throws DataAccessException {

		return findRcsBotImageByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotImageByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotImage> findRcsBotImageByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotImageByStatus", startResult, maxRows, status);
		return new LinkedHashSet<RcsBotImage>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotImage entity) {
		return true;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_image  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
