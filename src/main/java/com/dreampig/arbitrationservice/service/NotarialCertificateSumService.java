package com.dreampig.arbitrationservice.service;

import com.dreampig.arbitrationservice.model.NotarialCertificateSum;

public interface NotarialCertificateSumService {

    int deleteByPrimaryKey(Integer id);

    int insert(NotarialCertificateSum record);

    int insertSelective(NotarialCertificateSum record);

    NotarialCertificateSum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NotarialCertificateSum record);

    int updateByPrimaryKey(NotarialCertificateSum record);
}
