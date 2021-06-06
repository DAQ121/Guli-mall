package com.daq.gulimall.product.dao;

import com.daq.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 11:22:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
