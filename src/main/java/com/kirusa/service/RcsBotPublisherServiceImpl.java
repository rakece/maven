package com.kirusa.service;

import com.kirusa.dao.RcsBotPublisherDAO;

import com.kirusa.domain.RcsBotPublisher;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotPublisher entities
 * 
 */

@Service("RcsBotPublisherService")

@Transactional
public class RcsBotPublisherServiceImpl implements RcsBotPublisherService {

	/**
	 * DAO injected by Spring that manages RcsBotPublisher entities
	 * 
	 */
	@Autowired
	private RcsBotPublisherDAO rcsBotPublisherDAO;

	/**
	 * Instantiates a new RcsBotPublisherServiceImpl.
	 *
	 */
	public RcsBotPublisherServiceImpl() {
	}

	/**
	 * Return all RcsBotPublisher entity
	 * 
	 */
	@Transactional
	public List<RcsBotPublisher> findAllRcsBotPublishers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotPublisher>(rcsBotPublisherDAO.findAllRcsBotPublishers(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public RcsBotPublisher findRcsBotPublisherByPrimaryKey(Integer id) {
		return rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(id);
	}

	/**
	 * Load an existing RcsBotPublisher entity
	 * 
	 */
	@Transactional
	public Set<RcsBotPublisher> loadRcsBotPublishers() {
		return rcsBotPublisherDAO.findAllRcsBotPublishers();
	}

	/**
	 * Save an existing RcsBotPublisher entity
	 * 
	 */
	@Transactional
	public void saveRcsBotPublisher(RcsBotPublisher rcsbotpublisher) {
		RcsBotPublisher existingRcsBotPublisher = rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(rcsbotpublisher.getId());

		if (existingRcsBotPublisher != null) {
			if (existingRcsBotPublisher != rcsbotpublisher) {
				existingRcsBotPublisher.setId(rcsbotpublisher.getId());
				existingRcsBotPublisher.setCompanyName(rcsbotpublisher.getCompanyName());
				existingRcsBotPublisher.setFirstName(rcsbotpublisher.getFirstName());
				existingRcsBotPublisher.setLastName(rcsbotpublisher.getLastName());
				existingRcsBotPublisher.setEmail(rcsbotpublisher.getEmail());
				existingRcsBotPublisher.setPhoneNumber(rcsbotpublisher.getPhoneNumber());
				existingRcsBotPublisher.setRcsBotId(rcsbotpublisher.getRcsBotId());
				existingRcsBotPublisher.setRcsBotUserId(rcsbotpublisher.getRcsBotUserId());
				existingRcsBotPublisher.setCreateDate(rcsbotpublisher.getCreateDate());
				existingRcsBotPublisher.setLastUpdate(rcsbotpublisher.getLastUpdate());
			}
			rcsbotpublisher = rcsBotPublisherDAO.store(existingRcsBotPublisher);
		} else {
			rcsbotpublisher = rcsBotPublisherDAO.store(rcsbotpublisher);
		}
		rcsBotPublisherDAO.flush();
	}

	/**
	 * Delete an existing RcsBotPublisher entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotPublisher(RcsBotPublisher rcsbotpublisher) {
		rcsBotPublisherDAO.remove(rcsbotpublisher);
		rcsBotPublisherDAO.flush();
	}

	/**
	 * Return a count of all RcsBotPublisher entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotPublishers() {
		return ((Long) rcsBotPublisherDAO.createQuerySingleResult("select count(o) from RcsBotPublisher o").getSingleResult()).intValue();
	}
}
