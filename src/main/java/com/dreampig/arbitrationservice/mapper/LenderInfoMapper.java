package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.LenderInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LenderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LenderInfo record);

    int insertSelective(LenderInfo record);

    LenderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LenderInfo record);

    int updateByPrimaryKey(LenderInfo record);
}