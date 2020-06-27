package com.kirusa.web.rest;

import com.google.gson.Gson;
import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCategoryDescDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotTagsDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotTags;

import com.kirusa.service.RcsBotCategoryService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for RcsBotCategory entities
 * 
 */

@Controller("RcsBotCategoryRestController")

public class RcsBotCategoryRestController {

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
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotTags entities
	 * 
	 */
	@Autowired
	private RcsBotTagsDAO rcsBotTagsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotCategory entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryService rcsBotCategoryService;

	/**
	 * Show all RcsBotTags entities by RcsBotCategory
	 * 
	 */
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotTags> getRcsBotCategoryRcsBotTagses(@PathVariable Integer rcsbotcategory_id) {
		return new java.util.ArrayList<RcsBotTags>(rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id).getRcsBotTagses());
	}

	/**
	* View an existing RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses/{rcsbottags_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotTags loadRcsBotCategoryRcsBotTagses(@PathVariable Integer rcsbotcategory_id, @PathVariable Integer related_rcsbottagses_id) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(related_rcsbottagses_id, -1, -1);

		return rcsbottags;
	}

	/**
	* Save an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCategory saveRcsBotCategory(@RequestBody RcsBotCategory rcsbotcategory) {
		rcsBotCategoryService.saveRcsBotCategory(rcsbotcategory);
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());
	}

	/**
	* Create a new RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCategory newRcsBotCategory(HttpEntity<String> httpEntity) {
		String json=httpEntity.getBody();
		RcsBotCategory rcsbotcategory = new Gson().fromJson(json, RcsBotCategory.class);
		rcsBotCategoryService.saveRcsBotCategory(rcsbotcategory);
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBots/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCategoryRcsBots(@PathVariable Integer rcsbotcategory_id, @PathVariable Integer related_rcsbots_id) {
		rcsBotCategoryService.deleteRcsBotCategoryRcsBots(rcsbotcategory_id, related_rcsbots_id);
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBots", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotCategoryRcsBots(@PathVariable Integer rcsbotcategory_id, @RequestBody RcsBot rcsbots) {
		rcsBotCategoryService.saveRcsBotCategoryRcsBots(rcsbotcategory_id, rcsbots);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbots.getId());
	}

	/**
	* Delete an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCategory(@PathVariable Integer rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id);
		rcsBotCategoryService.deleteRcsBotCategory(rcsbotcategory);
	}

	/**
	* Create a new RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotTags newRcsBotCategoryRcsBotTagses(@PathVariable Integer rcsbotcategory_id, @RequestBody RcsBotTags rcsbottags) {
		rcsBotCategoryService.saveRcsBotCategoryRcsBotTagses(rcsbotcategory_id, rcsbottags);
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags.getId());
	}

	/**
	* Select an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategory loadRcsBotCategory(@PathVariable Integer rcsbotcategory_id) {
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id);
	}

	/**
	* Show all RcsBot entities by RcsBotCategory
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBots", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBot> getRcsBotCategoryRcsBots(@PathVariable Integer rcsbotcategory_id) {
		return new java.util.ArrayList<RcsBot>(rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id).getRcsBots());
	}

	/**
	* View an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs/{rcsbotcategorydesc_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategoryDesc loadRcsBotCategoryRcsBotCategoryDescs(@PathVariable Integer rcsbotcategory_id, @PathVariable Integer related_rcsbotcategorydescs_id) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(related_rcsbotcategorydescs_id, -1, -1);

		return rcsbotcategorydesc;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBots/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotCategoryRcsBots(@PathVariable Integer rcsbotcategory_id, @PathVariable Integer related_rcsbots_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots_id, -1, -1);

		return rcsbot;
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
	* Show all RcsBotCategory entities
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotCategory> listRcsBotCategorys() {
		return new java.util.ArrayList<RcsBotCategory>(rcsBotCategoryService.loadRcsBotCategorys());
	}

	/**
	* Delete an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs/{rcsbotcategorydesc_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCategoryRcsBotCategoryDescs(@PathVariable Integer rcsbotcategory_id, @PathVariable Integer related_rcsbotcategorydescs_id) {
		rcsBotCategoryService.deleteRcsBotCategoryRcsBotCategoryDescs(rcsbotcategory_id, related_rcsbotcategorydescs_id);
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBots", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotCategoryRcsBots(@PathVariable Integer rcsbotcategory_id, @RequestBody RcsBot rcsbot) {
		rcsBotCategoryService.saveRcsBotCategoryRcsBots(rcsbotcategory_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Delete an existing RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses/{rcsbottags_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCategoryRcsBotTagses(@PathVariable Integer rcsbotcategory_id, @PathVariable Integer related_rcsbottagses_id) {
		rcsBotCategoryService.deleteRcsBotCategoryRcsBotTagses(rcsbotcategory_id, related_rcsbottagses_id);
	}

	/**
	* Save an existing RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotTags saveRcsBotCategoryRcsBotTagses(@PathVariable Integer rcsbotcategory_id, @RequestBody RcsBotTags rcsbottagses) {
		rcsBotCategoryService.saveRcsBotCategoryRcsBotTagses(rcsbotcategory_id, rcsbottagses);
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottagses.getId());
	}

	/**
	* Create a new RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCategoryDesc newRcsBotCategoryRcsBotCategoryDescs(@PathVariable Integer rcsbotcategory_id, @RequestBody RcsBotCategoryDesc rcsbotcategorydesc) {
		rcsBotCategoryService.saveRcsBotCategoryRcsBotCategoryDescs(rcsbotcategory_id, rcsbotcategorydesc);
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydesc.getId());
	}

	/**
	* Show all RcsBotCategoryDesc entities by RcsBotCategory
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotCategoryDesc> getRcsBotCategoryRcsBotCategoryDescs(@PathVariable Integer rcsbotcategory_id) {
		return new java.util.ArrayList<RcsBotCategoryDesc>(rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id).getRcsBotCategoryDescs());
	}

	/**
	* Save an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping(value = "/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCategoryDesc saveRcsBotCategoryRcsBotCategoryDescs(@PathVariable Integer rcsbotcategory_id, @RequestBody RcsBotCategoryDesc rcsbotcategorydescs) {
		rcsBotCategoryService.saveRcsBotCategoryRcsBotCategoryDescs(rcsbotcategory_id, rcsbotcategorydescs);
		return rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydescs.getId());
	}
}