package com.kirusa.web.rest;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBot;
import com.kirusa.service.RcsBotService;

@Controller
public class UpdateBotStatusController {

	@Autowired
	private RcsBotService rcsBotService;
	
	@RequestMapping(value = "/rcsbotdirectory/activatebot/{bot_id}/{status}", method = RequestMethod.GET)
	@ResponseBody
	public String updateBotStatus(@PathVariable("bot_id") Integer bot_id, @PathVariable("status") String status) {
		String resp = "error";
		try {
			resp = updateBotDetails(bot_id, status);
		} catch (CmdHandlerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resp;
	}

	private String updateBotDetails(Integer botId, String status) throws CmdHandlerException {


		RcsBot rcsBot = rcsBotService.findRcsBotByPrimaryKey(botId);
		JSONObject respObj = new JSONObject();
		try {
			if(null != rcsBot) {
				rcsBot.setStatus(status);
				RcsBot updatedBot = rcsBotService.saveRcsBot(rcsBot);
				if(null != updatedBot && "active".equals(updatedBot.getStatus())) {
					respObj.put("status", "success");
					respObj.put("upadte_status", "actived");
					respObj.put("bot_id", updatedBot.getId());
				} else {
					respObj.put("status", "success");
					respObj.put("upadte_status", "notactivated");
					respObj.put("bot_id", updatedBot.getId());
				}
			} else {
				respObj.put("status", "error");
				respObj.put("upadte_status", "error in updating");
				respObj.put("bot_id", botId);
			}
		} catch (JSONException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		return respObj.toString();
	}
}
