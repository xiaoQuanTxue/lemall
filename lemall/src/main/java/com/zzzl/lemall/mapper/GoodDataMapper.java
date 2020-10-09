package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.GoodData;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 清山
 * @Date 2020/10/7 10:26
 */
@Mapper
public interface GoodDataMapper {


    /**
     * 获取商品详情页的展示图片与信息
     * @param id
     * @return
     */
    GoodData getGoodDataByGoodId(Integer id);




}
