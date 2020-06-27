package com.kirusa.service;

import com.kirusa.dao.RcsBotTypeDescDAO;

import com.kirusa.domain.RcsBotTypeDesc;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotTypeDesc entities
 * 
 */

@Service("RcsBotTypeDescService")

@Transactional
public class RcsBotTypeDescServiceImpl implements RcsBotTypeDescService {

	/**
	 * DAO injected by Spring that manages RcsBotTypeDesc entities
	 * 
	 */
	@Autowired
	private RcsBotTypeDescDAO rcsBotTypeDescDAO;

	/**
	 * Instantiates a new RcsBotTypeDescServiceImpl.
	 *
	 */
	public RcsBotTypeDescServiceImpl() {
	}

	/**
	 * Return a count of all RcsBotTypeDesc entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotTypeDescs() {
		return ((Long) rcsBotTypeDescDAO.createQuerySingleResult("select count(o) from RcsBotTypeDesc o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing RcsBotTypeDesc entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotTypeDesc(RcsBotTypeDesc rcsbottypedesc) {
		rcsBotTypeDescDAO.remove(rcsbottypedesc);
		rcsBotTypeDescDAO.flush();
	}

	/**
	 * Return all RcsBotTypeDesc entity
	 * 
	 */
	@Transactional
	public List<RcsBotTypeDesc> findAllRcsBotTypeDescs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotTypeDesc>(rcsBotTypeDescDAO.findAllRcsBotTypeDescs(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public RcsBotTypeDesc findRcsBotTypeDescByPrimaryKey(Integer id) {
		return rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(id);
	}

	/**
	 * Save an existing RcsBotTypeDesc entity
	 * 
	 */
	@Transactional
	public void saveRcsBotTypeDesc(RcsBotTypeDesc rcsbottypedesc) {
		RcsBotTypeDesc existingRcsBotTypeDesc = rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(rcsbottypedesc.getId());

		if (existingRcsBotTypeDesc != null) {
			if (existingRcsBotTypeDesc != rcsbottypedesc) {
				existingRcsBotTypeDesc.setId(rcsbottypedesc.getId());
				existingRcsBotTypeDesc.setName(rcsbottypedesc.getName());
				existingRcsBotTypeDesc.setDisplayName(rcsbottypedesc.getDisplayName());
				existingRcsBotTypeDesc.setDescription(rcsbottypedesc.getDescription());
				existingRcsBotTypeDesc.setLang(rcsbottypedesc.getLang());
				existingRcsBotTypeDesc.setCreateDate(rcsbottypedesc.getCreateDate());
				existingRcsBotTypeDesc.setLastUpdate(rcsbottypedesc.getLastUpdate());
			}
			rcsbottypedesc = rcsBotTypeDescDAO.store(existingRcsBotTypeDesc);
		} else {
			rcsbottypedesc = rcsBotTypeDescDAO.store(rcsbottypedesc);
		}
		rcsBotTypeDescDAO.flush();
	}

	/**
	 * Load an existing RcsBotTypeDesc entity
	 * 
	 */
	@Transactional
	public Set<RcsBotTypeDesc> loadRcsBotTypeDescs() {
		return rcsBotTypeDescDAO.findAllRcsBotTypeDescs();
	}
	public List<RcsBotTypeDesc> findRcsBotTypeDescByNameAndLang(String name,String lang,int startResult, int maxRows)
	{
		return rcsBotTypeDescDAO.findRcsBotTypeDescByNameAndLang(name,lang,startResult,maxRows);
	}
	public Set<RcsBotTypeDesc> findRcsBotTypeDescByLang(String lang)
	{
		return rcsBotTypeDescDAO.findRcsBotTypeDescByLang(lang);
	}
}
