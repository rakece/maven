package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotUserroleDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;
import com.kirusa.domain.RcsCountryList;

import com.kirusa.service.RcsBotUserService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotUser entities
 * 
 */

@Controller("RcsBotUserRestController")

public class RcsBotUserRestController {

	/**
	 * DAO injected by Spring that manages RcsBotBilling entities
	 * 
	 */
	@Autowired
	private RcsBotBillingDAO rcsBotBillingDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUserrole entities
	 * 
	 */
	@Autowired
	private RcsBotUserroleDAO rcsBotUserroleDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserService rcsBotUserService;

	/**
	 * Delete an existing RcsBotUser entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUser(@PathVariable Integer rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id);
		rcsBotUserService.deleteRcsBotUser(rcsbotuser);
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotUser newRcsBotUser(@RequestBody RcsBotUser rcsbotuser) {
		rcsBotUserService.saveRcsBotUser(rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}

	/**
	* Delete an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotBillings/{rcsbotbilling_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUserRcsBotBillings(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcsbotbillings_id) {
		rcsBotUserService.deleteRcsBotUserRcsBotBillings(rcsbotuser_id, related_rcsbotbillings_id);
	}

	/**
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotUser saveRcsBotUser(@RequestBody RcsBotUser rcsbotuser) {
		rcsBotUserService.saveRcsBotUser(rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}

	/**
	* View an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles/{rcsbotuserrole_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUserrole loadRcsBotUserRcsBotUserroles(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcsbotuserroles_id) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(related_rcsbotuserroles_id, -1, -1);

		return rcsbotuserrole;
	}

	/**
	* View an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsCountryList/{rcscountrylist_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsCountryList loadRcsBotUserRcsCountryList(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(related_rcscountrylist_id, -1, -1);

		return rcscountrylist;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBots", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotUserRcsBots(@PathVariable Integer rcsbotuser_id, @RequestBody RcsBot rcsbots) {
		rcsBotUserService.saveRcsBotUserRcsBots(rcsbotuser_id, rcsbots);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbots.getId());
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
	* Select an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUser loadRcsBotUser(@PathVariable Integer rcsbotuser_id) {
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id);
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBots/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotUserRcsBots(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcsbots_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots_id, -1, -1);

		return rcsbot;
	}

	/**
	* Delete an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles/{rcsbotuserrole_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUserRcsBotUserroles(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcsbotuserroles_id) {
		rcsBotUserService.deleteRcsBotUserRcsBotUserroles(rcsbotuser_id, related_rcsbotuserroles_id);
	}

	/**
	* Save an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotUserrole saveRcsBotUserRcsBotUserroles(@PathVariable Integer rcsbotuser_id, @RequestBody RcsBotUserrole rcsbotuserroles) {
		rcsBotUserService.saveRcsBotUserRcsBotUserroles(rcsbotuser_id, rcsbotuserroles);
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserroles.getId());
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBots", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotUserRcsBots(@PathVariable Integer rcsbotuser_id, @RequestBody RcsBot rcsbot) {
		rcsBotUserService.saveRcsBotUserRcsBots(rcsbotuser_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Save an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsCountryList", method = RequestMethod.PUT)
	@ResponseBody
	public RcsCountryList saveRcsBotUserRcsCountryList(@PathVariable Integer rcsbotuser_id, @RequestBody RcsCountryList rcscountrylist) {
		rcsBotUserService.saveRcsBotUserRcsCountryList(rcsbotuser_id, rcscountrylist);
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());
	}

	/**
	* Show all RcsBot entities by RcsBotUser
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBots", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBot> getRcsBotUserRcsBots(@PathVariable Integer rcsbotuser_id) {
		return new java.util.ArrayList<RcsBot>(rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id).getRcsBots());
	}

	/**
	* View an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotBillings/{rcsbotbilling_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotBilling loadRcsBotUserRcsBotBillings(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcsbotbillings_id) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(related_rcsbotbillings_id, -1, -1);

		return rcsbotbilling;
	}

	/**
	* Create a new RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsCountryList", method = RequestMethod.POST)
	@ResponseBody
	public RcsCountryList newRcsBotUserRcsCountryList(@PathVariable Integer rcsbotuser_id, @RequestBody RcsCountryList rcscountrylist) {
		rcsBotUserService.saveRcsBotUserRcsCountryList(rcsbotuser_id, rcscountrylist);
		return rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBots/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUserRcsBots(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcsbots_id) {
		rcsBotUserService.deleteRcsBotUserRcsBots(rcsbotuser_id, related_rcsbots_id);
	}

	/**
	* Create a new RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotUserrole newRcsBotUserRcsBotUserroles(@PathVariable Integer rcsbotuser_id, @RequestBody RcsBotUserrole rcsbotuserrole) {
		rcsBotUserService.saveRcsBotUserRcsBotUserroles(rcsbotuser_id, rcsbotuserrole);
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole.getId());
	}

	/**
	* Create a new RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotBillings", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotBilling newRcsBotUserRcsBotBillings(@PathVariable Integer rcsbotuser_id, @RequestBody RcsBotBilling rcsbotbilling) {
		rcsBotUserService.saveRcsBotUserRcsBotBillings(rcsbotuser_id, rcsbotbilling);
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling.getId());
	}

	/**
	* Show all RcsBotBilling entities by RcsBotUser
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotBillings", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotBilling> getRcsBotUserRcsBotBillings(@PathVariable Integer rcsbotuser_id) {
		return new java.util.ArrayList<RcsBotBilling>(rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id).getRcsBotBillings());
	}

	/**
	* Get RcsCountryList entity by RcsBotUser
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsCountryList", method = RequestMethod.GET)
	@ResponseBody
	public RcsCountryList getRcsBotUserRcsCountryList(@PathVariable Integer rcsbotuser_id) {
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id).getRcsCountryList();
	}

	/**
	* Show all RcsBotUserrole entities by RcsBotUser
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotUserrole> getRcsBotUserRcsBotUserroles(@PathVariable Integer rcsbotuser_id) {
		return new java.util.ArrayList<RcsBotUserrole>(rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id).getRcsBotUserroles());
	}

	/**
	* Save an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsBotBillings", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotBilling saveRcsBotUserRcsBotBillings(@PathVariable Integer rcsbotuser_id, @RequestBody RcsBotBilling rcsbotbillings) {
		rcsBotUserService.saveRcsBotUserRcsBotBillings(rcsbotuser_id, rcsbotbillings);
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbillings.getId());
	}

	/**
	* Show all RcsBotUser entities
	* 
	*/
	@RequestMapping(value = "/RcsBotUser", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotUser> listRcsBotUsers() {
		return new java.util.ArrayList<RcsBotUser>(rcsBotUserService.loadRcsBotUsers());
	}

	/**
	* Delete an existing RcsCountryList entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUser/{rcsbotuser_id}/rcsCountryList/{rcscountrylist_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUserRcsCountryList(@PathVariable Integer rcsbotuser_id, @PathVariable Integer related_rcscountrylist_id) {
		rcsBotUserService.deleteRcsBotUserRcsCountryList(rcsbotuser_id, related_rcscountrylist_id);
	}
}