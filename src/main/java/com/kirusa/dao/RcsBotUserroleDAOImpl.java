
package com.kirusa.dao;

import com.kirusa.domain.RcsBotUserrole;

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
 * DAO to manage RcsBotUserrole entities.
 * 
 */
@Repository("RcsBotUserroleDAO")

@Transactional
public class RcsBotUserroleDAOImpl extends AbstractJpaDao<RcsBotUserrole> implements RcsBotUserroleDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotUserrole.class }));

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
	 * Instantiates a new RcsBotUserroleDAOImpl
	 *
	 */
	public RcsBotUserroleDAOImpl() {
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
	 * JPQL Query - findRcsBotUserroleByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotUserrole findRcsBotUserroleByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotUserroleByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotUserrole findRcsBotUserroleByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotUserroleByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotUserrole) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleTypeContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleTypeContaining(String userRoleType) throws DataAccessException {

		return findRcsBotUserroleByUserRoleTypeContaining(userRoleType, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleTypeContaining(String userRoleType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByUserRoleTypeContaining", startResult, maxRows, userRoleType);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotUserroles
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findAllRcsBotUserroles() throws DataAccessException {

		return findAllRcsBotUserroles(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotUserroles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findAllRcsBotUserroles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotUserroles", startResult, maxRows);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescription
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescription(String roleDescription) throws DataAccessException {

		return findRcsBotUserroleByRoleDescription(roleDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescription(String roleDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByRoleDescription", startResult, maxRows, roleDescription);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotUserroleByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescriptionContaining(String roleDescription) throws DataAccessException {

		return findRcsBotUserroleByRoleDescriptionContaining(roleDescription, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByRoleDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByRoleDescriptionContaining(String roleDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByRoleDescriptionContaining", startResult, maxRows, roleDescription);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotUserroleByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleById
	 *
	 */
	@Transactional
	public RcsBotUserrole findRcsBotUserroleById(Integer id) throws DataAccessException {

		return findRcsBotUserroleById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleById
	 *
	 */

	@Transactional
	public RcsBotUserrole findRcsBotUserroleById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotUserroleById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotUserrole) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleType
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleType(String userRoleType) throws DataAccessException {

		return findRcsBotUserroleByUserRoleType(userRoleType, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByUserRoleType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByUserRoleType(String userRoleType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByUserRoleType", startResult, maxRows, userRoleType);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleByValidTo
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByValidTo(java.util.Calendar validTo) throws DataAccessException {

		return findRcsBotUserroleByValidTo(validTo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByValidTo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByValidTo(java.util.Calendar validTo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByValidTo", startResult, maxRows, validTo);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserroleByValidFrom
	 *
	 */
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByValidFrom(java.util.Calendar validFrom) throws DataAccessException {

		return findRcsBotUserroleByValidFrom(validFrom, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserroleByValidFrom
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUserrole> findRcsBotUserroleByValidFrom(java.util.Calendar validFrom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserroleByValidFrom", startResult, maxRows, validFrom);
		return new LinkedHashSet<RcsBotUserrole>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotUserrole entity) {
		return true;
	}
}
