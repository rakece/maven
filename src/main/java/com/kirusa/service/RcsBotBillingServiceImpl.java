package com.kirusa.service;

import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUserDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotBilling entities
 * 
 */

@Service("RcsBotBillingService")

@Transactional
public class RcsBotBillingServiceImpl implements RcsBotBillingService {

	/**
	 * DAO injected by Spring that manages RcsBotBilling entities
	 * 
	 */
	@Autowired
	private RcsBotBillingDAO rcsBotBillingDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * Instantiates a new RcsBotBillingServiceImpl.
	 *
	 */
	public RcsBotBillingServiceImpl() {
	}

	/**
	 * Delete an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBotBilling deleteRcsBotBillingRcsBotUser(Integer rcsbotbilling_id, Integer related_rcsbotuser_id) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling_id, -1, -1);
		RcsBotUser related_rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id, -1, -1);

		rcsbotbilling.setRcsBotUser(null);
		related_rcsbotuser.getRcsBotBillings().remove(rcsbotbilling);
		rcsbotbilling = rcsBotBillingDAO.store(rcsbotbilling);
		rcsBotBillingDAO.flush();

		related_rcsbotuser = rcsBotUserDAO.store(related_rcsbotuser);
		rcsBotUserDAO.flush();

		rcsBotUserDAO.remove(related_rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotbilling;
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotBilling deleteRcsBotBillingRcsBot(Integer rcsbotbilling_id, Integer related_rcsbot_id) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling_id, -1, -1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbotbilling.setRcsBot(null);
		related_rcsbot.getRcsBotBillings().remove(rcsbotbilling);
		rcsbotbilling = rcsBotBillingDAO.store(rcsbotbilling);
		rcsBotBillingDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotbilling;
	}

	/**
	 * Return a count of all RcsBotBilling entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotBillings() {
		return ((Long) rcsBotBillingDAO.createQuerySingleResult("select count(o) from RcsBotBilling o")
				.getSingleResult()).intValue();
	}

	/**
	 * Delete an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotBilling(RcsBotBilling rcsbotbilling) {
		rcsBotBillingDAO.remove(rcsbotbilling);
		rcsBotBillingDAO.flush();
	}

	/**
	 * Return all RcsBotBilling entity
	 * 
	 */
	@Transactional
	public List<RcsBotBilling> findAllRcsBotBillings(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotBilling>(rcsBotBillingDAO.findAllRcsBotBillings(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotBilling saveRcsBotBillingRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(id, -1, -1);
		RcsBot existingrcsBot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBot != null) {
			existingrcsBot.setId(related_rcsbot.getId());
			existingrcsBot.setPlatform(related_rcsbot.getPlatform());
			existingrcsBot.setPrivacyUrl(related_rcsbot.getPrivacyUrl());
			existingrcsBot.setWebsiteUrl(related_rcsbot.getWebsiteUrl());
			existingrcsBot.setTermAndConditionUrl(related_rcsbot.getTermAndConditionUrl());
			existingrcsBot.setCreateDate(related_rcsbot.getCreateDate());
			existingrcsBot.setLastUpdate(related_rcsbot.getLastUpdate());
			existingrcsBot.setStatus(related_rcsbot.getStatus());
			existingrcsBot.setLogoImageName(related_rcsbot.getLogoImageName());
			related_rcsbot = existingrcsBot;
		}

		rcsbotbilling.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotBillings().add(rcsbotbilling);
		rcsbotbilling = rcsBotBillingDAO.store(rcsbotbilling);
		rcsBotBillingDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotbilling;
	}

	/**
	 * Save an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBotBilling saveRcsBotBillingRcsBotUser(Integer id, RcsBotUser related_rcsbotuser) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(id, -1, -1);
		RcsBotUser existingrcsBotUser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotUser != null) {
			existingrcsBotUser.setId(related_rcsbotuser.getId());
			existingrcsBotUser.setMobileNo(related_rcsbotuser.getMobileNo());
			existingrcsBotUser.setLoginSource(related_rcsbotuser.getLoginSource());
			existingrcsBotUser.setEmail(related_rcsbotuser.getEmail());
			existingrcsBotUser.setVerifiedEmail(related_rcsbotuser.getVerifiedEmail());
			existingrcsBotUser.setVerifiedPhone(related_rcsbotuser.getVerifiedPhone());
			existingrcsBotUser.setGpsLocation(related_rcsbotuser.getGpsLocation());
			existingrcsBotUser.setLon(related_rcsbotuser.getLon());
			existingrcsBotUser.setLat(related_rcsbotuser.getLat());
			existingrcsBotUser.setAltPhone(related_rcsbotuser.getAltPhone());
			existingrcsBotUser.setPassword(related_rcsbotuser.getPassword());
			existingrcsBotUser.setFname(related_rcsbotuser.getFname());
			existingrcsBotUser.setLname(related_rcsbotuser.getLname());
			existingrcsBotUser.setUserStatus(related_rcsbotuser.getUserStatus());
			existingrcsBotUser.setUserType(related_rcsbotuser.getUserType());
			existingrcsBotUser.setLastLoginTime(related_rcsbotuser.getLastLoginTime());
			existingrcsBotUser.setLoginCount(related_rcsbotuser.getLoginCount());
			existingrcsBotUser.setWrongPasswordCount(related_rcsbotuser.getWrongPasswordCount());
			existingrcsBotUser.setOtp(related_rcsbotuser.getOtp());
			existingrcsBotUser.setLang(related_rcsbotuser.getLang());
			existingrcsBotUser.setCreateDate(related_rcsbotuser.getCreateDate());
			existingrcsBotUser.setLastUpdate(related_rcsbotuser.getLastUpdate());
			existingrcsBotUser.setProfileImageName(related_rcsbotuser.getProfileImageName());
			existingrcsBotUser.setCompanyName(related_rcsbotuser.getCompanyName());
			related_rcsbotuser = existingrcsBotUser;
		}

		rcsbotbilling.setRcsBotUser(related_rcsbotuser);
		related_rcsbotuser.getRcsBotBillings().add(rcsbotbilling);
		rcsbotbilling = rcsBotBillingDAO.store(rcsbotbilling);
		rcsBotBillingDAO.flush();

		related_rcsbotuser = rcsBotUserDAO.store(related_rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotbilling;
	}

	/**
	 * Save an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public void saveRcsBotBilling(RcsBotBilling rcsbotbilling) {
		RcsBotBilling existingRcsBotBilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling.getId());

		if (existingRcsBotBilling != null) {
			if (existingRcsBotBilling != rcsbotbilling) {
				if (rcsbotbilling.getId() != null)
					existingRcsBotBilling.setId(rcsbotbilling.getId());
				if (rcsbotbilling.getUserName() != null)
					existingRcsBotBilling.setUserName(rcsbotbilling.getUserName());
				if (rcsbotbilling.getCompanyName() != null)
					existingRcsBotBilling.setCompanyName(rcsbotbilling.getCompanyName());
				if (rcsbotbilling.getEmail() != null)
					existingRcsBotBilling.setEmail(rcsbotbilling.getEmail());
				if (rcsbotbilling.getAccountType() != null)
					existingRcsBotBilling.setAccountType(rcsbotbilling.getAccountType());
				if (rcsbotbilling.getContactNo() != null)
					existingRcsBotBilling.setContactNo(rcsbotbilling.getContactNo());
				if (rcsbotbilling.getAltContactNo() != null)
					existingRcsBotBilling.setAltContactNo(rcsbotbilling.getAltContactNo());
				if (rcsbotbilling.getAddressLine1() != null)
					existingRcsBotBilling.setAddressLine1(rcsbotbilling.getAddressLine1());
				if (rcsbotbilling.getAddressLine2() != null)
					existingRcsBotBilling.setAddressLine2(rcsbotbilling.getAddressLine2());
				if (rcsbotbilling.getCity() != null)
					existingRcsBotBilling.setCity(rcsbotbilling.getCity());
				if (rcsbotbilling.getState() != null)
					existingRcsBotBilling.setState(rcsbotbilling.getState());
				if (rcsbotbilling.getZip() != null)
					existingRcsBotBilling.setZip(rcsbotbilling.getZip());
				if (rcsbotbilling.getCountry() != null)
					existingRcsBotBilling.setCountry(rcsbotbilling.getCountry());

				existingRcsBotBilling.setCreateDate(rcsbotbilling.getCreateDate());
				existingRcsBotBilling.setLastUpdate(rcsbotbilling.getLastUpdate());
			}
			rcsbotbilling = rcsBotBillingDAO.store(existingRcsBotBilling);
		} else {
			rcsbotbilling = rcsBotBillingDAO.store(rcsbotbilling);
		}
		rcsBotBillingDAO.flush();
	}

	/**
	 * Load an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public Set<RcsBotBilling> loadRcsBotBillings() {
		return rcsBotBillingDAO.findAllRcsBotBillings();
	}

	/**
	 */
	@Transactional
	public RcsBotBilling findRcsBotBillingByPrimaryKey(Integer id) {
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(id);
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotBillingDAO.deletebyRcsBotId(botId);
	}
}
