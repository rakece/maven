
package com.kirusa.service;

import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotComment;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotImage;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotVideo;

/**
 * Spring service that handles CRUD requests for RcsBot entities
 * 
 */
public interface RcsBotService {

	/**
	* Delete an existing RcsBotUpdate entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotUpdatesDesc(Integer rcsbot_id, Integer related_rcsbotupdates_id);

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotAvailables(Integer rcsbot_id_1, Integer related_rcsbotavailables_id);

	/**
	* Save an existing RcsBotDesc entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotDescs(Integer id, RcsBotDesc related_rcsbotdescs);

	/**
	* Save an existing RcsBotBilling entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotBillings(Integer id_1, RcsBotBilling related_rcsbotbillings);

	/**
	* Save an existing RcsBotCategory entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotCategory(Integer id_2, RcsBotCategory related_rcsbotcategory);

	/**
	* Save an existing RcsBotUser entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotUser(Integer id_3, RcsBotUser related_rcsbotuser);

	/**
	* Delete an existing RcsBotComment entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotComments(Integer rcsbot_id_2, Integer related_rcsbotcomments_id);

	/**
	* Delete an existing RcsBotTags entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotTagses(Integer rcsbot_id_3, Integer related_rcsbottagses_id);

	/**
	* Save an existing RcsBotComment entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotComments(Integer id_4, RcsBotComment related_rcsbotcomments);

	/**
	* Load an existing RcsBot entity
	* 
	 */
	public Set<RcsBot> loadRcsBots();

	/**
	* Return all RcsBot entity
	* 
	 */
	public List<RcsBot> findAllRcsBots(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsBotAvailable entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotAvailables(Integer id_5, RcsBotAvailable related_rcsbotavailables);

	/**
	* Delete an existing RcsBotDesc entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotDescs(Integer rcsbot_id_4, Integer related_rcsbotdescs_id);

	/**
	* Save an existing RcsBotTags entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotTagses(Integer id_6, RcsBotTags related_rcsbottagses);

	/**
	* Delete an existing RcsBotVideo entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotVideos(Integer rcsbot_id_5, Integer related_rcsbotvideos_id);

	/**
	* Save an existing RcsBotImage entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotImages(Integer id_7, RcsBotImage related_rcsbotimages);

	/**
	* Delete an existing RcsBotCategory entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotCategory(Integer rcsbot_id_6, Integer related_rcsbotcategory_id);

	/**
	* Delete an existing RcsBotBilling entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotBillings(Integer rcsbot_id_7, Integer related_rcsbotbillings_id);

	/**
	* Save an existing RcsBotVideo entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotVideos(Integer id_8, RcsBotVideo related_rcsbotvideos);

	/**
	 */
	public RcsBot findRcsBotByPrimaryKey(Integer id_9);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public void deleteRcsBot(RcsBot rcsbot);

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBot saveRcsBot(RcsBot rcsbot_1);

	/**
	* Save an existing RcsBotUpdate entity
	* 
	 */
	public RcsBot saveRcsBotRcsBotUpdates(Integer id_10, RcsBotUpdateDesc related_rcsbotupdates);

	/**
	* Delete an existing RcsBotUser entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotUser(Integer rcsbot_id_8, Integer related_rcsbotuser_id);

	/**
	* Delete an existing RcsBotImage entity
	* 
	 */
	public RcsBot deleteRcsBotRcsBotImages(Integer rcsbot_id_9, Integer related_rcsbotimages_id);

	/**
	* Return a count of all RcsBot entity
	* 
	 */
	public Integer countRcsBots();
	public Set<RcsBot> findRcsBotByRcsBotCategoryId(Integer rcsBotCategoryId, int startResult, int maxRows) throws DataAccessException;
	public List<RcsBot> findAllRcsBotsByUser(Integer userId,Integer startResult, Integer maxRows);
	
}
