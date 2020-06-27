package com.kirusa.web;

import com.kirusa.dao.RcsBotCarrierDAO;

import com.kirusa.domain.RcsBotCarrier;

import com.kirusa.service.RcsBotCarrierService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotCarrier entities
 * 
 */

@Controller("RcsBotCarrierController")

public class RcsBotCarrierController {

	/**
	 * DAO injected by Spring that manages RcsBotCarrier entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierDAO rcsBotCarrierDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotCarrier entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierService rcsBotCarrierService;

	/**
	 * Save an existing RcsBotCarrier entity
	 * 
	 */
	@RequestMapping("/saveRcsBotCarrier")
	public String saveRcsBotCarrier(@ModelAttribute RcsBotCarrier rcsbotcarrier) {
		rcsBotCarrierService.saveRcsBotCarrier(rcsbotcarrier);
		return "forward:/indexRcsBotCarrier";
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
	* Select an existing RcsBotCarrier entity
	* 
	*/
	@RequestMapping("/selectRcsBotCarrier")
	public ModelAndView selectRcsBotCarrier(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarrier", rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(idKey));
		mav.setViewName("rcsbotcarrier/viewRcsBotCarrier.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCarrier entities
	* 
	*/
	@RequestMapping("/indexRcsBotCarrier")
	public ModelAndView listRcsBotCarriers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarriers", rcsBotCarrierService.loadRcsBotCarriers());

		mav.setViewName("rcsbotcarrier/listRcsBotCarriers.jsp");

		return mav;
	}

	/**
	* Select the RcsBotCarrier entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCarrier")
	public ModelAndView confirmDeleteRcsBotCarrier(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarrier", rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(idKey));
		mav.setViewName("rcsbotcarrier/deleteRcsBotCarrier.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotCarrier entity
	* 
	*/
	@RequestMapping("/editRcsBotCarrier")
	public ModelAndView editRcsBotCarrier(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarrier", rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(idKey));
		mav.setViewName("rcsbotcarrier/editRcsBotCarrier.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotCarrier entities
	* 
	*/
	public String indexRcsBotCarrier() {
		return "redirect:/indexRcsBotCarrier";
	}

	/**
	* Create a new RcsBotCarrier entity
	* 
	*/
	@RequestMapping("/newRcsBotCarrier")
	public ModelAndView newRcsBotCarrier() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarrier", new RcsBotCarrier());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcarrier/editRcsBotCarrier.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotcarrierController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing RcsBotCarrier entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCarrier")
	public String deleteRcsBotCarrier(@RequestParam Integer idKey) {
		RcsBotCarrier rcsbotcarrier = rcsBotCarrierDAO.findRcsBotCarrierByPrimaryKey(idKey);
		rcsBotCarrierService.deleteRcsBotCarrier(rcsbotcarrier);
		return "forward:/indexRcsBotCarrier";
	}
}