package com.kirusa.web;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotDescDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotDesc;

import com.kirusa.service.RcsBotDescService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotDesc entities
 * 
 */

@Controller("RcsBotDescController")

public class RcsBotDescController {

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotDesc entities
	 * 
	 */
	@Autowired
	private RcsBotDescDAO rcsBotDescDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotDesc entities
	 * 
	 */
	@Autowired
	private RcsBotDescService rcsBotDescService;

	/**
	 * Save an existing RcsBotDesc entity
	 * 
	 */
	@RequestMapping("/saveRcsBotDesc")
	public String saveRcsBotDesc(@ModelAttribute RcsBotDesc rcsbotdesc) {
		rcsBotDescService.saveRcsBotDesc(rcsbotdesc);
		return "forward:/indexRcsBotDesc";
	}

	/**
	* Show all RcsBotDesc entities
	* 
	*/
	@RequestMapping("/indexRcsBotDesc")
	public ModelAndView listRcsBotDescs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotdescs", rcsBotDescService.loadRcsBotDescs());

		mav.setViewName("rcsbotdesc/listRcsBotDescs.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotdescController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new RcsBotDesc entity
	* 
	*/
	@RequestMapping("/newRcsBotDesc")
	public ModelAndView newRcsBotDesc() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotdesc", new RcsBotDesc());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotdesc/editRcsBotDesc.jsp");

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
	* Delete an existing RcsBotDesc entity
	* 
	*/
	@RequestMapping("/deleteRcsBotDesc")
	public String deleteRcsBotDesc(@RequestParam Integer idKey) {
		RcsBotDesc rcsbotdesc = rcsBotDescDAO.findRcsBotDescByPrimaryKey(idKey);
		rcsBotDescService.deleteRcsBotDesc(rcsbotdesc);
		return "forward:/indexRcsBotDesc";
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotDescRcsBot")
	public ModelAndView confirmDeleteRcsBotDescRcsBot(@RequestParam Integer rcsbotdesc_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbotdesc_id", rcsbotdesc_id);
		mav.setViewName("rcsbotdesc/rcsbot/deleteRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotDescRcsBot")
	public ModelAndView saveRcsBotDescRcsBot(@RequestParam Integer rcsbotdesc_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotDesc parent_rcsbotdesc = rcsBotDescService.saveRcsBotDescRcsBot(rcsbotdesc_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotdesc_id", rcsbotdesc_id);
		mav.addObject("rcsbotdesc", parent_rcsbotdesc);
		mav.setViewName("rcsbotdesc/viewRcsBotDesc.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotDesc
	* 
	*/
	@RequestMapping("/listRcsBotDescRcsBot")
	public ModelAndView listRcsBotDescRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotdesc", rcsBotDescDAO.findRcsBotDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotdesc/rcsbot/listRcsBot.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBot entity
	* 
	*/
	@RequestMapping("/editRcsBotDescRcsBot")
	public ModelAndView editRcsBotDescRcsBot(@RequestParam Integer rcsbotdesc_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotdesc_id", rcsbotdesc_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotdesc/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Select the RcsBotDesc entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotDesc")
	public ModelAndView confirmDeleteRcsBotDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotdesc", rcsBotDescDAO.findRcsBotDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotdesc/deleteRcsBotDesc.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotDescRcsBot")
	public ModelAndView selectRcsBotDescRcsBot(@RequestParam Integer rcsbotdesc_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotdesc_id", rcsbotdesc_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotdesc/rcsbot/viewRcsBot.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotDesc entity
	* 
	*/
	@RequestMapping("/selectRcsBotDesc")
	public ModelAndView selectRcsBotDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotdesc", rcsBotDescDAO.findRcsBotDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotdesc/viewRcsBotDesc.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotDescRcsBot")
	public ModelAndView newRcsBotDescRcsBot(@RequestParam Integer rcsbotdesc_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotdesc_id", rcsbotdesc_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotdesc/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotDescRcsBot")
	public ModelAndView deleteRcsBotDescRcsBot(@RequestParam Integer rcsbotdesc_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotDesc rcsbotdesc = rcsBotDescService.deleteRcsBotDescRcsBot(rcsbotdesc_id, related_rcsbot_id);

		mav.addObject("rcsbotdesc_id", rcsbotdesc_id);
		mav.addObject("rcsbotdesc", rcsbotdesc);
		mav.setViewName("rcsbotdesc/viewRcsBotDesc.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotDesc entity
	* 
	*/
	@RequestMapping("/editRcsBotDesc")
	public ModelAndView editRcsBotDesc(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotdesc", rcsBotDescDAO.findRcsBotDescByPrimaryKey(idKey));
		mav.setViewName("rcsbotdesc/editRcsBotDesc.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotDesc entities
	* 
	*/
	public String indexRcsBotDesc() {
		return "redirect:/indexRcsBotDesc";
	}
}