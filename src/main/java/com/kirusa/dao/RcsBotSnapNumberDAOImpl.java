
package com.kirusa.dao;

import com.kirusa.domain.RcsBotSnapNumber;

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
 * DAO to manage RcsBotSnapNumber entities.
 * 
 */
@Repository("RcsBotSnapNumberDAO")

@Transactional
public class RcsBotSnapNumberDAOImpl extends AbstractJpaDao<RcsBotSnapNumber> implements RcsBotSnapNumberDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotSnapNumber.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	//@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext	
	private EntityManager entityManager;

	/**
	 * Instantiates a new RcsBotSnapNumberDAOImpl
	 *
	 */
	public RcsBotSnapNumberDAOImpl() {
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
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDescContaining
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDescContaining(String snapNumberDesc) throws DataAccessException {

		return findRcsBotSnapNumberBySnapNumberDescContaining(snapNumberDesc, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDescContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDescContaining(String snapNumberDesc, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapNumberDescContaining", startResult, maxRows, snapNumberDesc);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByRcsBotId
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByRcsBotId(Integer rcsBotId) throws DataAccessException {

		return findRcsBotSnapNumberByRcsBotId(rcsBotId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByRcsBotId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberByRcsBotId", startResult, maxRows, rcsBotId);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIso
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIso(String snapCountryIso) throws DataAccessException {

		return findRcsBotSnapNumberBySnapCountryIso(snapCountryIso, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIso
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIso(String snapCountryIso, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapCountryIso", startResult, maxRows, snapCountryIso);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotSnapNumberByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIsoContaining
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIsoContaining(String snapCountryIso) throws DataAccessException {

		return findRcsBotSnapNumberBySnapCountryIsoContaining(snapCountryIso, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryIsoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryIsoContaining(String snapCountryIso, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapCountryIsoContaining", startResult, maxRows, snapCountryIso);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotSnapNumbers
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findAllRcsBotSnapNumbers() throws DataAccessException {

		return findAllRcsBotSnapNumbers(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotSnapNumbers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findAllRcsBotSnapNumbers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotSnapNumbers", startResult, maxRows);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotSnapNumber findRcsBotSnapNumberByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotSnapNumberByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotSnapNumber findRcsBotSnapNumberByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotSnapNumberByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotSnapNumber) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotSnapNumberByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumberContaining
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumberContaining(String snapCallNumber) throws DataAccessException {

		return findRcsBotSnapNumberBySnapCallNumberContaining(snapCallNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumberContaining(String snapCallNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapCallNumberContaining", startResult, maxRows, snapCallNumber);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDesc
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDesc(String snapNumberDesc) throws DataAccessException {

		return findRcsBotSnapNumberBySnapNumberDesc(snapNumberDesc, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapNumberDesc
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapNumberDesc(String snapNumberDesc, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapNumberDesc", startResult, maxRows, snapNumberDesc);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberById
	 *
	 */
	@Transactional
	public RcsBotSnapNumber findRcsBotSnapNumberById(Integer id) throws DataAccessException {

		return findRcsBotSnapNumberById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberById
	 *
	 */

	@Transactional
	public RcsBotSnapNumber findRcsBotSnapNumberById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotSnapNumberById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotSnapNumber) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumber
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumber(String snapCallNumber) throws DataAccessException {

		return findRcsBotSnapNumberBySnapCallNumber(snapCallNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCallNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCallNumber(String snapCallNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapCallNumber", startResult, maxRows, snapCallNumber);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryCode
	 *
	 */
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryCode(Integer snapCountryCode) throws DataAccessException {

		return findRcsBotSnapNumberBySnapCountryCode(snapCountryCode, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotSnapNumberBySnapCountryCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberBySnapCountryCode(Integer snapCountryCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotSnapNumberBySnapCountryCode", startResult, maxRows, snapCountryCode);
		return new LinkedHashSet<RcsBotSnapNumber>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotSnapNumber entity) {
		return true;
	}
}
