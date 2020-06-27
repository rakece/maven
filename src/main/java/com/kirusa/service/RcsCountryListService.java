
package com.kirusa.service;

import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsCountryList;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsCountryList entities
 * 
 */
public interface RcsCountryListService {

	/**
	* Return a count of all RcsCountryList entity
	* 
	 */
	public Integer countRcsCountryLists();

	/**
	* Save an existing RcsBotUser entity
	* 
	 */
	public RcsCountryList saveRcsCountryListRcsBotUsers(Integer id, RcsBotUser related_rcsbotusers);

	/**
	* Load an existing RcsCountryList entity
	* 
	 */
	public Set<RcsCountryList> loadRcsCountryLists();

	/**
	* Save an existing RcsBotAvailable entity
	* 
	 */
	public RcsCountryList saveRcsCountryListRcsBotAvailables(Integer id_1, RcsBotAvailable related_rcsbotavailables);

	/**
	* Delete an existing RcsCountryList entity
	* 
	 */
	public void deleteRcsCountryList(RcsCountryList rcscountrylist);

	/**
	 */
	public RcsCountryList findRcsCountryListByPrimaryKey(Integer id_2);

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	 */
	public RcsCountryList deleteRcsCountryListRcsBotAvailables(Integer rcscountrylist_id, Integer related_rcsbotavailables_id);

	/**
	* Delete an existing RcsBotUser entity
	* 
	 */
	public RcsCountryList deleteRcsCountryListRcsBotUsers(Integer rcscountrylist_id_1, Integer related_rcsbotusers_id);

	/**
	* Return all RcsCountryList entity
	* 
	 */
	public List<RcsCountryList> findAllRcsCountryLists(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsCountryList entity
	* 
	 */
	public void saveRcsCountryList(RcsCountryList rcscountrylist_1);
}