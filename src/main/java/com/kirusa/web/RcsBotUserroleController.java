package com.kirusa.web;

import com.kirusa.dao.RcsBotUserDAO;
import com.kirusa.dao.RcsBotUserroleDAO;

import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;

import com.kirusa.service.RcsBotUserroleService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotUserrole entities
 * 
 */

@Controller("RcsBotUserroleController")

public class RcsBotUserroleController {

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
	 * Service injected by Spring that provides CRUD operations for RcsBotUserrole entities
	 * 
	 */
	@Autowired
	private RcsBotUserroleService rcsBotUserroleService;

	/**
	 * Select an existing RcsBotUserrole entity
	 * 
	 */
	@RequestMapping("/selectRcsBotUserrole")
	public ModelAndView selectRcsBotUserrole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserrole", rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(idKey));
		mav.setViewName("rcsbotuserrole/viewRcsBotUserrole.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/editRcsBotUserroleRcsBotUser")
	public ModelAndView editRcsBotUserroleRcsBotUser(@RequestParam Integer rcsbotuserrole_id, @RequestParam Integer rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuserrole_id", rcsbotuserrole_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotuserrole/rcsbotuser/editRcsBotUser.jsp");

		return mav;
	}

	/**
	* Show all RcsBotUser entities by RcsBotUserrole
	* 
	*/
	@RequestMapping("/listRcsBotUserroleRcsBotUser")
	public ModelAndView listRcsBotUserroleRcsBotUser(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserrole", rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(idKey));
		mav.setViewName("rcsbotuserrole/rcsbotuser/listRcsBotUser.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/saveRcsBotUserrole")
	public String saveRcsBotUserrole(@ModelAttribute RcsBotUserrole rcsbotuserrole) {
		rcsBotUserroleService.saveRcsBotUserrole(rcsbotuserrole);
		return "forward:/indexRcsBotUserrole";
	}

	/**
	* Select the RcsBotUserrole entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUserrole")
	public ModelAndView confirmDeleteRcsBotUserrole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserrole", rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(idKey));
		mav.setViewName("rcsbotuserrole/deleteRcsBotUserrole.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/newRcsBotUserrole")
	public ModelAndView newRcsBotUserrole() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserrole", new RcsBotUserrole());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuserrole/editRcsBotUserrole.jsp");

		return mav;
	}

	/**
	* View an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/selectRcsBotUserroleRcsBotUser")
	public ModelAndView selectRcsBotUserroleRcsBotUser(@RequestParam Integer rcsbotuserrole_id, @RequestParam Integer rcsbotuser_id) {
		RcsBotUser rcsbotuser = rcsBotUserDAO.findRcsBotUserByPrimaryKey(rcsbotuser_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuserrole_id", rcsbotuserrole_id);
		mav.addObject("rcsbotuser", rcsbotuser);
		mav.setViewName("rcsbotuserrole/rcsbotuser/viewRcsBotUser.jsp");

		return mav;
	}

	/**
	* Select the child RcsBotUser entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotUserroleRcsBotUser")
	public ModelAndView confirmDeleteRcsBotUserroleRcsBotUser(@RequestParam Integer rcsbotuserrole_id, @RequestParam Integer related_rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuser", rcsBotUserDAO.findRcsBotUserByPrimaryKey(related_rcsbotuser_id));
		mav.addObject("rcsbotuserrole_id", rcsbotuserrole_id);
		mav.setViewName("rcsbotuserrole/rcsbotuser/deleteRcsBotUser.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotUser entity
	* 
	*/
	@RequestMapping("/newRcsBotUserroleRcsBotUser")
	public ModelAndView newRcsBotUserroleRcsBotUser(@RequestParam Integer rcsbotuserrole_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuserrole_id", rcsbotuserrole_id);
		mav.addObject("rcsbotuser", new RcsBotUser());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotuserrole/rcsbotuser/editRcsBotUser.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUserrole")
	public String deleteRcsBotUserrole(@RequestParam Integer idKey) {
		RcsBotUserrole rcsbotuserrole = rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(idKey);
		rcsBotUserroleService.deleteRcsBotUserrole(rcsbotuserrole);
		return "forward:/indexRcsBotUserrole";
	}

	/**
	* Delete an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/deleteRcsBotUserroleRcsBotUser")
	public ModelAndView deleteRcsBotUserroleRcsBotUser(@RequestParam Integer rcsbotuserrole_id, @RequestParam Integer related_rcsbotuser_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotUserrole rcsbotuserrole = rcsBotUserroleService.deleteRcsBotUserroleRcsBotUser(rcsbotuserrole_id, related_rcsbotuser_id);

		mav.addObject("rcsbotuserrole_id", rcsbotuserrole_id);
		mav.addObject("rcsbotuserrole", rcsbotuserrole);
		mav.setViewName("rcsbotuserrole/viewRcsBotUserrole.jsp");

		return mav;
	}

	/**
	* Show all RcsBotUserrole entities
	* 
	*/
	@RequestMapping("/indexRcsBotUserrole")
	public ModelAndView listRcsBotUserroles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserroles", rcsBotUserroleService.loadRcsBotUserroles());

		mav.setViewName("rcsbotuserrole/listRcsBotUserroles.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotUserrole entity
	* 
	*/
	@RequestMapping("/editRcsBotUserrole")
	public ModelAndView editRcsBotUserrole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotuserrole", rcsBotUserroleDAO.findRcsBotUserroleByPrimaryKey(idKey));
		mav.setViewName("rcsbotuserrole/editRcsBotUserrole.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotUserrole entities
	* 
	*/
	public String indexRcsBotUserrole() {
		return "redirect:/indexRcsBotUserrole";
	}

	/**
	*/
	@RequestMapping("/rcsbotuserroleController/binary.action")
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
	* Save an existing RcsBotUser entity
	* 
	*/
	@RequestMapping("/saveRcsBotUserroleRcsBotUser")
	public ModelAndView saveRcsBotUserroleRcsBotUser(@RequestParam Integer rcsbotuserrole_id, @ModelAttribute RcsBotUser rcsbotuser) {
		RcsBotUserrole parent_rcsbotuserrole = rcsBotUserroleService.saveRcsBotUserroleRcsBotUser(rcsbotuserrole_id, rcsbotuser);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotuserrole_id", rcsbotuserrole_id);
		mav.addObject("rcsbotuserrole", parent_rcsbotuserrole);
		mav.setViewName("rcsbotuserrole/viewRcsBotUserrole.jsp");

		return mav;
	}
}