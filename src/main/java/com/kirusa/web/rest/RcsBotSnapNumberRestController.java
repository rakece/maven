package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotSnapNumberDAO;

import com.kirusa.domain.RcsBotSnapNumber;

import com.kirusa.service.RcsBotSnapNumberService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotSnapNumber entities
 * 
 */

@Controller("RcsBotSnapNumberRestController")

public class RcsBotSnapNumberRestController {

	/**
	 * DAO injected by Spring that manages RcsBotSnapNumber entities
	 * 
	 */
	@Autowired
	private RcsBotSnapNumberDAO rcsBotSnapNumberDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotSnapNumber entities
	 * 
	 */
	@Autowired
	private RcsBotSnapNumberService rcsBotSnapNumberService;

	/**
	 * Show all RcsBotSnapNumber entities
	 * 
	 */
	@RequestMapping(value = "/RcsBotSnapNumber", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotSnapNumber> listRcsBotSnapNumbers() {
		return new java.util.ArrayList<RcsBotSnapNumber>(rcsBotSnapNumberService.loadRcsBotSnapNumbers());
	}

	/**
	* Delete an existing RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping(value = "/RcsBotSnapNumber/{rcsbotsnapnumber_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotSnapNumber(@PathVariable Integer rcsbotsnapnumber_id) {
		RcsBotSnapNumber rcsbotsnapnumber = rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(rcsbotsnapnumber_id);
		rcsBotSnapNumberService.deleteRcsBotSnapNumber(rcsbotsnapnumber);
	}

	/**
	* Save an existing RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping(value = "/RcsBotSnapNumber", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotSnapNumber saveRcsBotSnapNumber(@RequestBody RcsBotSnapNumber rcsbotsnapnumber) {
		rcsBotSnapNumberService.saveRcsBotSnapNumber(rcsbotsnapnumber);
		return rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(rcsbotsnapnumber.getId());
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
	* Select an existing RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping(value = "/RcsBotSnapNumber/{rcsbotsnapnumber_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotSnapNumber loadRcsBotSnapNumber(@PathVariable Integer rcsbotsnapnumber_id) {
		return rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(rcsbotsnapnumber_id);
	}

	/**
	* Create a new RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping(value = "/RcsBotSnapNumber", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotSnapNumber newRcsBotSnapNumber(@RequestBody RcsBotSnapNumber rcsbotsnapnumber) {
		rcsBotSnapNumberService.saveRcsBotSnapNumber(rcsbotsnapnumber);
		return rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(rcsbotsnapnumber.getId());
	}
}