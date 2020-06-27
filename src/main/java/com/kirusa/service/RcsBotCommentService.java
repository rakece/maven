
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotComment;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for RcsBotComment entities
 * 
 */
public interface RcsBotCommentService {

	/**
	* Return all RcsBotComment entity
	* 
	 */
	public List<RcsBotComment> findAllRcsBotComments(Integer startResult, Integer maxRows);

	/**
	 */
	public RcsBotComment findRcsBotCommentByPrimaryKey(Integer id);

	/**
	* Delete an existing RcsBot entity
	* 
	 */
	public RcsBotComment deleteRcsBotCommentRcsBot(Integer rcsbotcomment_id, Integer related_rcsbot_id);

	/**
	* Delete an existing RcsBotComment entity
	* 
	 */
	public void deleteRcsBotComment(RcsBotComment rcsbotcomment);

	/**
	* Load an existing RcsBotComment entity
	* 
	 */
	public Set<RcsBotComment> loadRcsBotComments();

	/**
	* Return a count of all RcsBotComment entity
	* 
	 */
	public Integer countRcsBotComments();

	/**
	* Save an existing RcsBotComment entity
	* 
	 */
	public void saveRcsBotComment(RcsBotComment rcsbotcomment_1);

	/**
	* Save an existing RcsBot entity
	* 
	 */
	public RcsBotComment saveRcsBotCommentRcsBot(Integer id_1, RcsBot related_rcsbot);
	public void deletebyRcsBotId(Integer botId);
}