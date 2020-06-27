package com.kirusa.service;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotTagsDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotTags;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotTags entities
 * 
 */

@Service("RcsBotTagsService")

@Transactional
public class RcsBotTagsServiceImpl implements RcsBotTagsService {

	/**
	 * DAO injected by Spring that manages RcsBotCategory entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDAO rcsBotCategoryDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotTags entities
	 * 
	 */
	@Autowired
	private RcsBotTagsDAO rcsBotTagsDAO;

	/**
	 * Instantiates a new RcsBotTagsServiceImpl.
	 *
	 */
	public RcsBotTagsServiceImpl() {
	}

	/**
	 * Save an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public void saveRcsBotTags(RcsBotTags rcsbottags) {
		RcsBotTags existingRcsBotTags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags.getId());

		if (existingRcsBotTags != null) {
			if (existingRcsBotTags != rcsbottags) {
				if (rcsbottags.getId() != null)
					existingRcsBotTags.setId(rcsbottags.getId());
				existingRcsBotTags.setCreateDate(rcsbottags.getCreateDate());
				existingRcsBotTags.setLastUpdate(rcsbottags.getLastUpdate());
			}
			rcsbottags = rcsBotTagsDAO.store(existingRcsBotTags);
		} else {
			rcsbottags = rcsBotTagsDAO.store(rcsbottags);
		}
		rcsBotTagsDAO.flush();
	}

	/**
	 * Load an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public Set<RcsBotTags> loadRcsBotTagss() {
		return rcsBotTagsDAO.findAllRcsBotTagss();
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotTags deleteRcsBotTagsRcsBot(Integer rcsbottags_id, Integer related_rcsbot_id) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags_id, -1, -1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbottags.setRcsBot(null);
		related_rcsbot.getRcsBotTagses().remove(rcsbottags);
		rcsbottags = rcsBotTagsDAO.store(rcsbottags);
		rcsBotTagsDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbottags;
	}

	/**
	 * Save an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public RcsBotTags saveRcsBotTagsRcsBotCategory(Integer id, RcsBotCategory related_rcsbotcategory) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(id, -1, -1);
		RcsBotCategory existingrcsBotCategory = rcsBotCategoryDAO
				.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotCategory != null) {
			existingrcsBotCategory.setId(related_rcsbotcategory.getId());
			existingrcsBotCategory.setCategoryName(related_rcsbotcategory.getCategoryName());
			existingrcsBotCategory.setCreateDate(related_rcsbotcategory.getCreateDate());
			existingrcsBotCategory.setLastUpdate(related_rcsbotcategory.getLastUpdate());
			existingrcsBotCategory.setImageName(related_rcsbotcategory.getImageName());
			related_rcsbotcategory = existingrcsBotCategory;
		}

		rcsbottags.setRcsBotCategory(related_rcsbotcategory);
		related_rcsbotcategory.getRcsBotTagses().add(rcsbottags);
		rcsbottags = rcsBotTagsDAO.store(rcsbottags);
		rcsBotTagsDAO.flush();

		related_rcsbotcategory = rcsBotCategoryDAO.store(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbottags;
	}

	/**
	 */
	@Transactional
	public RcsBotTags findRcsBotTagsByPrimaryKey(Integer id) {
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(id);
	}

	/**
	 * Return a count of all RcsBotTags entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotTagss() {
		return ((Long) rcsBotTagsDAO.createQuerySingleResult("select count(o) from RcsBotTags o").getSingleResult())
				.intValue();
	}

	/**
	 * Return all RcsBotTags entity
	 * 
	 */
	@Transactional
	public List<RcsBotTags> findAllRcsBotTagss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotTags>(rcsBotTagsDAO.findAllRcsBotTagss(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotTags saveRcsBotTagsRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(id, -1, -1);
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

		rcsbottags.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotTagses().add(rcsbottags);
		rcsbottags = rcsBotTagsDAO.store(rcsbottags);
		rcsBotTagsDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbottags;
	}

	/**
	 * Delete an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public RcsBotTags deleteRcsBotTagsRcsBotCategory(Integer rcsbottags_id, Integer related_rcsbotcategory_id) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags_id, -1, -1);
		RcsBotCategory related_rcsbotcategory = rcsBotCategoryDAO
				.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id, -1, -1);

		rcsbottags.setRcsBotCategory(null);
		related_rcsbotcategory.getRcsBotTagses().remove(rcsbottags);
		rcsbottags = rcsBotTagsDAO.store(rcsbottags);
		rcsBotTagsDAO.flush();

		related_rcsbotcategory = rcsBotCategoryDAO.store(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		rcsBotCategoryDAO.remove(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbottags;
	}

	/**
	 * Delete an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotTags(RcsBotTags rcsbottags) {
		rcsBotTagsDAO.remove(rcsbottags);
		rcsBotTagsDAO.flush();
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotTagsDAO.deletebyRcsBotId(botId);
	}
}
