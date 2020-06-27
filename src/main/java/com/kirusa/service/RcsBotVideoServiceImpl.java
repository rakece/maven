package com.kirusa.service;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotVideoDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotVideo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RcsBotVideo entities
 * 
 */

@Service("RcsBotVideoService")

@Transactional
public class RcsBotVideoServiceImpl implements RcsBotVideoService {

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotVideo entities
	 * 
	 */
	@Autowired
	private RcsBotVideoDAO rcsBotVideoDAO;

	/**
	 * Instantiates a new RcsBotVideoServiceImpl.
	 *
	 */
	public RcsBotVideoServiceImpl() {
	}

	/**
	 * Return a count of all RcsBotVideo entity
	 * 
	 */
	@Transactional
	public Integer countRcsBotVideos() {
		return ((Long) rcsBotVideoDAO.createQuerySingleResult("select count(o) from RcsBotVideo o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotVideo saveRcsBotVideoRcsBot(Integer id, RcsBot related_rcsbot) {
		RcsBotVideo rcsbotvideo = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(id, -1, -1);
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

		rcsbotvideo.setRcsBot(related_rcsbot);
		related_rcsbot.getRcsBotVideos().add(rcsbotvideo);
		rcsbotvideo = rcsBotVideoDAO.store(rcsbotvideo);
		rcsBotVideoDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotvideo;
	}

	/**
	 */
	@Transactional
	public RcsBotVideo findRcsBotVideoByPrimaryKey(Integer id) {
		return rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(id);
	}

	/**
	 * Return all RcsBotVideo entity
	 * 
	 */
	@Transactional
	public List<RcsBotVideo> findAllRcsBotVideos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBotVideo>(rcsBotVideoDAO.findAllRcsBotVideos(startResult, maxRows));
	}

	/**
	 * Load an existing RcsBotVideo entity
	 * 
	 */
	@Transactional
	public Set<RcsBotVideo> loadRcsBotVideos() {
		return rcsBotVideoDAO.findAllRcsBotVideos();
	}

	/**
	 * Save an existing RcsBotVideo entity
	 * 
	 */
	@Transactional
	public void saveRcsBotVideo(RcsBotVideo rcsbotvideo) {
		RcsBotVideo existingRcsBotVideo = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo.getId());

		if (existingRcsBotVideo != null) {
			if (existingRcsBotVideo != rcsbotvideo) {
				existingRcsBotVideo.setId(rcsbotvideo.getId());
				existingRcsBotVideo.setVideoName(rcsbotvideo.getVideoName());
				existingRcsBotVideo.setDescription(rcsbotvideo.getDescription());
				existingRcsBotVideo.setCreateDate(rcsbotvideo.getCreateDate());
				existingRcsBotVideo.setLastUpdate(rcsbotvideo.getLastUpdate());
				existingRcsBotVideo.setStatus(rcsbotvideo.getStatus());
			}
			rcsbotvideo = rcsBotVideoDAO.store(existingRcsBotVideo);
		} else {
			rcsbotvideo = rcsBotVideoDAO.store(rcsbotvideo);
		}
		rcsBotVideoDAO.flush();
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBotVideo deleteRcsBotVideoRcsBot(Integer rcsbotvideo_id, Integer related_rcsbot_id) {
		RcsBotVideo rcsbotvideo = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo_id, -1, -1);
		RcsBot related_rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		rcsbotvideo.setRcsBot(null);
		related_rcsbot.getRcsBotVideos().remove(rcsbotvideo);
		rcsbotvideo = rcsBotVideoDAO.store(rcsbotvideo);
		rcsBotVideoDAO.flush();

		related_rcsbot = rcsBotDAO.store(related_rcsbot);
		rcsBotDAO.flush();

		rcsBotDAO.remove(related_rcsbot);
		rcsBotDAO.flush();

		return rcsbotvideo;
	}

	/**
	 * Delete an existing RcsBotVideo entity
	 * 
	 */
	@Transactional
	public void deleteRcsBotVideo(RcsBotVideo rcsbotvideo) {
		rcsBotVideoDAO.remove(rcsbotvideo);
		rcsBotVideoDAO.flush();
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		rcsBotVideoDAO.deletebyRcsBotId(botId);
	}
}
