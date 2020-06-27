package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotVideoDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotVideo;

import com.kirusa.service.RcsBotVideoService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotVideo entities
 * 
 */

@Controller("RcsBotVideoRestController")

public class RcsBotVideoRestController {

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
	 * Service injected by Spring that provides CRUD operations for RcsBotVideo entities
	 * 
	 */
	@Autowired
	private RcsBotVideoService rcsBotVideoService;

	/**
	 * Select an existing RcsBotVideo entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotVideo loadRcsBotVideo(@PathVariable Integer rcsbotvideo_id) {
		return rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo_id);
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotVideoRcsBot(@PathVariable Integer rcsbotvideo_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}

	/**
	* Get RcsBot entity by RcsBotVideo
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotVideoRcsBot(@PathVariable Integer rcsbotvideo_id) {
		return rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo_id).getRcsBot();
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotVideoRcsBot(@PathVariable Integer rcsbotvideo_id, @RequestBody RcsBot rcsbot) {
		rcsBotVideoService.saveRcsBotVideoRcsBot(rcsbotvideo_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Create a new RcsBotVideo entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotVideo newRcsBotVideo(@RequestBody RcsBotVideo rcsbotvideo) {
		rcsBotVideoService.saveRcsBotVideo(rcsbotvideo);
		return rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo.getId());
	}

	/**
	* Delete an existing RcsBotVideo entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotVideo(@PathVariable Integer rcsbotvideo_id) {
		RcsBotVideo rcsbotvideo = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo_id);
		rcsBotVideoService.deleteRcsBotVideo(rcsbotvideo);
	}

	/**
	* Show all RcsBotVideo entities
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotVideo> listRcsBotVideos() {
		return new java.util.ArrayList<RcsBotVideo>(rcsBotVideoService.loadRcsBotVideos());
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

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotVideoRcsBot(@PathVariable Integer rcsbotvideo_id, @RequestBody RcsBot rcsbot) {
		rcsBotVideoService.saveRcsBotVideoRcsBot(rcsbotvideo_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo/{rcsbotvideo_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotVideoRcsBot(@PathVariable Integer rcsbotvideo_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotVideoService.deleteRcsBotVideoRcsBot(rcsbotvideo_id, related_rcsbot_id);
	}

	/**
	* Save an existing RcsBotVideo entity
	* 
	*/
	@RequestMapping(value = "/RcsBotVideo", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotVideo saveRcsBotVideo(@RequestBody RcsBotVideo rcsbotvideo) {
		rcsBotVideoService.saveRcsBotVideo(rcsbotvideo);
		return rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(rcsbotvideo.getId());
	}
}