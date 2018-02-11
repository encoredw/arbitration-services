package com.dreampig.arbitrationservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Controller
@Endpoint
public class ServiceEndpoint {
    private static final String NAMESPACE_URI = "http://www.dreampig.com.cn";

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getToken")
    @ResponsePayload
    public void getToken(){
        System.out.println("invoke getToken........");
    }
}
