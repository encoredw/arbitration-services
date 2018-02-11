package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.ArbitrationToken;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArbitrationTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArbitrationToken record);

    int insertSelective(ArbitrationToken record);

    ArbitrationToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArbitrationToken record);

    int updateByPrimaryKey(ArbitrationToken record);
}