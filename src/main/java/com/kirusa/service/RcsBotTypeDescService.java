
package com.kirusa.service;

import com.kirusa.domain.RcsBotTypeDesc;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotTypeDesc entities
 * 
 */
public interface RcsBotTypeDescService {

	/**
	* Return a count of all RcsBotTypeDesc entity
	* 
	 */
	public Integer countRcsBotTypeDescs();

	/**
	* Delete an existing RcsBotTypeDesc entity
	* 
	 */
	public void deleteRcsBotTypeDesc(RcsBotTypeDesc rcsbottypedesc);

	/**
	* Return all RcsBotTypeDesc entity
	* 
	 */
	public List<RcsBotTypeDesc> findAllRcsBotTypeDescs(Integer startResult, Integer maxRows);

	/**
	 */
	public RcsBotTypeDesc findRcsBotTypeDescByPrimaryKey(Integer id);

	/**
	* Save an existing RcsBotTypeDesc entity
	* 
	 */
	public void saveRcsBotTypeDesc(RcsBotTypeDesc rcsbottypedesc_1);

	/**
	* Load an existing RcsBotTypeDesc entity
	* 
	 */
	public Set<RcsBotTypeDesc> loadRcsBotTypeDescs();
	
	public List<RcsBotTypeDesc> findRcsBotTypeDescByNameAndLang(String name,String lang,int startResult, int maxRows);
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLang(String lang);

}