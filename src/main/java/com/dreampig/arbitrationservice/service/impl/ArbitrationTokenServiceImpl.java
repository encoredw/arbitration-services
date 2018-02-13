package com.dreampig.arbitrationservice.service.impl;

import com.dreampig.arbitrationservice.mapper.ArbitrationTokenMapper;
import com.dreampig.arbitrationservice.model.ArbitrationToken;
import com.dreampig.arbitrationservice.service.ArbitrationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service(value = "arbitrationTokenService")
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
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


    /**
     * 验证token的有效性
     * @param token 令牌
     * @return
     */
    @Override
    public boolean verifyToken(String token){
        if(token != null){
            ArbitrationToken arbitrationToken =  arbitrationTokenMapper.selectByToken(token);
            if(arbitrationToken != null){
                long current = System.currentTimeMillis();
                Date date = new Date(current);
                if(date.before(arbitrationToken.getAuthTokenExpirTime())){
                    return true;
                }else {
                    arbitrationTokenMapper.deleteByPrimaryKey(arbitrationToken.getId());
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
