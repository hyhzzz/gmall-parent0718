package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.model.BaseCategory1;
import com.atguigu.gmall.product.service.BaseCategory1Service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * ClassName: BaseCategory1ServiceImplTest
 * Package: com.atguigu.gmall.product.service.impl
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/17 21:29
 * @Version 1.0
 */

@SpringBootTest
class BaseCategory1ServiceImplTest {


    @Autowired
    private BaseCategory1Service baseCategory1Service;

    @Autowired
    private BaseCategory1Mapper baseCategory1Mapper;

    @Test
    public void test() {
        //List<BaseCategory1> list = baseCategory1Mapper.selectList(null);
        //System.out.println(list);


        //根据分类的名称查询分类列表

        //QueryWrapper<BaseCategory1> wrapper = new QueryWrapper<>();
        //wrapper.eq("name","手机");

        LambdaQueryWrapper<BaseCategory1> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(BaseCategory1::getName,"手机");
        List<BaseCategory1> list = baseCategory1Service.list(wrapper);
        System.out.println(list);


    }
}