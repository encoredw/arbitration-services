package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.Authentication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthenticationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    Authentication selectByPrimaryKey(Integer id);

    Authentication selectByAuthentication(Authentication record);

    int updateByPrimaryKeySelective(Authentication record);

    int updateByPrimaryKey(Authentication record);
}