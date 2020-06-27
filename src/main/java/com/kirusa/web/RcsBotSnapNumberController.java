package com.kirusa.web;

import com.kirusa.dao.RcsBotSnapNumberDAO;

import com.kirusa.domain.RcsBotSnapNumber;

import com.kirusa.service.RcsBotSnapNumberService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotSnapNumber entities
 * 
 */

@Controller("RcsBotSnapNumberController")

public class RcsBotSnapNumberController {

	/**
	 * DAO injected by Spring that manages RcsBotSnapNumber entities
	 * 
	 */
	@Autowired
	private RcsBotSnapNumberDAO rcsBotSnapNumberDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotSnapNumber entities
	 * 
	 */
	@Autowired
	private RcsBotSnapNumberService rcsBotSnapNumberService;

	/**
	 * Select an existing RcsBotSnapNumber entity
	 * 
	 */
	@RequestMapping("/selectRcsBotSnapNumber")
	public ModelAndView selectRcsBotSnapNumber(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotsnapnumber", rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(idKey));
		mav.setViewName("rcsbotsnapnumber/viewRcsBotSnapNumber.jsp");

		return mav;
	}

	/**
	* Select the RcsBotSnapNumber entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotSnapNumber")
	public ModelAndView confirmDeleteRcsBotSnapNumber(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotsnapnumber", rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(idKey));
		mav.setViewName("rcsbotsnapnumber/deleteRcsBotSnapNumber.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping("/saveRcsBotSnapNumber")
	public String saveRcsBotSnapNumber(@ModelAttribute RcsBotSnapNumber rcsbotsnapnumber) {
		rcsBotSnapNumberService.saveRcsBotSnapNumber(rcsbotsnapnumber);
		return "forward:/indexRcsBotSnapNumber";
	}

	/**
	* Create a new RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping("/newRcsBotSnapNumber")
	public ModelAndView newRcsBotSnapNumber() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotsnapnumber", new RcsBotSnapNumber());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotsnapnumber/editRcsBotSnapNumber.jsp");

		return mav;
	}

	/**
	* Show all RcsBotSnapNumber entities
	* 
	*/
	@RequestMapping("/indexRcsBotSnapNumber")
	public ModelAndView listRcsBotSnapNumbers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotsnapnumbers", rcsBotSnapNumberService.loadRcsBotSnapNumbers());

		mav.setViewName("rcsbotsnapnumber/listRcsBotSnapNumbers.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping("/deleteRcsBotSnapNumber")
	public String deleteRcsBotSnapNumber(@RequestParam Integer idKey) {
		RcsBotSnapNumber rcsbotsnapnumber = rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(idKey);
		rcsBotSnapNumberService.deleteRcsBotSnapNumber(rcsbotsnapnumber);
		return "forward:/indexRcsBotSnapNumber";
	}

	/**
	* Edit an existing RcsBotSnapNumber entity
	* 
	*/
	@RequestMapping("/editRcsBotSnapNumber")
	public ModelAndView editRcsBotSnapNumber(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotsnapnumber", rcsBotSnapNumberDAO.findRcsBotSnapNumberByPrimaryKey(idKey));
		mav.setViewName("rcsbotsnapnumber/editRcsBotSnapNumber.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotSnapNumber entities
	* 
	*/
	public String indexRcsBotSnapNumber() {
		return "redirect:/indexRcsBotSnapNumber";
	}

	/**
	*/
	@RequestMapping("/rcsbotsnapnumberController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
}