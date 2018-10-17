package com.jk.service.seller;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-seller")
public interface SellerFeignService extends SellerService {
}
