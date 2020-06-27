package com.kirusa.web.rest;

import com.kirusa.dao.RcsBotCommentDAO;
import com.kirusa.dao.RcsBotDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotComment;

import com.kirusa.service.RcsBotCommentService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for RcsBotComment entities
 * 
 */

@Controller("RcsBotCommentRestController")

public class RcsBotCommentRestController {

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
	 * Delete an existing RcsBotComment entity
	 * 
	 */
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotComment(@PathVariable Integer rcsbotcomment_id) {
		RcsBotComment rcsbotcomment = rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment_id);
		rcsBotCommentService.deleteRcsBotComment(rcsbotcomment);
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}/rcsBot", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBot saveRcsBotCommentRcsBot(@PathVariable Integer rcsbotcomment_id, @RequestBody RcsBot rcsbot) {
		rcsBotCommentService.saveRcsBotCommentRcsBot(rcsbotcomment_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Save an existing RcsBotComment entity
	* 
	*/
	@RequestMapping(value = "/RcsBotComment", method = RequestMethod.PUT)
	@ResponseBody
	public RcsBotComment saveRcsBotComment(@RequestBody RcsBotComment rcsbotcomment) {
		rcsBotCommentService.saveRcsBotComment(rcsbotcomment);
		return rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment.getId());
	}

	/**
	* Get RcsBot entity by RcsBotComment
	* 
	*/
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}/rcsBot", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot getRcsBotCommentRcsBot(@PathVariable Integer rcsbotcomment_id) {
		return rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment_id).getRcsBot();
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
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}/rcsBot", method = RequestMethod.POST)
	@ResponseBody
	public RcsBot newRcsBotCommentRcsBot(@PathVariable Integer rcsbotcomment_id, @RequestBody RcsBot rcsbot) {
		rcsBotCommentService.saveRcsBotCommentRcsBot(rcsbotcomment_id, rcsbot);
		return rcsBotDAO.findRcsBotByPrimaryKey(rcsbot.getId());
	}

	/**
	* Show all RcsBotComment entities
	* 
	*/
	@RequestMapping(value = "/RcsBotComment", method = RequestMethod.GET)
	@ResponseBody
	public List<RcsBotComment> listRcsBotComments() {
		return new java.util.ArrayList<RcsBotComment>(rcsBotCommentService.loadRcsBotComments());
	}

	/**
	* Delete an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}/rcsBot/{rcsbot_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteRcsBotCommentRcsBot(@PathVariable Integer rcsbotcomment_id, @PathVariable Integer related_rcsbot_id) {
		rcsBotCommentService.deleteRcsBotCommentRcsBot(rcsbotcomment_id, related_rcsbot_id);
	}

	/**
	* Select an existing RcsBotComment entity
	* 
	*/
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBotComment loadRcsBotComment(@PathVariable Integer rcsbotcomment_id) {
		return rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment_id);
	}

	/**
	* Create a new RcsBotComment entity
	* 
	*/
	@RequestMapping(value = "/RcsBotComment", method = RequestMethod.POST)
	@ResponseBody
	public RcsBotComment newRcsBotComment(@RequestBody RcsBotComment rcsbotcomment) {
		rcsBotCommentService.saveRcsBotComment(rcsbotcomment);
		return rcsBotCommentDAO.findRcsBotCommentByPrimaryKey(rcsbotcomment.getId());
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping(value = "/RcsBotComment/{rcsbotcomment_id}/rcsBot/{rcsbot_id}", method = RequestMethod.GET)
	@ResponseBody
	public RcsBot loadRcsBotCommentRcsBot(@PathVariable Integer rcsbotcomment_id, @PathVariable Integer related_rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id, -1, -1);

		return rcsbot;
	}
}