package com.kirusa.common.cmdhandler.sync;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.kirusa.common.cmdhandler.Cmd;
import com.kirusa.common.cmdhandler.CmdHandlerException;
import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.iv.logging.LoggerFactory;
import com.kirusa.iv.logging.logger.IvLogger;
import com.kirusa.request.BotBillingData;
import com.kirusa.request.BotBillingRequest;
import com.kirusa.request.BotSettingData;
import com.kirusa.request.BotSettingRequest;
import com.kirusa.response.CmdResponse;
import com.kirusa.service.RcsBotBillingService;
import com.kirusa.service.RcsBotCategoryService;
import com.kirusa.service.RcsBotService;
import com.kirusa.service.RcsBotTagsService;
import com.kirusa.service.RcsBotUserService;
import com.kirusa.service.RcsCountryListService;

@Component
public class BotBillingCmdHandler extends AbstractCmdHandlerSync {

	private static final IvLogger logger = LoggerFactory.getLogger(BotBillingCmdHandler.class);

	@Autowired
	private RcsBotUserService rcsBotUserService;

	@Autowired
	private RcsCountryListService rcsCountryListService;

	@Autowired
	private RcsBotUserService rcsUserBotService;

	@Autowired
	private RcsBotService rcsBotService;

	@Autowired
	RcsBotCategoryService rcsBotCategoryService;

	@Autowired
	RcsBotTagsService rcsBotTagsService;
	
	@Autowired
	RcsBotBillingService rcsBotBillingService;
	
	

	private static Gson gson = new Gson();

	@Override
	public String handle(JSONObject jsonObject, String jsonData, HttpEntity<String> request)
			throws CmdHandlerException {
		// TODO Auto-generated method stub
		BotBillingRequest botBillingRequest = gson.fromJson(jsonData, BotBillingRequest.class);
		BotBillingData botBillingData = botBillingRequest.getData();
		CmdResponse cmdResponse = new CmdResponse();
		cmdResponse.addData(Cmd.FLD_CMD, botBillingRequest.getCmd());
		RcsBotBilling rcsBotBilling = new RcsBotBilling();

		if ((botBillingData.getRcs_bot_user_id() == null) || (botBillingData.getBot_id() == null)) {
			throw new CmdHandlerException(CmdHandlerException.ERRCODE_NON_EXISTING_IDENTITY,
					CmdHandlerException.ERRMSG_EMPTY_IDENTITY);
		}
		RcsBotUser tempuser = rcsUserBotService.findRcsBotUserByPrimaryKey(botBillingData.getRcs_bot_user_id());
		rcsBotBilling.setRcsBotUser(tempuser);

		RcsBot tempBot = rcsBotService.findRcsBotByPrimaryKey(botBillingData.getBot_id());
		rcsBotBilling.setRcsBot(tempBot);
		if(botBillingData.getId()!=null)
			rcsBotBilling.setId(botBillingData.getId());
		rcsBotBilling.setUserName(botBillingData.getUser_name());
		rcsBotBilling.setCompanyName(botBillingData.getCompany_name());
		rcsBotBilling.setEmail(botBillingData.getEmail());
		rcsBotBilling.setAccountType(botBillingData.getAccount_type());
		
		rcsBotBilling.setContactNo(botBillingData.getContact_no());
		rcsBotBilling.setAltContactNo(botBillingData.getAlt_contact_no());
		rcsBotBilling.setAccountType(botBillingData.getAccount_type());
		rcsBotBilling.setAddressLine1(botBillingData.getAddress_line1());
		rcsBotBilling.setAddressLine2(botBillingData.getAddress_line2());
		
		rcsBotBilling.setCity(botBillingData.getCity());
		rcsBotBilling.setState(botBillingData.getState());
		rcsBotBilling.setZip(botBillingData.getZip());
		rcsBotBilling.setCountry(botBillingData.getCountry());
		
		
		
		rcsBotBillingService.saveRcsBotBilling(rcsBotBilling);
		
		return cmdResponse.toJsonData();
	}
}
