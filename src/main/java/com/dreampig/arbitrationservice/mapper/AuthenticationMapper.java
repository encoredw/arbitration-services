package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.Authentication;

public interface AuthenticationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    Authentication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Authentication record);

    int updateByPrimaryKey(Authentication record);
}