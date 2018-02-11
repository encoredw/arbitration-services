package com.dreampig.arbitrationservice.service;

import com.dreampig.arbitrationservice.model.Authentication;

public interface AuthenticationService {

    int deleteByPrimaryKey(Integer id);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    Authentication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Authentication record);

    int updateByPrimaryKey(Authentication record);

    Authentication selectByAuthentication(Authentication record);
}