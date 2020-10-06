package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.GoodDetails;
import com.zzzl.lemall.domain.GoodDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface GoodDetailsMapper {
    long countByExample(GoodDetailsExample example);

    int deleteByExample(GoodDetailsExample example);

    int deleteByPrimaryKey(Integer goodDetailsId);

    int insert(GoodDetails record);

    int insertSelective(GoodDetails record);

    List<GoodDetails> selectByExample(GoodDetailsExample example);

    GoodDetails selectByPrimaryKey(Integer goodDetailsId);

    int updateByExampleSelective(@Param("record") GoodDetails record, @Param("example") GoodDetailsExample example);

    int updateByExample(@Param("record") GoodDetails record, @Param("example") GoodDetailsExample example);

    int updateByPrimaryKeySelective(GoodDetails record);

    int updateByPrimaryKey(GoodDetails record);


//    自定义部分
    List<GoodDetails>selectLunBo();
}