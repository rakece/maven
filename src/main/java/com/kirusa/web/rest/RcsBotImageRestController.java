package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotImageDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotImage;

import com.kirusa.service.RcsBotImageService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for RcsBotImage entities
 * 
 */

@Controller("RcsBotImageRestController")

public class RcsBotImageRestController {

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
	 * Service injected by Spring that provides CRUD operations for RcsBotImage entities
	 * 
	 */
	@Autowired
	private RcsBotImageService rcsBotImageService;

	/**
	 * Get RcsBot entity by RcsBotImage
	 * 
	 */
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotImageRcsBot(@PathVariable Integer rcsbotimage_id) {
		return rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage_id).getRcsBot();
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotImageRcsBot(@PathVariable Integer rcsbotimage_id, @RequestBody RcsBot rcsbot) {
		rcsBotImageService.saveRcsBotImageRcsBot(rcsbotimage_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Show all RcsBotImage entities
	* 
	*/
	@RequestMapping(value = "/RcsBotImage", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotImage> listRcsBotImages() {
		return new java.util.ArrayList<RcsBotImage>(rcsBotImageService.loadRcsBotImages());
	}

	/**
	* Save an existing RcsBotImage entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotImage saveRcsBotImage(@RequestBody RcsBotImage rcsbotimage) {
		rcsBotImageService.saveRcsBotImage(rcsbotimage);
		return rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage.getId());
	}

	/**
	* Create a new RcsBotImage entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotImage newRcsBotImage(@RequestBody RcsBotImage rcsbotimage) {
		rcsBotImageService.saveRcsBotImage(rcsbotimage);
		return rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage.getId());
	}

	/**
	* Select an existing RcsBotImage entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotImage loadRcsBotImage(@PathVariable Integer rcsbotimage_id) {
		return rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage_id);
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotImageRcsBot(@PathVariable Integer rcsbotimage_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotImageService.deleteRcsBotImageRcsBot(rcsbotimage_id, related_rcsbot_id);
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotImageRcsBot(@PathVariable Integer rcsbotimage_id, @RequestBody RcsBot rcsbot) {
		rcsBotImageService.saveRcsBotImageRcsBot(rcsbotimage_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotImageRcsBot(@PathVariable Integer rcsbotimage_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}

	/**
	* Delete an existing RcsBotImage entity
	* 
	*/
	@RequestMapping(value = "/RcsBotImage/{rcsbotimage_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotImage(@PathVariable Integer rcsbotimage_id) {
		RcsBotImage rcsbotimage = rcsBotImageDAO.findRcsBotImageByPrimaryKey(rcsbotimage_id);
		rcsBotImageService.deleteRcsBotImage(rcsbotimage);
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}