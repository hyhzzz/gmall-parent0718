package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.product.model.BaseCategory1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: BaseCategory1Mapper
 * Package: com.atguigu.gmall.product.mapper
 * Description:
 * 一级分类mapper映射
 *
 * @Author coderhyh
 * @Create 2023/3/17 21:12
 * @Version 1.0
 */

@Mapper //可加可不加 因为service-util中有配置持久层包扫描
public interface BaseCategory1Mapper extends BaseMapper<BaseCategory1> {

}
