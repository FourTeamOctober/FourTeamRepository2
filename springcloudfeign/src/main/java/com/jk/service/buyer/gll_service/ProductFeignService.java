package com.jk.service.buyer.gll_service;

import com.jk.service.buyer.ProductServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface ProductFeignService extends ProductServiceApi {
}
