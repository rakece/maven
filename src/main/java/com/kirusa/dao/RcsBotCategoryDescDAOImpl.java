
package com.kirusa.dao;

import com.kirusa.domain.RcsBotCategoryDesc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RcsBotCategoryDesc entities.
 * 
 */
@Repository("RcsBotCategoryDescDAO")

@Transactional
public class RcsBotCategoryDescDAOImpl extends AbstractJpaDao<RcsBotCategoryDesc> implements RcsBotCategoryDescDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotCategoryDesc.class }));

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
	 * Instantiates a new RcsBotCategoryDescDAOImpl
	 *
	 */
	public RcsBotCategoryDescDAOImpl() {
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
	 * JPQL Query - findRcsBotCategoryDescByDisplayName
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayName(String displayName) throws DataAccessException {

		return findRcsBotCategoryDescByDisplayName(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayName(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByDisplayName", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescById
	 *
	 */
	@Transactional
	public RcsBotCategoryDesc findRcsBotCategoryDescById(Integer id) throws DataAccessException {

		return findRcsBotCategoryDescById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescById
	 *
	 */

	@Transactional
	public RcsBotCategoryDesc findRcsBotCategoryDescById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCategoryDescById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCategoryDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotCategoryDescByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotCategoryDesc findRcsBotCategoryDescByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotCategoryDescByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotCategoryDesc findRcsBotCategoryDescByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCategoryDescByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCategoryDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescription(String description) throws DataAccessException {

		return findRcsBotCategoryDescByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotCategoryDescByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByLang
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLang(String lang) throws DataAccessException {

		return findRcsBotCategoryDescByLang(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByLang
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLang(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByLang", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByLangContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLangContaining(String lang) throws DataAccessException {

		return findRcsBotCategoryDescByLangContaining(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByLangContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByLangContaining", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotCategoryDescByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayNameContaining(String displayName) throws DataAccessException {

		return findRcsBotCategoryDescByDisplayNameContaining(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryDescByDisplayNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findRcsBotCategoryDescByDisplayNameContaining(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryDescByDisplayNameContaining", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotCategoryDescs
	 *
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> findAllRcsBotCategoryDescs() throws DataAccessException {

		return findAllRcsBotCategoryDescs(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotCategoryDescs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategoryDesc> findAllRcsBotCategoryDescs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotCategoryDescs", startResult, maxRows);
		return new LinkedHashSet<RcsBotCategoryDesc>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotCategoryDesc entity) {
		return true;
	}
	public List<RcsBotCategoryDesc> findRcsBotCategoryDescByLangAndById(int id,String lang,int startResult, int maxRows)
	{
		Query query = createNamedQuery("findRcsBotCategoryDescByLangAndByCategotyId", startResult, maxRows,id,lang);
		return new ArrayList<RcsBotCategoryDesc>(query.getResultList());
	}
	

}
