package com.kirusa.service;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUpdateDescDAO;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.response.BotDescription;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotUpdateDesc entities
 * 
 */

@Service("RcsBotUpdateDescService")

@Transactional
public class RcsBotUpdateDescServiceImpl implements RcsBotUpdateDescService {

	/**
	 * DAO injected by Spring that manages RcsBotUpdate entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUpdateDesc entities
	 * 
	 */
	@Autowired
	private RcsBotUpdateDescDAO rcsBotUpdateDescDAO;

	/**
	 * Instantiates a new RcsBotUpdateDescServiceImpl.
	 *
	 */
	public RcsBotUpdateDescServiceImpl() {
	}

	/**
	 * Delete an existing RcsBotUpdate entity
	 * 
	 */
	@Transactional
	public RcsBotUpdateDesc deleteRcsBotUpdateDescRcsBotUpdate(Integer rcsbotupdatedesc_id,
			Integer related_rcsbotupdate_id) {
		RcsBotUpdateDesc rcsbotupdatedesc = rcsBotUpdateDescDAO.findRcsBotUpdateDescByPrimaryKey(rcsbotupdatedesc_id,
				-1, -1);
		RcsBot related_rcsbotupdate = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbotupdate_id, -1, -1);

		rcsbotupdatedesc.setRcsBot(null);
		related_rcsbotupdate.getRcsBotUpdatesDesc().remove(rcsbotupdatedesc);
		rcsbotupdatedesc = rcsBotUpdateDescDAO.store(rcsbotupdatedesc);
		rcsBotUpdateDescDAO.flush();

		related_rcsbotupdate = rcsBotDAO.store(related_rcsbotupdate);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbotupdate);
		rcsBotDAO.flush();

		return rcsbotupdatedesc;
	}

	/**
	 * Save an existing RcsBotUpdateDesc entity
	 * 
	 */
	@Transactional
	public void saveRcsBotUpdateDesc(RcsBotUpdateDesc rcsbotupdatedesc) {
		RcsBotUpdateDesc existingRcsBotUpdateDesc = rcsBotUpdateDescDAO
				.findRcsBotUpdateDescByPrimaryKey(rcsbotupdatedesc.getId());

		if (existingRcsBotUpdateDesc != null) {
			if (existingRcsBotUpdateDesc != rcsbotupdatedesc) {
				if (rcsbotupdatedesc.getId() != null)
					existingRcsBotUpdateDesc.setId(rcsbotupdatedesc.getId());
				if (rcsbotupdatedesc.getDescription() != null)
					existingRcsBotUpdateDesc.setDescription(rcsbotupdatedesc.getDescription());
				if (rcsbotupdatedesc.getLang() != null)
					existingRcsBotUpdateDesc.setLang(rcsbotupdatedesc.getLang());
				existingRcsBotUpdateDesc.setCreateDate(rcsbotupdatedesc.getCreateDate());
				existingRcsBotUpdateDesc.setLastUpdate(rcsbotupdatedesc.getLastUpdate());
			}
			rcsbotupdatedesc = rcsBotUpdateDescDAO.store(existingRcsBotUpdateDesc);
		} else {
			rcsbotupdatedesc = rcsBotUpdateDescDAO.store(rcsbotupdatedesc);
		}
		rcsBotUpdateDescDAO.flush();
	}

	/**
	 * Return all RcsBotUpdateDesc entity
	 * 
	 */
	@Transactional
	public List<RcsBotUpdateDesc> findAllRcsBotUpdateDescs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotUpdateDesc>(
				rcsBotUpdateDescDAO.findAllRcsBotUpdateDescs(startResult, maxRows));
	}

	/**
	 * Delete an existing RcsBotUpdateDesc entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotUpdateDesc(RcsBotUpdateDesc rcsbotupdatedesc) {
		rcsBotUpdateDescDAO.remove(rcsbotupdatedesc);
		rcsBotUpdateDescDAO.flush();
	}

	/**
	 */
	@Transactional
	public RcsBotUpdateDesc findRcsBotUpdateDescByPrimaryKey(Integer id) {
		return rcsBotUpdateDescDAO.findRcsBotUpdateDescByPrimaryKey(id);
	}

	/**
	 * Load an existing RcsBotUpdateDesc entity
	 * 
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> loadRcsBotUpdateDescs() {
		return rcsBotUpdateDescDAO.findAllRcsBotUpdateDescs();
	}

	/**
	 * Save an existing RcsBotUpdate entity
	 * 
	 */

	/**
	 * Return a count of all RcsBotUpdateDesc entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotUpdateDescs() {
		return ((Long) rcsBotUpdateDescDAO.createQuerySingleResult("select count(o) from RcsBotUpdateDesc o")
				.getSingleResult()).intValue();
	}

	/**
	 * Return Most recent updated bot description
	 * 
	 */
	@Transactional
	public BotDescription findMostRecentUpdateByRcsBotId(Integer botId, String lang) {
		return rcsBotUpdateDescDAO.findMostRecentUpdateByRcsBotId(botId, lang);
	}

	@Override
	public RcsBotUpdateDesc saveRcsBotUpdateDescRcsBot(Integer id, RcsBot related_rcsbotupdate) {
		// TODO Auto-generated method stub
		return null;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotUpdateDescDAO.deletebyRcsBotId(botId);
	}
}
