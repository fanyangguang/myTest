package com.fan.dao.trade;

import com.fan.entity.trade.Stores;
import com.fan.entity.trade.StoresExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoresMapper {
    long countByExample(StoresExample example);

    int deleteByExample(StoresExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Stores record);

    int insertSelective(Stores record);

    List<Stores> selectByExample(StoresExample example);

    Stores selectByPrimaryKey(Long id);

    List<Stores> selectByName(  @Param("name") String name);

    int updateByExampleSelective(@Param("record") Stores record, @Param("example") StoresExample example);

    int updateByExample(@Param("record") Stores record, @Param("example") StoresExample example);

    int updateByPrimaryKeySelective(Stores record);

    int updateByPrimaryKey(Stores record);
}