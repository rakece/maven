
package com.kirusa.dao;

import com.kirusa.domain.RcsBotPublisher;

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
 * DAO to manage RcsBotPublisher entities.
 * 
 */
@Repository("RcsBotPublisherDAO")

@Transactional
public class RcsBotPublisherDAOImpl extends AbstractJpaDao<RcsBotPublisher> implements RcsBotPublisherDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotPublisher.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	//@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Instantiates a new RcsBotPublisherDAOImpl
	 *
	 */
	public RcsBotPublisherDAOImpl() {
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
	 * JPQL Query - findRcsBotPublisherByCompanyName
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyName(String companyName) throws DataAccessException {

		return findRcsBotPublisherByCompanyName(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyName(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByCompanyName", startResult, maxRows, companyName);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyNameContaining(String companyName) throws DataAccessException {

		return findRcsBotPublisherByCompanyNameContaining(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyNameContaining(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByCompanyNameContaining", startResult, maxRows, companyName);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByLastNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByLastNameContaining(String lastName) throws DataAccessException {

		return findRcsBotPublisherByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotPublisherByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherById
	 *
	 */
	@Transactional
	public RcsBotPublisher findRcsBotPublisherById(Integer id) throws DataAccessException {

		return findRcsBotPublisherById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherById
	 *
	 */

	@Transactional
	public RcsBotPublisher findRcsBotPublisherById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotPublisherById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotPublisher) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumber
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumber(String phoneNumber) throws DataAccessException {

		return findRcsBotPublisherByPhoneNumber(phoneNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumber(String phoneNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByPhoneNumber", startResult, maxRows, phoneNumber);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumberContaining
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumberContaining(String phoneNumber) throws DataAccessException {

		return findRcsBotPublisherByPhoneNumberContaining(phoneNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumberContaining(String phoneNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByPhoneNumberContaining", startResult, maxRows, phoneNumber);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotId
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotId(Integer rcsBotId) throws DataAccessException {

		return findRcsBotPublisherByRcsBotId(rcsBotId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByRcsBotId", startResult, maxRows, rcsBotId);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotPublishers
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findAllRcsBotPublishers() throws DataAccessException {

		return findAllRcsBotPublishers(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotPublishers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findAllRcsBotPublishers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotPublishers", startResult, maxRows);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByEmail
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByEmail(String email) throws DataAccessException {

		return findRcsBotPublisherByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByEmail", startResult, maxRows, email);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstNameContaining(String firstName) throws DataAccessException {

		return findRcsBotPublisherByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotUserId
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotUserId(Integer rcsBotUserId) throws DataAccessException {

		return findRcsBotPublisherByRcsBotUserId(rcsBotUserId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotUserId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotUserId(Integer rcsBotUserId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByRcsBotUserId", startResult, maxRows, rcsBotUserId);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByEmailContaining
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByEmailContaining(String email) throws DataAccessException {

		return findRcsBotPublisherByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotPublisher findRcsBotPublisherByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotPublisherByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotPublisher findRcsBotPublisherByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotPublisherByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotPublisher) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotPublisherByLastName
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByLastName(String lastName) throws DataAccessException {

		return findRcsBotPublisherByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByFirstName
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstName(String firstName) throws DataAccessException {

		return findRcsBotPublisherByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotPublisherByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotPublisherByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotPublisherByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotPublisher> findRcsBotPublisherByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotPublisherByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotPublisher>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotPublisher entity) {
		return true;
	}
}
