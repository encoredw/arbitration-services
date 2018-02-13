package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.RepaymentStatementData;

public interface RepaymentStatementDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RepaymentStatementData record);

    int insertSelective(RepaymentStatementData record);

    RepaymentStatementData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RepaymentStatementData record);

    int updateByPrimaryKey(RepaymentStatementData record);
}