package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Value;
import com.zzzl.lemall.domain.ValueExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ValueMapper {
    long countByExample(ValueExample example);

    int deleteByExample(ValueExample example);

    int deleteByPrimaryKey(Integer valId);

    int insert(Value record);

    int insertSelective(Value record);

    List<Value> selectByExample(ValueExample example);

    Value selectByPrimaryKey(Integer valId);

    int updateByExampleSelective(@Param("record") Value record, @Param("example") ValueExample example);

    int updateByExample(@Param("record") Value record, @Param("example") ValueExample example);

    int updateByPrimaryKeySelective(Value record);

    int updateByPrimaryKey(Value record);
}