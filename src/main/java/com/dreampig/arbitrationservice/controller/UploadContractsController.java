package com.dreampig.arbitrationservice.controller;


import com.dreampig.arbitrationservice.common.ArbitrationJsonConvert;
import com.dreampig.arbitrationservice.common.MessageData;
import com.dreampig.arbitrationservice.model.ContractInitData;
import com.dreampig.arbitrationservice.model.LenderInfo;
import com.dreampig.arbitrationservice.model.NotarialCertificateSum;
import com.dreampig.arbitrationservice.model.pojo.ContractInitDataJson;
import com.dreampig.arbitrationservice.service.ArbitrationTokenService;
import com.dreampig.arbitrationservice.service.ContractInitDataService;
import com.dreampig.arbitrationservice.service.LenderInfoService;
import com.dreampig.arbitrationservice.service.NotarialCertificateSumService;
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
    @Autowired
    private ContractInitDataService contractInitDataService;
    @Autowired
    private LenderInfoService lenderInfoService;
    @Autowired
    private NotarialCertificateSumService notarialCertificateSumService;

    @RequestMapping(value = "/applyContractInitData",method = RequestMethod.POST)
    @ResponseBody
    public MessageData uploadContracts(String type, String sign, String token, @RequestBody String contracts){
        MessageData messageData = new MessageData();
        if(type !=null && sign !=null && token !=null){
            if(arbitrationTokenService.verifyToken(token)){
                ContractInitDataJson contractInitDataJson = ArbitrationJsonConvert.reqeustJsonToArbitraction(contracts);
                if(contractInitDataJson != null){
                    ContractInitData  contractInitData = new ContractInitData();
                    NotarialCertificateSum notarialCertificateSum =  contractInitDataJson.getNotarialCertificateApplicatSumJson();
                    LenderInfo lenderInfo = contractInitDataJson.getLenderInfos().get(0);


                }

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
