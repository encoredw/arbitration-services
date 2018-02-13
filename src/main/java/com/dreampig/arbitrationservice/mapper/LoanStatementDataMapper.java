package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.LoanStatementData;

public interface LoanStatementDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoanStatementData record);

    int insertSelective(LoanStatementData record);

    LoanStatementData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoanStatementData record);

    int updateByPrimaryKey(LoanStatementData record);
}