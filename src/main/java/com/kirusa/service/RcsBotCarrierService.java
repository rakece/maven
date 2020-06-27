
package com.kirusa.service;

import com.kirusa.domain.RcsBotCarrier;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotCarrier entities
 * 
 */
public interface RcsBotCarrierService {

	/**
	* Load an existing RcsBotCarrier entity
	* 
	 */
	public Set<RcsBotCarrier> loadRcsBotCarriers();

	/**
	 */
	public RcsBotCarrier findRcsBotCarrierByPrimaryKey(Integer id);

	/**
	* Return a count of all RcsBotCarrier entity
	* 
	 */
	public Integer countRcsBotCarriers();

	/**
	* Return all RcsBotCarrier entity
	* 
	 */
	public List<RcsBotCarrier> findAllRcsBotCarriers(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsBotCarrier entity
	* 
	 */
	public void saveRcsBotCarrier(RcsBotCarrier rcsbotcarrier);

	/**
	* Delete an existing RcsBotCarrier entity
	* 
	 */
	public void deleteRcsBotCarrier(RcsBotCarrier rcsbotcarrier_1);
}