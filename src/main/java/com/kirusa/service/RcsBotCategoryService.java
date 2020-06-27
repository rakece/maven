
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.response.BotWebContent;

import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;

/**
 * Spring service that handles CRUD requests for RcsBotCategory entities
 * 
 */
public interface RcsBotCategoryService {

	/**
	 */
	public RcsBotCategory findRcsBotCategoryByPrimaryKey(Integer id);

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotCategory saveRcsBotCategoryRcsBots(Integer id_1, RcsBot related_rcsbots);

	/**
	* Delete an existing RcsBotCategory entity
	* 
	 */
	public void deleteRcsBotCategory(RcsBotCategory rcsbotcategory);

	/**
	* Load an existing RcsBotCategory entity
	* 
	 */
	public Set<RcsBotCategory> loadRcsBotCategorys();

	/**
	* Delete an existing RcsBotCategoryDesc entity
	* 
	 */
	public RcsBotCategory deleteRcsBotCategoryRcsBotCategoryDescs(Integer rcsbotcategory_id, Integer related_rcsbotcategorydescs_id);

	/**
	* Save an existing RcsBotCategoryDesc entity
	* 
	 */
	public RcsBotCategory saveRcsBotCategoryRcsBotCategoryDescs(Integer id_2, RcsBotCategoryDesc related_rcsbotcategorydescs);

	/**
	* Return a count of all RcsBotCategory entity
	* 
	 */
	public Integer countRcsBotCategorys();

	/**
	* Save an existing RcsBotTags entity
	* 
	 */
	public RcsBotCategory saveRcsBotCategoryRcsBotTagses(Integer id_3, RcsBotTags related_rcsbottagses);

	/**
	* Return all RcsBotCategory entity
	* 
	 */
	public List<RcsBotCategory> findAllRcsBotCategorys(Integer startResult, Integer maxRows);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotCategory deleteRcsBotCategoryRcsBots(Integer rcsbotcategory_id_1, Integer related_rcsbots_id);

	/**
	* Delete an existing RcsBotTags entity
	* 
	 */
	public RcsBotCategory deleteRcsBotCategoryRcsBotTagses(Integer rcsbotcategory_id_2, Integer related_rcsbottagses_id);

	/**
	* Save an existing RcsBotCategory entity
	* 
	 */
	public void saveRcsBotCategory(RcsBotCategory rcsbotcategory_1);
	
	public List<RcsBotCategory> findRcsBotCategoryByCategoryName(String categoryName_1, int startResult, int maxRows) throws DataAccessException;
	public List<BotWebContent> findRcsCategory(String lang);
}