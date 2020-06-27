
package com.kirusa.service;

import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

/**
 * Spring service that handles CRUD requests for RcsBotCategoryDesc entities
 * 
 */
public interface RcsBotCategoryDescService {

	/**
	* Load an existing RcsBotCategoryDesc entity
	* 
	 */
	public Set<RcsBotCategoryDesc> loadRcsBotCategoryDescs();

	/**
	* Return a count of all RcsBotCategoryDesc entity
	* 
	 */
	public Integer countRcsBotCategoryDescs();

	/**
	* Return all RcsBotCategoryDesc entity
	* 
	 */
	public List<RcsBotCategoryDesc> findAllRcsBotCategoryDescs(Integer startResult, Integer maxRows);

	/**
	* Delete an existing RcsBotCategory entity
	* 
	 */
	public RcsBotCategoryDesc deleteRcsBotCategoryDescRcsBotCategory(Integer rcsbotcategorydesc_id, Integer related_rcsbotcategory_id);

	/**
	* Delete an existing RcsBotCategoryDesc entity
	* 
	 */
	public void deleteRcsBotCategoryDesc(RcsBotCategoryDesc rcsbotcategorydesc);

	/**
	* Save an existing RcsBotCategory entity
	* 
	 */
	public RcsBotCategoryDesc saveRcsBotCategoryDescRcsBotCategory(Integer id, RcsBotCategory related_rcsbotcategory);

	/**
	* Save an existing RcsBotCategoryDesc entity
	* 
	 */
	public void saveRcsBotCategoryDesc(RcsBotCategoryDesc rcsbotcategorydesc_1);

	/**
	 */
	public RcsBotCategoryDesc findRcsBotCategoryDescByPrimaryKey(Integer id_1);
	
	public List<RcsBotCategoryDesc> findRcsBotCategoryDescByLangAndById(int id,String lang,int startResult, int maxRows);
	
}