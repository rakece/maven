
package com.kirusa.dao;

import com.kirusa.domain.RcsBotBilling;

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
 * DAO to manage RcsBotBilling entities.
 * 
 */
@Repository("RcsBotBillingDAO")

@Transactional
public class RcsBotBillingDAOImpl extends AbstractJpaDao<RcsBotBilling> implements RcsBotBillingDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotBilling.class }));

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
	 * Instantiates a new RcsBotBillingDAOImpl
	 *
	 */
	public RcsBotBillingDAOImpl() {
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
	 * JPQL Query - findRcsBotBillingByState
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByState(String state) throws DataAccessException {

		return findRcsBotBillingByState(state, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByState(String state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByState", startResult, maxRows, state);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByEmailContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByEmailContaining(String email) throws DataAccessException {

		return findRcsBotBillingByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotBillingByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotBilling findRcsBotBillingByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotBillingByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotBilling findRcsBotBillingByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotBillingByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotBilling) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotBillingByEmail
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByEmail(String email) throws DataAccessException {

		return findRcsBotBillingByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByEmail", startResult, maxRows, email);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCountry
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCountry(String country) throws DataAccessException {

		return findRcsBotBillingByCountry(country, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCountry
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCountry(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCountry", startResult, maxRows, country);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNo
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNo(String altContactNo) throws DataAccessException {

		return findRcsBotBillingByAltContactNo(altContactNo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNo(String altContactNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAltContactNo", startResult, maxRows, altContactNo);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotBillingByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAccountType
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAccountType(String accountType) throws DataAccessException {

		return findRcsBotBillingByAccountType(accountType, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAccountType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAccountType(String accountType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAccountType", startResult, maxRows, accountType);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByUserName
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByUserName(String userName) throws DataAccessException {

		return findRcsBotBillingByUserName(userName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByUserName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByUserName(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByUserName", startResult, maxRows, userName);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCountryContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCountryContaining(String country) throws DataAccessException {

		return findRcsBotBillingByCountryContaining(country, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCountryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCountryContaining(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCountryContaining", startResult, maxRows, country);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1(String addressLine1) throws DataAccessException {

		return findRcsBotBillingByAddressLine1(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAddressLine1", startResult, maxRows, addressLine1);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotBillings
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findAllRcsBotBillings() throws DataAccessException {

		return findAllRcsBotBillings(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotBillings
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findAllRcsBotBillings(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotBillings", startResult, maxRows);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByContactNo
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByContactNo(String contactNo) throws DataAccessException {

		return findRcsBotBillingByContactNo(contactNo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByContactNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByContactNo(String contactNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByContactNo", startResult, maxRows, contactNo);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCompanyName
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCompanyName(String companyName) throws DataAccessException {

		return findRcsBotBillingByCompanyName(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCompanyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCompanyName(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCompanyName", startResult, maxRows, companyName);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2(String addressLine2) throws DataAccessException {

		return findRcsBotBillingByAddressLine2(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAddressLine2", startResult, maxRows, addressLine2);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCityContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCityContaining(String city) throws DataAccessException {

		return findRcsBotBillingByCityContaining(city, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCityContaining(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCityContaining", startResult, maxRows, city);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAccountTypeContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAccountTypeContaining(String accountType) throws DataAccessException {

		return findRcsBotBillingByAccountTypeContaining(accountType, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAccountTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAccountTypeContaining(String accountType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAccountTypeContaining", startResult, maxRows, accountType);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCompanyNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCompanyNameContaining(String companyName) throws DataAccessException {

		return findRcsBotBillingByCompanyNameContaining(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCompanyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCompanyNameContaining(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCompanyNameContaining", startResult, maxRows, companyName);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByZip
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByZip(String zip) throws DataAccessException {

		return findRcsBotBillingByZip(zip, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByZip
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByZip(String zip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByZip", startResult, maxRows, zip);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByContactNoContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByContactNoContaining(String contactNo) throws DataAccessException {

		return findRcsBotBillingByContactNoContaining(contactNo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByContactNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByContactNoContaining(String contactNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByContactNoContaining", startResult, maxRows, contactNo);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByCity
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCity(String city) throws DataAccessException {

		return findRcsBotBillingByCity(city, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByCity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByCity(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByCity", startResult, maxRows, city);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByUserNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByUserNameContaining(String userName) throws DataAccessException {

		return findRcsBotBillingByUserNameContaining(userName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByUserNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByUserNameContaining(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByUserNameContaining", startResult, maxRows, userName);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2Containing
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2Containing(String addressLine2) throws DataAccessException {

		return findRcsBotBillingByAddressLine2Containing(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2Containing(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAddressLine2Containing", startResult, maxRows, addressLine2);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNoContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNoContaining(String altContactNo) throws DataAccessException {

		return findRcsBotBillingByAltContactNoContaining(altContactNo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNoContaining(String altContactNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAltContactNoContaining", startResult, maxRows, altContactNo);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByStateContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByStateContaining(String state) throws DataAccessException {

		return findRcsBotBillingByStateContaining(state, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByStateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByStateContaining(String state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByStateContaining", startResult, maxRows, state);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByZipContaining
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByZipContaining(String zip) throws DataAccessException {

		return findRcsBotBillingByZipContaining(zip, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByZipContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByZipContaining(String zip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByZipContaining", startResult, maxRows, zip);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1Containing
	 *
	 */
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1Containing(String addressLine1) throws DataAccessException {

		return findRcsBotBillingByAddressLine1Containing(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotBillingByAddressLine1Containing", startResult, maxRows, addressLine1);
		return new LinkedHashSet<RcsBotBilling>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotBillingById
	 *
	 */
	@Transactional
	public RcsBotBilling findRcsBotBillingById(Integer id) throws DataAccessException {

		return findRcsBotBillingById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotBillingById
	 *
	 */

	@Transactional
	public RcsBotBilling findRcsBotBillingById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotBillingById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotBilling) query.getSingleResult();
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
	public boolean canBeMerged(RcsBotBilling entity) {
		return true;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_billing  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
