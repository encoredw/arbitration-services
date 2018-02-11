package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.AuthenticationMapper;
import com.dreampig.arbitrationservice.model.Authentication;
import com.dreampig.arbitrationservice.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationMapper authenticationMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return authenticationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Authentication record) {
        return authenticationMapper.insert(record);
    }

    @Override
    public int insertSelective(Authentication record) {
        return authenticationMapper.insertSelective(record);
    }

    @Override
    public Authentication selectByPrimaryKey(Integer id) {
        return authenticationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Authentication record) {
        return authenticationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Authentication selectByAuthentication(Authentication record) {
        if(record.getSid()!=null && record.getType()!=null && record.getPassword() !=null){
            return authenticationMapper.selectByAuthentication(record);
        }
        return null;
    }

    @Override
    public int updateByPrimaryKey(Authentication record) {
        return authenticationMapper.updateByPrimaryKey(record);
    }
}
