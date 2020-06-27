package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotTypeDescDAO;

import com.kirusa.domain.RcsBotTypeDesc;

import com.kirusa.service.RcsBotTypeDescService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotTypeDesc entities
 * 
 */

@Controller("RcsBotTypeDescRestController")

public class RcsBotTypeDescRestController {

	/**
	 * DAO injected by Spring that manages RcsBotTypeDesc entities
	 * 
	 */
	@Autowired
	private RcsBotTypeDescDAO rcsBotTypeDescDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotTypeDesc entities
	 * 
	 */
	@Autowired
	private RcsBotTypeDescService rcsBotTypeDescService;

	/**
	 * Show all RcsBotTypeDesc entities
	 * 
	 */
	@RequestMapping(value = "/RcsBotTypeDesc", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotTypeDesc> listRcsBotTypeDescs() {
		return new java.util.ArrayList<RcsBotTypeDesc>(rcsBotTypeDescService.loadRcsBotTypeDescs());
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
	* Save an existing RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTypeDesc", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotTypeDesc saveRcsBotTypeDesc(@RequestBody RcsBotTypeDesc rcsbottypedesc) {
		rcsBotTypeDescService.saveRcsBotTypeDesc(rcsbottypedesc);
		return rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(rcsbottypedesc.getId());
	}

	/**
	* Select an existing RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTypeDesc/{rcsbottypedesc_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotTypeDesc loadRcsBotTypeDesc(@PathVariable Integer rcsbottypedesc_id) {
		return rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(rcsbottypedesc_id);
	}

	/**
	* Delete an existing RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTypeDesc/{rcsbottypedesc_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotTypeDesc(@PathVariable Integer rcsbottypedesc_id) {
		RcsBotTypeDesc rcsbottypedesc = rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(rcsbottypedesc_id);
		rcsBotTypeDescService.deleteRcsBotTypeDesc(rcsbottypedesc);
	}

	/**
	* Create a new RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTypeDesc", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotTypeDesc newRcsBotTypeDesc(@RequestBody RcsBotTypeDesc rcsbottypedesc) {
		rcsBotTypeDescService.saveRcsBotTypeDesc(rcsbottypedesc);
		return rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(rcsbottypedesc.getId());
	}
}