package com.daq.gulimall.order.dao;

import com.daq.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 15:02:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
