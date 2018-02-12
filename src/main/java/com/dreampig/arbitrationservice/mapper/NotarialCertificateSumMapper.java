package com.dreampig.arbitrationservice.mapper;

import com.dreampig.arbitrationservice.model.NotarialCertificateSum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NotarialCertificateSumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NotarialCertificateSum record);

    int insertSelective(NotarialCertificateSum record);

    NotarialCertificateSum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NotarialCertificateSum record);

    int updateByPrimaryKey(NotarialCertificateSum record);
}