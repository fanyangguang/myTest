package com.fan.common.service.impl;

import com.fan.common.service.StoreService;
import com.fan.dao.trade.StoresMapper;
import com.fan.entity.trade.Stores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yonghao
 * @date 2019/12/5
 */
@Slf4j
@Service
public class StoreServiceImpl implements StoreService {
    @Resource
    StoresMapper storesMapper;
    @Override
    public Stores selectByPrimaryKey(Long id) {
        Stores store=storesMapper.selectByPrimaryKey(1L);
        return store;
    }
    @Override
    public int insertSelective(Stores bean) {
        int result=storesMapper.insertSelective(bean );
        return result;
    }

    @Override
    public List<Stores> selectByName(String name) {
        log.info("store name:{}", name);
        List<Stores> store=storesMapper.selectByName(name);
        log.info("store info:{}", store);
        return store;
    }
}
