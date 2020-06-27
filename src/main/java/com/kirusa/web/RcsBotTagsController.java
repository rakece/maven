package com.kirusa.web;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotTagsDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotTags;

import com.kirusa.service.RcsBotTagsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for RcsBotTags entities
 * 
 */

@Controller("RcsBotTagsController")

public class RcsBotTagsController {

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
	 * Edit an existing RcsBot entity
	 * 
	 */
	@RequestMapping("/editRcsBotTagsRcsBot")
	public ModelAndView editRcsBotTagsRcsBot(@RequestParam Integer rcsbottags_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbottags/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/saveRcsBotTagsRcsBotCategory")
	public ModelAndView saveRcsBotTagsRcsBotCategory(@RequestParam Integer rcsbottags_id, @ModelAttribute RcsBotCategory rcsbotcategory) {
		RcsBotTags parent_rcsbottags = rcsBotTagsService.saveRcsBotTagsRcsBotCategory(rcsbottags_id, rcsbotcategory);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbottags", parent_rcsbottags);
		mav.setViewName("rcsbottags/viewRcsBotTags.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/editRcsBotTagsRcsBotCategory")
	public ModelAndView editRcsBotTagsRcsBotCategory(@RequestParam Integer rcsbottags_id, @RequestParam Integer rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbottags/rcsbotcategory/editRcsBotCategory.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbottagsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/selectRcsBotTags")
	public ModelAndView selectRcsBotTags(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(idKey));
		mav.setViewName("rcsbottags/viewRcsBotTags.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/editRcsBotTags")
	public ModelAndView editRcsBotTags(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(idKey));
		mav.setViewName("rcsbottags/editRcsBotTags.jsp");

		return mav;
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotTagsRcsBot")
	public ModelAndView confirmDeleteRcsBotTagsRcsBot(@RequestParam Integer rcsbottags_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.setViewName("rcsbottags/rcsbot/deleteRcsBot.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCategory entities by RcsBotTags
	* 
	*/
	@RequestMapping("/listRcsBotTagsRcsBotCategory")
	public ModelAndView listRcsBotTagsRcsBotCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(idKey));
		mav.setViewName("rcsbottags/rcsbotcategory/listRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/saveRcsBotTags")
	public String saveRcsBotTags(@ModelAttribute RcsBotTags rcsbottags) {
		rcsBotTagsService.saveRcsBotTags(rcsbottags);
		return "forward:/indexRcsBotTags";
	}

	/**
	* View an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/selectRcsBotTagsRcsBotCategory")
	public ModelAndView selectRcsBotTagsRcsBotCategory(@RequestParam Integer rcsbottags_id, @RequestParam Integer rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbottags/rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotTagsRcsBot")
	public ModelAndView newRcsBotTagsRcsBot(@RequestParam Integer rcsbottags_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbottags/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotCategory entity
	* 
	*/
	@RequestMapping("/newRcsBotTagsRcsBotCategory")
	public ModelAndView newRcsBotTagsRcsBotCategory(@RequestParam Integer rcsbottags_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbotcategory", new RcsBotCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbottags/rcsbotcategory/editRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotCategory entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotTagsRcsBotCategory")
	public ModelAndView confirmDeleteRcsBotTagsRcsBotCategory(@RequestParam Integer rcsbottags_id, @RequestParam Integer related_rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id));
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.setViewName("rcsbottags/rcsbotcategory/deleteRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotTags entities
	* 
	*/
	public String indexRcsBotTags() {
		return "redirect:/indexRcsBotTags";
	}

	/**
	* Select the RcsBotTags entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotTags")
	public ModelAndView confirmDeleteRcsBotTags(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(idKey));
		mav.setViewName("rcsbottags/deleteRcsBotTags.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotTags entity
	* 
	*/
	@RequestMapping("/newRcsBotTags")
	public ModelAndView newRcsBotTags() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", new RcsBotTags());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbottags/editRcsBotTags.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/deleteRcsBotTagsRcsBotCategory")
	public ModelAndView deleteRcsBotTagsRcsBotCategory(@RequestParam Integer rcsbottags_id, @RequestParam Integer related_rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotTags rcsbottags = rcsBotTagsService.deleteRcsBotTagsRcsBotCategory(rcsbottags_id, related_rcsbotcategory_id);

		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbottags", rcsbottags);
		mav.setViewName("rcsbottags/viewRcsBotTags.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotTags
	* 
	*/
	@RequestMapping("/listRcsBotTagsRcsBot")
	public ModelAndView listRcsBotTagsRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(idKey));
		mav.setViewName("rcsbottags/rcsbot/listRcsBot.jsp");

		return mav;
	}

	/**
	* Show all RcsBotTags entities
	* 
	*/
	@RequestMapping("/indexRcsBotTags")
	public ModelAndView listRcsBotTagss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottagss", rcsBotTagsService.loadRcsBotTagss());

		mav.setViewName("rcsbottags/listRcsBotTagss.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotTagsRcsBot")
	public ModelAndView saveRcsBotTagsRcsBot(@RequestParam Integer rcsbottags_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotTags parent_rcsbottags = rcsBotTagsService.saveRcsBotTagsRcsBot(rcsbottags_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbottags", parent_rcsbottags);
		mav.setViewName("rcsbottags/viewRcsBotTags.jsp");

		return mav;
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
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotTagsRcsBot")
	public ModelAndView deleteRcsBotTagsRcsBot(@RequestParam Integer rcsbottags_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotTags rcsbottags = rcsBotTagsService.deleteRcsBotTagsRcsBot(rcsbottags_id, related_rcsbot_id);

		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbottags", rcsbottags);
		mav.setViewName("rcsbottags/viewRcsBotTags.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotTagsRcsBot")
	public ModelAndView selectRcsBotTagsRcsBot(@RequestParam Integer rcsbottags_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbottags_id", rcsbottags_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbottags/rcsbot/viewRcsBot.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/deleteRcsBotTags")
	public String deleteRcsBotTags(@RequestParam Integer idKey) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(idKey);
		rcsBotTagsService.deleteRcsBotTags(rcsbottags);
		return "forward:/indexRcsBotTags";
	}
}