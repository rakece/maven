
package com.kirusa.dao;

import com.kirusa.domain.RcsBotCarrier;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RcsBotCarrier entities.
 * 
 */
@Repository("RcsBotCarrierDAO")

@Transactional
public class RcsBotCarrierDAOImpl extends AbstractJpaDao<RcsBotCarrier> implements RcsBotCarrierDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotCarrier.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	//@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext	
	private EntityManager entityManager;

	/**
	 * Instantiates a new RcsBotCarrierDAOImpl
	 *
	 */
	public RcsBotCarrierDAOImpl() {
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
	 * JPQL Query - findRcsBotCarrierByDisplayNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayNameContaining(String displayName) throws DataAccessException {

		return findRcsBotCarrierByDisplayNameContaining(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayNameContaining(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByDisplayNameContaining", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotCarrierByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotCarrierByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierById
	 *
	 */
	@Transactional
	public RcsBotCarrier findRcsBotCarrierById(Integer id) throws DataAccessException {

		return findRcsBotCarrierById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierById
	 *
	 */

	@Transactional
	public RcsBotCarrier findRcsBotCarrierById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCarrierById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCarrier) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayName
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayName(String displayName) throws DataAccessException {

		return findRcsBotCarrierByDisplayName(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDisplayName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDisplayName(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByDisplayName", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotCarrier findRcsBotCarrierByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotCarrierByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotCarrier findRcsBotCarrierByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCarrierByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCarrier) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCarrierByRcsCountryId
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByRcsCountryId(Integer rcsCountryId) throws DataAccessException {

		return findRcsBotCarrierByRcsCountryId(rcsCountryId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByRcsCountryId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByRcsCountryId(Integer rcsCountryId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByRcsCountryId", startResult, maxRows, rcsCountryId);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotCarrierByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotCarriers
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findAllRcsBotCarriers() throws DataAccessException {

		return findAllRcsBotCarriers(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotCarriers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findAllRcsBotCarriers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotCarriers", startResult, maxRows);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByNameContaining(String name) throws DataAccessException {

		return findRcsBotCarrierByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDescription(String description) throws DataAccessException {

		return findRcsBotCarrierByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierByName
	 *
	 */
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByName(String name) throws DataAccessException {

		return findRcsBotCarrierByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrier> findRcsBotCarrierByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierByName", startResult, maxRows, name);
		return new LinkedHashSet<RcsBotCarrier>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotCarrier entity) {
		return true;
	}
}
