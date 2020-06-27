
package com.kirusa.service;

import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotUserrole entities
 * 
 */
public interface RcsBotUserroleService {

	/**
	* Return all RcsBotUserrole entity
	* 
	 */
	public List<RcsBotUserrole> findAllRcsBotUserroles(Integer startResult, Integer maxRows);

	/**
	* Delete an existing RcsBotUserrole entity
	* 
	 */
	public void deleteRcsBotUserrole(RcsBotUserrole rcsbotuserrole);

	/**
	 */
	public RcsBotUserrole findRcsBotUserroleByPrimaryKey(Integer id);

	/**
	* Delete an existing RcsBotUser entity
	* 
	 */
	public RcsBotUserrole deleteRcsBotUserroleRcsBotUser(Integer rcsbotuserrole_id, Integer related_rcsbotuser_id);

	/**
	* Save an existing RcsBotUserrole entity
	* 
	 */
	public void saveRcsBotUserrole(RcsBotUserrole rcsbotuserrole_1);

	/**
	* Return a count of all RcsBotUserrole entity
	* 
	 */
	public Integer countRcsBotUserroles();

	/**
	* Load an existing RcsBotUserrole entity
	* 
	 */
	public Set<RcsBotUserrole> loadRcsBotUserroles();

	/**
	* Save an existing RcsBotUser entity
	* 
	 */
	public RcsBotUserrole saveRcsBotUserroleRcsBotUser(Integer id_1, RcsBotUser related_rcsbotuser);
}