package com.dreampig.arbitrationservice.controller;

import com.dreampig.arbitrationservice.common.ArbitrationTokenProcessor;
import com.dreampig.arbitrationservice.common.MessageData;
import com.dreampig.arbitrationservice.model.ArbitrationToken;
import com.dreampig.arbitrationservice.model.Authentication;
import com.dreampig.arbitrationservice.service.ArbitrationTokenService;
import com.dreampig.arbitrationservice.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/aoss-web/inceptor-notarization",method = RequestMethod.POST)
public class ServicesController {

    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private ArbitrationTokenService arbitrationTokenService;

    @RequestMapping(value = "/getToken",method = RequestMethod.POST)
    @ResponseBody
    public MessageData getToken(@RequestHeader String type,@RequestHeader String sid,@RequestHeader String password){

        Authentication authentication = new Authentication();
        MessageData messageData = new MessageData();

        authentication.setSid(sid);
        authentication.setType(type);
        authentication.setPassword(password);
        Authentication authenticationData = authenticationService.selectByAuthentication(authentication);
        if(authenticationData != null){
            ArbitrationTokenProcessor atp  = new ArbitrationTokenProcessor();
            ArbitrationToken arbitrationToken = new ArbitrationToken();
            arbitrationToken.setAuthId(authenticationData.getId());
            arbitrationToken.setAuthToken(atp.generateToken(authenticationData.getSid(),true));
            arbitrationToken.setAuthTokenExpirTime(atp.generateTokenExpair());
            arbitrationToken.setCratetime(new Date());
            arbitrationTokenService.insert(arbitrationToken);

            messageData.setRetCode("0000");
            messageData.setRetMsg("Success");
            messageData.setSid(authenticationData.getSid());
            messageData.setToken(arbitrationToken.getAuthToken());
            messageData.setDeadTime(arbitrationToken.getAuthTokenExpirTime().toString());

        }else{
            messageData.setRetCode("0001");
            messageData.setRetMsg("Failure");
        }

        return messageData;
    }
    
    @RequestMapping(value = "/applyStatementInitData",method = RequestMethod.POST)
    @ResponseBody
    public String applyStatementInitData(String type, String sid, String password,@RequestBody String requestBody){
    	System.out.println(type+":"+sid+":"+password);
        Authentication authentication = new Authentication();
        authentication.setSid(sid);
        authentication.setType(type);
        authentication.setPassword(password);
        authentication= authenticationService.selectByAuthentication(authentication);
        
//        if(authentication!=null) {
//
//        	try {
//        		JSONObject applyStatementInitData=new JSONObject(requestBody);
//				applyStatementInitData.get("businessCode01");
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        }
    	return "";
    }
    
    @RequestMapping(value = "/applyRepaymentInitData",method = RequestMethod.POST)
    @ResponseBody
    public String applyRepaymentInitData(String type, String sid, String password,@RequestBody String requestBody){
       
    	return "";
    }
}
