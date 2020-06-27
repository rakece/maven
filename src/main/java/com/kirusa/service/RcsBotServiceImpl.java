package com.kirusa.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCommentDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotDescDAO;
import com.kirusa.dao.RcsBotImageDAO;
import com.kirusa.dao.RcsBotTagsDAO;
import com.kirusa.dao.RcsBotUpdateDescDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotVideoDAO;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotComment;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotImage;
import com.kirusa.domain.RcsBotTags;
import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotVideo;

/**
 * Spring service that handles CRUD requests for RcsBot entities
 * 
 */

@Service("RcsBotService")

@Transactional
public class RcsBotServiceImpl implements RcsBotService {

	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBotBilling entities
	 * 
	 */
	@Autowired
	private RcsBotBillingDAO rcsBotBillingDAO;

	/**
	 * DAO injected by Spring that manages RcsBotCategory entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDAO rcsBotCategoryDAO;

	/**
	 * DAO injected by Spring that manages RcsBotComment entities
	 * 
	 */
	@Autowired
	private RcsBotCommentDAO rcsBotCommentDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotDesc entities
	 * 
	 */
	@Autowired
	private RcsBotDescDAO rcsBotDescDAO;

	/**
	 * DAO injected by Spring that manages RcsBotImage entities
	 * 
	 */
	@Autowired
	private RcsBotImageDAO rcsBotImageDAO;

	/**
	 * DAO injected by Spring that manages RcsBotTags entities
	 * 
	 */
	@Autowired
	private RcsBotTagsDAO rcsBotTagsDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUpdate entities
	 * 
	 */
	@Autowired
	private RcsBotUpdateDescDAO rcsBotUpdateDAODesc;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * DAO injected by Spring that manages RcsBotVideo entities
	 * 
	 */
	@Autowired
	private RcsBotVideoDAO rcsBotVideoDAO;

	/**
	 * Instantiates a new RcsBotServiceImpl.
	 *
	 */
	public RcsBotServiceImpl() {
	}

	/**
	 * Save an existing RcsBotImage entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotImages(Integer id, RcsBotImage related_rcsbotimages) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotImage existingrcsBotImages = rcsBotImageDAO.findRcsBotImageByPrimaryKey(related_rcsbotimages.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotImages != null) {
			existingrcsBotImages.setId(related_rcsbotimages.getId());
			if (related_rcsbotimages.getImageName() != null)
				existingrcsBotImages.setImageName(related_rcsbotimages.getImageName());
			if (related_rcsbotimages.getStatus() != null)
				existingrcsBotImages.setDescription(related_rcsbotimages.getDescription());
			existingrcsBotImages.setCreateDate(related_rcsbotimages.getCreateDate());
			existingrcsBotImages.setLastUpdate(related_rcsbotimages.getLastUpdate());
			if (related_rcsbotimages.getStatus() != null)
				existingrcsBotImages.setStatus(related_rcsbotimages.getStatus());
			related_rcsbotimages = existingrcsBotImages;
		}

		related_rcsbotimages.setRcsBot(rcsbot);
		rcsbot.getRcsBotImages().add(related_rcsbotimages);
		related_rcsbotimages = rcsBotImageDAO.store(related_rcsbotimages);
		rcsBotImageDAO.flush();		

		rcsbot = rcsBotDAO.store(rcsbot);
		
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotBillings(Integer id, RcsBotBilling related_rcsbotbillings) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotBilling existingrcsBotBillings = rcsBotBillingDAO
				.findRcsBotBillingByPrimaryKey(related_rcsbotbillings.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotBillings != null) {
			existingrcsBotBillings.setId(related_rcsbotbillings.getId());
			if (related_rcsbotbillings.getUserName() != null)
				existingrcsBotBillings.setUserName(related_rcsbotbillings.getUserName());
			if (related_rcsbotbillings.getCompanyName() != null)
				existingrcsBotBillings.setCompanyName(related_rcsbotbillings.getCompanyName());
			if (related_rcsbotbillings.getEmail() != null)
				existingrcsBotBillings.setEmail(related_rcsbotbillings.getEmail());
			if (related_rcsbotbillings.getAccountType() != null)
				existingrcsBotBillings.setAccountType(related_rcsbotbillings.getAccountType());
			if (related_rcsbotbillings.getContactNo() != null)
				existingrcsBotBillings.setContactNo(related_rcsbotbillings.getContactNo());
			if (related_rcsbotbillings.getAltContactNo() != null)
				existingrcsBotBillings.setAltContactNo(related_rcsbotbillings.getAltContactNo());
			if (related_rcsbotbillings.getAddressLine1() != null)
				existingrcsBotBillings.setAddressLine1(related_rcsbotbillings.getAddressLine1());
			if (related_rcsbotbillings.getAddressLine2() != null)
				existingrcsBotBillings.setAddressLine2(related_rcsbotbillings.getAddressLine2());
			if (related_rcsbotbillings.getCity() != null)
				existingrcsBotBillings.setCity(related_rcsbotbillings.getCity());
			if (related_rcsbotbillings.getState() != null)
				existingrcsBotBillings.setState(related_rcsbotbillings.getState());
			if (related_rcsbotbillings.getZip() != null)
				existingrcsBotBillings.setZip(related_rcsbotbillings.getZip());
			if (related_rcsbotbillings.getCountry() != null)
				existingrcsBotBillings.setCountry(related_rcsbotbillings.getCountry());
			existingrcsBotBillings.setCreateDate(related_rcsbotbillings.getCreateDate());
			existingrcsBotBillings.setLastUpdate(related_rcsbotbillings.getLastUpdate());
			related_rcsbotbillings = existingrcsBotBillings;
		}

		related_rcsbotbillings.setRcsBot(rcsbot);
		rcsbot.getRcsBotBillings().add(related_rcsbotbillings);
		related_rcsbotbillings = rcsBotBillingDAO.store(related_rcsbotbillings);
		rcsBotBillingDAO.flush();

		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Load an existing RcsBot entity
	 * 
	 */
	@Transactional
	public Set<RcsBot> loadRcsBots() {
		return rcsBotDAO.findAllRcsBots();
	}

