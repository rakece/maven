
package com.kirusa.service;

import com.kirusa.domain.RcsBot;

import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.response.BotDescription;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotUpdateDesc entities
 * 
 */
public interface RcsBotUpdateDescService {

	/**
	* Save an existing RcsBotUpdate entity
	* 
	 */
	public RcsBotUpdateDesc saveRcsBotUpdateDescRcsBot(Integer id, RcsBot related_rcsbotupdate);

	/**
	* Delete an existing RcsBotUpdateDesc entity
	* 
	 */
	public void deleteRcsBotUpdateDesc(RcsBotUpdateDesc rcsbotupdatedesc);

	/**
	* Return a count of all RcsBotUpdateDesc entity
	* 
	 */
	public Integer countRcsBotUpdateDescs();

	/**
	 */
	public RcsBotUpdateDesc findRcsBotUpdateDescByPrimaryKey(Integer id_1);

	/**
	* Save an existing RcsBotUpdateDesc entity
	* 
	 */
	public void saveRcsBotUpdateDesc(RcsBotUpdateDesc rcsbotupdatedesc_1);

	/**
	* Load an existing RcsBotUpdateDesc entity
	* 
	 */
	public Set<RcsBotUpdateDesc> loadRcsBotUpdateDescs();

	/**
	* Delete an existing RcsBotUpdate entity
	* 
	 */
	public RcsBotUpdateDesc deleteRcsBotUpdateDescRcsBotUpdate(Integer rcsbotupdatedesc_id, Integer related_rcsbotupdate_id);

	/**
	* Return all RcsBotUpdateDesc entity
	* 
	 */
	public List<RcsBotUpdateDesc> findAllRcsBotUpdateDescs(Integer startResult, Integer maxRows);
	
	
	/**
	 * Return Most recent updated bot description
	 * 
	 */
	public BotDescription findMostRecentUpdateByRcsBotId(Integer botId, String lang);
	public void deletebyRcsBotId(Integer botId);
}