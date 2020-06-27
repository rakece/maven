package com.kirusa.web;

import com.kirusa.dao.RcsBotCarrierMappingDAO;

import com.kirusa.domain.RcsBotCarrierMapping;

import com.kirusa.service.RcsBotCarrierMappingService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotCarrierMapping entities
 * 
 */

@Controller("RcsBotCarrierMappingController")

public class RcsBotCarrierMappingController {

	/**
	 * DAO injected by Spring that manages RcsBotCarrierMapping entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierMappingDAO rcsBotCarrierMappingDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotCarrierMapping entities
	 * 
	 */
	@Autowired
	private RcsBotCarrierMappingService rcsBotCarrierMappingService;

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
	* Select the RcsBotCarrierMapping entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCarrierMapping")
	public ModelAndView confirmDeleteRcsBotCarrierMapping(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarriermapping", rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(idKey));
		mav.setViewName("rcsbotcarriermapping/deleteRcsBotCarrierMapping.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping("/newRcsBotCarrierMapping")
	public ModelAndView newRcsBotCarrierMapping() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarriermapping", new RcsBotCarrierMapping());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcarriermapping/editRcsBotCarrierMapping.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping("/saveRcsBotCarrierMapping")
	public String saveRcsBotCarrierMapping(@ModelAttribute RcsBotCarrierMapping rcsbotcarriermapping) {
		rcsBotCarrierMappingService.saveRcsBotCarrierMapping(rcsbotcarriermapping);
		return "forward:/indexRcsBotCarrierMapping";
	}

	/**
	* Edit an existing RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping("/editRcsBotCarrierMapping")
	public ModelAndView editRcsBotCarrierMapping(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarriermapping", rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(idKey));
		mav.setViewName("rcsbotcarriermapping/editRcsBotCarrierMapping.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping("/selectRcsBotCarrierMapping")
	public ModelAndView selectRcsBotCarrierMapping(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarriermapping", rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(idKey));
		mav.setViewName("rcsbotcarriermapping/viewRcsBotCarrierMapping.jsp");

		return mav;
	}

	/**
	* Show all RcsBotCarrierMapping entities
	* 
	*/
	@RequestMapping("/indexRcsBotCarrierMapping")
	public ModelAndView listRcsBotCarrierMappings() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcarriermappings", rcsBotCarrierMappingService.loadRcsBotCarrierMappings());

		mav.setViewName("rcsbotcarriermapping/listRcsBotCarrierMappings.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotCarrierMapping entities
	* 
	*/
	public String indexRcsBotCarrierMapping() {
		return "redirect:/indexRcsBotCarrierMapping";
	}

	/**
	*/
	@RequestMapping("/rcsbotcarriermappingController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing RcsBotCarrierMapping entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCarrierMapping")
	public String deleteRcsBotCarrierMapping(@RequestParam Integer idKey) {
		RcsBotCarrierMapping rcsbotcarriermapping = rcsBotCarrierMappingDAO.findRcsBotCarrierMappingByPrimaryKey(idKey);
		rcsBotCarrierMappingService.deleteRcsBotCarrierMapping(rcsbotcarriermapping);
		return "forward:/indexRcsBotCarrierMapping";
	}
}