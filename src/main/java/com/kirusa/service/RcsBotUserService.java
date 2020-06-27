
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;
import com.kirusa.domain.RcsCountryList;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotUser entities
 * 
 */
public interface RcsBotUserService {

	/**
	* Return all RcsBotUser entity
	* 
	 */
	public List<RcsBotUser> findAllRcsBotUsers(Integer startResult, Integer maxRows);

	/**
	 */
	public RcsBotUser findRcsBotUserByPrimaryKey(Integer id);

	/**
	* Delete an existing RcsBotUserrole entity
	* 
	 */
	public RcsBotUser deleteRcsBotUserRcsBotUserroles(Integer rcsbotuser_id, Integer related_rcsbotuserroles_id);

	/**
	* Save an existing RcsBotUser entity
	* 
	 */
	public RcsBotUser saveRcsBotUser(RcsBotUser rcsbotuser);

	/**
	* Delete an existing RcsBotUser entity
	* 
	 */
	public void deleteRcsBotUser(RcsBotUser rcsbotuser_1);

	/**
	* Load an existing RcsBotUser entity
	* 
	 */
	public Set<RcsBotUser> loadRcsBotUsers();

	/**
	* Delete an existing RcsCountryList entity
	* 
	 */
	public RcsBotUser deleteRcsBotUserRcsCountryList(Integer rcsbotuser_id_1, Integer related_rcscountrylist_id);

	/**
	* Save an existing RcsBotUserrole entity
	* 
	 */
	public RcsBotUser saveRcsBotUserRcsBotUserroles(Integer id_1, RcsBotUserrole related_rcsbotuserroles);

	/**
	* Return a count of all RcsBotUser entity
	* 
	 */
	public Integer countRcsBotUsers();

	/**
	* Save an existing RcsBotBilling entity
	* 
	 */
	public RcsBotUser saveRcsBotUserRcsBotBillings(Integer id_2, RcsBotBilling related_rcsbotbillings);

	/**
	* Delete an existing RcsBotBilling entity
	* 
	 */
	public RcsBotUser deleteRcsBotUserRcsBotBillings(Integer rcsbotuser_id_2, Integer related_rcsbotbillings_id);

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotUser saveRcsBotUserRcsBots(Integer id_3, RcsBot related_rcsbots);

	/**
	* Save an existing RcsCountryList entity
	* 
	 */
	public RcsBotUser saveRcsBotUserRcsCountryList(Integer id_4, RcsCountryList related_rcscountrylist);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotUser deleteRcsBotUserRcsBots(Integer rcsbotuser_id_3, Integer related_rcsbots_id);
}