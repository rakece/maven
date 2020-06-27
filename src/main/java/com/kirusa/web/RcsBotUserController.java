package com.kirusa.web;

import com.kirusa.dao.RcsBotBillingDAO;
import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotUserroleDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;
import com.kirusa.domain.RcsCountryList;

import com.kirusa.service.RcsBotUserService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotUser entities
 * 
 */

@Controller("RcsBotUserController")

public class RcsBotUserController {

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
	 * DAO injected by Spring that manages RcsBotUserrole entities
	 * 
	 */
	@Autowired
	private RcsBotUserroleDAO rcsBotUserroleDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserService rcsBotUserService;

	/**
	 * Save an existing RcsBot entity
	 * 
	 */
	@RequestMapping("/saveRcsBotUserRcsBots")
	public ModelAndView saveRcsBotUserRcsBots(@RequestParam Integer rcsbotuser_id, @ModelAttribute RcsBot rcsbots) {
		RcsBotUser parent_rcsbotuser = rcsBotUserService.saveRcsBotUserRcsBots(rcsbotuser_id, rcsbots);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", parent_rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* View an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/selectRcsBotUserRcsCountryList")
	public ModelAndView selectRcsBotUserRcsCountryList(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcscountrylist", rcscountrylist);
		mav.setViewName("rcsbotuser/rcscountrylist/viewRcsCountryList.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotUserRcsBots")
	public ModelAndView selectRcsBotUserRcsBots(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcsbots_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbots_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotuser/rcsbots/viewRcsBots.jsp");

		return mav;
	}

	/**
	* Show all RcsBotBilling entities by RcsBotUser
	* 
	*/
	@RequestMapping("/listRcsBotUserRcsBotBillings")
	public ModelAndView listRcsBotUserRcsBotBillings(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/rcsbotbillings/listRcsBotBillings.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUserRcsCountryList")
	public ModelAndView deleteRcsBotUserRcsCountryList(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcscountrylist_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotUser rcsbotuser = rcsBotUserService.deleteRcsBotUserRcsCountryList(rcsbotuser_id, related_rcscountrylist_id);

		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Show all RcsCountryList entities by RcsBotUser
	* 
	*/
	@RequestMapping("/listRcsBotUserRcsCountryList")
	public ModelAndView listRcsBotUserRcsCountryList(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/rcscountrylist/listRcsCountryList.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/selectRcsBotUserRcsBotBillings")
	public ModelAndView selectRcsBotUserRcsBotBillings(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcsbotbillings_id) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbillings_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotbilling", rcsbotbilling);
		mav.setViewName("rcsbotuser/rcsbotbillings/viewRcsBotBillings.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotUserrole entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUserRcsBotUserroles")
	public ModelAndView confirmDeleteRcsBotUserRcsBotUserroles(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcsbotuserroles_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserrole", rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(related_rcsbotuserroles_id));
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.setViewName("rcsbotuser/rcsbotuserroles/deleteRcsBotUserroles.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping("/newRcsBotUser")
	public ModelAndView newRcsBotUser() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", new RcsBotUser());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuser/editRcsBotUser.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotUser
	* 
	*/
	@RequestMapping("/listRcsBotUserRcsBots")
	public ModelAndView listRcsBotUserRcsBots(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/rcsbots/listRcsBots.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/selectRcsBotUserRcsBotUserroles")
	public ModelAndView selectRcsBotUserRcsBotUserroles(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcsbotuserroles_id) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserroles_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuserrole", rcsbotuserrole);
		mav.setViewName("rcsbotuser/rcsbotuserroles/viewRcsBotUserroles.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/saveRcsBotUserRcsBotBillings")
	public ModelAndView saveRcsBotUserRcsBotBillings(@RequestParam Integer rcsbotuser_id, @ModelAttribute RcsBotBilling rcsbotbillings) {
		RcsBotUser parent_rcsbotuser = rcsBotUserService.saveRcsBotUserRcsBotBillings(rcsbotuser_id, rcsbotbillings);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", parent_rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Show all RcsBotUserrole entities by RcsBotUser
	* 
	*/
	@RequestMapping("/listRcsBotUserRcsBotUserroles")
	public ModelAndView listRcsBotUserRcsBotUserroles(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/rcsbotuserroles/listRcsBotUserroles.jsp");

		return mav;
	}

	/**
	* Show all RcsBotUser entities
	* 
	*/
	@RequestMapping("/indexRcsBotUser")
	public ModelAndView listRcsBotUsers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotusers", rcsBotUserService.loadRcsBotUsers());

		mav.setViewName("rcsbotuser/listRcsBotUsers.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/newRcsBotUserRcsBotUserroles")
	public ModelAndView newRcsBotUserRcsBotUserroles(@RequestParam Integer rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuserrole", new RcsBotUserrole());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuser/rcsbotuserroles/editRcsBotUserroles.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/selectRcsBotUser")
	public ModelAndView selectRcsBotUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotBilling entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUserRcsBotBillings")
	public ModelAndView confirmDeleteRcsBotUserRcsBotBillings(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcsbotbillings_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotbilling", rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(related_rcsbotbillings_id));
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.setViewName("rcsbotuser/rcsbotbillings/deleteRcsBotBillings.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/saveRcsBotUser")
	public String saveRcsBotUser(@ModelAttribute RcsBotUser rcsbotuser) {
		rcsBotUserService.saveRcsBotUser(rcsbotuser);
		return "forward:/indexRcsBotUser";
	}

	/**
	* Entry point to show all RcsBotUser entities
	* 
	*/
	public String indexRcsBotUser() {
		return "redirect:/indexRcsBotUser";
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUserRcsBots")
	public ModelAndView deleteRcsBotUserRcsBots(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcsbots_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotUser rcsbotuser = rcsBotUserService.deleteRcsBotUserRcsBots(rcsbotuser_id, related_rcsbots_id);

		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUserRcsBotBillings")
	public ModelAndView deleteRcsBotUserRcsBotBillings(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcsbotbillings_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotUser rcsbotuser = rcsBotUserService.deleteRcsBotUserRcsBotBillings(rcsbotuser_id, related_rcsbotbillings_id);

		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotBilling entity
	* 
	*/
	@RequestMapping("/editRcsBotUserRcsBotBillings")
	public ModelAndView editRcsBotUserRcsBotBillings(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcsbotbillings_id) {
		RcsBotBilling rcsbotbilling = rcsBotBillingDAO.findRcsBotBillingByPrimaryKey(rcsbotbillings_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotbilling", rcsbotbilling);
		mav.setViewName("rcsbotuser/rcsbotbillings/editRcsBotBillings.jsp");

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
	*/
	@RequestMapping("/rcsbotuserController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the child RcsCountryList entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUserRcsCountryList")
	public ModelAndView confirmDeleteRcsBotUserRcsCountryList(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcscountrylist_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(related_rcscountrylist_id));
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.setViewName("rcsbotuser/rcscountrylist/deleteRcsCountryList.jsp");

		return mav;
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUserRcsBots")
	public ModelAndView confirmDeleteRcsBotUserRcsBots(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcsbots_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbots_id));
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.setViewName("rcsbotuser/rcsbots/deleteRcsBots.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/editRcsBotUserRcsBotUserroles")
	public ModelAndView editRcsBotUserRcsBotUserroles(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcsbotuserroles_id) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(rcsbotuserroles_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuserrole", rcsbotuserrole);
		mav.setViewName("rcsbotuser/rcsbotuserroles/editRcsBotUserroles.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/editRcsBotUserRcsCountryList")
	public ModelAndView editRcsBotUserRcsCountryList(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcscountrylist_id) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(rcscountrylist_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcscountrylist", rcscountrylist);
		mav.setViewName("rcsbotuser/rcscountrylist/editRcsCountryList.jsp");

		return mav;
	}

	/**
	* Select the RcsBotUser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUser")
	public ModelAndView confirmDeleteRcsBotUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/deleteRcsBotUser.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotBilling entity
	* 
	*/
	@RequestMapping("/newRcsBotUserRcsBotBillings")
	public ModelAndView newRcsBotUserRcsBotBillings(@RequestParam Integer rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotbilling", new RcsBotBilling());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuser/rcsbotbillings/editRcsBotBillings.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotUserRcsBots")
	public ModelAndView newRcsBotUserRcsBots(@RequestParam Integer rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuser/rcsbots/editRcsBots.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUserRcsBotUserroles")
	public ModelAndView deleteRcsBotUserRcsBotUserroles(@RequestParam Integer rcsbotuser_id, @RequestParam Integer related_rcsbotuserroles_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotUser rcsbotuser = rcsBotUserService.deleteRcsBotUserRcsBotUserroles(rcsbotuser_id, related_rcsbotuserroles_id);

		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Create a new RcsCountryList entity
	* 
	*/
	@RequestMapping("/newRcsBotUserRcsCountryList")
	public ModelAndView newRcsBotUserRcsCountryList(@RequestParam Integer rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcscountrylist", new RcsCountryList());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuser/rcscountrylist/editRcsCountryList.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBot entity
	* 
	*/
	@RequestMapping("/editRcsBotUserRcsBots")
	public ModelAndView editRcsBotUserRcsBots(@RequestParam Integer rcsbotuser_id, @RequestParam Integer rcsbots_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbots_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotuser/rcsbots/editRcsBots.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/editRcsBotUser")
	public ModelAndView editRcsBotUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey));
		mav.setViewName("rcsbotuser/editRcsBotUser.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/saveRcsBotUserRcsBotUserroles")
	public ModelAndView saveRcsBotUserRcsBotUserroles(@RequestParam Integer rcsbotuser_id, @ModelAttribute RcsBotUserrole rcsbotuserroles) {
		RcsBotUser parent_rcsbotuser = rcsBotUserService.saveRcsBotUserRcsBotUserroles(rcsbotuser_id, rcsbotuserroles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", parent_rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Save an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/saveRcsBotUserRcsCountryList")
	public ModelAndView saveRcsBotUserRcsCountryList(@RequestParam Integer rcsbotuser_id, @ModelAttribute RcsCountryList rcscountrylist) {
		RcsBotUser parent_rcsbotuser = rcsBotUserService.saveRcsBotUserRcsCountryList(rcsbotuser_id, rcscountrylist);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuser_id", rcsbotuser_id);
		mav.addObject("rcsbotuser", parent_rcsbotuser);
		mav.setViewName("rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUser")
	public String deleteRcsBotUser(@RequestParam Integer idKey) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(idKey);
		rcsBotUserService.deleteRcsBotUser(rcsbotuser);
		return "forward:/indexRcsBotUser";
	}
}