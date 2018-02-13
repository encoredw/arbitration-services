package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.LenderInfoMapper;
import com.dreampig.arbitrationservice.model.LenderInfo;
import com.dreampig.arbitrationservice.service.LenderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "lenderInfoService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
public class LenderInfoServiceImpl implements LenderInfoService {

    @Autowired
    private LenderInfoMapper lenderInfoMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lenderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LenderInfo record) {
        return lenderInfoMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(LenderInfo record) {
        return lenderInfoMapper.insertSelective(record);
    }

    @Override
    public LenderInfo selectByPrimaryKey(Integer id) {
        return lenderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LenderInfo record) {
        return lenderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LenderInfo record) {
        return lenderInfoMapper.updateByPrimaryKey(record);
    }
}
