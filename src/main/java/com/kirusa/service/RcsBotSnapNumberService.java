
package com.kirusa.service;

import com.kirusa.domain.RcsBotSnapNumber;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotSnapNumber entities
 * 
 */
public interface RcsBotSnapNumberService {

	/**
	* Load an existing RcsBotSnapNumber entity
	* 
	 */
	public Set<RcsBotSnapNumber> loadRcsBotSnapNumbers();

	/**
	* Return all RcsBotSnapNumber entity
	* 
	 */
	public List<RcsBotSnapNumber> findAllRcsBotSnapNumbers(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsBotSnapNumber entity
	* 
	 */
	public void saveRcsBotSnapNumber(RcsBotSnapNumber rcsbotsnapnumber);

	/**
	* Delete an existing RcsBotSnapNumber entity
	* 
	 */
	public void deleteRcsBotSnapNumber(RcsBotSnapNumber rcsbotsnapnumber_1);

	/**
	* Return a count of all RcsBotSnapNumber entity
	* 
	 */
	public Integer countRcsBotSnapNumbers();

	/**
	 */
	public RcsBotSnapNumber findRcsBotSnapNumberByPrimaryKey(Integer id);
	
	public Set<RcsBotSnapNumber> findRcsBotSnapNumberByRcsBotId(Integer rcsBotId);
}