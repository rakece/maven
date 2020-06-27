package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotCarrierDAO;

import com.kirusa.domain.RcsBotCarrier;

import com.kirusa.service.RcsBotCarrierService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotCarrier entities
 * 
 */

@Controller("RcsBotCarrierRestController")

public class RcsBotCarrierRestController {

	/**
	 * DAO injected by Spring that manages RcsBotCarrier entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierDAO rcsBotCarrierDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotCarrier entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierService rcsBotCarrierService;

	/**
	 * Create a new RcsBotCarrier entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotCarrier", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCarrier newRcsBotCarrier(@RequestBody RcsBotCarrier rcsbotcarrier) {
		rcsBotCarrierService.saveRcsBotCarrier(rcsbotcarrier);
		return rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(rcsbotcarrier.getId());
	}

	/**
	* Save an existing RcsBotCarrier entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrier", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCarrier saveRcsBotCarrier(@RequestBody RcsBotCarrier rcsbotcarrier) {
		rcsBotCarrierService.saveRcsBotCarrier(rcsbotcarrier);
		return rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(rcsbotcarrier.getId());
	}

	/**
	* Delete an existing RcsBotCarrier entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrier/{rcsbotcarrier_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCarrier(@PathVariable Integer rcsbotcarrier_id) {
		RcsBotCarrier rcsbotcarrier = rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(rcsbotcarrier_id);
		rcsBotCarrierService.deleteRcsBotCarrier(rcsbotcarrier);
	}

	/**
	* Select an existing RcsBotCarrier entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrier/{rcsbotcarrier_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCarrier loadRcsBotCarrier(@PathVariable Integer rcsbotcarrier_id) {
		return rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(rcsbotcarrier_id);
	}

	/**
	* Show all RcsBotCarrier entities
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrier", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotCarrier> listRcsBotCarriers() {
		return new java.util.ArrayList<RcsBotCarrier>(rcsBotCarrierService.loadRcsBotCarriers());
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