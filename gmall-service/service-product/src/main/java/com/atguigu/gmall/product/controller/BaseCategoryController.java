package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.product.model.BaseAttrInfo;
import com.atguigu.gmall.product.model.BaseCategory1;
import com.atguigu.gmall.product.model.BaseCategory2;
import com.atguigu.gmall.product.model.BaseCategory3;
import com.atguigu.gmall.product.service.BaseAttrInfoService;
import com.atguigu.gmall.product.service.BaseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: BaseCategoryController
 * Package: com.atguigu.gmall.product.controller
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/17 22:40
 * @Version 1.0
 */
@RestController //@Controller+@ResponseBody 响应json数据
@RequestMapping(value = "/admin/product")
public class BaseCategoryController {

    @Autowired
    private BaseCategoryService baseCategoryService;

    @Autowired
    private BaseAttrInfoService baseAttrInfoService;

    /**
     * 查询一级分类列表
     *
     * @return
     */
    @GetMapping("/getCategory1")
    public Result<List<BaseCategory1>> getCategory1() {

        List<BaseCategory1> list = baseCategoryService.getCategory1();

        return Result.ok(list);
    }

    /**
     * 根据一级分类id查询二级分类集合
     *
     * @param category1Id
     * @return
     */
    @GetMapping("/getCategory2/{category1Id}")
    public Result<List<BaseCategory2>> getCategory2(@PathVariable(value = "category1Id") Long category1Id) {
        List<BaseCategory2> list = baseCategoryService.getCategory2(category1Id);
        return Result.ok(list);
    }

    /**
     * 根据二级分类id查询三级分类集合
     *
     * @param category2Id
     * @return
     */
    @GetMapping("/getCategory3/{category2Id}")
    public Result<List<BaseCategory3>> getCategory3(@PathVariable(value = "category2Id") Long category2Id) {
        List<BaseCategory3> list = baseCategoryService.getCategory3(category2Id);
        return Result.ok(list);
    }

    /**
     * 根据分类Id 获取平台属性数据
     *
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    @GetMapping("/attrInfoList/{category1Id}/{category2Id}/{category3Id}")
    public Result<List<BaseAttrInfo>> attrInfoList(@PathVariable(value = "category1Id") Long category1Id,
                                                   @PathVariable(value = "category2Id") Long category2Id,
                                                   @PathVariable(value = "category3Id") Long category3Id) {

        List<BaseAttrInfo> baseAttrInfoList = baseAttrInfoService.getAttrInfoList(category1Id, category2Id, category3Id);
        return Result.ok(baseAttrInfoList);
    }

}
