
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotTags;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotTags entities
 * 
 */
public interface RcsBotTagsService {

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotTags deleteRcsBotTagsRcsBot(Integer rcsbottags_id, Integer related_rcsbot_id);

	/**
	* Delete an existing RcsBotTags entity
	* 
	 */
	public void deleteRcsBotTags(RcsBotTags rcsbottags);

	/**
	* Return all RcsBotTags entity
	* 
	 */
	public List<RcsBotTags> findAllRcsBotTagss(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsBotCategory entity
	* 
	 */
	public RcsBotTags saveRcsBotTagsRcsBotCategory(Integer id, RcsBotCategory related_rcsbotcategory);

	/**
	 */
	public RcsBotTags findRcsBotTagsByPrimaryKey(Integer id_1);

	/**
	* Save an existing RcsBotTags entity
	* 
	 */
	public void saveRcsBotTags(RcsBotTags rcsbottags_1);

	/**
	* Load an existing RcsBotTags entity
	* 
	 */
	public Set<RcsBotTags> loadRcsBotTagss();

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotTags saveRcsBotTagsRcsBot(Integer id_2, RcsBot related_rcsbot);

	/**
	* Return a count of all RcsBotTags entity
	* 
	 */
	public Integer countRcsBotTagss();

	/**
	* Delete an existing RcsBotCategory entity
	* 
	 */
	public RcsBotTags deleteRcsBotTagsRcsBotCategory(Integer rcsbottags_id_1, Integer related_rcsbotcategory_id);
	public void deletebyRcsBotId(Integer botId);
}