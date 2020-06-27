package com.kirusa.web;

import com.kirusa.dao.RcsBotAvailableDAO;
import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsCountryListDAO;

import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsCountryList;

import com.kirusa.service.RcsCountryListService;

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
 * Spring MVC controller that handles CRUD requests for RcsCountryList entities
 * 
 */

@Controller("RcsCountryListController")

public class RcsCountryListController {

	/**
	 * DAO injected by Spring that manages RcsBotAvailable entities
	 * 
	 */
	@Autowired
	private RcsBotAvailableDAO rcsBotAvailableDAO;

	/**
	 * DAO injected by Spring that manages RcsBotUser entities
	 * 
	 */
	@Autowired
	private RcsBotUserDAO rcsBotUserDAO;

	/**
	 * DAO injected by Spring that manages RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListDAO rcsCountryListDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsCountryList entities
	 * 
	 */
	@Autowired
	private RcsCountryListService rcsCountryListService;

	/**
	 * Entry point to show all RcsCountryList entities
	 * 
	 */
	public String indexRcsCountryList() {
		return "redirect:/indexRcsCountryList";
	}

	/**
	* Select the child RcsBotAvailable entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsCountryListRcsBotAvailables")
	public ModelAndView confirmDeleteRcsCountryListRcsBotAvailables(@RequestParam Integer rcscountrylist_id, @RequestParam Integer related_rcsbotavailables_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotavailable", rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(related_rcsbotavailables_id));
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.setViewName("rcscountrylist/rcsbotavailables/deleteRcsBotAvailables.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/editRcsCountryListRcsBotUsers")
	public ModelAndView editRcsCountryListRcsBotUsers(@RequestParam Integer rcscountrylist_id, @RequestParam Integer rcsbotusers_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotusers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcscountrylist/rcsbotusers/editRcsBotUsers.jsp");

		return mav;
	}

	/**
	* Select an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/selectRcsCountryList")
	public ModelAndView selectRcsCountryList(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(idKey));
		mav.setViewName("rcscountrylist/viewRcsCountryList.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/saveRcsCountryListRcsBotUsers")
	public ModelAndView saveRcsCountryListRcsBotUsers(@RequestParam Integer rcscountrylist_id, @ModelAttribute RcsBotUser rcsbotusers) {
		RcsCountryList parent_rcscountrylist = rcsCountryListService.saveRcsCountryListRcsBotUsers(rcscountrylist_id, rcsbotusers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcscountrylist", parent_rcscountrylist);
		mav.setViewName("rcscountrylist/viewRcsCountryList.jsp");

		return mav;
	}

	/**
	* Select the RcsCountryList entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsCountryList")
	public ModelAndView confirmDeleteRcsCountryList(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(idKey));
		mav.setViewName("rcscountrylist/deleteRcsCountryList.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/editRcsCountryList")
	public ModelAndView editRcsCountryList(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(idKey));
		mav.setViewName("rcscountrylist/editRcsCountryList.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/selectRcsCountryListRcsBotAvailables")
	public ModelAndView selectRcsCountryListRcsBotAvailables(@RequestParam Integer rcscountrylist_id, @RequestParam Integer rcsbotavailables_id) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailables_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcsbotavailable", rcsbotavailable);
		mav.setViewName("rcscountrylist/rcsbotavailables/viewRcsBotAvailables.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotUser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsCountryListRcsBotUsers")
	public ModelAndView confirmDeleteRcsCountryListRcsBotUsers(@RequestParam Integer rcscountrylist_id, @RequestParam Integer related_rcsbotusers_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotusers_id));
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.setViewName("rcscountrylist/rcsbotusers/deleteRcsBotUsers.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcscountrylistController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/deleteRcsCountryListRcsBotUsers")
	public ModelAndView deleteRcsCountryListRcsBotUsers(@RequestParam Integer rcscountrylist_id, @RequestParam Integer related_rcsbotusers_id) {
		ModelAndView mav = new ModelAndView();

		RcsCountryList rcscountrylist = rcsCountryListService.deleteRcsCountryListRcsBotUsers(rcscountrylist_id, related_rcsbotusers_id);

		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcscountrylist", rcscountrylist);
		mav.setViewName("rcscountrylist/viewRcsCountryList.jsp");

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
	* Show all RcsBotAvailable entities by RcsCountryList
	* 
	*/
	@RequestMapping("/listRcsCountryListRcsBotAvailables")
	public ModelAndView listRcsCountryListRcsBotAvailables(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(idKey));
		mav.setViewName("rcscountrylist/rcsbotavailables/listRcsBotAvailables.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/editRcsCountryListRcsBotAvailables")
	public ModelAndView editRcsCountryListRcsBotAvailables(@RequestParam Integer rcscountrylist_id, @RequestParam Integer rcsbotavailables_id) {
		RcsBotAvailable rcsbotavailable = rcsBotAvailableDAO.findRcsBotAvailableByPrimaryKey(rcsbotavailables_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcsbotavailable", rcsbotavailable);
		mav.setViewName("rcscountrylist/rcsbotavailables/editRcsBotAvailables.jsp");

		return mav;
	}

	/**
	* Save an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/saveRcsCountryList")
	public String saveRcsCountryList(@ModelAttribute RcsCountryList rcscountrylist) {
		rcsCountryListService.saveRcsCountryList(rcscountrylist);
		return "forward:/indexRcsCountryList";
	}

	/**
	* View an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/selectRcsCountryListRcsBotUsers")
	public ModelAndView selectRcsCountryListRcsBotUsers(@RequestParam Integer rcscountrylist_id, @RequestParam Integer rcsbotusers_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotusers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcscountrylist/rcsbotusers/viewRcsBotUsers.jsp");

		return mav;
	}

	/**
	* Show all RcsCountryList entities
	* 
	*/
	@RequestMapping("/indexRcsCountryList")
	public ModelAndView listRcsCountryLists() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylists", rcsCountryListService.loadRcsCountryLists());

		mav.setViewName("rcscountrylist/listRcsCountryLists.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsCountryList entity
	* 
	*/
	@RequestMapping("/deleteRcsCountryList")
	public String deleteRcsCountryList(@RequestParam Integer idKey) {
		RcsCountryList rcscountrylist = rcsCountryListDAO.findRcsCountryListByPrimaryKey(idKey);
		rcsCountryListService.deleteRcsCountryList(rcscountrylist);
		return "forward:/indexRcsCountryList";
	}

	/**
	* Delete an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/deleteRcsCountryListRcsBotAvailables")
	public ModelAndView deleteRcsCountryListRcsBotAvailables(@RequestParam Integer rcscountrylist_id, @RequestParam Integer related_rcsbotavailables_id) {
		ModelAndView mav = new ModelAndView();

		RcsCountryList rcscountrylist = rcsCountryListService.deleteRcsCountryListRcsBotAvailables(rcscountrylist_id, related_rcsbotavailables_id);

		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcscountrylist", rcscountrylist);
		mav.setViewName("rcscountrylist/viewRcsCountryList.jsp");

		return mav;
	}

	/**
	* Show all RcsBotUser entities by RcsCountryList
	* 
	*/
	@RequestMapping("/listRcsCountryListRcsBotUsers")
	public ModelAndView listRcsCountryListRcsBotUsers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", rcsCountryListDAO.findRcsCountryListByPrimaryKey(idKey));
		mav.setViewName("rcscountrylist/rcsbotusers/listRcsBotUsers.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping("/newRcsCountryListRcsBotUsers")
	public ModelAndView newRcsCountryListRcsBotUsers(@RequestParam Integer rcscountrylist_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcsbotuser", new RcsBotUser());
		mav.addObject("newFlag", true);
		mav.setViewName("rcscountrylist/rcsbotusers/editRcsBotUsers.jsp");

		return mav;
	}

	/**
	* Create a new RcsCountryList entity
	* 
	*/
	@RequestMapping("/newRcsCountryList")
	public ModelAndView newRcsCountryList() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcscountrylist", new RcsCountryList());
		mav.addObject("newFlag", true);
		mav.setViewName("rcscountrylist/editRcsCountryList.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/saveRcsCountryListRcsBotAvailables")
	public ModelAndView saveRcsCountryListRcsBotAvailables(@RequestParam Integer rcscountrylist_id, @ModelAttribute RcsBotAvailable rcsbotavailables) {
		RcsCountryList parent_rcscountrylist = rcsCountryListService.saveRcsCountryListRcsBotAvailables(rcscountrylist_id, rcsbotavailables);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcscountrylist", parent_rcscountrylist);
		mav.setViewName("rcscountrylist/viewRcsCountryList.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotAvailable entity
	* 
	*/
	@RequestMapping("/newRcsCountryListRcsBotAvailables")
	public ModelAndView newRcsCountryListRcsBotAvailables(@RequestParam Integer rcscountrylist_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcscountrylist_id", rcscountrylist_id);
		mav.addObject("rcsbotavailable", new RcsBotAvailable());
		mav.addObject("newFlag", true);
		mav.setViewName("rcscountrylist/rcsbotavailables/editRcsBotAvailables.jsp");

		return mav;
	}
}