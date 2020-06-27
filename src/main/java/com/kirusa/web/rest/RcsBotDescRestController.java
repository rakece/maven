package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotDescDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotDesc;

import com.kirusa.service.RcsBotDescService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotDesc entities
 * 
 */

@Controller("RcsBotDescRestController")

public class RcsBotDescRestController {

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
	 * Service injected by Spring that provides CRUD operations for RcsBotDesc entities
	 * 
	 */
	@Autowired
	private RcsBotDescService rcsBotDescService;

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotDescRcsBot(@PathVariable Integer rcsbotdesc_id, @RequestBody RcsBot rcsbot) {
		rcsBotDescService.saveRcsBotDescRcsBot(rcsbotdesc_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Create a new RcsBotDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotDesc newRcsBotDesc(@RequestBody RcsBotDesc rcsbotdesc) {
		rcsBotDescService.saveRcsBotDesc(rcsbotdesc);
		return rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotDescRcsBot(@PathVariable Integer rcsbotdesc_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotDescService.deleteRcsBotDescRcsBot(rcsbotdesc_id, related_rcsbot_id);
	}

	/**
	* Select an existing RcsBotDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotDesc loadRcsBotDesc(@PathVariable Integer rcsbotdesc_id) {
		return rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc_id);
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
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotDescRcsBot(@PathVariable Integer rcsbotdesc_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}

	/**
	* Delete an existing RcsBotDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotDesc(@PathVariable Integer rcsbotdesc_id) {
		RcsBotDesc rcsbotdesc = rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc_id);
		rcsBotDescService.deleteRcsBotDesc(rcsbotdesc);
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotDescRcsBot(@PathVariable Integer rcsbotdesc_id, @RequestBody RcsBot rcsbot) {
		rcsBotDescService.saveRcsBotDescRcsBot(rcsbotdesc_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Save an existing RcsBotDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotDesc saveRcsBotDesc(@RequestBody RcsBotDesc rcsbotdesc) {
		rcsBotDescService.saveRcsBotDesc(rcsbotdesc);
		return rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc.getId());
	}

	/**
	* Show all RcsBotDesc entities
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotDesc> listRcsBotDescs() {
		return new java.util.ArrayList<RcsBotDesc>(rcsBotDescService.loadRcsBotDescs());
	}

	/**
	* Get RcsBot entity by RcsBotDesc
	* 
	*/
	@RequestMapping(value = "/RcsBotDesc/{rcsbotdesc_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotDescRcsBot(@PathVariable Integer rcsbotdesc_id) {
		return rcsBotDescDAO.findRcsBotDescByPrimaryKey(rcsbotdesc_id).getRcsBot();
	}
}