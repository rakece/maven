
package com.kirusa.dao;

import com.kirusa.domain.RcsCountryList;

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
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RcsCountryList entities.
 * 
 */
@Repository("RcsCountryListDAO")

@Transactional
public class RcsCountryListDAOImpl extends AbstractJpaDao<RcsCountryList> implements RcsCountryListDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsCountryList.class }));

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
	 * Instantiates a new RcsCountryListDAOImpl
	 *
	 */
	public RcsCountryListDAOImpl() {
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
	 * JPQL Query - findRcsCountryListByCountryIsoName
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryIsoName(String countryIsoName) throws DataAccessException {

		return findRcsCountryListByCountryIsoName(countryIsoName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryIsoName(String countryIsoName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsCountryListByCountryIsoName", startResult, maxRows, countryIsoName);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsCountryListById
	 *
	 */
	@Transactional
	public RcsCountryList findRcsCountryListById(Integer id) throws DataAccessException {

		return findRcsCountryListById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListById
	 *
	 */

	@Transactional
	public RcsCountryList findRcsCountryListById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsCountryListById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsCountryList) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsCountryListByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsCountryListByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsCountryListByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsCountryListByPrimaryKey
	 *
	 */
	@Transactional
	public RcsCountryList findRcsCountryListByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsCountryListByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByPrimaryKey
	 *
	 */

	@Transactional
	public RcsCountryList findRcsCountryListByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsCountryListByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsCountryList) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoNameContaining
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryIsoNameContaining(String countryIsoName) throws DataAccessException {

		return findRcsCountryListByCountryIsoNameContaining(countryIsoName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryIsoNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryIsoNameContaining(String countryIsoName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsCountryListByCountryIsoNameContaining", startResult, maxRows, countryIsoName);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryNameContaining
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryNameContaining(String countryName) throws DataAccessException {

		return findRcsCountryListByCountryNameContaining(countryName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryNameContaining(String countryName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsCountryListByCountryNameContaining", startResult, maxRows, countryName);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryName
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryName(String countryName) throws DataAccessException {

		return findRcsCountryListByCountryName(countryName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByCountryName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCountryName(String countryName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsCountryListByCountryName", startResult, maxRows, countryName);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsCountryLists
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findAllRcsCountryLists() throws DataAccessException {

		return findAllRcsCountryLists(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsCountryLists
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findAllRcsCountryLists(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsCountryLists", startResult, maxRows);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsCountryListByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsCountryListByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsCountryListByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsCountryList> findRcsCountryListByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsCountryListByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsCountryList>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsCountryList entity) {
		return true;
	}
}
