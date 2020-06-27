package com.kirusa.service;

import com.kirusa.dao.RcsBotTypeDAO;

import com.kirusa.domain.RcsBotType;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotType entities
 * 
 */

@Service("RcsBotTypeService")

@Transactional
public class RcsBotTypeServiceImpl implements RcsBotTypeService {

	/**
	 * DAO injected by Spring that manages RcsBotType entities
	 * 
	 */
	@Autowired
	private RcsBotTypeDAO rcsBotTypeDAO;

	/**
	 * Instantiates a new RcsBotTypeServiceImpl.
	 *
	 */
	public RcsBotTypeServiceImpl() {
	}

	/**
	 * Return a count of all RcsBotType entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotTypes() {
		return ((Long) rcsBotTypeDAO.createQuerySingleResult("select count(o) from RcsBotType o").getSingleResult())
				.intValue();
	}

	/**
	 * Save an existing RcsBotType entity
	 * 
	 */
	@Transactional
	public void saveRcsBotType(RcsBotType rcsbottype) {
		RcsBotType existingRcsBotType = rcsBotTypeDAO.findRcsBotTypeByPrimaryKey(rcsbottype.getId());

		if (existingRcsBotType != null) {
			if (existingRcsBotType != rcsbottype) {
				if (rcsbottype.getId() != null)
					existingRcsBotType.setId(rcsbottype.getId());
				if (rcsbottype.getType() != null)
					existingRcsBotType.setType(rcsbottype.getType());
				if (rcsbottype.getRcsBotId() != null)
					existingRcsBotType.setRcsBotId(rcsbottype.getRcsBotId());
				if (rcsbottype.getRcsBotCategoryId() != null)
					existingRcsBotType.setRcsBotCategoryId(rcsbottype.getRcsBotCategoryId());
				existingRcsBotType.setCreateDate(rcsbottype.getCreateDate());
				existingRcsBotType.setLastUpdate(rcsbottype.getLastUpdate());
			}
			rcsbottype = rcsBotTypeDAO.store(existingRcsBotType);
		} else {
			rcsbottype = rcsBotTypeDAO.store(rcsbottype);
		}
		rcsBotTypeDAO.flush();
	}

	/**
	 * Return all RcsBotType entity
	 * 
	 */
	@Transactional
	public List<RcsBotType> findAllRcsBotTypes(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotType>(rcsBotTypeDAO.findAllRcsBotTypes(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public RcsBotType findRcsBotTypeByPrimaryKey(Integer id) {
		return rcsBotTypeDAO.findRcsBotTypeByPrimaryKey(id);
	}

	/**
	 * Load an existing RcsBotType entity
	 * 
	 */
	@Transactional
	public Set<RcsBotType> loadRcsBotTypes() {
		return rcsBotTypeDAO.findAllRcsBotTypes();
	}

	/**
	 * Delete an existing RcsBotType entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotType(RcsBotType rcsbottype) {
		rcsBotTypeDAO.remove(rcsbottype);
		rcsBotTypeDAO.flush();
	}

	public List<RcsBotType> findRcsBotByTypes(String type, Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotType>(rcsBotTypeDAO.findRcsBotTypeByType(type, startResult, maxRows));
	}
	public List<RcsBotType> findRcsBotTypeByBotId(Integer id) 
	{
		return new java.util.ArrayList<RcsBotType>(rcsBotTypeDAO.findRcsBotTypeByRcsBotId(id));
		
		
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotTypeDAO.deletebyRcsBotId(botId);
	}
}
