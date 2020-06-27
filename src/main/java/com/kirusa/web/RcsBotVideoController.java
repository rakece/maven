package com.kirusa.web;

import com.kirusa.dao.RcsBotDAO;
import com.kirusa.dao.RcsBotVideoDAO;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotVideo;

import com.kirusa.service.RcsBotVideoService;

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
 * Spring MVC controller that handles CRUD requests for RcsBotVideo entities
 * 
 */

@Controller("RcsBotVideoController")

public class RcsBotVideoController {

	/**
	 * DAO injected by Spring that manages RcsBot entities
	 * 
	 */
	@Autowired
	private RcsBotDAO rcsBotDAO;

	/**
	 * DAO injected by Spring that manages RcsBotVideo entities
	 * 
	 */
	@Autowired
	private RcsBotVideoDAO rcsBotVideoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for RcsBotVideo entities
	 * 
	 */
	@Autowired
	private RcsBotVideoService rcsBotVideoService;

	/**
	 * Delete an existing RcsBot entity
	 * 
	 */
	@RequestMapping("/deleteRcsBotVideoRcsBot")
	public ModelAndView deleteRcsBotVideoRcsBot(@RequestParam Integer rcsbotvideo_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		RcsBotVideo rcsbotvideo = rcsBotVideoService.deleteRcsBotVideoRcsBot(rcsbotvideo_id, related_rcsbot_id);

		mav.addObject("rcsbotvideo_id", rcsbotvideo_id);
		mav.addObject("rcsbotvideo", rcsbotvideo);
		mav.setViewName("rcsbotvideo/viewRcsBotVideo.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/rcsbotvideoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Show all RcsBotVideo entities
	* 
	*/
	@RequestMapping("/indexRcsBotVideo")
	public ModelAndView listRcsBotVideos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotvideos", rcsBotVideoService.loadRcsBotVideos());

		mav.setViewName("rcsbotvideo/listRcsBotVideos.jsp");

		return mav;
	}

	/**
	* Create a new RcsBot entity
	* 
	*/
	@RequestMapping("/newRcsBotVideoRcsBot")
	public ModelAndView newRcsBotVideoRcsBot(@RequestParam Integer rcsbotvideo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotvideo_id", rcsbotvideo_id);
		mav.addObject("rcsbot", new RcsBot());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotvideo/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Select an existing RcsBotVideo entity
	* 
	*/
	@RequestMapping("/selectRcsBotVideo")
	public ModelAndView selectRcsBotVideo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotvideo", rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(idKey));
		mav.setViewName("rcsbotvideo/viewRcsBotVideo.jsp");

		return mav;
	}

	/**
	* Create a new RcsBotVideo entity
	* 
	*/
	@RequestMapping("/newRcsBotVideo")
	public ModelAndView newRcsBotVideo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotvideo", new RcsBotVideo());
		mav.addObject("newFlag", true);
		mav.setViewName("rcsbotvideo/editRcsBotVideo.jsp");

		return mav;
	}

	/**
	* Edit an existing RcsBot entity
	* 
	*/
	@RequestMapping("/editRcsBotVideoRcsBot")
	public ModelAndView editRcsBotVideoRcsBot(@RequestParam Integer rcsbotvideo_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotvideo_id", rcsbotvideo_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotvideo/rcsbot/editRcsBot.jsp");

		return mav;
	}

	/**
	* Save an existing RcsBot entity
	* 
	*/
	@RequestMapping("/saveRcsBotVideoRcsBot")
	public ModelAndView saveRcsBotVideoRcsBot(@RequestParam Integer rcsbotvideo_id, @ModelAttribute RcsBot rcsbot) {
		RcsBotVideo parent_rcsbotvideo = rcsBotVideoService.saveRcsBotVideoRcsBot(rcsbotvideo_id, rcsbot);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotvideo_id", rcsbotvideo_id);
		mav.addObject("rcsbotvideo", parent_rcsbotvideo);
		mav.setViewName("rcsbotvideo/viewRcsBotVideo.jsp");

		return mav;
	}

	/**
	* Delete an existing RcsBotVideo entity
	* 
	*/
	@RequestMapping("/deleteRcsBotVideo")
	public String deleteRcsBotVideo(@RequestParam Integer idKey) {
		RcsBotVideo rcsbotvideo = rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(idKey);
		rcsBotVideoService.deleteRcsBotVideo(rcsbotvideo);
		return "forward:/indexRcsBotVideo";
	}

	/**
	* Save an existing RcsBotVideo entity
	* 
	*/
	@RequestMapping("/saveRcsBotVideo")
	public String saveRcsBotVideo(@ModelAttribute RcsBotVideo rcsbotvideo) {
		rcsBotVideoService.saveRcsBotVideo(rcsbotvideo);
		return "forward:/indexRcsBotVideo";
	}

	/**
	* Show all RcsBot entities by RcsBotVideo
	* 
	*/
	@RequestMapping("/listRcsBotVideoRcsBot")
	public ModelAndView listRcsBotVideoRcsBot(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotvideo", rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(idKey));
		mav.setViewName("rcsbotvideo/rcsbot/listRcsBot.jsp");

		return mav;
	}

	/**
	* Entry point to show all RcsBotVideo entities
	* 
	*/
	public String indexRcsBotVideo() {
		return "redirect:/indexRcsBotVideo";
	}

	/**
	* Select the RcsBotVideo entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotVideo")
	public ModelAndView confirmDeleteRcsBotVideo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotvideo", rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(idKey));
		mav.setViewName("rcsbotvideo/deleteRcsBotVideo.jsp");

		return mav;
	}

	/**
	* Select the child RcsBot entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteRcsBotVideoRcsBot")
	public ModelAndView confirmDeleteRcsBotVideoRcsBot(@RequestParam Integer rcsbotvideo_id, @RequestParam Integer related_rcsbot_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbot", rcsBotDAO.findRcsBotByPrimaryKey(related_rcsbot_id));
		mav.addObject("rcsbotvideo_id", rcsbotvideo_id);
		mav.setViewName("rcsbotvideo/rcsbot/deleteRcsBot.jsp");

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
	* Edit an existing RcsBotVideo entity
	* 
	*/
	@RequestMapping("/editRcsBotVideo")
	public ModelAndView editRcsBotVideo(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("rcsbotvideo", rcsBotVideoDAO.findRcsBotVideoByPrimaryKey(idKey));
		mav.setViewName("rcsbotvideo/editRcsBotVideo.jsp");

		return mav;
	}

	/**
	* View an existing RcsBot entity
	* 
	*/
	@RequestMapping("/selectRcsBotVideoRcsBot")
	public ModelAndView selectRcsBotVideoRcsBot(@RequestParam Integer rcsbotvideo_id, @RequestParam Integer rcsbot_id) {
		RcsBot rcsbot = rcsBotDAO.findRcsBotByPrimaryKey(rcsbot_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("rcsbotvideo_id", rcsbotvideo_id);
		mav.addObject("rcsbot", rcsbot);
		mav.setViewName("rcsbotvideo/rcsbot/viewRcsBot.jsp");

		return mav;
	}
}