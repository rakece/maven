package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsCountryList;

import com.kirusa.service.RcsCountryListService;

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
 * Spring Rest controller that handles CRUD requests for RcsCountryList entities
 * 
 */

@Controller("RcsCountryListRestController")

public class RcsCountryListRestController {

	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListService rcsCountryListService;

	/**
	 * Show all RcsCountryList entities
	 * 
	 */
	@RequestMapping(value = "/RcsCountryList", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsCountryList> listRcsCountryLists() {
		return new java.util.ArrayList<RcsCountryList>(rcsCountryListService.loadRcsCountryLists());
	}

	/**
	* Select an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsCountryList loadRcsCountryList(@PathVariable Integer rcscountrylist_id) {
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id);
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
	* View an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables/{rcsbotavailable_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotAvailable loadRcsCountryListRcsBotAvailables(@PathVariable Integer rcscountrylist_id, @PathVariable Integer related_rcsbotavailables_id) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(related_rcsbotavailables_id, -1, -1);

		return rcsbotavailable;
	}

	/**
	* Save an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotAvailable saveRcsCountryListRcsBotAvailables(@PathVariable Integer rcscountrylist_id, @RequestBody RcsBotAvailable rcsbotavailables) {
		rcsCountryListService.saveRcsCountryListRcsBotAvailables(rcscountrylist_id, rcsbotavailables);
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailables.getId());
	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotUsers/{rcsbotuser_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsCountryListRcsBotUsers(@PathVariable Integer rcscountrylist_id, @PathVariable Integer related_rcsbotusers_id) {
		rcsCountryListService.deleteRcsCountryListRcsBotUsers(rcscountrylist_id, related_rcsbotusers_id);
	}

	/**
	* Show all RcsBotUser entities by RcsCountryList
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotUser> getRcsCountryListRcsBotUsers(@PathVariable Integer rcscountrylist_id) {
		return new java.util.ArrayList<RcsBotUser>(rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id).getRcsBotUsers());
	}

	/**
	* Save an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList", method = RequestMethod.PUT)
	@ResponseBody
	public RcsCountryList saveRcsCountryList(@RequestBody RcsCountryList rcscountrylist) {
		rcsCountryListService.saveRcsCountryList(rcscountrylist);
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());
	}

	/**
	* Create a new RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotAvailable newRcsCountryListRcsBotAvailables(@PathVariable Integer rcscountrylist_id, @RequestBody RcsBotAvailable rcsbotavailable) {
		rcsCountryListService.saveRcsCountryListRcsBotAvailables(rcscountrylist_id, rcsbotavailable);
		return rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailable.getId());
	}

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables/{rcsbotavailable_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsCountryListRcsBotAvailables(@PathVariable Integer rcscountrylist_id, @PathVariable Integer related_rcsbotavailables_id) {
		rcsCountryListService.deleteRcsCountryListRcsBotAvailables(rcscountrylist_id, related_rcsbotavailables_id);
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotUsers", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotUser newRcsCountryListRcsBotUsers(@PathVariable Integer rcscountrylist_id, @RequestBody RcsBotUser rcsbotuser) {
		rcsCountryListService.saveRcsCountryListRcsBotUsers(rcscountrylist_id, rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}

	/**
	* Show all RcsBotAvailable entities by RcsCountryList
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotAvailable> getRcsCountryListRcsBotAvailables(@PathVariable Integer rcscountrylist_id) {
		return new java.util.ArrayList<RcsBotAvailable>(rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id).getRcsBotAvailables());
	}

	/**
	* Create a new RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList", method = RequestMethod.POST)
	@ResponseBody
	public RcsCountryList newRcsCountryList(@RequestBody RcsCountryList rcscountrylist) {
		rcsCountryListService.saveRcsCountryList(rcscountrylist);
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());
	}

	/**
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotUsers", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotUser saveRcsCountryListRcsBotUsers(@PathVariable Integer rcscountrylist_id, @RequestBody RcsBotUser rcsbotusers) {
		rcsCountryListService.saveRcsCountryListRcsBotUsers(rcscountrylist_id, rcsbotusers);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotusers.getId());
	}

	/**
	* View an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}/rcsBotUsers/{rcsbotuser_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUser loadRcsCountryListRcsBotUsers(@PathVariable Integer rcscountrylist_id, @PathVariable Integer related_rcsbotusers_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotusers_id, -1, -1);

		return rcsbotuser;
	}

	/**
	* Delete an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsCountryList/{rcscountrylist_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsCountryList(@PathVariable Integer rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id);
		rcsCountryListService.deleteRcsCountryList(rcscountrylist);
	}
}