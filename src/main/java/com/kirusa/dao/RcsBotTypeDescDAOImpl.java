
package com.kirusa.dao;

import com.kirusa.domain.RcsBotTypeDesc;

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

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RcsBotTypeDesc entities.
 * 
 */
@Repository("RcsBotTypeDescDAO")

@Transactional
public class RcsBotTypeDescDAOImpl extends AbstractJpaDao<RcsBotTypeDesc> implements RcsBotTypeDescDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotTypeDesc.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Instantiates a new RcsBotTypeDescDAOImpl
	 *
	 */
	public RcsBotTypeDescDAOImpl() {
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
	 * JPQL Query - findRcsBotTypeDescByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotTypeDesc findRcsBotTypeDescByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotTypeDescByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotTypeDesc findRcsBotTypeDescByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotTypeDescByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotTypeDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayNameContaining(String displayName) throws DataAccessException {

		return findRcsBotTypeDescByDisplayNameContaining(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayNameContaining(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByDisplayNameContaining", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByNameContaining(String name) throws DataAccessException {

		return findRcsBotTypeDescByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescription(String description) throws DataAccessException {

		return findRcsBotTypeDescByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayName
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayName(String displayName) throws DataAccessException {

		return findRcsBotTypeDescByDisplayName(displayName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDisplayName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDisplayName(String displayName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByDisplayName", startResult, maxRows, displayName);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByName
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByName(String name) throws DataAccessException {

		return findRcsBotTypeDescByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByName", startResult, maxRows, name);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotTypeDescs
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findAllRcsBotTypeDescs() throws DataAccessException {

		return findAllRcsBotTypeDescs(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotTypeDescs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findAllRcsBotTypeDescs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotTypeDescs", startResult, maxRows);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotTypeDescByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByLang
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLang(String lang) throws DataAccessException {

		return findRcsBotTypeDescByLang(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByLang
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLang(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByLang", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByLangContaining
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLangContaining(String lang) throws DataAccessException {

		return findRcsBotTypeDescByLangContaining(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByLangContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByLangContaining", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotTypeDescByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotTypeDescByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeDescByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotTypeDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeDescById
	 *
	 */
	@Transactional
	public RcsBotTypeDesc findRcsBotTypeDescById(Integer id) throws DataAccessException {

		return findRcsBotTypeDescById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeDescById
	 *
	 */

	@Transactional
	public RcsBotTypeDesc findRcsBotTypeDescById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotTypeDescById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotTypeDesc) query.getSingleResult();
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
	public boolean canBeMerged(RcsBotTypeDesc entity) {
		return true;
	}
	public List<RcsBotTypeDesc> findRcsBotTypeDescByNameAndLang(String name,String lang,int startResult, int maxRows)
	{
		Query query = createNamedQuery("findRcsBotTypeDescByNameAndLang", startResult, maxRows,name,lang);
		return new ArrayList<RcsBotTypeDesc>(query.getResultList());
	}
}
