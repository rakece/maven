package com.kirusa.service;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCategoryDescDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotTagsDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.response.BotWebContent;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotCategory entities
 * 
 */

@Service("RcsBotCategoryService")

@Transactional
public class RcsBotCategoryServiceImpl implements RcsBotCategoryService {

	/**
	 * DAO injected by Spring that manages RcsBotCategory entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDAO rcsBotCategoryDAO;

	/**
	 * DAO injected by Spring that manages RcsBotCategoryDesc entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDescDAO rcsBotCategoryDescDAO;

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
	 * Instantiates a new RcsBotCategoryServiceImpl.
	 *
	 */
	public RcsBotCategoryServiceImpl() {
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotCategory saveRcsBotCategoryRcsBots(Integer id, RcsBot related_rcsbots) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(id, -1, -1);
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

		related_rcsbots.setRcsBotCategory(rcsbotcategory);
		rcsbotcategory.getRcsBots().add(related_rcsbots);
		related_rcsbots = rcsBotDAO.store(related_rcsbots);
		rcsBotDAO.flush();

		rcsbotcategory = rcsBotCategoryDAO.store(rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbotcategory;
	}

	/**
	 * Delete an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public RcsBotCategory deleteRcsBotCategoryRcsBotTagses(Integer rcsbotcategory_id, Integer related_rcsbottagses_id) {
		RcsBotTags related_rcsbottagses = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(related_rcsbottagses_id, -1, -1);

		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		related_rcsbottagses.setRcsBotCategory(null);
		rcsbotcategory.getRcsBotTagses().remove(related_rcsbottagses);

		rcsBotTagsDAO.remove(related_rcsbottagses);
		rcsBotTagsDAO.flush();

		return rcsbotcategory;
	}

	/**
	 * Load an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public Set<RcsBotCategory> loadRcsBotCategorys() {
		return rcsBotCategoryDAO.findAllRcsBotCategorys();
	}

	/**
	 * Save an existing RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public RcsBotCategory saveRcsBotCategoryRcsBotCategoryDescs(Integer id, RcsBotCategoryDesc related_rcsbotcategorydescs) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(id, -1, -1);
		RcsBotCategoryDesc existingrcsBotCategoryDescs = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(related_rcsbotcategorydescs.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotCategoryDescs != null) {
			existingrcsBotCategoryDescs.setId(related_rcsbotcategorydescs.getId());
			existingrcsBotCategoryDescs.setDisplayName(related_rcsbotcategorydescs.getDisplayName());
			existingrcsBotCategoryDescs.setDescription(related_rcsbotcategorydescs.getDescription());
			existingrcsBotCategoryDescs.setLang(related_rcsbotcategorydescs.getLang());
			existingrcsBotCategoryDescs.setCreateDate(related_rcsbotcategorydescs.getCreateDate());
			existingrcsBotCategoryDescs.setLastUpdate(related_rcsbotcategorydescs.getLastUpdate());
			related_rcsbotcategorydescs = existingrcsBotCategoryDescs;
		}

		related_rcsbotcategorydescs.setRcsBotCategory(rcsbotcategory);
		rcsbotcategory.getRcsBotCategoryDescs().add(related_rcsbotcategorydescs);
		related_rcsbotcategorydescs = rcsBotCategoryDescDAO.store(related_rcsbotcategorydescs);
		rcsBotCategoryDescDAO.flush();

		rcsbotcategory = rcsBotCategoryDAO.store(rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbotcategory;
	}

	/**
	 * Save an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public void saveRcsBotCategory(RcsBotCategory rcsbotcategory) {
		RcsBotCategory existingRcsBotCategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());

		if (existingRcsBotCategory != null) {
			if (existingRcsBotCategory != rcsbotcategory) {
				existingRcsBotCategory.setId(rcsbotcategory.getId());
				existingRcsBotCategory.setCategoryName(rcsbotcategory.getCategoryName());
				existingRcsBotCategory.setCreateDate(rcsbotcategory.getCreateDate());
				existingRcsBotCategory.setLastUpdate(rcsbotcategory.getLastUpdate());
				existingRcsBotCategory.setImageName(rcsbotcategory.getImageName());
			}
			rcsbotcategory = rcsBotCategoryDAO.store(existingRcsBotCategory);
		} else {
			rcsbotcategory = rcsBotCategoryDAO.store(rcsbotcategory);
		}
		rcsBotCategoryDAO.flush();
	}

	/**
	 * Delete an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotCategory(RcsBotCategory rcsbotcategory) {
		rcsBotCategoryDAO.remove(rcsbotcategory);
		rcsBotCategoryDAO.flush();
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotCategory deleteRcsBotCategoryRcsBots(Integer rcsbotcategory_id, Integer related_rcsbots_id) {
		RcsBot related_rcsbots = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots_id, -1, -1);

		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		related_rcsbots.setRcsBotCategory(null);
		rcsbotcategory.getRcsBots().remove(related_rcsbots);

		rcsBotDAO.remove(related_rcsbots);
		rcsBotDAO.flush();

		return rcsbotcategory;
	}

	/**
	 * Save an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public RcsBotCategory saveRcsBotCategoryRcsBotTagses(Integer id, RcsBotTags related_rcsbottagses) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(id, -1, -1);
		RcsBotTags existingrcsBotTagses = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(related_rcsbottagses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotTagses != null) {
			existingrcsBotTagses.setId(related_rcsbottagses.getId());
			existingrcsBotTagses.setCreateDate(related_rcsbottagses.getCreateDate());
			existingrcsBotTagses.setLastUpdate(related_rcsbottagses.getLastUpdate());
			related_rcsbottagses = existingrcsBotTagses;
		}

		related_rcsbottagses.setRcsBotCategory(rcsbotcategory);
		rcsbotcategory.getRcsBotTagses().add(related_rcsbottagses);
		related_rcsbottagses = rcsBotTagsDAO.store(related_rcsbottagses);
		rcsBotTagsDAO.flush();

		rcsbotcategory = rcsBotCategoryDAO.store(rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbotcategory;
	}

	/**
	 * Return a count of all RcsBotCategory entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotCategorys() {
		return ((Long) rcsBotCategoryDAO.createQuerySingleResult("select count(o) from RcsBotCategory o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public RcsBotCategory deleteRcsBotCategoryRcsBotCategoryDescs(Integer rcsbotcategory_id, Integer related_rcsbotcategorydescs_id) {
		RcsBotCategoryDesc related_rcsbotcategorydescs = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(related_rcsbotcategorydescs_id, -1, -1);

		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		related_rcsbotcategorydescs.setRcsBotCategory(null);
		rcsbotcategory.getRcsBotCategoryDescs().remove(related_rcsbotcategorydescs);

		rcsBotCategoryDescDAO.remove(related_rcsbotcategorydescs);
		rcsBotCategoryDescDAO.flush();

		return rcsbotcategory;
	}

	/**
	 */
	@Transactional
	public RcsBotCategory findRcsBotCategoryByPrimaryKey(Integer id) {
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(id);
	}

	/**
	 * Return all RcsBotCategory entity
	 * 
	 */
	@Transactional
	public List<RcsBotCategory> findAllRcsBotCategorys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotCategory>(rcsBotCategoryDAO.findAllRcsBotCategorys(startResult, maxRows));
	}
	
	public List<RcsBotCategory> findRcsBotCategoryByCategoryName(String categoryName_1, int startResult, int maxRows) 
	{
		return new java.util.ArrayList<RcsBotCategory>( rcsBotCategoryDAO.findRcsBotCategoryByCategoryName(categoryName_1,startResult, maxRows));
	}
	public List<BotWebContent> findRcsCategory(String lang)
	{
		return rcsBotCategoryDAO.findRcsCategory(lang);
	}
}
