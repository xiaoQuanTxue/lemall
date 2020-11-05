package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.Sizes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 清山
 * @Date 2020/10/7 11:16
 */
@Mapper
public interface SizesMapper {
    int deleteSizesByCartId(int cartId);
    int batchDeleteSizesByCartId(int[] cartId);
    int updateSizes(Sizes sizes);
    int batchInsertSizes(List<Sizes> sizesList);
}
