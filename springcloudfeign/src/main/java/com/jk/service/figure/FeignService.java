package com.jk.service.figure;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface FeignService extends FeignServiceApi {

}
