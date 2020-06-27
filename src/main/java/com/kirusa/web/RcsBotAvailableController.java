package com.kirusa.web;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsCountryList;

import com.kirusa.service.RcsBotAvailableService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotAvailable entities
 * 
 */

@Controller("RcsBotAvailableController")

public class RcsBotAvailableController {

	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableService rcsBotAvailableService;

	/**
	 * Edit an existing RcsBot entity
	 * 
	 */
	@RequestMapping("/editRcsBotAvailableRcsBot")
	public ModelAndView editRcsBotAvailableRcsBot(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotavailable/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/deleteRcsBotAvailable")
	public String deleteRcsBotAvailable(@RequestParam Integer idKey) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(idKey);
		rcsBotAvailableService.deleteRcsBotAvailable(rcsbotavailable);
		return "forward:/indexRcsBotAvailable";
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotAvailableRcsBot")
	public ModelAndView selectRcsBotAvailableRcsBot(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotavailable/rcsbot/viewRcsBot.jsp");

		return mav;
	}

	/**
	* Show all RcsCountryList entities by RcsBotAvailable
	* 
	*/
	@RequestMapping("/listRcsBotAvailableRcsCountryList")
	public ModelAndView listRcsBotAvailableRcsCountryList(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(idKey));
		mav.setViewName("rcsbotavailable/rcscountrylist/listRcsCountryList.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotAvailableRcsBot")
	public ModelAndView deleteRcsBotAvailableRcsBot(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotAvailable rcsbotavailable = rcsBotAvailableService.deleteRcsBotAvailableRcsBot(rcsbotavailable_id, related_rcsbot_id);

		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbotavailable", rcsbotavailable);
		mav.setViewName("rcsbotavailable/viewRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/newRcsBotAvailable")
	public ModelAndView newRcsBotAvailable() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", new RcsBotAvailable());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotavailable/editRcsBotAvailable.jsp");

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
	* Save an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/saveRcsBotAvailableRcsCountryList")
	public ModelAndView saveRcsBotAvailableRcsCountryList(@RequestParam Integer rcsbotavailable_id, @ModelAttribute RcsCountryList rcscountrylist) {
		RcsBotAvailable parent_rcsbotavailable = rcsBotAvailableService.saveRcsBotAvailableRcsCountryList(rcsbotavailable_id, rcscountrylist);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbotavailable", parent_rcsbotavailable);
		mav.setViewName("rcsbotavailable/viewRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* Show all RcsBotAvailable entities
	* 
	*/
	@RequestMapping("/indexRcsBotAvailable")
	public ModelAndView listRcsBotAvailables() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailables", rcsBotAvailableService.loadRcsBotAvailables());

		mav.setViewName("rcsbotavailable/listRcsBotAvailables.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotAvailableRcsBot")
	public ModelAndView newRcsBotAvailableRcsBot(@RequestParam Integer rcsbotavailable_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotavailable/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotavailableController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/deleteRcsBotAvailableRcsCountryList")
	public ModelAndView deleteRcsBotAvailableRcsCountryList(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer related_rcscountrylist_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotAvailable rcsbotavailable = rcsBotAvailableService.deleteRcsBotAvailableRcsCountryList(rcsbotavailable_id, related_rcscountrylist_id);

		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbotavailable", rcsbotavailable);
		mav.setViewName("rcsbotavailable/viewRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotAvailable entities
	* 
	*/
	public String indexRcsBotAvailable() {
		return "redirect:/indexRcsBotAvailable";
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotAvailableRcsBot")
	public ModelAndView confirmDeleteRcsBotAvailableRcsBot(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.setViewName("rcsbotavailable/rcsbot/deleteRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/saveRcsBotAvailable")
	public String saveRcsBotAvailable(@ModelAttribute RcsBotAvailable rcsbotavailable) {
		rcsBotAvailableService.saveRcsBotAvailable(rcsbotavailable);
		return "forward:/indexRcsBotAvailable";
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotAvailableRcsBot")
	public ModelAndView saveRcsBotAvailableRcsBot(@RequestParam Integer rcsbotavailable_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotAvailable parent_rcsbotavailable = rcsBotAvailableService.saveRcsBotAvailableRcsBot(rcsbotavailable_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcsbotavailable", parent_rcsbotavailable);
		mav.setViewName("rcsbotavailable/viewRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* Select the child RcsCountryList entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotAvailableRcsCountryList")
	public ModelAndView confirmDeleteRcsBotAvailableRcsCountryList(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer related_rcscountrylist_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(related_rcscountrylist_id));
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.setViewName("rcsbotavailable/rcscountrylist/deleteRcsCountryList.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/selectRcsBotAvailable")
	public ModelAndView selectRcsBotAvailable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(idKey));
		mav.setViewName("rcsbotavailable/viewRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/editRcsBotAvailable")
	public ModelAndView editRcsBotAvailable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(idKey));
		mav.setViewName("rcsbotavailable/editRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/editRcsBotAvailableRcsCountryList")
	public ModelAndView editRcsBotAvailableRcsCountryList(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcscountrylist", rcscountrylist);
		mav.setViewName("rcsbotavailable/rcscountrylist/editRcsCountryList.jsp");

		return mav;
	}

	/**
	* Select the RcsBotAvailable entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotAvailable")
	public ModelAndView confirmDeleteRcsBotAvailable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(idKey));
		mav.setViewName("rcsbotavailable/deleteRcsBotAvailable.jsp");

		return mav;
	}

	/**
	* View an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/selectRcsBotAvailableRcsCountryList")
	public ModelAndView selectRcsBotAvailableRcsCountryList(@RequestParam Integer rcsbotavailable_id, @RequestParam Integer rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcscountrylist", rcscountrylist);
		mav.setViewName("rcsbotavailable/rcscountrylist/viewRcsCountryList.jsp");

		return mav;
	}

	/**
	* Create a new RcsCountryList entity
	* 
	*/
	@RequestMapping("/newRcsBotAvailableRcsCountryList")
	public ModelAndView newRcsBotAvailableRcsCountryList(@RequestParam Integer rcsbotavailable_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotavailable_id", rcsbotavailable_id);
		mav.addObject("rcscountrylist", new RcsCountryList());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotavailable/rcscountrylist/editRcsCountryList.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotAvailable
	* 
	*/
	@RequestMapping("/listRcsBotAvailableRcsBot")
	public ModelAndView listRcsBotAvailableRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(idKey));
		mav.setViewName("rcsbotavailable/rcsbot/listRcsBot.jsp");

		return mav;
	}
}