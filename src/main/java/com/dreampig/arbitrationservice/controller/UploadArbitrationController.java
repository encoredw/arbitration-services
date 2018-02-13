package com.dreampig.arbitrationservice.controller;

import com.dreampig.arbitrationservice.common.MessageData;
import org.springframework.web.bind.annotation.*;

/**
 * 仲裁申请上传接口
 */
@RestController
@RequestMapping(value = "/aoss-web/inceptor-notarization",method = RequestMethod.POST)
public class UploadArbitrationController {

    @RequestMapping(value = "/applyArbitrationInitData",method = RequestMethod.POST)
    @ResponseBody
    public MessageData applyArbitrationInitData(String type, String sign, String token, @RequestBody String contracts) {

        MessageData messageData = new MessageData();

        return messageData;
    }

    }
