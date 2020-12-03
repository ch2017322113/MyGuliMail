package cn.pandacoder.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.pandacoder.common.utils.PageUtils;
import cn.pandacoder.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author pandacoder
 * @email 894302745@qq.com
 * @date 2020-12-03 11:32:06
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

