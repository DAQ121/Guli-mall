package com.daq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daq.common.utils.PageUtils;
import com.daq.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 14:47:37
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

