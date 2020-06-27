package com.kirusa.web;

import com.kirusa.dao.RcsBotPublisherDAO;

import com.kirusa.domain.RcsBotPublisher;

import com.kirusa.service.RcsBotPublisherService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotPublisher entities
 * 
 */

@Controller("RcsBotPublisherController")

public class RcsBotPublisherController {

	/**
	 * DAO injected by Spring that manages RcsBotPublisher entities
	 * 
	 */
	@Autowired
	private RcsBotPublisherDAO rcsBotPublisherDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotPublisher entities
	 * 
	 */
	@Autowired
	private RcsBotPublisherService rcsBotPublisherService;

	/**
	 * Save an existing RcsBotPublisher entity
	 * 
	 */
	@RequestMapping("/saveRcsBotPublisher")
	public String saveRcsBotPublisher(@ModelAttribute RcsBotPublisher rcsbotpublisher) {
		rcsBotPublisherService.saveRcsBotPublisher(rcsbotpublisher);
		return "forward:/indexRcsBotPublisher";
	}

	/**
	* Edit an existing RcsBotPublisher entity
	* 
	*/
	@RequestMapping("/editRcsBotPublisher")
	public ModelAndView editRcsBotPublisher(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotpublisher", rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(idKey));
		mav.setViewName("rcsbotpublisher/editRcsBotPublisher.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotPublisher entity
	* 
	*/
	@RequestMapping("/deleteRcsBotPublisher")
	public String deleteRcsBotPublisher(@RequestParam Integer idKey) {
		RcsBotPublisher rcsbotpublisher = rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(idKey);
		rcsBotPublisherService.deleteRcsBotPublisher(rcsbotpublisher);
		return "forward:/indexRcsBotPublisher";
	}

	/**
	* Create a new RcsBotPublisher entity
	* 
	*/
	@RequestMapping("/newRcsBotPublisher")
	public ModelAndView newRcsBotPublisher() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotpublisher", new RcsBotPublisher());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotpublisher/editRcsBotPublisher.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotpublisherController/binary.action")
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

	/**
	* Show all RcsBotPublisher entities
	* 
	*/
	@RequestMapping("/indexRcsBotPublisher")
	public ModelAndView listRcsBotPublishers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotpublishers", rcsBotPublisherService.loadRcsBotPublishers());

		mav.setViewName("rcsbotpublisher/listRcsBotPublishers.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotPublisher entities
	* 
	*/
	public String indexRcsBotPublisher() {
		return "redirect:/indexRcsBotPublisher";
	}

	/**
	* Select an existing RcsBotPublisher entity
	* 
	*/
	@RequestMapping("/selectRcsBotPublisher")
	public ModelAndView selectRcsBotPublisher(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotpublisher", rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(idKey));
		mav.setViewName("rcsbotpublisher/viewRcsBotPublisher.jsp");

		return mav;
	}

	/**
	* Select the RcsBotPublisher entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotPublisher")
	public ModelAndView confirmDeleteRcsBotPublisher(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotpublisher", rcsBotPublisherDAO.findRcsBotPublisherByPrimaryKey(idKey));
		mav.setViewName("rcsbotpublisher/deleteRcsBotPublisher.jsp");

		return mav;
	}
}