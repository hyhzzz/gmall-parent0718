package com.atguigu.gmall.product.service.impl;

import com.atguigu.gmall.product.mapper.BaseCategory1Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory2Mapper;
import com.atguigu.gmall.product.mapper.BaseCategory3Mapper;
import com.atguigu.gmall.product.model.BaseCategory1;
import com.atguigu.gmall.product.model.BaseCategory2;
import com.atguigu.gmall.product.model.BaseCategory3;
import com.atguigu.gmall.product.service.BaseCategoryService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BaseCategoryServiceImpl
 * Package: com.atguigu.gmall.product.service.impl
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/17 22:37
 * @Version 1.0
 */
@Service
public class BaseCategoryServiceImpl implements BaseCategoryService {

    @Autowired
    private BaseCategory1Mapper baseCategory1Mapper;

    @Autowired
    private BaseCategory2Mapper baseCategory2Mapper;

    @Autowired
    private BaseCategory3Mapper baseCategory3Mapper;


    /**
     * 查询一级分类列表
     *
     * @return
     */
    @Override
    public List<BaseCategory1> getCategory1() {
        return baseCategory1Mapper.selectList(null);
    }

    /**
     * 根据一级分类id查询二级分类集合
     *
     * @param category1Id
     * @return
     */
    @Override
    public List<BaseCategory2> getCategory2(Long category1Id) {
        //构建查询条件
        LambdaQueryWrapper<BaseCategory2> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(BaseCategory2::getCategory1Id, category1Id);
        //执行查询
        return baseCategory2Mapper.selectList(wrapper);
    }

    /**
     * 根据二级分类id查询三级分类集合
     *
     * @param category2Id
     * @return
     */
    @Override
    public List<BaseCategory3> getCategory3(Long category2Id) {
        //构建查询条件
        LambdaQueryWrapper<BaseCategory3> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(BaseCategory3::getCategory2Id, category2Id);
        //执行查询
        return baseCategory3Mapper.selectList(wrapper);
    }


}
