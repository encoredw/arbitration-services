package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.ContractInitDataMapper;
import com.dreampig.arbitrationservice.model.ContractInitData;
import com.dreampig.arbitrationservice.service.ContractInitDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "contractInitDataService")
public class ContractInitDataServiceImpl implements ContractInitDataService {

    @Autowired
    private ContractInitDataMapper contractInitDataMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return contractInitDataMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ContractInitData record) {
        return contractInitDataMapper.insert(record);
    }

    @Override
    public int insertSelective(ContractInitData record) {
        return contractInitDataMapper.insertSelective(record);
    }

    @Override
    public ContractInitData selectByPrimaryKey(Integer id) {
        return contractInitDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ContractInitData record) {
        return contractInitDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ContractInitData record) {
        return contractInitDataMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(ContractInitData record) {
        return contractInitDataMapper.updateByPrimaryKey(record);
    }
}
