package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsCountryList;

import com.kirusa.service.RcsBotAvailableService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotAvailable entities
 * 
 */

@Controller("RcsBotAvailableRestController")

public class RcsBotAvailableRestController {

	
	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableService rcsBotAvailableService;

	/**
	 * Delete an existing RcsCountryList entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList/{rcscountrylist_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotAvailableRcsCountryList(@PathVariable Integer rcsbotavailable_id, @PathVariable Integer related_rcscountrylist_id) {
		rcsBotAvailableService.deleteRcsBotAvailableRcsCountryList(rcsbotavailable_id, related_rcscountrylist_id);
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotAvailableRcsBot(@PathVariable Integer rcsbotavailable_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}

	/**
	* View an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList/{rcscountrylist_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsCountryList loadRcsBotAvailableRcsCountryList(@PathVariable Integer rcsbotavailable_id, @PathVariable Integer related_rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(related_rcscountrylist_id, -1, -1);

		return rcscountrylist;
	}

	/**
	* Get RcsCountryList entity by RcsBotAvailable
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList", method = RequestMethod.GET)
	@ResponseBody
	public RcsCountryList getRcsBotAvailableRcsCountryList(@PathVariable Integer rcsbotavailable_id) {
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable_id).getRcsCountryList();
	}

	/**
	* Save an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList", method = RequestMethod.PUT)
	@ResponseBody
	public RcsCountryList saveRcsBotAvailableRcsCountryList(@PathVariable Integer rcsbotavailable_id, @RequestBody RcsCountryList rcscountrylist) {
		rcsBotAvailableService.saveRcsBotAvailableRcsCountryList(rcsbotavailable_id, rcscountrylist);
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotAvailableRcsBot(@PathVariable Integer rcsbotavailable_id, @RequestBody RcsBot rcsbot) {
		rcsBotAvailableService.saveRcsBotAvailableRcsBot(rcsbotavailable_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Select an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotAvailable loadRcsBotAvailable(@PathVariable Integer rcsbotavailable_id) {
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable_id);
	}

	/**
	* Save an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotAvailable saveRcsBotAvailable(@RequestBody RcsBotAvailable rcsbotavailable) {
		rcsBotAvailableService.saveRcsBotAvailable(rcsbotavailable);
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotAvailableRcsBot(@PathVariable Integer rcsbotavailable_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotAvailableService.deleteRcsBotAvailableRcsBot(rcsbotavailable_id, related_rcsbot_id);
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
	* Create a new RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotAvailable newRcsBotAvailable(@RequestBody RcsBotAvailable rcsbotavailable) {
		rcsBotAvailableService.saveRcsBotAvailable(rcsbotavailable);
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable.getId());
	}

	/**
	* Get RcsBot entity by RcsBotAvailable
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotAvailableRcsBot(@PathVariable Integer rcsbotavailable_id) {
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable_id).getRcsBot();
	}

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotAvailable(@PathVariable Integer rcsbotavailable_id) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable_id);
		rcsBotAvailableService.deleteRcsBotAvailable(rcsbotavailable);
	}

	/**
	* Show all RcsBotAvailable entities
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotAvailable> listRcsBotAvailables() {
		return new java.util.ArrayList<RcsBotAvailable>(rcsBotAvailableService.loadRcsBotAvailables());
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotAvailableRcsBot(@PathVariable Integer rcsbotavailable_id, @RequestBody RcsBot rcsbot) {
		rcsBotAvailableService.saveRcsBotAvailableRcsBot(rcsbotavailable_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Create a new RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList", method = RequestMethod.POST)
	@ResponseBody
	public RcsCountryList newRcsBotAvailableRcsCountryList(@PathVariable Integer rcsbotavailable_id, @RequestBody RcsCountryList rcscountrylist) {
		rcsBotAvailableService.saveRcsBotAvailableRcsCountryList(rcsbotavailable_id, rcscountrylist);
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());
	}
	
}