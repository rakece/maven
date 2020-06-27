package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotUserroleDAO;

import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;

import com.kirusa.service.RcsBotUserroleService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotUserrole entities
 * 
 */

@Controller("RcsBotUserroleRestController")

public class RcsBotUserroleRestController {

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
	 * Service injected by Spring that provides CRUD operations for RcsBotUserrole entities
	 * 
	 */
	@Autowired
	private RcsBotUserroleService rcsBotUserroleService;

	/**
	 * Select an existing RcsBotUserrole entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUserrole loadRcsBotUserrole(@PathVariable Integer rcsbotuserrole_id) {
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole_id);
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotUser newRcsBotUserroleRcsBotUser(@PathVariable Integer rcsbotuserrole_id, @RequestBody RcsBotUser rcsbotuser) {
		rcsBotUserroleService.saveRcsBotUserroleRcsBotUser(rcsbotuserrole_id, rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}

	/**
	* Save an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotUserrole saveRcsBotUserrole(@RequestBody RcsBotUserrole rcsbotuserrole) {
		rcsBotUserroleService.saveRcsBotUserrole(rcsbotuserrole);
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole.getId());
	}

	/**
	* Delete an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUserrole(@PathVariable Integer rcsbotuserrole_id) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole_id);
		rcsBotUserroleService.deleteRcsBotUserrole(rcsbotuserrole);
	}

	/**
	* Get RcsBotUser entity by RcsBotUserrole
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUser getRcsBotUserroleRcsBotUser(@PathVariable Integer rcsbotuserrole_id) {
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole_id).getRcsBotUser();
	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser/{rcsbotuser_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotUserroleRcsBotUser(@PathVariable Integer rcsbotuserrole_id, @PathVariable Integer related_rcsbotuser_id) {
		rcsBotUserroleService.deleteRcsBotUserroleRcsBotUser(rcsbotuserrole_id, related_rcsbotuser_id);
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
	* View an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser/{rcsbotuser_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotUser loadRcsBotUserroleRcsBotUser(@PathVariable Integer rcsbotuserrole_id, @PathVariable Integer related_rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id, -1, -1);

		return rcsbotuser;
	}

	/**
	* Show all RcsBotUserrole entities
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotUserrole> listRcsBotUserroles() {
		return new java.util.ArrayList<RcsBotUserrole>(rcsBotUserroleService.loadRcsBotUserroles());
	}

	/**
	* Create a new RcsBotUserrole entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotUserrole newRcsBotUserrole(@RequestBody RcsBotUserrole rcsbotuserrole) {
		rcsBotUserroleService.saveRcsBotUserrole(rcsbotuserrole);
		return rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserrole.getId());
	}

	/**
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping(value = "/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotUser saveRcsBotUserroleRcsBotUser(@PathVariable Integer rcsbotuserrole_id, @RequestBody RcsBotUser rcsbotuser) {
		rcsBotUserroleService.saveRcsBotUserroleRcsBotUser(rcsbotuserrole_id, rcsbotuser);
		return rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser.getId());
	}
}