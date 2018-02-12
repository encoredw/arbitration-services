package com.dreampig.arbitrationservice.controller;


import com.dreampig.arbitrationservice.common.MessageData;
import com.dreampig.arbitrationservice.model.ContractInitData;
import com.dreampig.arbitrationservice.service.ArbitrationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 合同保全上传接口
 */
@RestController
@RequestMapping(value = "/aoss-web/inceptor-notarization",method = RequestMethod.POST)
public class UploadContractsController {

    @Autowired
    private ArbitrationTokenService arbitrationTokenService;

    @RequestMapping(value = "/applyContractInitData",method = RequestMethod.POST)
    @ResponseBody
    public MessageData uploadContracts(String type, String sign, String token, @RequestBody String contracts){
        MessageData messageData = new MessageData();
        if(type !=null && sign !=null && token !=null){
            if(arbitrationTokenService.verifyToken(token)){
                //TODO 解析contracts json;
            }else{
                messageData.setRetCode("0001");
                messageData.setRetMsg("Token Expair,Please get token again!");
            }
        }else{
            messageData.setRetCode("0001");
            messageData.setRetMsg("Failure");
        }

        return messageData;
    }
}
