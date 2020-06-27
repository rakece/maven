package com.kirusa.web;

import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUserDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;

import com.kirusa.service.RcsBotBillingService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotBilling entities
 * 
 */

@Controller("RcsBotBillingController")

public class RcsBotBillingController {

	/**
	 * DAO injected by Spring that manages RcsBotBilling entities
	 * 
	 */
	@Autowired
	private RcsBotBillingDAO rcsBotBillingDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotBilling entities
	 * 
	 */
	@Autowired
	private RcsBotBillingService rcsBotBillingService;

	/**
	 * Show all RcsBotBilling entities
	 * 
	 */
	@RequestMapping("/indexRcsBotBilling")
	public ModelAndView listRcsBotBillings() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbillings", rcsBotBillingService.loadRcsBotBillings());

		mav.setViewName("rcsbotbilling/listRcsBotBillings.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/deleteRcsBotBilling")
	public String deleteRcsBotBilling(@RequestParam Integer idKey) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(idKey);
		rcsBotBillingService.deleteRcsBotBilling(rcsbotbilling);
		return "forward:/indexRcsBotBilling";
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotBillingRcsBot")
	public ModelAndView deleteRcsBotBillingRcsBot(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotBilling rcsbotbilling = rcsBotBillingService.deleteRcsBotBillingRcsBot(rcsbotbilling_id, related_rcsbot_id);

		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotbilling", rcsbotbilling);
		mav.setViewName("rcsbotbilling/viewRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotBilling
	* 
	*/
	@RequestMapping("/listRcsBotBillingRcsBot")
	public ModelAndView listRcsBotBillingRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(idKey));
		mav.setViewName("rcsbotbilling/rcsbot/listRcsBot.jsp");

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
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping("/newRcsBotBillingRcsBotUser")
	public ModelAndView newRcsBotBillingRcsBotUser(@RequestParam Integer rcsbotbilling_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotuser", new RcsBotUser());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotbilling/rcsbotuser/editRcsBotUser.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/deleteRcsBotBillingRcsBotUser")
	public ModelAndView deleteRcsBotBillingRcsBotUser(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer related_rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotBilling rcsbotbilling = rcsBotBillingService.deleteRcsBotBillingRcsBotUser(rcsbotbilling_id, related_rcsbotuser_id);

		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotbilling", rcsbotbilling);
		mav.setViewName("rcsbotbilling/viewRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotBilling entity
	* 
	*/
	@RequestMapping("/newRcsBotBilling")
	public ModelAndView newRcsBotBilling() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", new RcsBotBilling());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotbilling/editRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Select the RcsBotBilling entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotBilling")
	public ModelAndView confirmDeleteRcsBotBilling(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(idKey));
		mav.setViewName("rcsbotbilling/deleteRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotBillingRcsBot")
	public ModelAndView newRcsBotBillingRcsBot(@RequestParam Integer rcsbotbilling_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotbilling/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/editRcsBotBillingRcsBotUser")
	public ModelAndView editRcsBotBillingRcsBotUser(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotbilling/rcsbotuser/editRcsBotUser.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/selectRcsBotBillingRcsBotUser")
	public ModelAndView selectRcsBotBillingRcsBotUser(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotbilling/rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotBillingRcsBot")
	public ModelAndView selectRcsBotBillingRcsBot(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotbilling/rcsbot/viewRcsBot.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBot entity
	* 
	*/
	@RequestMapping("/editRcsBotBillingRcsBot")
	public ModelAndView editRcsBotBillingRcsBot(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotbilling/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Show all RcsBotUser entities by RcsBotBilling
	* 
	*/
	@RequestMapping("/listRcsBotBillingRcsBotUser")
	public ModelAndView listRcsBotBillingRcsBotUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(idKey));
		mav.setViewName("rcsbotbilling/rcsbotuser/listRcsBotUser.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotbillingController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/saveRcsBotBilling")
	public String saveRcsBotBilling(@ModelAttribute RcsBotBilling rcsbotbilling) {
		rcsBotBillingService.saveRcsBotBilling(rcsbotbilling);
		return "forward:/indexRcsBotBilling";
	}

	/**
	* Entry point to show all RcsBotBilling entities
	* 
	*/
	public String indexRcsBotBilling() {
		return "redirect:/indexRcsBotBilling";
	}

	/**
	* Select the child RcsBotUser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotBillingRcsBotUser")
	public ModelAndView confirmDeleteRcsBotBillingRcsBotUser(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer related_rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id));
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.setViewName("rcsbotbilling/rcsbotuser/deleteRcsBotUser.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/editRcsBotBilling")
	public ModelAndView editRcsBotBilling(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(idKey));
		mav.setViewName("rcsbotbilling/editRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/selectRcsBotBilling")
	public ModelAndView selectRcsBotBilling(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(idKey));
		mav.setViewName("rcsbotbilling/viewRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotBillingRcsBot")
	public ModelAndView confirmDeleteRcsBotBillingRcsBot(@RequestParam Integer rcsbotbilling_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.setViewName("rcsbotbilling/rcsbot/deleteRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/saveRcsBotBillingRcsBotUser")
	public ModelAndView saveRcsBotBillingRcsBotUser(@RequestParam Integer rcsbotbilling_id, @ModelAttribute RcsBotUser rcsbotuser) {
		RcsBotBilling parent_rcsbotbilling = rcsBotBillingService.saveRcsBotBillingRcsBotUser(rcsbotbilling_id, rcsbotuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotbilling", parent_rcsbotbilling);
		mav.setViewName("rcsbotbilling/viewRcsBotBilling.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotBillingRcsBot")
	public ModelAndView saveRcsBotBillingRcsBot(@RequestParam Integer rcsbotbilling_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotBilling parent_rcsbotbilling = rcsBotBillingService.saveRcsBotBillingRcsBot(rcsbotbilling_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotbilling_id", rcsbotbilling_id);
		mav.addObject("rcsbotbilling", parent_rcsbotbilling);
		mav.setViewName("rcsbotbilling/viewRcsBotBilling.jsp");

		return mav;
	}
}