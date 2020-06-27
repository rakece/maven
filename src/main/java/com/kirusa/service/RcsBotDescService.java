
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotDesc;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

/**
 * Spring service that handles CRUD requests for RcsBotDesc entities
 * 
 */
public interface RcsBotDescService {

	/**
	* Load an existing RcsBotDesc entity
	* 
	 */
	public Set<RcsBotDesc> loadRcsBotDescs();

	/**
	* Return all RcsBotDesc entity
	* 
	 */
	public List<RcsBotDesc> findAllRcsBotDescs(Integer startResult, Integer maxRows);

	/**
	 */
	public RcsBotDesc findRcsBotDescByPrimaryKey(Integer id);

	/**
	* Save an existing RcsBotDesc entity
	* 
	 */
	public void saveRcsBotDesc(RcsBotDesc rcsbotdesc);

	/**
	* Return a count of all RcsBotDesc entity
	* 
	 */
	public Integer countRcsBotDescs();

	/**
	* Delete an existing RcsBotDesc entity
	* 
	 */
	public void deleteRcsBotDesc(RcsBotDesc rcsbotdesc_1);

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotDesc saveRcsBotDescRcsBot(Integer id_1, RcsBot related_rcsbot);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotDesc deleteRcsBotDescRcsBot(Integer rcsbotdesc_id, Integer related_rcsbot_id);
	
	public Set<RcsBotDesc> findRcsBotDescByLangAndSummary(String locale, String key,int startResult, int maxRows);
	public void deletebyRcsBotId(Integer botId);
	
}