package com.kirusa.web;

import com.kirusa.dao.RcsBotCommentDAO;
import com.kirusa.dao.RcsBotDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotComment;

import com.kirusa.service.RcsBotCommentService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotComment entities
 * 
 */

@Controller("RcsBotCommentController")

public class RcsBotCommentController {

	/**
	 * DAO injected by Spring that manages RcsBotComment entities
	 * 
	 */
	@Autowired
	private RcsBotCommentDAO rcsBotCommentDAO;

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotComment entities
	 * 
	 */
	@Autowired
	private RcsBotCommentService rcsBotCommentService;

	/**
	 */
	@RequestMapping("/rcsbotcommentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing RcsBotComment entity
	* 
	*/
	@RequestMapping("/deleteRcsBotComment")
	public String deleteRcsBotComment(@RequestParam Integer idKey) {
		RcsBotComment rcsbotcomment = rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(idKey);
		rcsBotCommentService.deleteRcsBotComment(rcsbotcomment);
		return "forward:/indexRcsBotComment";
	}

	/**
	* Save an existing RcsBotComment entity
	* 
	*/
	@RequestMapping("/saveRcsBotComment")
	public String saveRcsBotComment(@ModelAttribute RcsBotComment rcsbotcomment) {
		rcsBotCommentService.saveRcsBotComment(rcsbotcomment);
		return "forward:/indexRcsBotComment";
	}

	/**
	* Edit an existing RcsBot entity
	* 
	*/
	@RequestMapping("/editRcsBotCommentRcsBot")
	public ModelAndView editRcsBotCommentRcsBot(@RequestParam Integer rcsbotcomment_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcomment_id", rcsbotcomment_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotcomment/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Show all RcsBot entities by RcsBotComment
	* 
	*/
	@RequestMapping("/listRcsBotCommentRcsBot")
	public ModelAndView listRcsBotCommentRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcomment", rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(idKey));
		mav.setViewName("rcsbotcomment/rcsbot/listRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotCommentRcsBot")
	public ModelAndView saveRcsBotCommentRcsBot(@RequestParam Integer rcsbotcomment_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotComment parent_rcsbotcomment = rcsBotCommentService.saveRcsBotCommentRcsBot(rcsbotcomment_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcomment_id", rcsbotcomment_id);
		mav.addObject("rcsbotcomment", parent_rcsbotcomment);
		mav.setViewName("rcsbotcomment/viewRcsBotComment.jsp");

		return mav;
	}

	/**
	* Show all RcsBotComment entities
	* 
	*/
	@RequestMapping("/indexRcsBotComment")
	public ModelAndView listRcsBotComments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcomments", rcsBotCommentService.loadRcsBotComments());

		mav.setViewName("rcsbotcomment/listRcsBotComments.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBotComment entity
	* 
	*/
	@RequestMapping("/editRcsBotComment")
	public ModelAndView editRcsBotComment(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcomment", rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(idKey));
		mav.setViewName("rcsbotcomment/editRcsBotComment.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotComment entity
	* 
	*/
	@RequestMapping("/selectRcsBotComment")
	public ModelAndView selectRcsBotComment(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcomment", rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(idKey));
		mav.setViewName("rcsbotcomment/viewRcsBotComment.jsp");

		return mav;
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotCommentRcsBot")
	public ModelAndView confirmDeleteRcsBotCommentRcsBot(@RequestParam Integer rcsbotcomment_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbotcomment_id", rcsbotcomment_id);
		mav.setViewName("rcsbotcomment/rcsbot/deleteRcsBot.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotComment entities
	* 
	*/
	public String indexRcsBotComment() {
		return "redirect:/indexRcsBotComment";
	}

	/**
	* Select the RcsBotComment entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotComment")
	public ModelAndView confirmDeleteRcsBotComment(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcomment", rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(idKey));
		mav.setViewName("rcsbotcomment/deleteRcsBotComment.jsp");

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
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotCommentRcsBot")
	public ModelAndView newRcsBotCommentRcsBot(@RequestParam Integer rcsbotcomment_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcomment_id", rcsbotcomment_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcomment/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping("/deleteRcsBotCommentRcsBot")
	public ModelAndView deleteRcsBotCommentRcsBot(@RequestParam Integer rcsbotcomment_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotComment rcsbotcomment = rcsBotCommentService.deleteRcsBotCommentRcsBot(rcsbotcomment_id, related_rcsbot_id);

		mav.addObject("rcsbotcomment_id", rcsbotcomment_id);
		mav.addObject("rcsbotcomment", rcsbotcomment);
		mav.setViewName("rcsbotcomment/viewRcsBotComment.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotCommentRcsBot")
	public ModelAndView selectRcsBotCommentRcsBot(@RequestParam Integer rcsbotcomment_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotcomment_id", rcsbotcomment_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotcomment/rcsbot/viewRcsBot.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotComment entity
	* 
	*/
	@RequestMapping("/newRcsBotComment")
	public ModelAndView newRcsBotComment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotcomment", new RcsBotComment());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotcomment/editRcsBotComment.jsp");

		return mav;
	}
}