
package com.kirusa.dao;

import com.kirusa.domain.RcsBotPublisher;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RcsBotPublisher entities.
 * 
 */
public interface RcsBotPublisherDAO extends JpaDao<RcsBotPublisher> {

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyName
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyName(String companyName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyName
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyName(String companyName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyNameContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyNameContaining(String companyName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByCompanyNameContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByCompanyNameContaining(String companyName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByLastNameContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByLastNameContaining(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByLastNameContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByLastUpdate
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByLastUpdate
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByLastUpdate(Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherById
	 *
	 */
	public RcsBotPublisher findRcsBotPublisherById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherById
	 *
	 */
	public RcsBotPublisher findRcsBotPublisherById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumber
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumber(String phoneNumber) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumber
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumber(String phoneNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumberContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumberContaining(String phoneNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByPhoneNumberContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByPhoneNumberContaining(String phoneNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotId
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotId(Integer rcsBotId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotId
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotPublishers
	 *
	 */
	public Set<RcsBotPublisher> findAllRcsBotPublishers() throws DataAccessException;

	/**
	 * JPQL Query - findAllRcsBotPublishers
	 *
	 */
	public Set<RcsBotPublisher> findAllRcsBotPublishers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByEmail
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByEmail
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByFirstNameContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstNameContaining(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByFirstNameContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotUserId
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotUserId(Integer rcsBotUserId) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByRcsBotUserId
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByRcsBotUserId(Integer rcsBotUserId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByEmailContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByEmailContaining
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByPrimaryKey
	 *
	 */
	public RcsBotPublisher findRcsBotPublisherByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByPrimaryKey
	 *
	 */
	public RcsBotPublisher findRcsBotPublisherByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByLastName
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByLastName(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByLastName
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByLastName(String lastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByFirstName
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstName(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByFirstName
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByFirstName(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByCreateDate
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByCreateDate(java.util.Calendar createDate) throws DataAccessException;

	/**
	 * JPQL Query - findRcsBotPublisherByCreateDate
	 *
	 */
	public Set<RcsBotPublisher> findRcsBotPublisherByCreateDate(Calendar createDate, int startResult, int maxRows) throws DataAccessException;

}