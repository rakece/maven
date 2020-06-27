package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUserDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;

import com.kirusa.service.RcsBotBillingService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotBilling entities
 * 
 */

@Controller("RcsBotBillingRestController")

public class RcsBotBillingRestController {

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
	 * Service injected by Spring that provides CRUD operations for RcsBotBilling entities
	 * 
	 */
	@Autowired
	private RcsBotBillingService rcsBotBillingService;

	/**
	 * Get RcsBotUser entity by RcsBotBilling
	 * 
	 */
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUser getRcsBotBillingRcsBotUser(@PathVariable Integer rcsbotbilling_id) {
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling_id).getRcsBotUser();
	}

	/**
	* Select an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotBilling loadRcsBotBilling(@PathVariable Integer rcsbotbilling_id) {
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling_id);
	}

	/**
	* Create a new RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotBilling newRcsBotBilling(@RequestBody RcsBotBilling rcsbotbilling) {
		rcsBotBillingService.saveRcsBotBilling(rcsbotbilling);
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling.getId());
	}

	/**
	* View an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser/{rcsbotuser_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUser loadRcsBotBillingRcsBotUser(@PathVariable Integer rcsbotbilling_id, @PathVariable Integer related_rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id, -1, -1);

		return rcsbotuser;
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
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotUser saveRcsBotBillingRcsBotUser(@PathVariable Integer rcsbotbilling_id, @RequestBody RcsBotUser rcsbotuser) {
		rcsBotBillingService.saveRcsBotBillingRcsBotUser(rcsbotbilling_id, rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser/{rcsbotuser_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotBillingRcsBotUser(@PathVariable Integer rcsbotbilling_id, @PathVariable Integer related_rcsbotuser_id) {
		rcsBotBillingService.deleteRcsBotBillingRcsBotUser(rcsbotbilling_id, related_rcsbotuser_id);
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotBillingRcsBot(@PathVariable Integer rcsbotbilling_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotBillingRcsBot(@PathVariable Integer rcsbotbilling_id, @RequestBody RcsBot rcsbot) {
		rcsBotBillingService.saveRcsBotBillingRcsBot(rcsbotbilling_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Get RcsBot entity by RcsBotBilling
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotBillingRcsBot(@PathVariable Integer rcsbotbilling_id) {
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling_id).getRcsBot();
	}

	/**
	* Delete an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotBilling(@PathVariable Integer rcsbotbilling_id) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling_id);
		rcsBotBillingService.deleteRcsBotBilling(rcsbotbilling);
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotBillingRcsBot(@PathVariable Integer rcsbotbilling_id, @RequestBody RcsBot rcsbot) {
		rcsBotBillingService.saveRcsBotBillingRcsBot(rcsbotbilling_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Save an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotBilling saveRcsBotBilling(@RequestBody RcsBotBilling rcsbotbilling) {
		rcsBotBillingService.saveRcsBotBilling(rcsbotbilling);
		return rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbilling.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotBillingRcsBot(@PathVariable Integer rcsbotbilling_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotBillingService.deleteRcsBotBillingRcsBot(rcsbotbilling_id, related_rcsbot_id);
	}

	/**
	* Show all RcsBotBilling entities
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotBilling> listRcsBotBillings() {
		return new java.util.ArrayList<RcsBotBilling>(rcsBotBillingService.loadRcsBotBillings());
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotUser newRcsBotBillingRcsBotUser(@PathVariable Integer rcsbotbilling_id, @RequestBody RcsBotUser rcsbotuser) {
		rcsBotBillingService.saveRcsBotBillingRcsBotUser(rcsbotbilling_id, rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}
}