package com.dreampig.arbitrationservice.service;

import com.dreampig.arbitrationservice.model.ContractInitData;

public interface ContractInitDataService {
    int deleteByPrimaryKey(Integer id);

    int insert(ContractInitData record);

    int insertSelective(ContractInitData record);

    ContractInitData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContractInitData record);

    int updateByPrimaryKeyWithBLOBs(ContractInitData record);

    int updateByPrimaryKey(ContractInitData record);
}
