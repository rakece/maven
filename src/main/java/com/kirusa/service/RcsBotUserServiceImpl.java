package com.kirusa.service;

import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotUserroleDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;
import com.kirusa.domain.RcsCountryList;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotUser entities
 * 
 */

@Service("RcsBotUserService")

@Transactional
public class RcsBotUserServiceImpl implements RcsBotUserService {

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
	 * DAO injected by Spring that manages RcsBotUserrole entities
	 * 
	 */
	@Autowired
	private RcsBotUserroleDAO rcsBotUserroleDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Instantiates a new RcsBotUserServiceImpl.
	 *
	 */
	public RcsBotUserServiceImpl() {
	}

	/**
	 * Delete an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public RcsBotUser deleteRcsBotUserRcsCountryList(Integer rcsbotuser_id, Integer related_rcscountrylist_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);
		RcsCountryList related_rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(related_rcscountrylist_id, -1, -1);

		rcsbotuser.setRcsCountryList(null);
		related_rcscountrylist.getRcsBotUsers().remove(rcsbotuser);
		rcsbotuser = rcsBotUserDAO.store(rcsbotuser);
		rcsBotUserDAO.flush();

		related_rcscountrylist = rcsCountryListDAO.store(related_rcscountrylist);
		rcsCountryListDAO.flush();

		rcsCountryListDAO.remove(related_rcscountrylist);
		rcsCountryListDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Save an existing RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public RcsBotUser saveRcsBotUserRcsBotUserroles(Integer id, RcsBotUserrole related_rcsbotuserroles) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(id, -1, -1);
		RcsBotUserrole existingrcsBotUserroles = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(related_rcsbotuserroles.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotUserroles != null) {
			existingrcsBotUserroles.setId(related_rcsbotuserroles.getId());
			existingrcsBotUserroles.setUserRoleType(related_rcsbotuserroles.getUserRoleType());
			existingrcsBotUserroles.setRoleDescription(related_rcsbotuserroles.getRoleDescription());
			existingrcsBotUserroles.setCreateDate(related_rcsbotuserroles.getCreateDate());
			existingrcsBotUserroles.setLastUpdate(related_rcsbotuserroles.getLastUpdate());
			existingrcsBotUserroles.setValidFrom(related_rcsbotuserroles.getValidFrom());
			existingrcsBotUserroles.setValidTo(related_rcsbotuserroles.getValidTo());
			related_rcsbotuserroles = existingrcsBotUserroles;
		}

		related_rcsbotuserroles.setRcsBotUser(rcsbotuser);
		rcsbotuser.getRcsBotUserroles().add(related_rcsbotuserroles);
		related_rcsbotuserroles = rcsBotUserroleDAO.store(related_rcsbotuserroles);
		rcsBotUserroleDAO.flush();

		rcsbotuser = rcsBotUserDAO.store(rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Load an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public Set<RcsBotUser> loadRcsBotUsers() {
		return rcsBotUserDAO.findAllRcsBotUsers();
	}

	/**
	 */
	@Transactional
	public RcsBotUser findRcsBotUserByPrimaryKey(Integer id) {
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(id);
	}

