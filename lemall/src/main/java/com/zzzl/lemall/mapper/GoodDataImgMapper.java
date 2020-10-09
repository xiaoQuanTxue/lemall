package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.GoodDataImg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 清山
 * @Date 2020/10/7 10:35
 */
@Mapper
public interface GoodDataImgMapper {


    /**
     * 商品详情界面 根据商品id获取底部大图
     * @param id
     * @return
     */
    List<GoodDataImg> getGoodDtaImgByGoodId(Integer id);

}
