package com.kirusa.service;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsCountryList;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotAvailable entities
 * 
 */

@Service("RcsBotAvailableService")

@Transactional
@Repository
public class RcsBotAvailableServiceImpl implements RcsBotAvailableService {

	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Instantiates a new RcsBotAvailableServiceImpl.
	 *
	 */
	public RcsBotAvailableServiceImpl() {
	}

	/**
	 * Delete an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public RcsBotAvailable deleteRcsBotAvailableRcsCountryList(Integer rcsbotavailable_id,
			Integer related_rcscountrylist_id) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable_id, -1,
				-1);
		RcsCountryList related_rcscountrylist = rcsCountryListDAO
				.findRcsCountryListByPrimaryKey(related_rcscountrylist_id, -1, -1);

		rcsbotavailable.setRcsCountryList(null);
		related_rcscountrylist.getRcsBotAvailables().remove(rcsbotavailable);
		rcsbotavailable = rcsBotAvailableDAO.store(rcsbotavailable);
		rcsBotAvailableDAO.flush();

		related_rcscountrylist = rcsCountryListDAO.store(related_rcscountrylist);
		rcsCountryListDAO.flush();

		rcsCountryListDAO.remove(related_rcscountrylist);
		rcsCountryListDAO.flush();

		return rcsbotavailable;
	}

	/**
	 * Save an existing RcsCountryList entity
	 * 
	 */
	@Transactional
	public RcsBotAvailable saveRcsBotAvailableRcsCountryList(Integer id, RcsCountryList related_rcscountrylist) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(id, -1, -1);
		RcsCountryList existingrcsCountryList = rcsCountryListDAO
				.findRcsCountryListByPrimaryKey(related_rcscountrylist.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsCountryList != null) {
			existingrcsCountryList.setId(related_rcscountrylist.getId());
			existingrcsCountryList.setCountryIsoName(related_rcscountrylist.getCountryIsoName());
			existingrcsCountryList.setCountryName(related_rcscountrylist.getCountryName());
			existingrcsCountryList.setCreateDate(related_rcscountrylist.getCreateDate());
			existingrcsCountryList.setLastUpdate(related_rcscountrylist.getLastUpdate());
			related_rcscountrylist = existingrcsCountryList;
		}

		rcsbotavailable.setRcsCountryList(related_rcscountrylist);
		related_rcscountrylist.getRcsBotAvailables().add(rcsbotavailable);
		rcsbotavailable = rcsBotAvailableDAO.store(rcsbotavailable);
		rcsBotAvailableDAO.flush();

		related_rcscountrylist = rcsCountryListDAO.store(related_rcscountrylist);
		rcsCountryListDAO.flush();

		return rcsbotavailable;
	}

	/**
	 * Return all RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public List<RcsBotAvailable> findAllRcsBotAvailables(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotAvailable>(
				rcsBotAvailableDAO.findAllRcsBotAvailables(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public void saveRcsBotAvailable(RcsBotAvailable rcsbotavailable) {
		RcsBotAvailable existingRcsBotAvailable = rcsBotAvailableDAO
				.findRcsBotAvailableByPrimaryKey(rcsbotavailable.getId());

		if (existingRcsBotAvailable != null) {
			if (existingRcsBotAvailable != rcsbotavailable) {
				if (rcsbotavailable.getId() != null)
					existingRcsBotAvailable.setId(rcsbotavailable.getId());
				existingRcsBotAvailable.setCreateDate(rcsbotavailable.getCreateDate());
				existingRcsBotAvailable.setLastUpdate(rcsbotavailable.getLastUpdate());
			}
			rcsbotavailable = rcsBotAvailableDAO.store(existingRcsBotAvailable);
		} else {
			rcsbotavailable = rcsBotAvailableDAO.store(rcsbotavailable);
		}
		rcsBotAvailableDAO.flush();
	}

	/**
	 * Return a count of all RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotAvailables() {
		return ((Long) rcsBotAvailableDAO.createQuerySingleResult("select count(o) from RcsBotAvailable o")
				.getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public RcsBotAvailable findRcsBotAvailableByPrimaryKey(Integer id) {
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(id);
	}

	/**
	 * Load an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public Set<RcsBotAvailable> loadRcsBotAvailables() {
		return rcsBotAvailableDAO.findAllRcsBotAvailables();
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotAvailable deleteRcsBotAvailableRcsBot(Integer rcsbotavailable_id, Integer related_rcsbot_id) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable_id, -1,
				-1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbotavailable.setRcsBot(null);
		related_rcsbot.getRcsBotAvailables().remove(rcsbotavailable);
		rcsbotavailable = rcsBotAvailableDAO.store(rcsbotavailable);
		rcsBotAvailableDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotavailable;
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotAvailable saveRcsBotAvailableRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(id, -1, -1);
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

		rcsbotavailable.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotAvailables().add(rcsbotavailable);
		rcsbotavailable = rcsBotAvailableDAO.store(rcsbotavailable);
		rcsBotAvailableDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotavailable;
	}

	/**
	 * Delete an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotAvailable(RcsBotAvailable rcsbotavailable) {
		rcsBotAvailableDAO.remove(rcsbotavailable);
		rcsBotAvailableDAO.flush();
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotAvailableDAO.deletebyRcsBotId(botId);
	}

	@Transactional
	public List<Integer>  findRcsBotAvailableByRcsBotCountryId(Integer rcs_bot_id) {
		return rcsBotAvailableDAO.findRcsBotAvailableByRcsBotCountryId(rcs_bot_id);
	}
}

