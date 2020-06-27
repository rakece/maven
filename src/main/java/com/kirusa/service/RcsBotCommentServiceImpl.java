package com.kirusa.service;

import com.kirusa.dao.RcsBotCommentDAO;
import com.kirusa.dao.RcsBotDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotComment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotComment entities
 * 
 */

@Service("RcsBotCommentService")

@Transactional
public class RcsBotCommentServiceImpl implements RcsBotCommentService {

	/**
	 * DAO injected by Spring that manages RcsBotComment entities
	 * 
	 */
	@Autowired
	private RcsBotCommentDAO rcsBotCommentDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * Instantiates a new RcsBotCommentServiceImpl.
	 *
	 */
	public RcsBotCommentServiceImpl() {
	}

	/**
	 * Delete an existing RcsBotComment entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotComment(RcsBotComment rcsbotcomment) {
		rcsBotCommentDAO.remove(rcsbotcomment);
		rcsBotCommentDAO.flush();
	}

	/**
	 */
	@Transactional
	public RcsBotComment findRcsBotCommentByPrimaryKey(Integer id) {
		return rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(id);
	}

	/**
	 * Load an existing RcsBotComment entity
	 * 
	 */
	@Transactional
	public Set<RcsBotComment> loadRcsBotComments() {
		return rcsBotCommentDAO.findAllRcsBotComments();
	}

	/**
	 * Return a count of all RcsBotComment entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotComments() {
		return ((Long) rcsBotCommentDAO.createQuerySingleResult("select count(o) from RcsBotComment o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotComment saveRcsBotCommentRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotComment rcsbotcomment = rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(id, -1, -1);
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

		rcsbotcomment.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotComments().add(rcsbotcomment);
		rcsbotcomment = rcsBotCommentDAO.store(rcsbotcomment);
		rcsBotCommentDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotcomment;
	}

	/**
	 * Save an existing RcsBotComment entity
	 * 
	 */
	@Transactional
	public void saveRcsBotComment(RcsBotComment rcsbotcomment) {
		RcsBotComment existingRcsBotComment = rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment.getId());

		if (existingRcsBotComment != null) {
			if (existingRcsBotComment != rcsbotcomment) {
				existingRcsBotComment.setId(rcsbotcomment.getId());
				existingRcsBotComment.setRcsBotUserId(rcsbotcomment.getRcsBotUserId());
				existingRcsBotComment.setCommenttext(rcsbotcomment.getCommenttext());
				existingRcsBotComment.setStatus(rcsbotcomment.getStatus());
				existingRcsBotComment.setRating(rcsbotcomment.getRating());
				existingRcsBotComment.setPositiveCount(rcsbotcomment.getPositiveCount());
				existingRcsBotComment.setNegativeCount(rcsbotcomment.getNegativeCount());
				existingRcsBotComment.setLang(rcsbotcomment.getLang());
				existingRcsBotComment.setCreateDate(rcsbotcomment.getCreateDate());
				existingRcsBotComment.setLastUpdate(rcsbotcomment.getLastUpdate());
			}
			rcsbotcomment = rcsBotCommentDAO.store(existingRcsBotComment);
		} else {
			rcsbotcomment = rcsBotCommentDAO.store(rcsbotcomment);
		}
		rcsBotCommentDAO.flush();
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotComment deleteRcsBotCommentRcsBot(Integer rcsbotcomment_id, Integer related_rcsbot_id) {
		RcsBotComment rcsbotcomment = rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment_id, -1, -1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbotcomment.setRcsBot(null);
		related_rcsbot.getRcsBotComments().remove(rcsbotcomment);
		rcsbotcomment = rcsBotCommentDAO.store(rcsbotcomment);
		rcsBotCommentDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotcomment;
	}

	/**
	 * Return all RcsBotComment entity
	 * 
	 */
	@Transactional
	public List<RcsBotComment> findAllRcsBotComments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotComment>(rcsBotCommentDAO.findAllRcsBotComments(startResult, maxRows));
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotCommentDAO.deletebyRcsBotId(botId);
	}
}