	/**
	 * Delete an existing RcsBotVideo entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotVideos(Integer rcsbot_id, Integer related_rcsbotvideos_id) {
		RcsBotVideo related_rcsbotvideos = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(related_rcsbotvideos_id, -1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotvideos.setRcsBot(null);
		rcsbot.getRcsBotVideos().remove(related_rcsbotvideos);

		rcsBotVideoDAO.remove(related_rcsbotvideos);
		rcsBotVideoDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotDesc entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotDescs(Integer id, RcsBotDesc related_rcsbotdescs) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotDesc existingrcsBotDescs = rcsBotDescDAO.findRcsBotDescByPrimaryKey(related_rcsbotdescs.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotDescs != null) {
			existingrcsBotDescs.setId(related_rcsbotdescs.getId());
			if (related_rcsbotdescs.getBotName() != null)
				existingrcsBotDescs.setBotName(related_rcsbotdescs.getBotName());
			if (related_rcsbotdescs.getBotSummary() != null)
				existingrcsBotDescs.setBotSummary(related_rcsbotdescs.getBotSummary());
			if (related_rcsbotdescs.getDisplayName() != null)
				existingrcsBotDescs.setDisplayName(related_rcsbotdescs.getDisplayName());
			if (related_rcsbotdescs.getDescription() != null)
				existingrcsBotDescs.setDescription(related_rcsbotdescs.getDescription());
			if (related_rcsbotdescs.getLang() != null)
				existingrcsBotDescs.setLang(related_rcsbotdescs.getLang());
			existingrcsBotDescs.setCreateDate(related_rcsbotdescs.getCreateDate());
			existingrcsBotDescs.setLastUpdate(related_rcsbotdescs.getLastUpdate());
			related_rcsbotdescs = existingrcsBotDescs;
		}

		related_rcsbotdescs.setRcsBot(rcsbot);
		rcsbot.getRcsBotDescs().add(related_rcsbotdescs);
		related_rcsbotdescs = rcsBotDescDAO.store(related_rcsbotdescs);
		rcsBotDescDAO.flush();

		//rcsbot = rcsBotDAO.store(rcsbot);
		
		//rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotAvailables(Integer id, RcsBotAvailable related_rcsbotavailables) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotAvailable existingrcsBotAvailables = rcsBotAvailableDAO
				.findRcsBotAvailableByPrimaryKey(related_rcsbotavailables.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotAvailables != null) {
			existingrcsBotAvailables.setId(related_rcsbotavailables.getId());
			existingrcsBotAvailables.setCreateDate(related_rcsbotavailables.getCreateDate());
			existingrcsBotAvailables.setLastUpdate(related_rcsbotavailables.getLastUpdate());
			related_rcsbotavailables = existingrcsBotAvailables;
		}

		related_rcsbotavailables.setRcsBot(rcsbot);
		rcsbot.getRcsBotAvailables().add(related_rcsbotavailables);
		related_rcsbotavailables = rcsBotAvailableDAO.store(related_rcsbotavailables);
		rcsBotAvailableDAO.flush();

		rcsbot = rcsBotDAO.store(rcsbot);
		
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotUpdate entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotUpdates(Integer id, RcsBotUpdateDesc related_rcsbotupdates) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotUpdateDesc existingrcsBotUpdates = rcsBotUpdateDAODesc
				.findRcsBotUpdateDescByPrimaryKey(related_rcsbotupdates.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotUpdates != null) {
			existingrcsBotUpdates.setId(related_rcsbotupdates.getId());
			existingrcsBotUpdates.setCreateDate(related_rcsbotupdates.getCreateDate());
			existingrcsBotUpdates.setLastUpdate(related_rcsbotupdates.getLastUpdate());
			related_rcsbotupdates = existingrcsBotUpdates;
		}

		related_rcsbotupdates.setRcsBot(rcsbot);
		rcsbot.getRcsBotUpdatesDesc().add(related_rcsbotupdates);
		related_rcsbotupdates = rcsBotUpdateDAODesc.store(related_rcsbotupdates);
		rcsBotUpdateDAODesc.flush();

		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotTagses(Integer id, RcsBotTags related_rcsbottagses) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotTags existingrcsBotTagses = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(related_rcsbottagses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotTagses != null) {
			existingrcsBotTagses.setId(related_rcsbottagses.getId());
			existingrcsBotTagses.setRcsBotCategory(related_rcsbottagses.getRcsBotCategory());
			existingrcsBotTagses.setCreateDate(related_rcsbottagses.getCreateDate());
			existingrcsBotTagses.setLastUpdate(related_rcsbottagses.getLastUpdate());
			related_rcsbottagses = existingrcsBotTagses;
		}

		related_rcsbottagses.setRcsBot(rcsbot);
		rcsbot.getRcsBotTagses().add(related_rcsbottagses);
		related_rcsbottagses = rcsBotTagsDAO.store(related_rcsbottagses);
		rcsBotTagsDAO.flush();

		rcsbot = rcsBotDAO.store(rcsbot);
		
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotComment entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotComments(Integer rcsbot_id, Integer related_rcsbotcomments_id) {
		RcsBotComment related_rcsbotcomments = rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(related_rcsbotcomments_id,
				-1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotcomments.setRcsBot(null);
		rcsbot.getRcsBotComments().remove(related_rcsbotcomments);

		rcsBotCommentDAO.remove(related_rcsbotcomments);
		rcsBotCommentDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotImage entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotImages(Integer rcsbot_id, Integer related_rcsbotimages_id) {
		RcsBotImage related_rcsbotimages = rcsBotImageDAO.findRcsBotImageByPrimaryKey(related_rcsbotimages_id, -1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotimages.setRcsBot(null);
		rcsbot.getRcsBotImages().remove(related_rcsbotimages);

		rcsBotImageDAO.remove(related_rcsbotimages);
		rcsBotImageDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotDesc entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotDescs(Integer rcsbot_id, Integer related_rcsbotdescs_id) {
		RcsBotDesc related_rcsbotdescs = rcsBotDescDAO.findRcsBotDescByPrimaryKey(related_rcsbotdescs_id, -1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotdescs.setRcsBot(null);
		rcsbot.getRcsBotDescs().remove(related_rcsbotdescs);

		rcsBotDescDAO.remove(related_rcsbotdescs);
		rcsBotDescDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotAvailable entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotAvailables(Integer rcsbot_id, Integer related_rcsbotavailables_id) {
		RcsBotAvailable related_rcsbotavailables = rcsBotAvailableDAO
				.findRcsBotAvailableByPrimaryKey(related_rcsbotavailables_id, -1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotavailables.setRcsBot(null);
		rcsbot.getRcsBotAvailables().remove(related_rcsbotavailables);

		rcsBotAvailableDAO.remove(related_rcsbotavailables);
		rcsBotAvailableDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotUpdate entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotUpdatesDesc(Integer rcsbot_id, Integer related_rcsbotupdates_id) {
		RcsBotUpdateDesc related_rcsbotupdates = rcsBotUpdateDAODesc.findRcsBotUpdateDescByPrimaryKey(related_rcsbotupdates_id, -1,
				-1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotupdates.setRcsBot(null);
		rcsbot.getRcsBotUpdatesDesc().remove(related_rcsbotupdates);

		rcsBotUpdateDAODesc.remove(related_rcsbotupdates);
		rcsBotUpdateDAODesc.flush();

		return rcsbot;
	}

	/**
	 * Return all RcsBot entity
	 * 
	 */
	@Transactional
	public List<RcsBot> findAllRcsBots(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RcsBot>(rcsBotDAO.findAllRcsBots(startResult, maxRows));
	}

