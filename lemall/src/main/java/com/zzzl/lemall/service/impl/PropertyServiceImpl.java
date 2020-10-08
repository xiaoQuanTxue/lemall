package com.zzzl.lemall.service.impl;

import com.zzzl.lemall.domain.Property;
import com.zzzl.lemall.mapper.PropertyMapper;
import com.zzzl.lemall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/7 21:16
 * 4
 */
@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyMapper propertyMapper;

    @Override
    public List<Property> selectPropertyByGoodId(Integer id) {

        List<Property> propertyByGoodId =  propertyMapper.getPropertyByGoodId(id);
        return propertyByGoodId;
    }


}
