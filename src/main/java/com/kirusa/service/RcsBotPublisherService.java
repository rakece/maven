
package com.kirusa.service;

import com.kirusa.domain.RcsBotPublisher;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotPublisher entities
 * 
 */
public interface RcsBotPublisherService {

	/**
	* Return all RcsBotPublisher entity
	* 
	 */
	public List<RcsBotPublisher> findAllRcsBotPublishers(Integer startResult, Integer maxRows);

	/**
	 */
	public RcsBotPublisher findRcsBotPublisherByPrimaryKey(Integer id);

	/**
	* Load an existing RcsBotPublisher entity
	* 
	 */
	public Set<RcsBotPublisher> loadRcsBotPublishers();

	/**
	* Save an existing RcsBotPublisher entity
	* 
	 */
	public void saveRcsBotPublisher(RcsBotPublisher rcsbotpublisher);

	/**
	* Delete an existing RcsBotPublisher entity
	* 
	 */
	public void deleteRcsBotPublisher(RcsBotPublisher rcsbotpublisher_1);

	/**
	* Return a count of all RcsBotPublisher entity
	* 
	 */
	public Integer countRcsBotPublishers();
}