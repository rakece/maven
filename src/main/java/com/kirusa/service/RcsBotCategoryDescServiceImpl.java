package com.kirusa.service;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCategoryDescDAO;

import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotCategoryDesc entities
 * 
 */

@Service("RcsBotCategoryDescService")

@Transactional
public class RcsBotCategoryDescServiceImpl implements RcsBotCategoryDescService {

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
	 * Instantiates a new RcsBotCategoryDescServiceImpl.
	 *
	 */
	public RcsBotCategoryDescServiceImpl() {
	}

	/**
	 * Save an existing RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public void saveRcsBotCategoryDesc(RcsBotCategoryDesc rcsbotcategorydesc) {
		RcsBotCategoryDesc existingRcsBotCategoryDesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc.getId());

		if (existingRcsBotCategoryDesc != null) {
			if (existingRcsBotCategoryDesc != rcsbotcategorydesc) {
				existingRcsBotCategoryDesc.setId(rcsbotcategorydesc.getId());
				existingRcsBotCategoryDesc.setDisplayName(rcsbotcategorydesc.getDisplayName());
				existingRcsBotCategoryDesc.setDescription(rcsbotcategorydesc.getDescription());
				existingRcsBotCategoryDesc.setLang(rcsbotcategorydesc.getLang());
				existingRcsBotCategoryDesc.setCreateDate(rcsbotcategorydesc.getCreateDate());
				existingRcsBotCategoryDesc.setLastUpdate(rcsbotcategorydesc.getLastUpdate());
			}
			rcsbotcategorydesc = rcsBotCategoryDescDAO.store(existingRcsBotCategoryDesc);
		} else {
			rcsbotcategorydesc = rcsBotCategoryDescDAO.store(rcsbotcategorydesc);
		}
		rcsBotCategoryDescDAO.flush();
	}

	/**
	 * Return a count of all RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotCategoryDescs() {
		return ((Long) rcsBotCategoryDescDAO.createQuerySingleResult("select count(o) from RcsBotCategoryDesc o").getSingleResult()).intValue();
	}

	/**
	 * Return all RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public List<RcsBotCategoryDesc> findAllRcsBotCategoryDescs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotCategoryDesc>(rcsBotCategoryDescDAO.findAllRcsBotCategoryDescs(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public RcsBotCategoryDesc saveRcsBotCategoryDescRcsBotCategory(Integer id, RcsBotCategory related_rcsbotcategory) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(id, -1, -1);
		RcsBotCategory existingrcsBotCategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotCategory != null) {
			existingrcsBotCategory.setId(related_rcsbotcategory.getId());
			existingrcsBotCategory.setCategoryName(related_rcsbotcategory.getCategoryName());
			existingrcsBotCategory.setCreateDate(related_rcsbotcategory.getCreateDate());
			existingrcsBotCategory.setLastUpdate(related_rcsbotcategory.getLastUpdate());
			existingrcsBotCategory.setImageName(related_rcsbotcategory.getImageName());
			related_rcsbotcategory = existingrcsBotCategory;
		}

		rcsbotcategorydesc.setRcsBotCategory(related_rcsbotcategory);
		related_rcsbotcategory.getRcsBotCategoryDescs().add(rcsbotcategorydesc);
		rcsbotcategorydesc = rcsBotCategoryDescDAO.store(rcsbotcategorydesc);
		rcsBotCategoryDescDAO.flush();

		related_rcsbotcategory = rcsBotCategoryDAO.store(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbotcategorydesc;
	}

	/**
	 * Load an existing RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public Set<RcsBotCategoryDesc> loadRcsBotCategoryDescs() {
		return rcsBotCategoryDescDAO.findAllRcsBotCategoryDescs();
	}

	/**
	 */
	@Transactional
	public RcsBotCategoryDesc findRcsBotCategoryDescByPrimaryKey(Integer id) {
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(id);
	}

	/**
	 * Delete an existing RcsBotCategoryDesc entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotCategoryDesc(RcsBotCategoryDesc rcsbotcategorydesc) {
		rcsBotCategoryDescDAO.remove(rcsbotcategorydesc);
		rcsBotCategoryDescDAO.flush();
	}

	/**
	 * Delete an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public RcsBotCategoryDesc deleteRcsBotCategoryDescRcsBotCategory(Integer rcsbotcategorydesc_id, Integer related_rcsbotcategory_id) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc_id, -1, -1);
		RcsBotCategory related_rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id, -1, -1);

		rcsbotcategorydesc.setRcsBotCategory(null);
		related_rcsbotcategory.getRcsBotCategoryDescs().remove(rcsbotcategorydesc);
		rcsbotcategorydesc = rcsBotCategoryDescDAO.store(rcsbotcategorydesc);
		rcsBotCategoryDescDAO.flush();

		related_rcsbotcategory = rcsBotCategoryDAO.store(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		rcsBotCategoryDAO.remove(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbotcategorydesc;
	}
	
	public List<RcsBotCategoryDesc> findRcsBotCategoryDescByLangAndById(int id,String lang,int startResult, int maxRows)
	{
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByLangAndById(id,lang,startResult,maxRows);

	}
}
