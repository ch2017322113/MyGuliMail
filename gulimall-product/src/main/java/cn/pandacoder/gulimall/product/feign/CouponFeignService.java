package cn.pandacoder.gulimall.product.feign;

import cn.pandacoder.common.to.SkuReductionTo;
import cn.pandacoder.common.to.SpuBoundTo;
import cn.pandacoder.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody  SkuReductionTo skuReductionTo);
}
