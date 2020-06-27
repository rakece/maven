package com.kirusa.service;

import com.kirusa.dao.RcsBotCarrierDAO;

import com.kirusa.domain.RcsBotCarrier;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotCarrier entities
 * 
 */

@Service("RcsBotCarrierService")

@Transactional
public class RcsBotCarrierServiceImpl implements RcsBotCarrierService {

	/**
	 * DAO injected by Spring that manages RcsBotCarrier entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierDAO rcsBotCarrierDAO;

	/**
	 * Instantiates a new RcsBotCarrierServiceImpl.
	 *
	 */
	public RcsBotCarrierServiceImpl() {
	}

	/**
	 * Load an existing RcsBotCarrier entity
	 * 
	 */
	@Transactional
	public Set<RcsBotCarrier> loadRcsBotCarriers() {
		return rcsBotCarrierDAO.findAllRcsBotCarriers();
	}

	/**
	 */
	@Transactional
	public RcsBotCarrier findRcsBotCarrierByPrimaryKey(Integer id) {
		return rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(id);
	}

	/**
	 * Return a count of all RcsBotCarrier entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotCarriers() {
		return ((Long) rcsBotCarrierDAO.createQuerySingleResult("select count(o) from RcsBotCarrier o").getSingleResult()).intValue();
	}

	/**
	 * Return all RcsBotCarrier entity
	 * 
	 */
	@Transactional
	public List<RcsBotCarrier> findAllRcsBotCarriers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotCarrier>(rcsBotCarrierDAO.findAllRcsBotCarriers(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBotCarrier entity
	 * 
	 */
	@Transactional
	public void saveRcsBotCarrier(RcsBotCarrier rcsbotcarrier) {
		RcsBotCarrier existingRcsBotCarrier = rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(rcsbotcarrier.getId());

		if (existingRcsBotCarrier != null) {
			if (existingRcsBotCarrier != rcsbotcarrier) {
				existingRcsBotCarrier.setId(rcsbotcarrier.getId());
				existingRcsBotCarrier.setRcsCountryId(rcsbotcarrier.getRcsCountryId());
				existingRcsBotCarrier.setName(rcsbotcarrier.getName());
				existingRcsBotCarrier.setDisplayName(rcsbotcarrier.getDisplayName());
				existingRcsBotCarrier.setDescription(rcsbotcarrier.getDescription());
				existingRcsBotCarrier.setCreateDate(rcsbotcarrier.getCreateDate());
				existingRcsBotCarrier.setLastUpdate(rcsbotcarrier.getLastUpdate());
			}
			rcsbotcarrier = rcsBotCarrierDAO.store(existingRcsBotCarrier);
		} else {
			rcsbotcarrier = rcsBotCarrierDAO.store(rcsbotcarrier);
		}
		rcsBotCarrierDAO.flush();
	}

	/**
	 * Delete an existing RcsBotCarrier entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotCarrier(RcsBotCarrier rcsbotcarrier) {
		rcsBotCarrierDAO.remove(rcsbotcarrier);
		rcsBotCarrierDAO.flush();
	}
}
