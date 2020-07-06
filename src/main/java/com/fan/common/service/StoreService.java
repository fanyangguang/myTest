package com.fan.common.service;

import com.fan.entity.trade.Stores;

import java.util.List;

/**
 * @author yonghao
 * @date 2019/12/5
 */
public interface StoreService {
    Stores selectByPrimaryKey(Long id);
    int insertSelective(Stores bean);
    List<Stores> selectByName(String name);
}
