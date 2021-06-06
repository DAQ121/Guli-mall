package com.daq.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daq.common.utils.PageUtils;
import com.daq.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 15:02:28
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

