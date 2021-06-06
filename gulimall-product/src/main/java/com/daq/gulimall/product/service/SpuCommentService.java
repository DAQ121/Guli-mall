package com.daq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daq.common.utils.PageUtils;
import com.daq.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 11:22:11
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

