package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.ContractInitData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContractInitDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContractInitData record);

    int insertSelective(ContractInitData record);

    ContractInitData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContractInitData record);

    int updateByPrimaryKeyWithBLOBs(ContractInitData record);

    int updateByPrimaryKey(ContractInitData record);
}