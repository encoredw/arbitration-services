package com.dreampig.arbitrationservice.controller;

import com.dreampig.arbitrationservice.model.Authentication;
import com.dreampig.arbitrationservice.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/aoss-web/inceptor-notarization",method = RequestMethod.POST)
public class ServicesController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/getToken",method = RequestMethod.POST)
    @ResponseBody
    public Authentication getToken(String type, String sid, String password,@RequestBody String requestBody){
        System.out.println(type+":"+sid+":"+password);
        Authentication authentication = new Authentication();
        authentication.setSid(sid);
        authentication.setType(type);
        authentication.setPassword(password);
       return authenticationService.selectByAuthentication(authentication);

    }
}
