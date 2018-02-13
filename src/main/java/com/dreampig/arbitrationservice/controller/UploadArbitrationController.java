package com.dreampig.arbitrationservice.controller;

import com.dreampig.arbitrationservice.common.MessageData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 仲裁申请上传接口
 */
@RestController
@EnableSwagger2
@RequestMapping(value = "/aoss-web/inceptor-notarization",method = RequestMethod.POST)
@Api(value = "UploadContractsController", description = "仲裁申请上传接口")
public class UploadArbitrationController {

    @ApiOperation(value= "仲裁申请上传方法", notes = "传入仲裁申请上传报文JSON")
    @RequestMapping(value = "/applyArbitrationInitData",method = RequestMethod.POST)
    @ResponseBody
    public MessageData applyArbitrationInitData(String type, String sign, String token, @RequestBody String contracts) {

        MessageData messageData = new MessageData();

        return messageData;
    }

    }
