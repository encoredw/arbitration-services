package com.dreampig.arbitrationservice.common;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.dreampig.arbitrationservice.model.pojo.ContractInitDataJson;

import java.util.List;

public class ArbitrationJsonConvert {

    public static ContractInitDataJson reqeustJsonToArbitraction(String requestJson){
        List<ContractInitDataJson> contractInitDataJsonList = null;
        try {

            JSONArray jsonArray = JSON.parseArray(requestJson);
            contractInitDataJsonList =  JSON.parseArray(jsonArray.toJSONString(), ContractInitDataJson.class);

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
        if(contractInitDataJsonList !=null){
            return contractInitDataJsonList.get(0);
        }
        return null;
    }
}
