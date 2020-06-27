package com.kirusa.web;

import com.kirusa.dao.RcsBotTypeDescDAO;

import com.kirusa.domain.RcsBotTypeDesc;

import com.kirusa.service.RcsBotTypeDescService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotTypeDesc entities
 * 
 */

@Controller("RcsBotTypeDescController")

public class RcsBotTypeDescController {

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
	 * Save an existing RcsBotTypeDesc entity
	 * 
	 */
	@RequestMapping("/saveRcsBotTypeDesc")
	public String saveRcsBotTypeDesc(@ModelAttribute RcsBotTypeDesc rcsbottypedesc) {
		rcsBotTypeDescService.saveRcsBotTypeDesc(rcsbottypedesc);
		return "forward:/indexRcsBotTypeDesc";
	}

	/**
	* Select the RcsBotTypeDesc entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotTypeDesc")
	public ModelAndView confirmDeleteRcsBotTypeDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottypedesc", rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(idKey));
		mav.setViewName("rcsbottypedesc/deleteRcsBotTypeDesc.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping("/selectRcsBotTypeDesc")
	public ModelAndView selectRcsBotTypeDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottypedesc", rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(idKey));
		mav.setViewName("rcsbottypedesc/viewRcsBotTypeDesc.jsp");

		return mav;
	}

	/**
	* Show all RcsBotTypeDesc entities
	* 
	*/
	@RequestMapping("/indexRcsBotTypeDesc")
	public ModelAndView listRcsBotTypeDescs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottypedescs", rcsBotTypeDescService.loadRcsBotTypeDescs());

		mav.setViewName("rcsbottypedesc/listRcsBotTypeDescs.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotTypeDesc entities
	* 
	*/
	public String indexRcsBotTypeDesc() {
		return "redirect:/indexRcsBotTypeDesc";
	}

	/**
	* Edit an existing RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping("/editRcsBotTypeDesc")
	public ModelAndView editRcsBotTypeDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottypedesc", rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(idKey));
		mav.setViewName("rcsbottypedesc/editRcsBotTypeDesc.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping("/newRcsBotTypeDesc")
	public ModelAndView newRcsBotTypeDesc() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbottypedesc", new RcsBotTypeDesc());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbottypedesc/editRcsBotTypeDesc.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbottypedescController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing RcsBotTypeDesc entity
	* 
	*/
	@RequestMapping("/deleteRcsBotTypeDesc")
	public String deleteRcsBotTypeDesc(@RequestParam Integer idKey) {
		RcsBotTypeDesc rcsbottypedesc = rcsBotTypeDescDAO.findRcsBotTypeDescByPrimaryKey(idKey);
		rcsBotTypeDescService.deleteRcsBotTypeDesc(rcsbottypedesc);
		return "forward:/indexRcsBotTypeDesc";
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