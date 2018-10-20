package com.jk.service.seller.sellerServiceProvider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-seller")
public interface ParityPriceFeignService extends ParityPriceService {
}
