package com.kirusa.service;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotImageDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotImage;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotImage entities
 * 
 */

@Service("RcsBotImageService")

@Transactional
public class RcsBotImageServiceImpl implements RcsBotImageService {

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotImage entities
	 * 
	 */
	@Autowired
	private RcsBotImageDAO rcsBotImageDAO;

	/**
	 * Instantiates a new RcsBotImageServiceImpl.
	 *
	 */
	public RcsBotImageServiceImpl() {
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotImage saveRcsBotImageRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotImage rcsbotimage = rcsBotImageDAO.findRcsBotImageByPrimaryKey(id, -1, -1);
		RcsBot existingrcsBot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBot != null) {
			existingrcsBot.setId(related_rcsbot.getId());
			existingrcsBot.setPlatform(related_rcsbot.getPlatform());
			existingrcsBot.setPrivacyUrl(related_rcsbot.getPrivacyUrl());
			existingrcsBot.setWebsiteUrl(related_rcsbot.getWebsiteUrl());
			existingrcsBot.setTermAndConditionUrl(related_rcsbot.getTermAndConditionUrl());
			existingrcsBot.setCreateDate(related_rcsbot.getCreateDate());
			existingrcsBot.setLastUpdate(related_rcsbot.getLastUpdate());
			existingrcsBot.setStatus(related_rcsbot.getStatus());
			existingrcsBot.setLogoImageName(related_rcsbot.getLogoImageName());
			related_rcsbot = existingrcsBot;
		}

		rcsbotimage.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotImages().add(rcsbotimage);
		rcsbotimage = rcsBotImageDAO.store(rcsbotimage);
		rcsBotImageDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotimage;
	}

	/**
	 * Return a count of all RcsBotImage entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotImages() {
		return ((Long) rcsBotImageDAO.createQuerySingleResult("select count(o) from RcsBotImage o").getSingleResult())
				.intValue();
	}

	/**
	 * Save an existing RcsBotImage entity
	 * 
	 */
	@Transactional
	public void saveRcsBotImage(RcsBotImage rcsbotimage) {
		RcsBotImage existingRcsBotImage = rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage.getId());

		if (existingRcsBotImage != null) {
			if (existingRcsBotImage != rcsbotimage) {
				if (rcsbotimage.getId() != null)
					existingRcsBotImage.setId(rcsbotimage.getId());
				if (rcsbotimage.getImageName() != null)
					existingRcsBotImage.setImageName(rcsbotimage.getImageName());
				if (rcsbotimage.getDescription() != null)
					existingRcsBotImage.setDescription(rcsbotimage.getDescription());

				existingRcsBotImage.setCreateDate(rcsbotimage.getCreateDate());
				existingRcsBotImage.setLastUpdate(rcsbotimage.getLastUpdate());
				if (rcsbotimage.getStatus() != null)
					existingRcsBotImage.setStatus(rcsbotimage.getStatus());
			}
			rcsbotimage = rcsBotImageDAO.store(existingRcsBotImage);
		} else {
			rcsbotimage = rcsBotImageDAO.store(rcsbotimage);
		}
		rcsBotImageDAO.flush();
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotImage deleteRcsBotImageRcsBot(Integer rcsbotimage_id, Integer related_rcsbot_id) {
		RcsBotImage rcsbotimage = rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage_id, -1, -1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbotimage.setRcsBot(null);
		related_rcsbot.getRcsBotImages().remove(rcsbotimage);
		rcsbotimage = rcsBotImageDAO.store(rcsbotimage);
		rcsBotImageDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotimage;
	}

	/**
	 */
	@Transactional
	public RcsBotImage findRcsBotImageByPrimaryKey(Integer id) {
		return rcsBotImageDAO.findRcsBotImageByPrimaryKey(id);
	}

	/**
	 * Delete an existing RcsBotImage entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotImage(RcsBotImage rcsbotimage) {
		rcsBotImageDAO.remove(rcsbotimage);
		rcsBotImageDAO.flush();
	}

	/**
	 * Return all RcsBotImage entity
	 * 
	 */
	@Transactional
	public List<RcsBotImage> findAllRcsBotImages(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotImage>(rcsBotImageDAO.findAllRcsBotImages(startResult, maxRows));
	}

	/**
	 * Load an existing RcsBotImage entity
	 * 
	 */
	@Transactional
	public Set<RcsBotImage> loadRcsBotImages() {
		return rcsBotImageDAO.findAllRcsBotImages();
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotImageDAO.deletebyRcsBotId(botId);
	}
}
