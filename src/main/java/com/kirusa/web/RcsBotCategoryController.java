package com.kirusa.web;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCategoryDescDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotTagsDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;
import com.kirusa.domain.RcsBotTags;

import com.kirusa.service.RcsBotCategoryService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotCategory entities
 * 
 */

@Controller("RcsBotCategoryController")

public class RcsBotCategoryController {

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
	 * Edit an existing RcsBot entity
	 * 
	 */
	@RequestMapping("/editRcsBotCategoryRcsBots")
	public ModelAndView editRcsBotCategoryRcsBots(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer rcsbots_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbots_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotcategory/rcsbots/editRcsBots.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/saveRcsBotCategoryRcsBotTagses")
	public ModelAndView saveRcsBotCategoryRcsBotTagses(@RequestParam Integer rcsbotcategory_id, @ModelAttribute RcsBotTags rcsbottagses) {
		RcsBotCategory parent_rcsbotcategory = rcsBotCategoryService.saveRcsBotCategoryRcsBotTagses(rcsbotcategory_id, rcsbottagses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategory", parent_rcsbotcategory);
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCategoryDesc entities by RcsBotCategory
	* 
	*/
	@RequestMapping("/listRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView listRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategory/rcsbotcategorydescs/listRcsBotCategoryDescs.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotTags entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCategoryRcsBotTagses")
	public ModelAndView confirmDeleteRcsBotCategoryRcsBotTagses(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer related_rcsbottagses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottags", rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(related_rcsbottagses_id));
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.setViewName("rcsbotcategory/rcsbottagses/deleteRcsBotTagses.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/selectRcsBotCategory")
	public ModelAndView selectRcsBotCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Show all RcsBotTags entities by RcsBotCategory
	* 
	*/
	@RequestMapping("/listRcsBotCategoryRcsBotTagses")
	public ModelAndView listRcsBotCategoryRcsBotTagses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategory/rcsbottagses/listRcsBotTagses.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotTags entity
	* 
	*/
	@RequestMapping("/newRcsBotCategoryRcsBotTagses")
	public ModelAndView newRcsBotCategoryRcsBotTagses(@RequestParam Integer rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbottags", new RcsBotTags());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcategory/rcsbottagses/editRcsBotTagses.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/newRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView newRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategorydesc", new RcsBotCategoryDesc());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcategory/rcsbotcategorydescs/editRcsBotCategoryDescs.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/selectRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView selectRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer rcsbotcategorydescs_id) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydescs_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategorydesc", rcsbotcategorydesc);
		mav.setViewName("rcsbotcategory/rcsbotcategorydescs/viewRcsBotCategoryDescs.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/saveRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView saveRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer rcsbotcategory_id, @ModelAttribute RcsBotCategoryDesc rcsbotcategorydescs) {
		RcsBotCategory parent_rcsbotcategory = rcsBotCategoryService.saveRcsBotCategoryRcsBotCategoryDescs(rcsbotcategory_id, rcsbotcategorydescs);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategory", parent_rcsbotcategory);
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotCategoryRcsBots")
	public ModelAndView saveRcsBotCategoryRcsBots(@RequestParam Integer rcsbotcategory_id, @ModelAttribute RcsBot rcsbots) {
		RcsBotCategory parent_rcsbotcategory = rcsBotCategoryService.saveRcsBotCategoryRcsBots(rcsbotcategory_id, rcsbots);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategory", parent_rcsbotcategory);
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCategory entities
	* 
	*/
	@RequestMapping("/indexRcsBotCategory")
	public ModelAndView listRcsBotCategorys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorys", rcsBotCategoryService.loadRcsBotCategorys());

		mav.setViewName("rcsbotcategory/listRcsBotCategorys.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/editRcsBotCategory")
	public ModelAndView editRcsBotCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategory/editRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/editRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView editRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer rcsbotcategorydescs_id) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(rcsbotcategorydescs_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategorydesc", rcsbotcategorydesc);
		mav.setViewName("rcsbotcategory/rcsbotcategorydescs/editRcsBotCategoryDescs.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotCategory
	* 
	*/
	@RequestMapping("/listRcsBotCategoryRcsBots")
	public ModelAndView listRcsBotCategoryRcsBots(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategory/rcsbots/listRcsBots.jsp");

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
	* Create a new RcsBotCategory entity
	* 
	*/
	@RequestMapping("/newRcsBotCategory")
	public ModelAndView newRcsBotCategory() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", new RcsBotCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcategory/editRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotCategory entities
	* 
	*/
	public String indexRcsBotCategory() {
		return "redirect:/indexRcsBotCategory";
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCategoryRcsBots")
	public ModelAndView deleteRcsBotCategoryRcsBots(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer related_rcsbots_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotCategory rcsbotcategory = rcsBotCategoryService.deleteRcsBotCategoryRcsBots(rcsbotcategory_id, related_rcsbots_id);

		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/saveRcsBotCategory")
	public String saveRcsBotCategory(@ModelAttribute RcsBotCategory rcsbotcategory) {
		rcsBotCategoryService.saveRcsBotCategory(rcsbotcategory);
		return "forward:/indexRcsBotCategory";
	}

	/**
	* Select the RcsBotCategory entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCategory")
	public ModelAndView confirmDeleteRcsBotCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategory/deleteRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotCategoryDesc entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView confirmDeleteRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer related_rcsbotcategorydescs_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydesc", rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(related_rcsbotcategorydescs_id));
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.setViewName("rcsbotcategory/rcsbotcategorydescs/deleteRcsBotCategoryDescs.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/selectRcsBotCategoryRcsBotTagses")
	public ModelAndView selectRcsBotCategoryRcsBotTagses(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer rcsbottagses_id) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottagses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbottags", rcsbottags);
		mav.setViewName("rcsbotcategory/rcsbottagses/viewRcsBotTagses.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotCategoryRcsBots")
	public ModelAndView selectRcsBotCategoryRcsBots(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer rcsbots_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbots_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotcategory/rcsbots/viewRcsBots.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCategory")
	public String deleteRcsBotCategory(@RequestParam Integer idKey) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(idKey);
		rcsBotCategoryService.deleteRcsBotCategory(rcsbotcategory);
		return "forward:/indexRcsBotCategory";
	}

	/**
	* Edit an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/editRcsBotCategoryRcsBotTagses")
	public ModelAndView editRcsBotCategoryRcsBotTagses(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer rcsbottagses_id) {
		RcsBotTags rcsbottags = rcsBotTagsDAO.findRcsBotTagsByPrimaryKey(rcsbottagses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbottags", rcsbottags);
		mav.setViewName("rcsbotcategory/rcsbottagses/editRcsBotTagses.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotcategoryController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCategoryRcsBots")
	public ModelAndView confirmDeleteRcsBotCategoryRcsBots(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer related_rcsbots_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots_id));
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.setViewName("rcsbotcategory/rcsbots/deleteRcsBots.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotCategoryRcsBots")
	public ModelAndView newRcsBotCategoryRcsBots(@RequestParam Integer rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcategory/rcsbots/editRcsBots.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCategoryRcsBotCategoryDescs")
	public ModelAndView deleteRcsBotCategoryRcsBotCategoryDescs(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer related_rcsbotcategorydescs_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotCategory rcsbotcategory = rcsBotCategoryService.deleteRcsBotCategoryRcsBotCategoryDescs(rcsbotcategory_id, related_rcsbotcategorydescs_id);

		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotTags entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCategoryRcsBotTagses")
	public ModelAndView deleteRcsBotCategoryRcsBotTagses(@RequestParam Integer rcsbotcategory_id, @RequestParam Integer related_rcsbottagses_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotCategory rcsbotcategory = rcsBotCategoryService.deleteRcsBotCategoryRcsBotTagses(rcsbotcategory_id, related_rcsbottagses_id);

		mav.addObject("rcsbotcategory_id", rcsbotcategory_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}
}