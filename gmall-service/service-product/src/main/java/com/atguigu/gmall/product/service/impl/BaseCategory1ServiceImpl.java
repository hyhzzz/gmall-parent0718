package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.model.BaseCategory1;
import com.atguigu.gmall.product.service.BaseCategory1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: BaseCategory1Service
 * Package: com.atguigu.gmall.product.service.impl
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/17 21:21
 * @Version 1.0
 */
@Service
public class BaseCategory1ServiceImpl extends ServiceImpl<BaseCategory1Mapper, BaseCategory1> implements BaseCategory1Service {


    @Autowired
    private BaseCategory1Mapper baseCategory1Mapper;


}
