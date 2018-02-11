package com.dreampig.arbitrationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aoss-web/inceptor-notarization",method = RequestMethod.POST)
public class ServicesController {

    @RequestMapping("/getToken")
    @ResponseBody
    public void getToken(){
        System.out.println("ServicesController getToken .............");
    }
}
