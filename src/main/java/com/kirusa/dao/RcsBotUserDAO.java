
package com.kirusa.dao;

import com.kirusa.domain.RcsBotUser;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotUser entities.
 * 
 */
public interface RcsBotUserDAO extends JpaDao<RcsBotUser> {

	/**
	 * JPQL Query - findRcsBotUserByUserTypeContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserTypeContaining(String userType) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserTypeContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserTypeContaining(String userType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLangContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLangContaining(String lang) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLangContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByPrimaryKey
	 *
	 */
	public RcsBotUser findRcsBotUserByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByPrimaryKey
	 *
	 */
	public RcsBotUser findRcsBotUserByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByFname
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByFname(String fname) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByFname
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByFname(String fname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByGpsLocationContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByGpsLocationContaining(String gpsLocation) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByGpsLocationContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByGpsLocationContaining(String gpsLocation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByProfileImageName
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByProfileImageName(String profileImageName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByProfileImageName
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByProfileImageName(String profileImageName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByProfileImageNameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByProfileImageNameContaining(String profileImageName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByProfileImageNameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByProfileImageNameContaining(String profileImageName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserStatus
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserStatus(String userStatus) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserStatus
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserStatus(String userStatus, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserStatusContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserStatusContaining(String userStatus_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserStatusContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserStatusContaining(String userStatus_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByMobileNoContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByMobileNoContaining(String mobileNo) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByMobileNoContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByMobileNoContaining(String mobileNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByGpsLocation
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByGpsLocation(String gpsLocation_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByGpsLocation
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByGpsLocation(String gpsLocation_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmailContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmailContaining(String verifiedEmail) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmailContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmailContaining(String verifiedEmail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByOtpContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByOtpContaining(String otp) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByOtpContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByOtpContaining(String otp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLoginSource
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLoginSource(String loginSource) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLoginSource
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLoginSource(String loginSource, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhoneContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhoneContaining(String verifiedPhone) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhoneContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhoneContaining(String verifiedPhone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLastUpdate
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLastUpdate
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByCompanyNameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByCompanyNameContaining(String companyName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByCompanyNameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByCompanyNameContaining(String companyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLon
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLon(java.math.BigDecimal lon) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLon
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLon(BigDecimal lon, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotUsers
	 *
	 */
	public Set<RcsBotUser> findAllRcsBotUsers() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotUsers
	 *
	 */
	public Set<RcsBotUser> findAllRcsBotUsers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLat
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLat(java.math.BigDecimal lat) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLat
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLat(BigDecimal lat, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLang
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLang(String lang_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLang
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLang(String lang_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByAltPhoneContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByAltPhoneContaining(String altPhone) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByAltPhoneContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByAltPhoneContaining(String altPhone, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByOtp
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByOtp(String otp_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByOtp
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByOtp(String otp_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLoginCount
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLoginCount(Integer loginCount) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLoginCount
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLoginCount(Integer loginCount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByPassword
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByPassword(String password) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByPassword
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByPassword(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByAltPhone
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByAltPhone(String altPhone_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByAltPhone
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByAltPhone(String altPhone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByEmailContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByEmailContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmail
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmail(String verifiedEmail_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedEmail
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedEmail(String verifiedEmail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLname
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLname(String lname) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLname
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLname(String lname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLastLoginTime
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLastLoginTime(java.util.Calendar lastLoginTime) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLastLoginTime
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLastLoginTime(Calendar lastLoginTime, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByWrongPasswordCount
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByWrongPasswordCount(Boolean wrongPasswordCount) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByWrongPasswordCount
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByWrongPasswordCount(Boolean wrongPasswordCount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByCompanyName
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByCompanyName(String companyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByCompanyName
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByCompanyName(String companyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByMobileNo
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByMobileNo(String mobileNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByMobileNo
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByMobileNo(String mobileNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserType
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserType(String userType_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByUserType
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByUserType(String userType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByPasswordContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByPasswordContaining(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByPasswordContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByPasswordContaining(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLnameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLnameContaining(String lname_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLnameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLnameContaining(String lname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLoginSourceContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLoginSourceContaining(String loginSource_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByLoginSourceContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByLoginSourceContaining(String loginSource_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByFnameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByFnameContaining(String fname_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByFnameContaining
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByFnameContaining(String fname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByCreateDate
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByCreateDate
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByEmail
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByEmail
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhone
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhone(String verifiedPhone_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserByVerifiedPhone
	 *
	 */
	public Set<RcsBotUser> findRcsBotUserByVerifiedPhone(String verifiedPhone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserById
	 *
	 */
	public RcsBotUser findRcsBotUserById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotUserById
	 *
	 */
	public RcsBotUser findRcsBotUserById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}