package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotPublisherDAO;

import com.kirusa.domain.RcsBotPublisher;

import com.kirusa.service.RcsBotPublisherService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotPublisher entities
 * 
 */

@Controller("RcsBotPublisherRestController")

public class RcsBotPublisherRestController {

	/**
	 * DAO injected by Spring that manages RcsBotPublisher entities
	 * 
	 */
	@Autowired
	private RcsBotPublisherDAO rcsBotPublisherDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotPublisher entities
	 * 
	 */
	@Autowired
	private RcsBotPublisherService rcsBotPublisherService;

	/**
	 * Create a new RcsBotPublisher entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotPublisher", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotPublisher newRcsBotPublisher(@RequestBody RcsBotPublisher rcsbotpublisher) {
		rcsBotPublisherService.saveRcsBotPublisher(rcsbotpublisher);
		return rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(rcsbotpublisher.getId());
	}

	/**
	* Delete an existing RcsBotPublisher entity
	* 
	*/
	@RequestMapping(value = "/RcsBotPublisher/{rcsbotpublisher_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotPublisher(@PathVariable Integer rcsbotpublisher_id) {
		RcsBotPublisher rcsbotpublisher = rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(rcsbotpublisher_id);
		rcsBotPublisherService.deleteRcsBotPublisher(rcsbotpublisher);
	}

	/**
	* Select an existing RcsBotPublisher entity
	* 
	*/
	@RequestMapping(value = "/RcsBotPublisher/{rcsbotpublisher_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotPublisher loadRcsBotPublisher(@PathVariable Integer rcsbotpublisher_id) {
		return rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(rcsbotpublisher_id);
	}

	/**
	* Save an existing RcsBotPublisher entity
	* 
	*/
	@RequestMapping(value = "/RcsBotPublisher", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotPublisher saveRcsBotPublisher(@RequestBody RcsBotPublisher rcsbotpublisher) {
		rcsBotPublisherService.saveRcsBotPublisher(rcsbotpublisher);
		return rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(rcsbotpublisher.getId());
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
	* Show all RcsBotPublisher entities
	* 
	*/
	@RequestMapping(value = "/RcsBotPublisher", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotPublisher> listRcsBotPublishers() {
		return new java.util.ArrayList<RcsBotPublisher>(rcsBotPublisherService.loadRcsBotPublishers());
	}
}