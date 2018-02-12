package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.LenderInfoMapper;
import com.dreampig.arbitrationservice.model.LenderInfo;
import com.dreampig.arbitrationservice.service.LenderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "lenderInfoService")
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
