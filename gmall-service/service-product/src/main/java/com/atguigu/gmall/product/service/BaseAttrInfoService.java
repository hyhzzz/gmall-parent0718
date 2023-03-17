package com.atguigu.gmall.product.service;

import com.atguigu.gmall.product.model.BaseAttrInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * ClassName: BaseAttrInfoService
 * Package: com.atguigu.gmall.product.service
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/17 23:06
 * @Version 1.0
 */
public interface BaseAttrInfoService extends IService<BaseAttrInfo> {
    /**
     * 根据分类Id 获取平台属性数据
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(Long category1Id, Long category2Id, Long category3Id);

}
