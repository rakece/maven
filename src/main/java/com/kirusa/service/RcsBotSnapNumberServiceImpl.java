package com.kirusa.service;

import com.kirusa.dao.RcsBotSnapNumberDAO;

import com.kirusa.domain.RcsBotSnapNumber;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotSnapNumber entities
 * 
 */

@Service("RcsBotSnapNumberService")

@Transactional
public class RcsBotSnapNumberServiceImpl implements RcsBotSnapNumberService {

	/**
	 * DAO injected by Spring that manages RcsBotSnapNumber entities
	 * 
	 */
	@Autowired
	private RcsBotSnapNumberDAO rcsBotSnapNumberDAO;

	/**
	 * Instantiates a new RcsBotSnapNumberServiceImpl.
	 *
	 */
	public RcsBotSnapNumberServiceImpl() {
	}

	/**
	 * Load an existing RcsBotSnapNumber entity
	 * 
	 */
	@Transactional
	public Set<RcsBotSnapNumber> loadRcsBotSnapNumbers() {
		return rcsBotSnapNumberDAO.findAllRcsBotSnapNumbers();
	}

	/**
	 * Return all RcsBotSnapNumber entity
	 * 
	 */
	@Transactional
	public List<RcsBotSnapNumber> findAllRcsBotSnapNumbers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotSnapNumber>(rcsBotSnapNumberDAO.findAllRcsBotSnapNumbers(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBotSnapNumber entity
	 * 
	 */
	@Transactional
	public void saveRcsBotSnapNumber(RcsBotSnapNumber rcsbotsnapnumber) {
		RcsBotSnapNumber existingRcsBotSnapNumber = rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(rcsbotsnapnumber.getId());

		if (existingRcsBotSnapNumber != null) {
			if (existingRcsBotSnapNumber != rcsbotsnapnumber) {
				existingRcsBotSnapNumber.setId(rcsbotsnapnumber.getId());
				existingRcsBotSnapNumber.setRcsBotId(rcsbotsnapnumber.getRcsBotId());
				existingRcsBotSnapNumber.setSnapCallNumber(rcsbotsnapnumber.getSnapCallNumber());
				existingRcsBotSnapNumber.setSnapCountryCode(rcsbotsnapnumber.getSnapCountryCode());
				existingRcsBotSnapNumber.setSnapCountryIso(rcsbotsnapnumber.getSnapCountryIso());
				existingRcsBotSnapNumber.setSnapNumberDesc(rcsbotsnapnumber.getSnapNumberDesc());
				existingRcsBotSnapNumber.setCreateDate(rcsbotsnapnumber.getCreateDate());
				existingRcsBotSnapNumber.setLastUpdate(rcsbotsnapnumber.getLastUpdate());
			}
			rcsbotsnapnumber = rcsBotSnapNumberDAO.store(existingRcsBotSnapNumber);
		} else {
			rcsbotsnapnumber = rcsBotSnapNumberDAO.store(rcsbotsnapnumber);
		}
		rcsBotSnapNumberDAO.flush();
	}

	/**
	 * Delete an existing RcsBotSnapNumber entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotSnapNumber(RcsBotSnapNumber rcsbotsnapnumber) {
		rcsBotSnapNumberDAO.remove(rcsbotsnapnumber);
		rcsBotSnapNumberDAO.flush();
	}

	/**
	 * Return a count of all RcsBotSnapNumber entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotSnapNumbers() {
		return ((Long) rcsBotSnapNumberDAO.createQuerySingleResult("select count(o) from RcsBotSnapNumber o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public RcsBotSnapNumber findRcsBotSnapNumberByPrimaryKey(Integer id) {
		return rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(id);
	}
	
	public  Set<RcsBotSnapNumber> findRcsBotSnapNumberByRcsBotId(Integer rcsBotId) {
		return rcsBotSnapNumberDAO.findRcsBotSnapNumberByRcsBotId(rcsBotId);
	}
}
