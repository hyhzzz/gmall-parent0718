package com.atguigu.gmall.product.service;

import com.atguigu.gmall.product.model.BaseAttrInfo;
import com.atguigu.gmall.product.model.BaseCategory1;
import com.atguigu.gmall.product.model.BaseCategory2;
import com.atguigu.gmall.product.model.BaseCategory3;

import java.util.List;

/**
 * ClassName: BaseCategoryService
 * Package: com.atguigu.gmall.product.service
 * Description:
 *所有三级分类相关的service
 * @Author coderhyh
 * @Create 2023/3/17 22:36
 * @Version 1.0
 */
public interface BaseCategoryService   {
    /**
     * 查询一级分类
     * @return
     */
    List<BaseCategory1> getCategory1();


    /**
     * 根据一级分类id查询二级分类集合
     * @param category1Id
     * @return
     */
    List<BaseCategory2> getCategory2(Long category1Id);

    /**
     * 根据二级分类id查询三级分类集合
     * @param category2Id
     * @return
     */
    List<BaseCategory3> getCategory3(Long category2Id);


}
