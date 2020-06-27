
package com.kirusa.dao;

import com.kirusa.domain.RcsBotUser;

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
 * DAO to manage RcsBotUser entities.
 * 
 */
@Repository("RcsBotUserDAO")

@Transactional
public class RcsBotUserDAOImpl extends AbstractJpaDao<RcsBotUser> implements RcsBotUserDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotUser.class }));

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
	 * Instantiates a new RcsBotUserDAOImpl
	 *
	 */
	public RcsBotUserDAOImpl() {
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
	 * JPQL Query - findRcsBotUserByUserTypeContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserTypeContaining(String userType) throws DataAccessException {

		return findRcsBotUserByUserTypeContaining(userType, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByUserTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserTypeContaining(String userType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByUserTypeContaining", startResult, maxRows, userType);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLangContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLangContaining(String lang) throws DataAccessException {

		return findRcsBotUserByLangContaining(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLangContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLangContaining", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotUser findRcsBotUserByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotUserByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotUser findRcsBotUserByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotUserByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotUser) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotUserByFname
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByFname(String fname) throws DataAccessException {

		return findRcsBotUserByFname(fname, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByFname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByFname(String fname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByFname", startResult, maxRows, fname);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByGpsLocationContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByGpsLocationContaining(String gpsLocation) throws DataAccessException {

		return findRcsBotUserByGpsLocationContaining(gpsLocation, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByGpsLocationContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByGpsLocationContaining(String gpsLocation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByGpsLocationContaining", startResult, maxRows, gpsLocation);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByProfileImageName
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByProfileImageName(String profileImageName) throws DataAccessException {

		return findRcsBotUserByProfileImageName(profileImageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByProfileImageName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByProfileImageName(String profileImageName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByProfileImageName", startResult, maxRows, profileImageName);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByProfileImageNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByProfileImageNameContaining(String profileImageName) throws DataAccessException {

		return findRcsBotUserByProfileImageNameContaining(profileImageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByProfileImageNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByProfileImageNameContaining(String profileImageName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByProfileImageNameContaining", startResult, maxRows, profileImageName);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByUserStatus
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserStatus(String userStatus) throws DataAccessException {

		return findRcsBotUserByUserStatus(userStatus, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByUserStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserStatus(String userStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByUserStatus", startResult, maxRows, userStatus);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByUserStatusContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserStatusContaining(String userStatus) throws DataAccessException {

		return findRcsBotUserByUserStatusContaining(userStatus, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByUserStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserStatusContaining(String userStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByUserStatusContaining", startResult, maxRows, userStatus);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByMobileNoContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByMobileNoContaining(String mobileNo) throws DataAccessException {

		return findRcsBotUserByMobileNoContaining(mobileNo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByMobileNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByMobileNoContaining(String mobileNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByMobileNoContaining", startResult, maxRows, mobileNo);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByGpsLocation
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByGpsLocation(String gpsLocation) throws DataAccessException {

		return findRcsBotUserByGpsLocation(gpsLocation, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByGpsLocation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByGpsLocation(String gpsLocation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByGpsLocation", startResult, maxRows, gpsLocation);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmailContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmailContaining(String verifiedEmail) throws DataAccessException {

		return findRcsBotUserByVerifiedEmailContaining(verifiedEmail, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmailContaining(String verifiedEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByVerifiedEmailContaining", startResult, maxRows, verifiedEmail);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByOtpContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByOtpContaining(String otp) throws DataAccessException {

		return findRcsBotUserByOtpContaining(otp, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByOtpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByOtpContaining(String otp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByOtpContaining", startResult, maxRows, otp);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLoginSource
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLoginSource(String loginSource) throws DataAccessException {

		return findRcsBotUserByLoginSource(loginSource, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLoginSource
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLoginSource(String loginSource, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLoginSource", startResult, maxRows, loginSource);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhoneContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhoneContaining(String verifiedPhone) throws DataAccessException {

		return findRcsBotUserByVerifiedPhoneContaining(verifiedPhone, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhoneContaining(String verifiedPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByVerifiedPhoneContaining", startResult, maxRows, verifiedPhone);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotUserByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByCompanyNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByCompanyNameContaining(String companyName) throws DataAccessException {

		return findRcsBotUserByCompanyNameContaining(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByCompanyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByCompanyNameContaining(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByCompanyNameContaining", startResult, maxRows, companyName);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLon
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLon(java.math.BigDecimal lon) throws DataAccessException {

		return findRcsBotUserByLon(lon, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLon
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLon(java.math.BigDecimal lon, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLon", startResult, maxRows, lon);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotUsers
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findAllRcsBotUsers() throws DataAccessException {

		return findAllRcsBotUsers(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotUsers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findAllRcsBotUsers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotUsers", startResult, maxRows);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLat
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLat(java.math.BigDecimal lat) throws DataAccessException {

		return findRcsBotUserByLat(lat, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLat
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLat(java.math.BigDecimal lat, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLat", startResult, maxRows, lat);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLang
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLang(String lang) throws DataAccessException {

		return findRcsBotUserByLang(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLang
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLang(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLang", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByAltPhoneContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByAltPhoneContaining(String altPhone) throws DataAccessException {

		return findRcsBotUserByAltPhoneContaining(altPhone, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByAltPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByAltPhoneContaining(String altPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByAltPhoneContaining", startResult, maxRows, altPhone);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByOtp
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByOtp(String otp) throws DataAccessException {

		return findRcsBotUserByOtp(otp, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByOtp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByOtp(String otp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByOtp", startResult, maxRows, otp);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLoginCount
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLoginCount(Integer loginCount) throws DataAccessException {

		return findRcsBotUserByLoginCount(loginCount, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLoginCount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLoginCount(Integer loginCount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLoginCount", startResult, maxRows, loginCount);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByPassword
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByPassword(String password) throws DataAccessException {

		return findRcsBotUserByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByPassword", startResult, maxRows, password);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByAltPhone
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByAltPhone(String altPhone) throws DataAccessException {

		return findRcsBotUserByAltPhone(altPhone, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByAltPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByAltPhone(String altPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByAltPhone", startResult, maxRows, altPhone);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByEmailContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByEmailContaining(String email) throws DataAccessException {

		return findRcsBotUserByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmail
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmail(String verifiedEmail) throws DataAccessException {

		return findRcsBotUserByVerifiedEmail(verifiedEmail, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmail(String verifiedEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByVerifiedEmail", startResult, maxRows, verifiedEmail);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLname
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLname(String lname) throws DataAccessException {

		return findRcsBotUserByLname(lname, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLname(String lname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLname", startResult, maxRows, lname);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLastLoginTime
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLastLoginTime(java.util.Calendar lastLoginTime) throws DataAccessException {

		return findRcsBotUserByLastLoginTime(lastLoginTime, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLastLoginTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLastLoginTime(java.util.Calendar lastLoginTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLastLoginTime", startResult, maxRows, lastLoginTime);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByWrongPasswordCount
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByWrongPasswordCount(Boolean wrongPasswordCount) throws DataAccessException {

		return findRcsBotUserByWrongPasswordCount(wrongPasswordCount, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByWrongPasswordCount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByWrongPasswordCount(Boolean wrongPasswordCount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByWrongPasswordCount", startResult, maxRows, wrongPasswordCount);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByCompanyName
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByCompanyName(String companyName) throws DataAccessException {

		return findRcsBotUserByCompanyName(companyName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByCompanyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByCompanyName(String companyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByCompanyName", startResult, maxRows, companyName);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByMobileNo
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByMobileNo(String mobileNo) throws DataAccessException {

		return findRcsBotUserByMobileNo(mobileNo, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByMobileNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByMobileNo(String mobileNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByMobileNo", startResult, maxRows, mobileNo);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByUserType
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserType(String userType) throws DataAccessException {

		return findRcsBotUserByUserType(userType, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByUserType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByUserType(String userType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByUserType", startResult, maxRows, userType);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByPasswordContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByPasswordContaining(String password) throws DataAccessException {

		return findRcsBotUserByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLnameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLnameContaining(String lname) throws DataAccessException {

		return findRcsBotUserByLnameContaining(lname, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLnameContaining(String lname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLnameContaining", startResult, maxRows, lname);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByLoginSourceContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLoginSourceContaining(String loginSource) throws DataAccessException {

		return findRcsBotUserByLoginSourceContaining(loginSource, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByLoginSourceContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByLoginSourceContaining(String loginSource, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByLoginSourceContaining", startResult, maxRows, loginSource);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByFnameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByFnameContaining(String fname) throws DataAccessException {

		return findRcsBotUserByFnameContaining(fname, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByFnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByFnameContaining(String fname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByFnameContaining", startResult, maxRows, fname);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotUserByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByEmail
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByEmail(String email) throws DataAccessException {

		return findRcsBotUserByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByEmail", startResult, maxRows, email);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhone
	 *
	 */
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhone(String verifiedPhone) throws DataAccessException {

		return findRcsBotUserByVerifiedPhone(verifiedPhone, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhone(String verifiedPhone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUserByVerifiedPhone", startResult, maxRows, verifiedPhone);
		return new LinkedHashSet<RcsBotUser>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUserById
	 *
	 */
	@Transactional
	public RcsBotUser findRcsBotUserById(Integer id) throws DataAccessException {

		return findRcsBotUserById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUserById
	 *
	 */

	@Transactional
	public RcsBotUser findRcsBotUserById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotUserById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotUser) query.getSingleResult();
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
	public boolean canBeMerged(RcsBotUser entity) {
		return true;
	}
}