	/**
	 * Save an existing RcsBotComment entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotComments(Integer id, RcsBotComment related_rcsbotcomments) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotComment existingrcsBotComments = rcsBotCommentDAO
				.findRcsBotCommentByPrimaryKey(related_rcsbotcomments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotComments != null) {
			existingrcsBotComments.setId(related_rcsbotcomments.getId());
			if(related_rcsbotcomments.getRcsBotUserId()!=null)
			existingrcsBotComments.setRcsBotUserId(related_rcsbotcomments.getRcsBotUserId());
			if(related_rcsbotcomments.getCommenttext()!=null)
			existingrcsBotComments.setCommenttext(related_rcsbotcomments.getCommenttext());
			if(related_rcsbotcomments.getStatus()!=null)
			existingrcsBotComments.setStatus(related_rcsbotcomments.getStatus());
			if(related_rcsbotcomments.getRating()!=null)
			existingrcsBotComments.setRating(related_rcsbotcomments.getRating());
			if(related_rcsbotcomments.getPositiveCount()!=null)
			existingrcsBotComments.setPositiveCount(related_rcsbotcomments.getPositiveCount());
			if(related_rcsbotcomments.getNegativeCount()!=null)
			existingrcsBotComments.setNegativeCount(related_rcsbotcomments.getNegativeCount());
			if(related_rcsbotcomments.getLang()!=null)
			existingrcsBotComments.setLang(related_rcsbotcomments.getLang());
			existingrcsBotComments.setCreateDate(related_rcsbotcomments.getCreateDate());
			existingrcsBotComments.setLastUpdate(related_rcsbotcomments.getLastUpdate());
			related_rcsbotcomments = existingrcsBotComments;
		}

		related_rcsbotcomments.setRcsBot(rcsbot);
		rcsbot.getRcsBotComments().add(related_rcsbotcomments);
		related_rcsbotcomments = rcsBotCommentDAO.store(related_rcsbotcomments);
		rcsBotCommentDAO.flush();

		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@Transactional
	public void deleteRcsBot(RcsBot rcsbot) {
		rcsBotDAO.remove(rcsbot);
		rcsBotDAO.flush();
	}

	/**
	 * Save an existing RcsBotVideo entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotVideos(Integer id, RcsBotVideo related_rcsbotvideos) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotVideo existingrcsBotVideos = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(related_rcsbotvideos.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotVideos != null) {
			existingrcsBotVideos.setId(related_rcsbotvideos.getId());
			if (related_rcsbotvideos.getVideoName() != null)
				existingrcsBotVideos.setVideoName(related_rcsbotvideos.getVideoName());
			if (related_rcsbotvideos.getDescription() != null)
				existingrcsBotVideos.setDescription(related_rcsbotvideos.getDescription());
			existingrcsBotVideos.setCreateDate(related_rcsbotvideos.getCreateDate());
			existingrcsBotVideos.setLastUpdate(related_rcsbotvideos.getLastUpdate());
			if (related_rcsbotvideos.getStatus() != null)
				existingrcsBotVideos.setStatus(related_rcsbotvideos.getStatus());
			related_rcsbotvideos = existingrcsBotVideos;
		}

		related_rcsbotvideos.setRcsBot(rcsbot);
		rcsbot.getRcsBotVideos().add(related_rcsbotvideos);
		related_rcsbotvideos = rcsBotVideoDAO.store(related_rcsbotvideos);
		rcsBotVideoDAO.flush();

		rcsbot = rcsBotDAO.store(rcsbot);
		
		rcsBotDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotTags entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotTagses(Integer rcsbot_id, Integer related_rcsbottagses_id) {
		RcsBotTags related_rcsbottagses = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(related_rcsbottagses_id, -1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbottagses.setRcsBot(null);
		rcsbot.getRcsBotTagses().remove(related_rcsbottagses);

		rcsBotTagsDAO.remove(related_rcsbottagses);
		rcsBotTagsDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBot(RcsBot rcsbot) {
		RcsBot existingRcsBot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());

		if (existingRcsBot != null) {
			if (existingRcsBot != rcsbot) {
				existingRcsBot.setId(rcsbot.getId());
				if (rcsbot.getPlatform() != null)
					existingRcsBot.setPlatform(rcsbot.getPlatform());
				if (rcsbot.getPrivacyUrl() != null)
					existingRcsBot.setPrivacyUrl(rcsbot.getPrivacyUrl());
				if (rcsbot.getWebsiteUrl() != null)
					existingRcsBot.setWebsiteUrl(rcsbot.getWebsiteUrl());
				if (rcsbot.getTermAndConditionUrl() != null)
					existingRcsBot.setTermAndConditionUrl(rcsbot.getTermAndConditionUrl());

				existingRcsBot.setCreateDate(rcsbot.getCreateDate());
				existingRcsBot.setLastUpdate(rcsbot.getLastUpdate());
				if (rcsbot.getStatus() != null)
					existingRcsBot.setStatus(rcsbot.getStatus());
				if (rcsbot.getLogoImageName() != null)
					existingRcsBot.setLogoImageName(rcsbot.getLogoImageName());
			}
			rcsbot = rcsBotDAO.store(existingRcsBot);
		} else {
			rcsbot = rcsBotDAO.store(rcsbot);
		}
		rcsBotDAO.flush();
		return rcsbot;
	}

	/**
	 */
	@Transactional
	public RcsBot findRcsBotByPrimaryKey(Integer id) {
		return rcsBotDAO.findRcsBotByPrimaryKey(id);
	}

