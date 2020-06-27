package com.kirusa.service;

import com.kirusa.dao.RcsBotCarrierMappingDAO;
import com.kirusa.domain.RcsBotCarrier;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.dto.RcsBotCarrierMappingDTO;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotCarrierMapping entities
 * 
 */

@Service("RcsBotCarrierMappingService")

@Transactional
public class RcsBotCarrierMappingServiceImpl implements RcsBotCarrierMappingService {

	/**
	 * DAO injected by Spring that manages RcsBotCarrierMapping entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierMappingDAO rcsBotCarrierMappingDAO;

	/**
	 * Instantiates a new RcsBotCarrierMappingServiceImpl.
	 *
	 */
	public RcsBotCarrierMappingServiceImpl() {
	}

	/**
	 * Return all RcsBotCarrierMapping entity
	 * 
	 */
	@Transactional
	public List<RcsBotCarrierMapping> findAllRcsBotCarrierMappings(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotCarrierMapping>(rcsBotCarrierMappingDAO.findAllRcsBotCarrierMappings(startResult, maxRows));
	}

	/**
	 * Return a count of all RcsBotCarrierMapping entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotCarrierMappings() {
		return ((Long) rcsBotCarrierMappingDAO.createQuerySingleResult("select count(o) from RcsBotCarrierMapping o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing RcsBotCarrierMapping entity
	 * 
	 */
	@Transactional
	public void saveRcsBotCarrierMapping(RcsBotCarrierMapping rcsbotcarriermapping) {
		RcsBotCarrierMapping existingRcsBotCarrierMapping = rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(rcsbotcarriermapping.getId());

		if (existingRcsBotCarrierMapping != null) {
			if (existingRcsBotCarrierMapping != rcsbotcarriermapping) {
				existingRcsBotCarrierMapping.setId(rcsbotcarriermapping.getId());
				existingRcsBotCarrierMapping.setRcsBotCarrierId(rcsbotcarriermapping.getRcsBotCarrierId());
				existingRcsBotCarrierMapping.setRcsBotId(rcsbotcarriermapping.getRcsBotId());
				existingRcsBotCarrierMapping.setCreateDate(rcsbotcarriermapping.getCreateDate());
				existingRcsBotCarrierMapping.setLastUpdate(rcsbotcarriermapping.getLastUpdate());
			}
			rcsbotcarriermapping = rcsBotCarrierMappingDAO.store(existingRcsBotCarrierMapping);
		} else {
			rcsbotcarriermapping = rcsBotCarrierMappingDAO.store(rcsbotcarriermapping);
		}
		rcsBotCarrierMappingDAO.flush();
	}

	/**
	 */
	@Transactional
	public RcsBotCarrierMapping findRcsBotCarrierMappingByPrimaryKey(Integer id) {
		return rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(id);
	}

	/**
	 * Load an existing RcsBotCarrierMapping entity
	 * 
	 */
	@Transactional
	public Set<RcsBotCarrierMapping> loadRcsBotCarrierMappings() {
		return rcsBotCarrierMappingDAO.findAllRcsBotCarrierMappings();
	}

	/**
	 * Delete an existing RcsBotCarrierMapping entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotCarrierMapping(RcsBotCarrierMapping rcsbotcarriermapping) {
		rcsBotCarrierMappingDAO.remove(rcsbotcarriermapping);
		rcsBotCarrierMappingDAO.flush();
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotCarrierMappingDAO.deletebyRcsBotId(botId);
	}
	public List<RcsBotCarrier> findRcsBotCarrierByBotId(Integer rcs_bot_id, int startResult, int maxRows)
	{
		return rcsBotCarrierMappingDAO.findRcsBotCarrierByBotId(rcs_bot_id, startResult, maxRows);
	}
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotId(Integer rcsBotId)
	{
		return rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByRcsBotId(rcsBotId);
	}
	public List<RcsBotCarrierMappingDTO> findAllRcsBotCarrierMappingByRcsBot()
	{
		return rcsBotCarrierMappingDAO.findAllRcsBotCarrierMappingByRcsBot();
	}
	
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotCarrierId(Integer rcsBotCarrierId) {
		return rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByRcsBotCarrierId(rcsBotCarrierId);
	}
}
