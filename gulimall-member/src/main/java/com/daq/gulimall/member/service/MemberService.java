package com.daq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daq.common.utils.PageUtils;
import com.daq.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author daiaoqi
 * @email daiaoqi686@gmail.com
 * @date 2021-06-06 14:54:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

