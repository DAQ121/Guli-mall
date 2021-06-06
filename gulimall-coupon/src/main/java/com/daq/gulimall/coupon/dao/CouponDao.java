package com.daq.gulimall.coupon.dao;

import com.daq.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 14:47:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
