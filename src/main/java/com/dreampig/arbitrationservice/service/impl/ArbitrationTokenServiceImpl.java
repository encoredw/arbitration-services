package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.ArbitrationTokenMapper;
import com.dreampig.arbitrationservice.model.ArbitrationToken;
import com.dreampig.arbitrationservice.service.ArbitrationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "arbitrationTokenService")
public class ArbitrationTokenServiceImpl implements ArbitrationTokenService {

    @Autowired
    private ArbitrationTokenMapper arbitrationTokenMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return arbitrationTokenMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ArbitrationToken record) {
        return arbitrationTokenMapper.insert(record);
    }

    @Override
    public int insertSelective(ArbitrationToken record) {
        return arbitrationTokenMapper.insertSelective(record);
    }

    @Override
    public ArbitrationToken selectByPrimaryKey(Integer id) {
        return arbitrationTokenMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ArbitrationToken record) {
        return arbitrationTokenMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ArbitrationToken record) {
        return arbitrationTokenMapper.updateByPrimaryKey(record);
    }
}
