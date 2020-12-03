package cn.pandacoder.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.pandacoder.common.utils.PageUtils;
import cn.pandacoder.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author pandacoder
 * @email 894302745@qq.com
 * @date 2020-12-02 22:37:51
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

