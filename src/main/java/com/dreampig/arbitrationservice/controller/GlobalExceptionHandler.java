package com.dreampig.arbitrationservice.controller;

import com.dreampig.arbitrationservice.common.MessageData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public MessageData allExceptionHandler(HttpServletRequest request,Exception ex)throws Exception{
        MessageData messageData = new MessageData();
        messageData.setRetCode("9999");
        messageData.setRetMsg("Server Internal Error");
        System.out.println(ex);
        return messageData;

    }
}
