package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.GoodExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

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


    //    新增商品内容
    Integer addGood(Good good);

    //    新增商品图片
    void addGOODImg(Good good);

    /**
     * //根据标题查找商品
     *
     * @param title
     * @return
     */
    List<Good> selectGoodsByTitle(String title);

    /**
     * 根据输入框的词搜索商品，模糊查询
     *
     * @param value
     * @return
     */
    List<Good> selectGoodsByValues(String value);


    /**
     * 根据商品id查找商品id
     *
     * @param id
     * @return
     */
    Good selectGoodById(Integer id);


    /**
     * 通过商家id查找商品
     *
     * @param id
     * @return
     */
    List<Good> selectByVendorId(Integer id);


    /**
     * 通过商家id和商品名模糊查找商品
     *
     * @param
     * @return
     */
    List<Good> selectGoodsByName(@Param("name") String s, @Param("id") Integer i);


    /**
     * 根据商品id更新商品
     *
     * @param good
     */
    void UpdateGoodById(Good good);

    /**
     * 根据商品id删除商品（不是真删除，更新商品状态）
     *
     * @param id
     */
    void deleteGoodById(Integer id);

    /**
     * 根据商品id的集合删除商品
     */
    void delInIds(List<Integer> ids);

    /**
     * 销量前五商品
     * @return
     */
    List<Good> findTopFiveGood();


}