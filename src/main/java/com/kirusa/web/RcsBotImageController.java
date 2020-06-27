package com.kirusa.web;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotImageDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotImage;

import com.kirusa.service.RcsBotImageService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotImage entities
 * 
 */

@Controller("RcsBotImageController")

public class RcsBotImageController {

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotImage entities
	 * 
	 */
	@Autowired
	private RcsBotImageDAO rcsBotImageDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotImage entities
	 * 
	 */
	@Autowired
	private RcsBotImageService rcsBotImageService;

	/**
	 * Select the RcsBotImage entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRcsBotImage")
	public ModelAndView confirmDeleteRcsBotImage(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotimage", rcsBotImageDAO.findRcsBotImageByPrimaryKey(idKey));
		mav.setViewName("rcsbotimage/deleteRcsBotImage.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBot entity
	* 
	*/
	@RequestMapping("/editRcsBotImageRcsBot")
	public ModelAndView editRcsBotImageRcsBot(@RequestParam Integer rcsbotimage_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotimage_id", rcsbotimage_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotimage/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotImage entity
	* 
	*/
	@RequestMapping("/deleteRcsBotImage")
	public String deleteRcsBotImage(@RequestParam Integer idKey) {
		RcsBotImage rcsbotimage = rcsBotImageDAO.findRcsBotImageByPrimaryKey(idKey);
		rcsBotImageService.deleteRcsBotImage(rcsbotimage);
		return "forward:/indexRcsBotImage";
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
	* Show all RcsBotImage entities
	* 
	*/
	@RequestMapping("/indexRcsBotImage")
	public ModelAndView listRcsBotImages() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotimages", rcsBotImageService.loadRcsBotImages());

		mav.setViewName("rcsbotimage/listRcsBotImages.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotimageController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select an existing RcsBotImage entity
	* 
	*/
	@RequestMapping("/selectRcsBotImage")
	public ModelAndView selectRcsBotImage(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotimage", rcsBotImageDAO.findRcsBotImageByPrimaryKey(idKey));
		mav.setViewName("rcsbotimage/viewRcsBotImage.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotImage entity
	* 
	*/
	@RequestMapping("/newRcsBotImage")
	public ModelAndView newRcsBotImage() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotimage", new RcsBotImage());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotimage/editRcsBotImage.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotImageRcsBot")
	public ModelAndView deleteRcsBotImageRcsBot(@RequestParam Integer rcsbotimage_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotImage rcsbotimage = rcsBotImageService.deleteRcsBotImageRcsBot(rcsbotimage_id, related_rcsbot_id);

		mav.addObject("rcsbotimage_id", rcsbotimage_id);
		mav.addObject("rcsbotimage", rcsbotimage);
		mav.setViewName("rcsbotimage/viewRcsBotImage.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotImage entities
	* 
	*/
	public String indexRcsBotImage() {
		return "redirect:/indexRcsBotImage";
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotImageRcsBot")
	public ModelAndView newRcsBotImageRcsBot(@RequestParam Integer rcsbotimage_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotimage_id", rcsbotimage_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotimage/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotImageRcsBot")
	public ModelAndView selectRcsBotImageRcsBot(@RequestParam Integer rcsbotimage_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotimage_id", rcsbotimage_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotimage/rcsbot/viewRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotImage entity
	* 
	*/
	@RequestMapping("/saveRcsBotImage")
	public String saveRcsBotImage(@ModelAttribute RcsBotImage rcsbotimage) {
		rcsBotImageService.saveRcsBotImage(rcsbotimage);
		return "forward:/indexRcsBotImage";
	}

	/**
	* Show all RcsBot entities by RcsBotImage
	* 
	*/
	@RequestMapping("/listRcsBotImageRcsBot")
	public ModelAndView listRcsBotImageRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotimage", rcsBotImageDAO.findRcsBotImageByPrimaryKey(idKey));
		mav.setViewName("rcsbotimage/rcsbot/listRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotImageRcsBot")
	public ModelAndView saveRcsBotImageRcsBot(@RequestParam Integer rcsbotimage_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotImage parent_rcsbotimage = rcsBotImageService.saveRcsBotImageRcsBot(rcsbotimage_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotimage_id", rcsbotimage_id);
		mav.addObject("rcsbotimage", parent_rcsbotimage);
		mav.setViewName("rcsbotimage/viewRcsBotImage.jsp");

		return mav;
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotImageRcsBot")
	public ModelAndView confirmDeleteRcsBotImageRcsBot(@RequestParam Integer rcsbotimage_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbotimage_id", rcsbotimage_id);
		mav.setViewName("rcsbotimage/rcsbot/deleteRcsBot.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotImage entity
	* 
	*/
	@RequestMapping("/editRcsBotImage")
	public ModelAndView editRcsBotImage(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotimage", rcsBotImageDAO.findRcsBotImageByPrimaryKey(idKey));
		mav.setViewName("rcsbotimage/editRcsBotImage.jsp");

		return mav;
	}
}