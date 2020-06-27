package com.kirusa.service;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotDescDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotDesc;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotDesc entities
 * 
 */

@Service("RcsBotDescService")

@Transactional
public class RcsBotDescServiceImpl implements RcsBotDescService {

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotDesc entities
	 * 
	 */
	@Autowired
	private RcsBotDescDAO rcsBotDescDAO;

	/**
	 * Instantiates a new RcsBotDescServiceImpl.
	 *
	 */
	public RcsBotDescServiceImpl() {
	}

	/**
	 * Save an existing RcsBotDesc entity
	 * 
	 */
	@Transactional
	public void saveRcsBotDesc(RcsBotDesc rcsbotdesc) {
		RcsBotDesc existingRcsBotDesc = rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc.getId());

		if (existingRcsBotDesc != null) {
			if (existingRcsBotDesc != rcsbotdesc) {
				if (rcsbotdesc.getId() != null)
					existingRcsBotDesc.setId(rcsbotdesc.getId());
				if (rcsbotdesc.getBotName() != null)
					existingRcsBotDesc.setBotName(rcsbotdesc.getBotName());
				if (rcsbotdesc.getBotSummary() != null)
					existingRcsBotDesc.setBotSummary(rcsbotdesc.getBotSummary());
				if (rcsbotdesc.getDisplayName() != null)
					existingRcsBotDesc.setDisplayName(rcsbotdesc.getDisplayName());
				if (rcsbotdesc.getDescription() != null)
					existingRcsBotDesc.setDescription(rcsbotdesc.getDescription());
				if (rcsbotdesc.getLang() != null)
					existingRcsBotDesc.setLang(rcsbotdesc.getLang());
				existingRcsBotDesc.setCreateDate(rcsbotdesc.getCreateDate());
				existingRcsBotDesc.setLastUpdate(rcsbotdesc.getLastUpdate());
			}
			rcsbotdesc = rcsBotDescDAO.store(existingRcsBotDesc);
		} else {
			rcsbotdesc = rcsBotDescDAO.store(rcsbotdesc);
		}
		rcsBotDescDAO.flush();
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotDesc saveRcsBotDescRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotDesc rcsbotdesc = rcsBotDescDAO.findRcsBotDescByPrimaryKey(id, -1, -1);
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

		rcsbotdesc.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotDescs().add(rcsbotdesc);
		rcsbotdesc = rcsBotDescDAO.store(rcsbotdesc);
		rcsBotDescDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotdesc;
	}

	/**
	 * Return all RcsBotDesc entity
	 * 
	 */
	@Transactional
	public List<RcsBotDesc> findAllRcsBotDescs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotDesc>(rcsBotDescDAO.findAllRcsBotDescs(startResult, maxRows));
	}

	/**
	 * Delete an existing RcsBotDesc entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotDesc(RcsBotDesc rcsbotdesc) {
		rcsBotDescDAO.remove(rcsbotdesc);
		rcsBotDescDAO.flush();
	}

	/**
	 * Load an existing RcsBotDesc entity
	 * 
	 */
	@Transactional
	public Set<RcsBotDesc> loadRcsBotDescs() {
		return rcsBotDescDAO.findAllRcsBotDescs();
	}

	/**
	 */
	@Transactional
	public RcsBotDesc findRcsBotDescByPrimaryKey(Integer id) {
		return rcsBotDescDAO.findRcsBotDescByPrimaryKey(id);
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotDesc deleteRcsBotDescRcsBot(Integer rcsbotdesc_id, Integer related_rcsbot_id) {
		RcsBotDesc rcsbotdesc = rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc_id, -1, -1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbotdesc.setRcsBot(null);
		related_rcsbot.getRcsBotDescs().remove(rcsbotdesc);
		rcsbotdesc = rcsBotDescDAO.store(rcsbotdesc);
		rcsBotDescDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotdesc;
	}

	/**
	 * Return a count of all RcsBotDesc entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotDescs() {
		return ((Long) rcsBotDescDAO.createQuerySingleResult("select count(o) from RcsBotDesc o").getSingleResult())
				.intValue();
	}

	public Set<RcsBotDesc> findRcsBotDescByLangAndSummary(String locale, String key, int startResult, int maxRows) {
		return rcsBotDescDAO.findRcsBotDescByLangAndSummary(locale, key, startResult, maxRows);

	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotDescDAO.deletebyRcsBotId(botId);
	}
}
