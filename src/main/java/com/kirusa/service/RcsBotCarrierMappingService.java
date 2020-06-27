
package com.kirusa.service;

import com.kirusa.domain.RcsBotCarrier;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.dto.RcsBotCarrierMappingDTO;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotCarrierMapping entities
 * 
 */
public interface RcsBotCarrierMappingService {

	/**
	* Return all RcsBotCarrierMapping entity
	* 
	 */
	public List<RcsBotCarrierMapping> findAllRcsBotCarrierMappings(Integer startResult, Integer maxRows);

	/**
	* Return a count of all RcsBotCarrierMapping entity
	* 
	 */
	public Integer countRcsBotCarrierMappings();

	/**
	* Save an existing RcsBotCarrierMapping entity
	* 
	 */
	public void saveRcsBotCarrierMapping(RcsBotCarrierMapping rcsbotcarriermapping);

	/**
	 */
	public RcsBotCarrierMapping findRcsBotCarrierMappingByPrimaryKey(Integer id);

	/**
	* Load an existing RcsBotCarrierMapping entity
	* 
	 */
	public Set<RcsBotCarrierMapping> loadRcsBotCarrierMappings();

	/**
	* Delete an existing RcsBotCarrierMapping entity
	* 
	 */
	public void deleteRcsBotCarrierMapping(RcsBotCarrierMapping rcsbotcarriermapping_1);
	
	public void deletebyRcsBotId(Integer botId);
	public List<RcsBotCarrier> findRcsBotCarrierByBotId(Integer rcs_bot_id, int startResult, int maxRows);
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotId(Integer rcsBotId);
	public List<RcsBotCarrierMappingDTO> findAllRcsBotCarrierMappingByRcsBot();
	
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotCarrierId(Integer rcsBotCarrierId);
}