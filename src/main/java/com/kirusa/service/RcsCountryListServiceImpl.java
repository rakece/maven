package com.kirusa.service;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsCountryList;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsCountryList entities
 * 
 */

@Service("RcsCountryListService")

@Transactional
public class RcsCountryListServiceImpl implements RcsCountryListService {

	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Instantiates a new RcsCountryListServiceImpl.
	 *
	 */
	public RcsCountryListServiceImpl() {
	}

	/**
	 * Load an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public Set<RcsCountryList> loadRcsCountryLists() {
		return rcsCountryListDAO.findAllRcsCountryLists();
	}

	/**
	 * Save an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public void saveRcsCountryList(RcsCountryList rcscountrylist) {
		RcsCountryList existingRcsCountryList = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());

		if (existingRcsCountryList != null) {
			if (existingRcsCountryList != rcscountrylist) {
				existingRcsCountryList.setId(rcscountrylist.getId());
				existingRcsCountryList.setCountryIsoName(rcscountrylist.getCountryIsoName());
				existingRcsCountryList.setCountryName(rcscountrylist.getCountryName());
				existingRcsCountryList.setCreateDate(rcscountrylist.getCreateDate());
				existingRcsCountryList.setLastUpdate(rcscountrylist.getLastUpdate());
			}
			rcscountrylist = rcsCountryListDAO.store(existingRcsCountryList);
		} else {
			rcscountrylist = rcsCountryListDAO.store(rcscountrylist);
		}
		rcsCountryListDAO.flush();
	}

	/**
	 * Delete an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public RcsCountryList deleteRcsCountryListRcsBotAvailables(Integer rcscountrylist_id, Integer related_rcsbotavailables_id) {
		RcsBotAvailable related_rcsbotavailables = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(related_rcsbotavailables_id, -1, -1);

		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id, -1, -1);

		related_rcsbotavailables.setRcsCountryList(null);
		rcscountrylist.getRcsBotAvailables().remove(related_rcsbotavailables);

		rcsBotAvailableDAO.remove(related_rcsbotavailables);
		rcsBotAvailableDAO.flush();

		return rcscountrylist;
	}

	/**
	 * Return a count of all RcsCountryList entity
	 * 
	 */
	@Transactional
	public Integer countRcsCountryLists() {
		return ((Long) rcsCountryListDAO.createQuerySingleResult("select count(o) from RcsCountryList o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsCountryList saveRcsCountryListRcsBotUsers(Integer id, RcsBotUser related_rcsbotusers) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(id, -1, -1);
		RcsBotUser existingrcsBotUsers = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotusers.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotUsers != null) {
			existingrcsBotUsers.setId(related_rcsbotusers.getId());
			existingrcsBotUsers.setMobileNo(related_rcsbotusers.getMobileNo());
			existingrcsBotUsers.setLoginSource(related_rcsbotusers.getLoginSource());
			existingrcsBotUsers.setEmail(related_rcsbotusers.getEmail());
			existingrcsBotUsers.setVerifiedEmail(related_rcsbotusers.getVerifiedEmail());
			existingrcsBotUsers.setVerifiedPhone(related_rcsbotusers.getVerifiedPhone());
			existingrcsBotUsers.setGpsLocation(related_rcsbotusers.getGpsLocation());
			existingrcsBotUsers.setLon(related_rcsbotusers.getLon());
			existingrcsBotUsers.setLat(related_rcsbotusers.getLat());
			existingrcsBotUsers.setAltPhone(related_rcsbotusers.getAltPhone());
			existingrcsBotUsers.setPassword(related_rcsbotusers.getPassword());
			existingrcsBotUsers.setFname(related_rcsbotusers.getFname());
			existingrcsBotUsers.setLname(related_rcsbotusers.getLname());
			existingrcsBotUsers.setUserStatus(related_rcsbotusers.getUserStatus());
			existingrcsBotUsers.setUserType(related_rcsbotusers.getUserType());
			existingrcsBotUsers.setLastLoginTime(related_rcsbotusers.getLastLoginTime());
			existingrcsBotUsers.setLoginCount(related_rcsbotusers.getLoginCount());
			existingrcsBotUsers.setWrongPasswordCount(related_rcsbotusers.getWrongPasswordCount());
			existingrcsBotUsers.setOtp(related_rcsbotusers.getOtp());
			existingrcsBotUsers.setLang(related_rcsbotusers.getLang());
			existingrcsBotUsers.setCreateDate(related_rcsbotusers.getCreateDate());
			existingrcsBotUsers.setLastUpdate(related_rcsbotusers.getLastUpdate());
			existingrcsBotUsers.setProfileImageName(related_rcsbotusers.getProfileImageName());
			existingrcsBotUsers.setCompanyName(related_rcsbotusers.getCompanyName());
			related_rcsbotusers = existingrcsBotUsers;
		}

		related_rcsbotusers.setRcsCountryList(rcscountrylist);
		rcscountrylist.getRcsBotUsers().add(related_rcsbotusers);
		related_rcsbotusers = rcsBotUserDAO.store(related_rcsbotusers);
		rcsBotUserDAO.flush();

		rcscountrylist = rcsCountryListDAO.store(rcscountrylist);
		rcsCountryListDAO.flush();

		return rcscountrylist;
	}

	/**
	 * Delete an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public void deleteRcsCountryList(RcsCountryList rcscountrylist) {
		rcsCountryListDAO.remove(rcscountrylist);
		rcsCountryListDAO.flush();
	}

	/**
	 * Delete an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsCountryList deleteRcsCountryListRcsBotUsers(Integer rcscountrylist_id, Integer related_rcsbotusers_id) {
		RcsBotUser related_rcsbotusers = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotusers_id, -1, -1);

		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id, -1, -1);

		related_rcsbotusers.setRcsCountryList(null);
		rcscountrylist.getRcsBotUsers().remove(related_rcsbotusers);

		rcsBotUserDAO.remove(related_rcsbotusers);
		rcsBotUserDAO.flush();

		return rcscountrylist;
	}

	/**
	 * Return all RcsCountryList entity
	 * 
	 */
	@Transactional
	public List<RcsCountryList> findAllRcsCountryLists(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsCountryList>(rcsCountryListDAO.findAllRcsCountryLists(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public RcsCountryList findRcsCountryListByPrimaryKey(Integer id) {
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(id);
	}

	/**
	 * Save an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public RcsCountryList saveRcsCountryListRcsBotAvailables(Integer id, RcsBotAvailable related_rcsbotavailables) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(id, -1, -1);
		RcsBotAvailable existingrcsBotAvailables = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(related_rcsbotavailables.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotAvailables != null) {
			existingrcsBotAvailables.setId(related_rcsbotavailables.getId());
			existingrcsBotAvailables.setCreateDate(related_rcsbotavailables.getCreateDate());
			existingrcsBotAvailables.setLastUpdate(related_rcsbotavailables.getLastUpdate());
			related_rcsbotavailables = existingrcsBotAvailables;
		}

		related_rcsbotavailables.setRcsCountryList(rcscountrylist);
		rcscountrylist.getRcsBotAvailables().add(related_rcsbotavailables);
		related_rcsbotavailables = rcsBotAvailableDAO.store(related_rcsbotavailables);
		rcsBotAvailableDAO.flush();

		rcscountrylist = rcsCountryListDAO.store(rcscountrylist);
		rcsCountryListDAO.flush();

		return rcscountrylist;
	}
}
