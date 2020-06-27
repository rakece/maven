package com.kirusa.service;

import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotUserroleDAO;

import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotUserrole entities
 * 
 */

@Service("RcsBotUserroleService")

@Transactional
public class RcsBotUserroleServiceImpl implements RcsBotUserroleService {

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
	 * Instantiates a new RcsBotUserroleServiceImpl.
	 *
	 */
	public RcsBotUserroleServiceImpl() {
	}

	/**
	 * Delete an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBotUserrole deleteRcsBotUserroleRcsBotUser(Integer rcsbotuserrole_id, Integer related_rcsbotuser_id) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole_id, -1, -1);
		RcsBotUser related_rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id, -1, -1);

		rcsbotuserrole.setRcsBotUser(null);
		related_rcsbotuser.getRcsBotUserroles().remove(rcsbotuserrole);
		rcsbotuserrole = rcsBotUserroleDAO.store(rcsbotuserrole);
		rcsBotUserroleDAO.flush();

		related_rcsbotuser = rcsBotUserDAO.store(related_rcsbotuser);
		rcsBotUserDAO.flush();

		rcsBotUserDAO.remove(related_rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotuserrole;
	}

	/**
	 * Save an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBotUserrole saveRcsBotUserroleRcsBotUser(Integer id, RcsBotUser related_rcsbotuser) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(id, -1, -1);
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

		rcsbotuserrole.setRcsBotUser(related_rcsbotuser);
		related_rcsbotuser.getRcsBotUserroles().add(rcsbotuserrole);
		rcsbotuserrole = rcsBotUserroleDAO.store(rcsbotuserrole);
		rcsBotUserroleDAO.flush();

		related_rcsbotuser = rcsBotUserDAO.store(related_rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbotuserrole;
	}

	/**
	 * Save an existing RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public void saveRcsBotUserrole(RcsBotUserrole rcsbotuserrole) {
		RcsBotUserrole existingRcsBotUserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole.getId());

		if (existingRcsBotUserrole != null) {
			if (existingRcsBotUserrole != rcsbotuserrole) {
				existingRcsBotUserrole.setId(rcsbotuserrole.getId());
				existingRcsBotUserrole.setUserRoleType(rcsbotuserrole.getUserRoleType());
				existingRcsBotUserrole.setRoleDescription(rcsbotuserrole.getRoleDescription());
				existingRcsBotUserrole.setCreateDate(rcsbotuserrole.getCreateDate());
				existingRcsBotUserrole.setLastUpdate(rcsbotuserrole.getLastUpdate());
				existingRcsBotUserrole.setValidFrom(rcsbotuserrole.getValidFrom());
				existingRcsBotUserrole.setValidTo(rcsbotuserrole.getValidTo());
			}
			rcsbotuserrole = rcsBotUserroleDAO.store(existingRcsBotUserrole);
		} else {
			rcsbotuserrole = rcsBotUserroleDAO.store(rcsbotuserrole);
		}
		rcsBotUserroleDAO.flush();
	}

	/**
	 * Load an existing RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public Set<RcsBotUserrole> loadRcsBotUserroles() {
		return rcsBotUserroleDAO.findAllRcsBotUserroles();
	}

	/**
	 */
	@Transactional
	public RcsBotUserrole findRcsBotUserroleByPrimaryKey(Integer id) {
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(id);
	}

	/**
	 * Return a count of all RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotUserroles() {
		return ((Long) rcsBotUserroleDAO.createQuerySingleResult("select count(o) from RcsBotUserrole o").getSingleResult()).intValue();
	}

	/**
	 * Return all RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public List<RcsBotUserrole> findAllRcsBotUserroles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotUserrole>(rcsBotUserroleDAO.findAllRcsBotUserroles(startResult, maxRows));
	}

	/**
	 * Delete an existing RcsBotUserrole entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotUserrole(RcsBotUserrole rcsbotuserrole) {
		rcsBotUserroleDAO.remove(rcsbotuserrole);
		rcsBotUserroleDAO.flush();
	}
}
