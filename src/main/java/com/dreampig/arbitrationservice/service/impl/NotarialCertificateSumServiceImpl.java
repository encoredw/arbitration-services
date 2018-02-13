package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.NotarialCertificateSumMapper;
import com.dreampig.arbitrationservice.model.NotarialCertificateSum;
import com.dreampig.arbitrationservice.service.NotarialCertificateSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "notarialCertificateSumService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
public class NotarialCertificateSumServiceImpl implements NotarialCertificateSumService {

    @Autowired
    private NotarialCertificateSumMapper notarialCertificateSumMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return notarialCertificateSumMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(NotarialCertificateSum record) {
        return notarialCertificateSumMapper.insert(record);
    }

    @Override
    public int insertSelective(NotarialCertificateSum record) {
        return notarialCertificateSumMapper.insertSelective(record);
    }

    @Override
    public NotarialCertificateSum selectByPrimaryKey(Integer id) {
        return notarialCertificateSumMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(NotarialCertificateSum record) {
        return notarialCertificateSumMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(NotarialCertificateSum record) {
        return notarialCertificateSumMapper.updateByPrimaryKey(record);
    }
}
