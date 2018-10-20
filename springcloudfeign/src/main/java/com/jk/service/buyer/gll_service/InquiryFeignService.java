package com.jk.service.buyer.gll_service;

import com.jk.service.buyer.InquiryService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-buyer")
public interface InquiryFeignService extends InquiryService {

}
