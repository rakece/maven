
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotBilling entities
 * 
 */
public interface RcsBotBillingService {

	/**
	* Return all RcsBotBilling entity
	* 
	 */
	public List<RcsBotBilling> findAllRcsBotBillings(Integer startResult, Integer maxRows);

	/**
	* Save an existing RcsBotBilling entity
	* 
	 */
	public void saveRcsBotBilling(RcsBotBilling rcsbotbilling);

	/**
	* Delete an existing RcsBotBilling entity
	* 
	 */
	public void deleteRcsBotBilling(RcsBotBilling rcsbotbilling_1);

	/**
	* Delete an existing RcsBotUser entity
	* 
	 */
	public RcsBotBilling deleteRcsBotBillingRcsBotUser(Integer rcsbotbilling_id, Integer related_rcsbotuser_id);

	/**
	 */
	public RcsBotBilling findRcsBotBillingByPrimaryKey(Integer id);

	/**
	* Save an existing RcsBotUser entity
	* 
	 */
	public RcsBotBilling saveRcsBotBillingRcsBotUser(Integer id_1, RcsBotUser related_rcsbotuser);

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotBilling saveRcsBotBillingRcsBot(Integer id_2, RcsBot related_rcsbot);

	/**
	* Load an existing RcsBotBilling entity
	* 
	 */
	public Set<RcsBotBilling> loadRcsBotBillings();

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotBilling deleteRcsBotBillingRcsBot(Integer rcsbotbilling_id_1, Integer related_rcsbot_id);

	/**
	* Return a count of all RcsBotBilling entity
	* 
	 */
	public Integer countRcsBotBillings();
	public void deletebyRcsBotId(Integer botId) ;
}