
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotVideo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotVideo entities
 * 
 */
public interface RcsBotVideoService {

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotVideo saveRcsBotVideoRcsBot(Integer id, RcsBot related_rcsbot);

	/**
	* Return all RcsBotVideo entity
	* 
	 */
	public List<RcsBotVideo> findAllRcsBotVideos(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsBotVideo entity
	* 
	 */
	public void saveRcsBotVideo(RcsBotVideo rcsbotvideo);

	/**
	* Load an existing RcsBotVideo entity
	* 
	 */
	public Set<RcsBotVideo> loadRcsBotVideos();

	/**
	 */
	public RcsBotVideo findRcsBotVideoByPrimaryKey(Integer id_1);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotVideo deleteRcsBotVideoRcsBot(Integer rcsbotvideo_id, Integer related_rcsbot_id);

	/**
	* Delete an existing RcsBotVideo entity
	* 
	 */
	public void deleteRcsBotVideo(RcsBotVideo rcsbotvideo_1);

	/**
	* Return a count of all RcsBotVideo entity
	* 
	 */
	public Integer countRcsBotVideos();
	public void deletebyRcsBotId(Integer botId);
}