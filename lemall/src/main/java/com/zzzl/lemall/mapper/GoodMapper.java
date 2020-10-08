package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.GoodExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodMapper {
    long countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(Integer goodId);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(Integer goodId);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);


//    自定义部分

    /**
     *  //根据标题查找商品
     * @param title
     * @return
     */
    List<Good> selectGoodsByTitle(String title);

    /**
     * 根据输入框的词搜索商品，模糊查询
     * @param value
     * @return
     */
    List<Good> selectGoodsByValues(String value);


    /**
     * 根据商品id查找商品id
     * @param id
     * @return
     */
    Good selectGoodById(Integer id);

}