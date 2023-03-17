package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.product.model.BaseAttrInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: BaseAttrInfoMapper
 * Package: com.atguigu.gmall.product.mapper
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/17 23:05
 * @Version 1.0
 */
public interface BaseAttrInfoMapper extends BaseMapper<BaseAttrInfo> {
    /**
     * 根据分类Id 获取平台属性数据
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    List<BaseAttrInfo> selectBaseAttrInfoList(@Param("category1Id") Long category1Id,
                                              @Param("category2Id") Long category2Id,
                                              @Param("category3Id") Long category3Id);

}
