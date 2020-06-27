
package com.kirusa.dao;

import com.kirusa.domain.RcsBotBilling;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotBilling entities.
 * 
 */
public interface RcsBotBillingDAO extends JpaDao<RcsBotBilling> {

	/**
	 * JPQL Query - findRcsBotBillingByState
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByState(String state) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByState
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByState(String state, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByEmailContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByEmailContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByLastUpdate
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByLastUpdate
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByPrimaryKey
	 *
	 */
	public RcsBotBilling findRcsBotBillingByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByPrimaryKey
	 *
	 */
	public RcsBotBilling findRcsBotBillingByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByEmail
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByEmail
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCountry
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCountry(String country) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCountry
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCountry(String country, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNo
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNo(String altContactNo) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNo
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNo(String altContactNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCreateDate
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCreateDate
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAccountType
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAccountType(String accountType) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAccountType
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAccountType(String accountType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByUserName
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByUserName(String userName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByUserName
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByUserName(String userName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCountryContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCountryContaining(String country_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCountryContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCountryContaining(String country_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1(String addressLine1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotBillings
	 *
	 */
	public Set<RcsBotBilling> findAllRcsBotBillings() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotBillings
	 *
	 */
	public Set<RcsBotBilling> findAllRcsBotBillings(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByContactNo
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByContactNo(String contactNo) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByContactNo
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByContactNo(String contactNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCompanyName
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCompanyName(String companyName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCompanyName
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCompanyName(String companyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2(String addressLine2) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCityContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCityContaining(String city) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCityContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCityContaining(String city, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAccountTypeContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAccountTypeContaining(String accountType_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAccountTypeContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAccountTypeContaining(String accountType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCompanyNameContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCompanyNameContaining(String companyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCompanyNameContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCompanyNameContaining(String companyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByZip
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByZip(String zip) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByZip
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByZip(String zip, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByContactNoContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByContactNoContaining(String contactNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByContactNoContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByContactNoContaining(String contactNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCity
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCity(String city_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByCity
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByCity(String city_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByUserNameContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByUserNameContaining(String userName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByUserNameContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByUserNameContaining(String userName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2Containing
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2Containing(String addressLine2_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine2Containing
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine2Containing(String addressLine2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNoContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNoContaining(String altContactNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAltContactNoContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAltContactNoContaining(String altContactNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByStateContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByStateContaining(String state_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByStateContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByStateContaining(String state_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByZipContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByZipContaining(String zip_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByZipContaining
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByZipContaining(String zip_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1Containing
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1Containing(String addressLine1_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingByAddressLine1Containing
	 *
	 */
	public Set<RcsBotBilling> findRcsBotBillingByAddressLine1Containing(String addressLine1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingById
	 *
	 */
	public RcsBotBilling findRcsBotBillingById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotBillingById
	 *
	 */
	public RcsBotBilling findRcsBotBillingById(Integer id_1, int startResult, int maxRows) throws DataAccessException;
	public void deletebyRcsBotId(Integer botId);


}