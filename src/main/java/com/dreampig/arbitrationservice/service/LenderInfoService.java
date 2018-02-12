package com.dreampig.arbitrationservice.service;

import com.dreampig.arbitrationservice.model.LenderInfo;

public interface LenderInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(LenderInfo record);

    int insertSelective(LenderInfo record);

    LenderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LenderInfo record);

    int updateByPrimaryKey(LenderInfo record);
}