	/**
	 * Delete an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public RcsBotUser deleteRcsBotUserRcsBotBillings(Integer rcsbotuser_id, Integer related_rcsbotbillings_id) {
		RcsBotBilling related_rcsbotbillings = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(related_rcsbotbillings_id, -1, -1);

		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		related_rcsbotbillings.setRcsBotUser(null);
		rcsbotuser.getRcsBotBillings().remove(related_rcsbotbillings);

		rcsBotBillingDAO.remove(related_rcsbotbillings);
		rcsBotBillingDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotUser deleteRcsBotUserRcsBots(Integer rcsbotuser_id, Integer related_rcsbots_id) {
		RcsBot related_rcsbots = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots_id, -1, -1);

		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		related_rcsbots.setRcsBotUser(null);
		rcsbotuser.getRcsBots().remove(related_rcsbots);

		rcsBotDAO.remove(related_rcsbots);
		rcsBotDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Delete an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotUser(RcsBotUser rcsbotuser) {
		rcsBotUserDAO.remove(rcsbotuser);
		rcsBotUserDAO.flush();
	}

	/**
	 * Return a count of all RcsBotUser entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotUsers() {
		return ((Long) rcsBotUserDAO.createQuerySingleResult("select count(o) from RcsBotUser o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotUser saveRcsBotUserRcsBots(Integer id, RcsBot related_rcsbots) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(id, -1, -1);
		RcsBot existingrcsBots = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBots != null) {
			existingrcsBots.setId(related_rcsbots.getId());
			existingrcsBots.setPlatform(related_rcsbots.getPlatform());
			existingrcsBots.setPrivacyUrl(related_rcsbots.getPrivacyUrl());
			existingrcsBots.setWebsiteUrl(related_rcsbots.getWebsiteUrl());
			existingrcsBots.setTermAndConditionUrl(related_rcsbots.getTermAndConditionUrl());
			existingrcsBots.setCreateDate(related_rcsbots.getCreateDate());
			existingrcsBots.setLastUpdate(related_rcsbots.getLastUpdate());
			existingrcsBots.setStatus(related_rcsbots.getStatus());
			existingrcsBots.setLogoImageName(related_rcsbots.getLogoImageName());
			related_rcsbots = existingrcsBots;
		}

		related_rcsbots.setRcsBotUser(rcsbotuser);
		rcsbotuser.getRcsBots().add(related_rcsbots);
		related_rcsbots = rcsBotDAO.store(related_rcsbots);
		rcsBotDAO.flush();

		rcsbotuser = rcsBotUserDAO.store(rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Save an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBotUser saveRcsBotUser(RcsBotUser rcsbotuser) {
		RcsBotUser existingRcsBotUser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());

		if (existingRcsBotUser != null) {
			if (existingRcsBotUser != rcsbotuser) {
				if(rcsbotuser.getId()!=null)
					existingRcsBotUser.setId(rcsbotuser.getId());
				if(rcsbotuser.getMobileNo()!=null)
				existingRcsBotUser.setMobileNo(rcsbotuser.getMobileNo());
				if(rcsbotuser.getLoginSource()!=null)
				existingRcsBotUser.setLoginSource(rcsbotuser.getLoginSource());
				if(rcsbotuser.getEmail()!=null)
				existingRcsBotUser.setEmail(rcsbotuser.getEmail());
				if(rcsbotuser.getVerifiedEmail()!=null)
				existingRcsBotUser.setVerifiedEmail(rcsbotuser.getVerifiedEmail());
				if(rcsbotuser.getVerifiedPhone()!=null)
				existingRcsBotUser.setVerifiedPhone(rcsbotuser.getVerifiedPhone());
				if(rcsbotuser.getGpsLocation()!=null)
				existingRcsBotUser.setGpsLocation(rcsbotuser.getGpsLocation());
				if(rcsbotuser.getLon()!=null)
				existingRcsBotUser.setLon(rcsbotuser.getLon());
				if(rcsbotuser.getLat()!=null)
				existingRcsBotUser.setLat(rcsbotuser.getLat());
				if(rcsbotuser.getAltPhone()!=null)
				existingRcsBotUser.setAltPhone(rcsbotuser.getAltPhone());
				if(rcsbotuser.getPassword()!=null)
				existingRcsBotUser.setPassword(rcsbotuser.getPassword());
				if(rcsbotuser.getFname()!=null)
				existingRcsBotUser.setFname(rcsbotuser.getFname());
				if(rcsbotuser.getLname()!=null)
				existingRcsBotUser.setLname(rcsbotuser.getLname());
				if(rcsbotuser.getUserStatus()!=null)
				existingRcsBotUser.setUserStatus(rcsbotuser.getUserStatus());
				if(rcsbotuser.getUserType()!=null)
				existingRcsBotUser.setUserType(rcsbotuser.getUserType());
				if(rcsbotuser.getLastLoginTime()!=null)
				existingRcsBotUser.setLastLoginTime(rcsbotuser.getLastLoginTime());
				if(rcsbotuser.getLoginCount()!=null)
				existingRcsBotUser.setLoginCount(rcsbotuser.getLoginCount());
				if(rcsbotuser.getWrongPasswordCount()!=null)
				existingRcsBotUser.setWrongPasswordCount(rcsbotuser.getWrongPasswordCount());
				if(rcsbotuser.getOtp()!=null)
				existingRcsBotUser.setOtp(rcsbotuser.getOtp());
				if(rcsbotuser.getLang()!=null)
				existingRcsBotUser.setLang(rcsbotuser.getLang());
				//existingRcsBotUser.setCreateDate(rcsbotuser.getCreateDate());
				if(rcsbotuser.getLastUpdate()!=null)
				existingRcsBotUser.setLastUpdate(rcsbotuser.getLastUpdate());
				if(rcsbotuser.getProfileImageName()!=null)
				existingRcsBotUser.setProfileImageName(rcsbotuser.getProfileImageName());
				if(rcsbotuser.getCompanyName()!=null)
				existingRcsBotUser.setCompanyName(rcsbotuser.getCompanyName());
			}
			rcsbotuser = rcsBotUserDAO.store(existingRcsBotUser);
		} else {
			rcsbotuser = rcsBotUserDAO.store(rcsbotuser);
		}
		rcsBotUserDAO.flush();
		return rcsbotuser;
	}

	/**
	 * Return all RcsBotUser entity
	 * 
	 */
	@Transactional
	public List<RcsBotUser> findAllRcsBotUsers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotUser>(rcsBotUserDAO.findAllRcsBotUsers(startResult, maxRows));
	}

	/**
	 * Save an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public RcsBotUser saveRcsBotUserRcsCountryList(Integer id, RcsCountryList related_rcscountrylist) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(id, -1, -1);
		RcsCountryList existingrcsCountryList = rcsCountryListDAO.findRcsCountryListByPrimaryKey(related_rcscountrylist.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsCountryList != null) {
			existingrcsCountryList.setId(related_rcscountrylist.getId());
			existingrcsCountryList.setCountryIsoName(related_rcscountrylist.getCountryIsoName());
			existingrcsCountryList.setCountryName(related_rcscountrylist.getCountryName());
			existingrcsCountryList.setCreateDate(related_rcscountrylist.getCreateDate());
			existingrcsCountryList.setLastUpdate(related_rcscountrylist.getLastUpdate());
			related_rcscountrylist = existingrcsCountryList;
		}

		rcsbotuser.setRcsCountryList(related_rcscountrylist);
		related_rcscountrylist.getRcsBotUsers().add(rcsbotuser);
		rcsbotuser = rcsBotUserDAO.store(rcsbotuser);
		rcsBotUserDAO.flush();

		related_rcscountrylist = rcsCountryListDAO.store(related_rcscountrylist);
		rcsCountryListDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Delete an existing RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public RcsBotUser deleteRcsBotUserRcsBotUserroles(Integer rcsbotuser_id, Integer related_rcsbotuserroles_id) {
		RcsBotUserrole related_rcsbotuserroles = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(related_rcsbotuserroles_id, -1, -1);

		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		related_rcsbotuserroles.setRcsBotUser(null);
		rcsbotuser.getRcsBotUserroles().remove(related_rcsbotuserroles);

		rcsBotUserroleDAO.remove(related_rcsbotuserroles);
		rcsBotUserroleDAO.flush();

		return rcsbotuser;
	}

	/**
	 * Save an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public RcsBotUser saveRcsBotUserRcsBotBillings(Integer id, RcsBotBilling related_rcsbotbillings) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(id, -1, -1);
		RcsBotBilling existingrcsBotBillings = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(related_rcsbotbillings.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotBillings != null) {
			existingrcsBotBillings.setId(related_rcsbotbillings.getId());
			existingrcsBotBillings.setUserName(related_rcsbotbillings.getUserName());
			existingrcsBotBillings.setCompanyName(related_rcsbotbillings.getCompanyName());
			existingrcsBotBillings.setEmail(related_rcsbotbillings.getEmail());
			existingrcsBotBillings.setAccountType(related_rcsbotbillings.getAccountType());
			existingrcsBotBillings.setContactNo(related_rcsbotbillings.getContactNo());
			existingrcsBotBillings.setAltContactNo(related_rcsbotbillings.getAltContactNo());
			existingrcsBotBillings.setAddressLine1(related_rcsbotbillings.getAddressLine1());
			existingrcsBotBillings.setAddressLine2(related_rcsbotbillings.getAddressLine2());
			existingrcsBotBillings.setCity(related_rcsbotbillings.getCity());
			existingrcsBotBillings.setState(related_rcsbotbillings.getState());
			existingrcsBotBillings.setZip(related_rcsbotbillings.getZip());
			existingrcsBotBillings.setCountry(related_rcsbotbillings.getCountry());
			existingrcsBotBillings.setCreateDate(related_rcsbotbillings.getCreateDate());
			existingrcsBotBillings.setLastUpdate(related_rcsbotbillings.getLastUpdate());
			related_rcsbotbillings = existingrcsBotBillings;
		}

		related_rcsbotbillings.setRcsBotUser(rcsbotuser);
		rcsbotuser.getRcsBotBillings().add(related_rcsbotbillings);
		related_rcsbotbillings = rcsBotBillingDAO.store(related_rcsbotbillings);
		rcsBotBillingDAO.flush();

		rcsbotuser = rcsBotUserDAO.store(rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotuser;
	}
}
