package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotCarrierMappingDAO;

import com.kirusa.domain.RcsBotCarrierMapping;

import com.kirusa.service.RcsBotCarrierMappingService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotCarrierMapping entities
 * 
 */

@Controller("RcsBotCarrierMappingRestController")

public class RcsBotCarrierMappingRestController {

	/**
	 * DAO injected by Spring that manages RcsBotCarrierMapping entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierMappingDAO rcsBotCarrierMappingDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotCarrierMapping entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierMappingService rcsBotCarrierMappingService;

	/**
	 * Delete an existing RcsBotCarrierMapping entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotCarrierMapping/{rcsbotcarriermapping_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCarrierMapping(@PathVariable Integer rcsbotcarriermapping_id) {
		RcsBotCarrierMapping rcsbotcarriermapping = rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(rcsbotcarriermapping_id);
		rcsBotCarrierMappingService.deleteRcsBotCarrierMapping(rcsbotcarriermapping);
	}

	/**
	* Create a new RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrierMapping", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCarrierMapping newRcsBotCarrierMapping(@RequestBody RcsBotCarrierMapping rcsbotcarriermapping) {
		rcsBotCarrierMappingService.saveRcsBotCarrierMapping(rcsbotcarriermapping);
		return rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(rcsbotcarriermapping.getId());
	}

	/**
	* Show all RcsBotCarrierMapping entities
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrierMapping", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotCarrierMapping> listRcsBotCarrierMappings() {
		return new java.util.ArrayList<RcsBotCarrierMapping>(rcsBotCarrierMappingService.loadRcsBotCarrierMappings());
	}

	/**
	* Save an existing RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrierMapping", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCarrierMapping saveRcsBotCarrierMapping(@RequestBody RcsBotCarrierMapping rcsbotcarriermapping) {
		rcsBotCarrierMappingService.saveRcsBotCarrierMapping(rcsbotcarriermapping);
		return rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(rcsbotcarriermapping.getId());
	}

	/**
	* Select an existing RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCarrierMapping/{rcsbotcarriermapping_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCarrierMapping loadRcsBotCarrierMapping(@PathVariable Integer rcsbotcarriermapping_id) {
		return rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(rcsbotcarriermapping_id);
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