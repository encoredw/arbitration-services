package com.dreampig.arbitrationservice.service;

import com.dreampig.arbitrationservice.model.ArbitrationToken;

public interface ArbitrationTokenService {
    int deleteByPrimaryKey(Integer id);

    int insert(ArbitrationToken record);

    int insertSelective(ArbitrationToken record);

    ArbitrationToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArbitrationToken record);

    int updateByPrimaryKey(ArbitrationToken record);
}
