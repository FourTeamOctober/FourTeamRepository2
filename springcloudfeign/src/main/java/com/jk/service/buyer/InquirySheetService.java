package com.jk.service.buyer;

import org.springframework.cloud.openfeign.FeignClient;
@FeignClient("service-buyer")
public interface InquirySheetService extends BuyerService{


}