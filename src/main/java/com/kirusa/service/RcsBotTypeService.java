
package com.kirusa.service;

import com.kirusa.domain.RcsBotType;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotType entities
 * 
 */
public interface RcsBotTypeService {

	/**
	* Return a count of all RcsBotType entity
	* 
	 */
	public Integer countRcsBotTypes();

	/**
	* Save an existing RcsBotType entity
	* 
	 */
	public void saveRcsBotType(RcsBotType rcsbottype);

	/**
	* Return all RcsBotType entity
	* 
	 */
	public List<RcsBotType> findAllRcsBotTypes(Integer startResult, Integer maxRows);

	/**
	 */
	public RcsBotType findRcsBotTypeByPrimaryKey(Integer id);

	/**
	* Load an existing RcsBotType entity
	* 
	 */
	public Set<RcsBotType> loadRcsBotTypes();

	/**
	* Delete an existing RcsBotType entity
	* 
	 */
	public void deleteRcsBotType(RcsBotType rcsbottype_1);
	
	public List<RcsBotType> findRcsBotByTypes(String type,Integer startResult, Integer maxRows);
	public List<RcsBotType>  findRcsBotTypeByBotId(Integer id);
	public void deletebyRcsBotId(Integer botId);
}