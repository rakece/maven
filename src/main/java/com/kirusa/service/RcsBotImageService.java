
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotImage;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotImage entities
 * 
 */
public interface RcsBotImageService {

	/**
	* Save an existing RcsBotImage entity
	* 
	 */
	public void saveRcsBotImage(RcsBotImage rcsbotimage);

	/**
	 */
	public RcsBotImage findRcsBotImageByPrimaryKey(Integer id);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotImage deleteRcsBotImageRcsBot(Integer rcsbotimage_id, Integer related_rcsbot_id);

	/**
	* Return a count of all RcsBotImage entity
	* 
	 */
	public Integer countRcsBotImages();

	/**
	* Delete an existing RcsBotImage entity
	* 
	 */
	public void deleteRcsBotImage(RcsBotImage rcsbotimage_1);

	/**
	* Load an existing RcsBotImage entity
	* 
	 */
	public Set<RcsBotImage> loadRcsBotImages();

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotImage saveRcsBotImageRcsBot(Integer id_1, RcsBot related_rcsbot);

	/**
	* Return all RcsBotImage entity
	* 
	 */
	public List<RcsBotImage> findAllRcsBotImages(Integer startResult, Integer maxRows);
	public void deletebyRcsBotId(Integer botId);
}