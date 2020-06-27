package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCategoryDescDAO;

import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;

import com.kirusa.service.RcsBotCategoryDescService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotCategoryDesc entities
 * 
 */

@Controller("RcsBotCategoryDescRestController")

public class RcsBotCategoryDescRestController {

	/**
	 * DAO injected by Spring that manages RcsBotCategory entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDAO rcsBotCategoryDAO;

	/**
	 * DAO injected by Spring that manages RcsBotCategoryDesc entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDescDAO rcsBotCategoryDescDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotCategoryDesc entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDescService rcsBotCategoryDescService;

	/**
	 * Save an existing RcsBotCategoryDesc entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotCategoryDesc", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCategoryDesc saveRcsBotCategoryDesc(@RequestBody RcsBotCategoryDesc rcsbotcategorydesc) {
		rcsBotCategoryDescService.saveRcsBotCategoryDesc(rcsbotcategorydesc);
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc.getId());
	}

	/**
	* Show all RcsBotCategoryDesc entities
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotCategoryDesc> listRcsBotCategoryDescs() {
		return new java.util.ArrayList<RcsBotCategoryDesc>(rcsBotCategoryDescService.loadRcsBotCategoryDescs());
	}

	/**
	* Get RcsBotCategory entity by RcsBotCategoryDesc
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}/rcsBotCategory", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategory getRcsBotCategoryDescRcsBotCategory(@PathVariable Integer rcsbotcategorydesc_id) {
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc_id).getRcsBotCategory();
	}

	/**
	* Delete an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCategoryDesc(@PathVariable Integer rcsbotcategorydesc_id) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc_id);
		rcsBotCategoryDescService.deleteRcsBotCategoryDesc(rcsbotcategorydesc);
	}

	/**
	* Save an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}/rcsBotCategory", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCategory saveRcsBotCategoryDescRcsBotCategory(@PathVariable Integer rcsbotcategorydesc_id, @RequestBody RcsBotCategory rcsbotcategory) {
		rcsBotCategoryDescService.saveRcsBotCategoryDescRcsBotCategory(rcsbotcategorydesc_id, rcsbotcategory);
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());
	}

	/**
	* Select an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategoryDesc loadRcsBotCategoryDesc(@PathVariable Integer rcsbotcategorydesc_id) {
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc_id);
	}

	/**
	* View an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}/rcsBotCategory/{rcsbotcategory_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategory loadRcsBotCategoryDescRcsBotCategory(@PathVariable Integer rcsbotcategorydesc_id, @PathVariable Integer related_rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id, -1, -1);

		return rcsbotcategory;
	}

	/**
	* Create a new RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCategoryDesc newRcsBotCategoryDesc(@RequestBody RcsBotCategoryDesc rcsbotcategorydesc) {
		rcsBotCategoryDescService.saveRcsBotCategoryDesc(rcsbotcategorydesc);
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc.getId());
	}

	/**
	* Delete an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}/rcsBotCategory/{rcsbotcategory_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCategoryDescRcsBotCategory(@PathVariable Integer rcsbotcategorydesc_id, @PathVariable Integer related_rcsbotcategory_id) {
		rcsBotCategoryDescService.deleteRcsBotCategoryDescRcsBotCategory(rcsbotcategorydesc_id, related_rcsbotcategory_id);
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
	* Create a new RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategoryDesc/{rcsbotcategorydesc_id}/rcsBotCategory", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCategory newRcsBotCategoryDescRcsBotCategory(@PathVariable Integer rcsbotcategorydesc_id, @RequestBody RcsBotCategory rcsbotcategory) {
		rcsBotCategoryDescService.saveRcsBotCategoryDescRcsBotCategory(rcsbotcategorydesc_id, rcsbotcategory);
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());
	}
}