	/**
	 * Delete an existing RcsBotBilling entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotBillings(Integer rcsbot_id, Integer related_rcsbotbillings_id) {
		RcsBotBilling related_rcsbotbillings = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(related_rcsbotbillings_id,
				-1, -1);

		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		related_rcsbotbillings.setRcsBot(null);
		rcsbot.getRcsBotBillings().remove(related_rcsbotbillings);

		rcsBotBillingDAO.remove(related_rcsbotbillings);
		rcsBotBillingDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotUser(Integer id, RcsBotUser related_rcsbotuser) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotUser existingrcsBotUser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotUser != null) {
			existingrcsBotUser.setId(related_rcsbotuser.getId());
			if (related_rcsbotuser.getMobileNo() != null)
				existingrcsBotUser.setMobileNo(related_rcsbotuser.getMobileNo());
			if (related_rcsbotuser.getLoginSource() != null)
				existingrcsBotUser.setLoginSource(related_rcsbotuser.getLoginSource());
			if (related_rcsbotuser.getEmail() != null)
				existingrcsBotUser.setEmail(related_rcsbotuser.getEmail());
			if (related_rcsbotuser.getVerifiedEmail() != null)
				existingrcsBotUser.setVerifiedEmail(related_rcsbotuser.getVerifiedEmail());
			if (related_rcsbotuser.getVerifiedPhone() != null)
				existingrcsBotUser.setVerifiedPhone(related_rcsbotuser.getVerifiedPhone());
			if (related_rcsbotuser.getGpsLocation() != null)
				existingrcsBotUser.setGpsLocation(related_rcsbotuser.getGpsLocation());
			if (related_rcsbotuser.getLon() != null)
				existingrcsBotUser.setLon(related_rcsbotuser.getLon());
			if (related_rcsbotuser.getLat() != null)
				existingrcsBotUser.setLat(related_rcsbotuser.getLat());
			if (related_rcsbotuser.getAltPhone() != null)
				existingrcsBotUser.setAltPhone(related_rcsbotuser.getAltPhone());
			if (related_rcsbotuser.getPassword() != null)
				existingrcsBotUser.setPassword(related_rcsbotuser.getPassword());
			if (related_rcsbotuser.getFname() != null)
				existingrcsBotUser.setFname(related_rcsbotuser.getFname());
			if (related_rcsbotuser.getLname() != null)
				existingrcsBotUser.setLname(related_rcsbotuser.getLname());
			if (related_rcsbotuser.getUserStatus() != null)
				existingrcsBotUser.setUserStatus(related_rcsbotuser.getUserStatus());
			if (related_rcsbotuser.getUserType() != null)
				existingrcsBotUser.setUserType(related_rcsbotuser.getUserType());
			if (related_rcsbotuser.getLastLoginTime() != null)
				existingrcsBotUser.setLastLoginTime(related_rcsbotuser.getLastLoginTime());
			if (related_rcsbotuser.getLoginCount() != null)
				existingrcsBotUser.setLoginCount(related_rcsbotuser.getLoginCount());
			if (related_rcsbotuser.getWrongPasswordCount() != null)
				existingrcsBotUser.setWrongPasswordCount(related_rcsbotuser.getWrongPasswordCount());
			if (related_rcsbotuser.getOtp() != null)
				existingrcsBotUser.setOtp(related_rcsbotuser.getOtp());
			if (related_rcsbotuser.getLang() != null)
				existingrcsBotUser.setLang(related_rcsbotuser.getLang());

			existingrcsBotUser.setCreateDate(related_rcsbotuser.getCreateDate());
			existingrcsBotUser.setLastUpdate(related_rcsbotuser.getLastUpdate());
			if (related_rcsbotuser.getProfileImageName() != null)
				existingrcsBotUser.setProfileImageName(related_rcsbotuser.getProfileImageName());
			if (related_rcsbotuser.getCompanyName() != null)
				existingrcsBotUser.setCompanyName(related_rcsbotuser.getCompanyName());
			related_rcsbotuser = existingrcsBotUser;
		}

		rcsbot.setRcsBotUser(related_rcsbotuser);
		related_rcsbotuser.getRcsBots().add(rcsbot);
		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		related_rcsbotuser = rcsBotUserDAO.store(related_rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotCategory(Integer rcsbot_id, Integer related_rcsbotcategory_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);
		RcsBotCategory related_rcsbotcategory = rcsBotCategoryDAO
				.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id, -1, -1);

		rcsbot.setRcsBotCategory(null);
		related_rcsbotcategory.getRcsBots().remove(rcsbot);
		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		related_rcsbotcategory = rcsBotCategoryDAO.store(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		rcsBotCategoryDAO.remove(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbot;
	}

	/**
	 * Save an existing RcsBotCategory entity
	 * 
	 */
	@Transactional
	public RcsBot saveRcsBotRcsBotCategory(Integer id, RcsBotCategory related_rcsbotcategory) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(id, -1, -1);
		RcsBotCategory existingrcsBotCategory = rcsBotCategoryDAO
				.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory.getId());

		// copy into the existing record to preserve existing relationships
		if (existingrcsBotCategory != null) {
			existingrcsBotCategory.setId(related_rcsbotcategory.getId());
			if (related_rcsbotcategory.getImageName() != null)
				existingrcsBotCategory.setCategoryName(related_rcsbotcategory.getImageName());
			existingrcsBotCategory.setCreateDate(related_rcsbotcategory.getCreateDate());
			existingrcsBotCategory.setLastUpdate(related_rcsbotcategory.getLastUpdate());
			if (related_rcsbotcategory.getImageName() != null)
				existingrcsBotCategory.setImageName(related_rcsbotcategory.getImageName());
			related_rcsbotcategory = existingrcsBotCategory;
		}

		rcsbot.setRcsBotCategory(related_rcsbotcategory);
		related_rcsbotcategory.getRcsBots().add(rcsbot);
		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		related_rcsbotcategory = rcsBotCategoryDAO.store(related_rcsbotcategory);
		rcsBotCategoryDAO.flush();

		return rcsbot;
	}

	/**
	 * Delete an existing RcsBotUser entity
	 * 
	 */
	@Transactional
	public RcsBot deleteRcsBotRcsBotUser(Integer rcsbot_id, Integer related_rcsbotuser_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);
		RcsBotUser related_rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id, -1, -1);

		rcsbot.setRcsBotUser(null);
		related_rcsbotuser.getRcsBots().remove(rcsbot);
		rcsbot = rcsBotDAO.store(rcsbot);
		rcsBotDAO.flush();

		related_rcsbotuser = rcsBotUserDAO.store(related_rcsbotuser);
		rcsBotUserDAO.flush();

		rcsBotUserDAO.remove(related_rcsbotuser);
		rcsBotUserDAO.flush();

		return rcsbot;
	}

	/**
	 * Return a count of all RcsBot entity
	 * 
	 */
	@Transactional
	public Integer countRcsBots() {
		return ((Long) rcsBotDAO.createQuerySingleResult("select count(o) from RcsBot o").getSingleResult()).intValue();
	}

	public Set<RcsBot> findRcsBotByRcsBotCategoryId(Integer rcsBotCategoryId, int startResult, int maxRows) {
		return rcsBotDAO.findRcsBotByRcsBotCategoryId(rcsBotCategoryId, startResult, maxRows);
	}
	public List<RcsBot> findAllRcsBotsByUser(Integer userId,Integer startResult, Integer maxRows)
	{
		return null;
	}
}
