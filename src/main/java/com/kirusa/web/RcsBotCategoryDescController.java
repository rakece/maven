package com.kirusa.web;

import com.kirusa.dao.RcsBotCategoryDAO;
import com.kirusa.dao.RcsBotCategoryDescDAO;

import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;

import com.kirusa.service.RcsBotCategoryDescService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotCategoryDesc entities
 * 
 */

@Controller("RcsBotCategoryDescController")

public class RcsBotCategoryDescController {

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
	 * Entry point to show all RcsBotCategoryDesc entities
	 * 
	 */
	public String indexRcsBotCategoryDesc() {
		return "redirect:/indexRcsBotCategoryDesc";
	}

	/**
	* Select an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/selectRcsBotCategoryDesc")
	public ModelAndView selectRcsBotCategoryDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydesc", rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategorydesc/viewRcsBotCategoryDesc.jsp");

		return mav;
	}

	/**
	* Select the RcsBotCategoryDesc entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCategoryDesc")
	public ModelAndView confirmDeleteRcsBotCategoryDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydesc", rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategorydesc/deleteRcsBotCategoryDesc.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/editRcsBotCategoryDesc")
	public ModelAndView editRcsBotCategoryDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydesc", rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategorydesc/editRcsBotCategoryDesc.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/saveRcsBotCategoryDescRcsBotCategory")
	public ModelAndView saveRcsBotCategoryDescRcsBotCategory(@RequestParam Integer rcsbotcategorydesc_id, @ModelAttribute RcsBotCategory rcsbotcategory) {
		RcsBotCategoryDesc parent_rcsbotcategorydesc = rcsBotCategoryDescService.saveRcsBotCategoryDescRcsBotCategory(rcsbotcategorydesc_id, rcsbotcategory);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategorydesc_id", rcsbotcategorydesc_id);
		mav.addObject("rcsbotcategorydesc", parent_rcsbotcategorydesc);
		mav.setViewName("rcsbotcategorydesc/viewRcsBotCategoryDesc.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/saveRcsBotCategoryDesc")
	public String saveRcsBotCategoryDesc(@ModelAttribute RcsBotCategoryDesc rcsbotcategorydesc) {
		rcsBotCategoryDescService.saveRcsBotCategoryDesc(rcsbotcategorydesc);
		return "forward:/indexRcsBotCategoryDesc";
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
	* Delete an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCategoryDescRcsBotCategory")
	public ModelAndView deleteRcsBotCategoryDescRcsBotCategory(@RequestParam Integer rcsbotcategorydesc_id, @RequestParam Integer related_rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescService.deleteRcsBotCategoryDescRcsBotCategory(rcsbotcategorydesc_id, related_rcsbotcategory_id);

		mav.addObject("rcsbotcategorydesc_id", rcsbotcategorydesc_id);
		mav.addObject("rcsbotcategorydesc", rcsbotcategorydesc);
		mav.setViewName("rcsbotcategorydesc/viewRcsBotCategoryDesc.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCategoryDesc")
	public String deleteRcsBotCategoryDesc(@RequestParam Integer idKey) {
		RcsBotCategoryDesc rcsbotcategorydesc = rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(idKey);
		rcsBotCategoryDescService.deleteRcsBotCategoryDesc(rcsbotcategorydesc);
		return "forward:/indexRcsBotCategoryDesc";
	}

	/**
	* Create a new RcsBotCategory entity
	* 
	*/
	@RequestMapping("/newRcsBotCategoryDescRcsBotCategory")
	public ModelAndView newRcsBotCategoryDescRcsBotCategory(@RequestParam Integer rcsbotcategorydesc_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategorydesc_id", rcsbotcategorydesc_id);
		mav.addObject("rcsbotcategory", new RcsBotCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcategorydesc/rcsbotcategory/editRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotCategory entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCategoryDescRcsBotCategory")
	public ModelAndView confirmDeleteRcsBotCategoryDescRcsBotCategory(@RequestParam Integer rcsbotcategorydesc_id, @RequestParam Integer related_rcsbotcategory_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategory", rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(related_rcsbotcategory_id));
		mav.addObject("rcsbotcategorydesc_id", rcsbotcategorydesc_id);
		mav.setViewName("rcsbotcategorydesc/rcsbotcategory/deleteRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCategory entities by RcsBotCategoryDesc
	* 
	*/
	@RequestMapping("/listRcsBotCategoryDescRcsBotCategory")
	public ModelAndView listRcsBotCategoryDescRcsBotCategory(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydesc", rcsBotCategoryDescDAO.findRcsBotCategoryDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotcategorydesc/rcsbotcategory/listRcsBotCategory.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/selectRcsBotCategoryDescRcsBotCategory")
	public ModelAndView selectRcsBotCategoryDescRcsBotCategory(@RequestParam Integer rcsbotcategorydesc_id, @RequestParam Integer rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategorydesc_id", rcsbotcategorydesc_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbotcategorydesc/rcsbotcategory/viewRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotCategoryDesc entity
	* 
	*/
	@RequestMapping("/newRcsBotCategoryDesc")
	public ModelAndView newRcsBotCategoryDesc() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydesc", new RcsBotCategoryDesc());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcategorydesc/editRcsBotCategoryDesc.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotCategory entity
	* 
	*/
	@RequestMapping("/editRcsBotCategoryDescRcsBotCategory")
	public ModelAndView editRcsBotCategoryDescRcsBotCategory(@RequestParam Integer rcsbotcategorydesc_id, @RequestParam Integer rcsbotcategory_id) {
		RcsBotCategory rcsbotcategory = rcsBotCategoryDAO.findRcsBotCategoryByPrimaryKey(rcsbotcategory_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcategorydesc_id", rcsbotcategorydesc_id);
		mav.addObject("rcsbotcategory", rcsbotcategory);
		mav.setViewName("rcsbotcategorydesc/rcsbotcategory/editRcsBotCategory.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCategoryDesc entities
	* 
	*/
	@RequestMapping("/indexRcsBotCategoryDesc")
	public ModelAndView listRcsBotCategoryDescs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcategorydescs", rcsBotCategoryDescService.loadRcsBotCategoryDescs());

		mav.setViewName("rcsbotcategorydesc/listRcsBotCategoryDescs.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotcategorydescController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}