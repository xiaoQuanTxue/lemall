package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Ctegory;
import com.zzzl.lemall.domain.CtegoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CtegoryMapper {
    long countByExample(CtegoryExample example);

    int deleteByExample(CtegoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(Ctegory record);

    int insertSelective(Ctegory record);

    List<Ctegory> selectByExample(CtegoryExample example);

    Ctegory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") Ctegory record, @Param("example") CtegoryExample example);

    int updateByExample(@Param("record") Ctegory record, @Param("example") CtegoryExample example);

    int updateByPrimaryKeySelective(Ctegory record);

    int updateByPrimaryKey(Ctegory record);
}