package com.fan.dao.trade;

import com.fan.common.domain.Relative;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelativeRepository {


    int deleteByPrimaryKey(Long id);

    int insert(Relative record);

    int insertSelective(Relative record);

    Relative selectByPrimaryKey(Long accountId);

//    int updateByExample(@Param("record") Relative record, @Param("example") RelativeCriteria example);

    int updateByPrimaryKeySelective(Relative record);

//    int updateByPrimaryKey(RelativeEntity record);

	int insertRelativeList(List<Relative> relativeList);


}