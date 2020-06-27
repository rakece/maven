package com.kirusa.common.cmdhandler.sync;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.common.cmdhandler.CmdHandlerMgr;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.dto.RcsBotCarrierMappingDTO;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.response.BotWebContentResponse;
import com.kirusa.response.CmdResponse;
import com.kirusa.service.RcsBotCarrierMappingService;
import com.kirusa.service.RcsBotCategoryDescService;
import com.kirusa.service.RcsBotCategoryService;
import com.kirusa.service.RcsBotDescService;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotTypeDescService;
import com.kirusa.service.RcsBotTypeService;
import com.kirusa.util.AppConfig;
import com.kirusa.util.RCSConstant;

@Component
public class SearchRcsBotHandler extends AbstractCmdHandlerSync {

	private static final IvLogger logger = LoggerFactory.getLogger(CmdHandlerMgr.class);

	private static DecimalFormat df2 = new DecimalFormat("#.#");

	@Autowired
	private RcsBotTypeService rcsBotTypeService;

	@Autowired
	private RcsBotService rcsBotService;

	@Autowired
	private RcsBotCategoryService rcsBotCategoryService;

	@Autowired
	private RcsBotCategoryDescService rcsBotCategoryDescService;

	@Autowired
	private RcsBotTypeDescService rcsBotTypeDescService;
	
	@Autowired
	private RcsBotCarrierMappingService rcsBotCarrierMappingService;

	@Autowired
	private RcsBotDescService rcsBotDescService;

	private static Gson gson = new Gson();

	private List<RcsBotDesc> rcsBotDesclist;

	private Map<Integer, RcsBot> mapRCSBot;
	
	private Map<Integer, RcsBotDesc> mapRCSBotDesc= new HashMap<Integer, RcsBotDesc>();

	List<RcsBotCarrierMappingDTO> rcsCarrierList;

	@PostConstruct
	public void rcsBotDesclistfromdb() {
		rcsBotDesclist = rcsBotDescService.findAllRcsBotDescs(-1, -1);
		mapRCSBot = new HashMap<Integer, RcsBot>();
		for (int i = 0; i < rcsBotDesclist.size(); i++) {
			mapRCSBot.put(rcsBotDesclist.get(i).getRcsBot().getId(), rcsBotDesclist.get(i).getRcsBot());
			// rcsBotDesclist.get(i).getRcsBot().getId();
		}
		rcsBotDesclist.forEach(botdes->
		{
			mapRCSBotDesc.put(botdes.getRcsBot().getId(), botdes);
		});
		
		rcsCarrierList=rcsBotCarrierMappingService.findAllRcsBotCarrierMappingByRcsBot();
		 
		
	}

	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {

		String cmd = getRequiredField(jsonObject, Cmd.FLD_CMD);
		String locale = getRequiredField(jsonObject, RCSConstant.FLD_LOCALE);
		String searchKey = getRequiredField(jsonObject, RCSConstant.FLD_SEARCH_KEY);
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, cmd);
		cmdResponse.addData(RCSConstant.FLD_STATUS, RCSConstant.FLD_STATUS_OK);
		if (locale == null)
			locale = RCSConstant.FLD_DEFAULT_LOCALE;
		JSONArray ret = getautocompleteBotList(searchKey, locale);
		cmdResponse.addData(RCSConstant.FLD_DATA, ret);
		return cmdResponse.toJsonData();
	}

	public synchronized void addRcsBottoAutoCompleteList(RcsBotDesc rcsBotDesc) {
		rcsBotDesclist.add(rcsBotDesc);

	}

	private void addObject(JSONArray arr, RcsBotDesc rcsBotDesc,Set<Integer> seachBot,String locale) {
		JSONObject temp = new JSONObject();
		try {
			if (rcsBotDesc!=null && !seachBot.contains(rcsBotDesc.getRcsBot().getId())&&rcsBotDesc.getLang().equals(locale)) {
				temp.put(RCSConstant.FLD_BOT_ID, rcsBotDesc.getRcsBot().getId());

				temp.put(RCSConstant.FLD_NAME, rcsBotDesc.getBotName());
				temp.put(RCSConstant.FLD_DISPLAY_NAME, rcsBotDesc.getDisplayName());
				temp.put(RCSConstant.FLD_SHORT_DESC, rcsBotDesc.getBotSummary());
				temp.put(RCSConstant.FLD_LOGO, AppConfig.getRcsBotLogoImageURL(rcsBotDesc.getRcsBot().getId()) + "/"
						+ rcsBotDesc.getRcsBot().getLogoImageName());
				arr.put(temp);
				seachBot.add(rcsBotDesc.getRcsBot().getId());
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public JSONArray getautocompleteBotList(String searchstr, String locale) {

		Set<Integer> seachBot = new HashSet<Integer>();
		JSONArray jSONArray = new JSONArray();

		for (RcsBotDesc rcsBotDesc : rcsBotDesclist) {

			if (((rcsBotDesc.getBotSummary().toLowerCase().contains(searchstr.toLowerCase()))
					|| (rcsBotDesc.getBotName().toLowerCase().contains(searchstr.toLowerCase()))
					|| (rcsBotDesc.getRcsBot().getRcsBotCategory().getCategoryName().toLowerCase()
							.contains(searchstr.toLowerCase())))
					&& (rcsBotDesc.getLang().equals(locale))) {
				this.addObject(jSONArray, rcsBotDesc,seachBot,locale);

			}
			//search country 
			Set<RcsBotAvailable> temp= rcsBotDesc.getRcsBot().getRcsBotAvailables();
			temp.forEach(tempbot->
			{
				if ((tempbot.getRcsCountryList().getCountryName().toLowerCase().contains(searchstr.toLowerCase())))
				{
					this.addObject(jSONArray, rcsBotDesc,seachBot,locale);
				}
				
			});
			
		}
		rcsCarrierList.forEach(carrier->
		{
			if ((carrier.getDisplayName().toLowerCase().contains(searchstr.toLowerCase())))
			{
				
				this.addObject(jSONArray, mapRCSBotDesc.get(carrier.getRcs_bot_id()),seachBot,locale);
			}
		});
		//search carrier
		
		return jSONArray;
	}

}
