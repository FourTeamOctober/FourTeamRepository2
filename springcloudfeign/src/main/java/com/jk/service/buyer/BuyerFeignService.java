package com.jk.service.buyer;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface BuyerFeignService extends BuyerService{
}
