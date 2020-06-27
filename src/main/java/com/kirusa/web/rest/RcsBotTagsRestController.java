package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotTagsDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotTags;

import com.kirusa.service.RcsBotTagsService;

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
 * Spring Rest controller that handles CRUD requests for RcsBotTags entities
 * 
 */

@Controller("RcsBotTagsRestController")

public class RcsBotTagsRestController {

	/**
	 * DAO injected by Spring that manages RcsBotCategory entities
	 * 
	 */
	@Autowired
	private RcsBotCategoryDAO rcsBotCategoryDAO;

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
	 * Service injected by Spring that provides CRUD operations for RcsBotTags entities
	 * 
	 */
	@Autowired
	private RcsBotTagsService rcsBotTagsService;

	/**
	 * Delete an existing RcsBotCategory entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBotCategory/{rcsbotcategory_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotTagsRcsBotCategory(@PathVariable Integer rcsbottags_id, @PathVariable Integer related_rcsbotcategory_id) {
		rcsBotTagsService.deleteRcsBotTagsRcsBotCategory(rcsbottags_id, related_rcsbotcategory_id);
	}

	/**
	* Create a new RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotTags newRcsBotTags(@RequestBody RcsBotTags rcsbottags) {
		rcsBotTagsService.saveRcsBotTags(rcsbottags);
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags.getId());
	}

	/**
	* Get RcsBotCategory entity by RcsBotTags
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBotCategory", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategory getRcsBotTagsRcsBotCategory(@PathVariable Integer rcsbottags_id) {
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags_id).getRcsBotCategory();
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotTagsRcsBot(@PathVariable Integer rcsbottags_id, @RequestBody RcsBot rcsbot) {
		rcsBotTagsService.saveRcsBotTagsRcsBot(rcsbottags_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
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
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotTagsRcsBot(@PathVariable Integer rcsbottags_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}

	/**
	* Save an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBotCategory", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotCategory saveRcsBotTagsRcsBotCategory(@PathVariable Integer rcsbottags_id, @RequestBody RcsBotCategory rcsbotcategory) {
		rcsBotTagsService.saveRcsBotTagsRcsBotCategory(rcsbottags_id, rcsbotcategory);
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());
	}

	/**
	* View an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBotCategory/{rcsbotcategory_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotCategory loadRcsBotTagsRcsBotCategory(@PathVariable Integer rcsbottags_id, @PathVariable Integer related_rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id, -1, -1);

		return rcsbotcategory;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotTagsRcsBot(@PathVariable Integer rcsbottags_id, @RequestBody RcsBot rcsbot) {
		rcsBotTagsService.saveRcsBotTagsRcsBot(rcsbottags_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Create a new RcsBotCategory entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBotCategory", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotCategory newRcsBotTagsRcsBotCategory(@PathVariable Integer rcsbottags_id, @RequestBody RcsBotCategory rcsbotcategory) {
		rcsBotTagsService.saveRcsBotTagsRcsBotCategory(rcsbottags_id, rcsbotcategory);
		return rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory.getId());
	}

	/**
	* Select an existing RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotTags loadRcsBotTags(@PathVariable Integer rcsbottags_id) {
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags_id);
	}

	/**
	* Save an existing RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotTags saveRcsBotTags(@RequestBody RcsBotTags rcsbottags) {
		rcsBotTagsService.saveRcsBotTags(rcsbottags);
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags.getId());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotTagsRcsBot(@PathVariable Integer rcsbottags_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotTagsService.deleteRcsBotTagsRcsBot(rcsbottags_id, related_rcsbot_id);
	}

	/**
	* Show all RcsBotTags entities
	* 
	*/
	@RequestMapping(value = "/RcsBotTags", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotTags> listRcsBotTagss() {
		return new java.util.ArrayList<RcsBotTags>(rcsBotTagsService.loadRcsBotTagss());
	}

	/**
	* Get RcsBot entity by RcsBotTags
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotTagsRcsBot(@PathVariable Integer rcsbottags_id) {
		return rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags_id).getRcsBot();
	}

	/**
	* Delete an existing RcsBotTags entity
	* 
	*/
	@RequestMapping(value = "/RcsBotTags/{rcsbottags_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotTags(@PathVariable Integer rcsbottags_id) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottags_id);
		rcsBotTagsService.deleteRcsBotTags(rcsbottags);
	}
}