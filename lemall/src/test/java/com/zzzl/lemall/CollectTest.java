package com.zzzl.lemall;

import com.zzzl.lemall.domain.Collect;
import com.zzzl.lemall.mapper.CollectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author zhl
 * @Date 2020/10/12 21:17
 */
@SpringBootTest
public class CollectTest {
    @Resource
    private CollectMapper collectMapper;

    @Test
    void test1(){
        List<Collect> collects=new ArrayList<>();
        for(int i=0;i<4;i++){
            Collect collect = new Collect();
            collect.setCollectDate(new Date());
            collect.setGoodId(1);
            collect.setUserId(1);
            collects.add(collect);
        }
        System.out.println(collectMapper.batchInsertCollections(collects));

    }
}
