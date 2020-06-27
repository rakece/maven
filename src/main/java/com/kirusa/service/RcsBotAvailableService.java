
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.domain.RcsCountryList;

import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;

/**
 * Spring service that handles CRUD requests for RcsBotAvailable entities
 * 
 */
public interface RcsBotAvailableService {

	/**
	* Return a count of all RcsBotAvailable entity
	* 
	 */
	public Integer countRcsBotAvailables();

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotAvailable saveRcsBotAvailableRcsBot(Integer id, RcsBot related_rcsbot);

	/**
	* Delete an existing RcsCountryList entity
	* 
	 */
	public RcsBotAvailable deleteRcsBotAvailableRcsCountryList(Integer rcsbotavailable_id, Integer related_rcscountrylist_id);

	/**
	* Return all RcsBotAvailable entity
	* 
	 */
	public List<RcsBotAvailable> findAllRcsBotAvailables(Integer startResult, Integer maxRows);

	/**
	* Load an existing RcsBotAvailable entity
	* 
	 */
	public Set<RcsBotAvailable> loadRcsBotAvailables();

	/**
	* Save an existing RcsBotAvailable entity
	* 
	 */
	public void saveRcsBotAvailable(RcsBotAvailable rcsbotavailable);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotAvailable deleteRcsBotAvailableRcsBot(Integer rcsbotavailable_id_1, Integer related_rcsbot_id);

	/**
	* Save an existing RcsCountryList entity
	* 
	 */
	public RcsBotAvailable saveRcsBotAvailableRcsCountryList(Integer id_1, RcsCountryList related_rcscountrylist);

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	 */
	public void deleteRcsBotAvailable(RcsBotAvailable rcsbotavailable_1);

	/**
	 */
	public RcsBotAvailable findRcsBotAvailableByPrimaryKey(Integer id_2);
	public void deletebyRcsBotId(Integer botId) ;
	public List<Integer> findRcsBotAvailableByRcsBotCountryId(Integer countryId) ;
	
}