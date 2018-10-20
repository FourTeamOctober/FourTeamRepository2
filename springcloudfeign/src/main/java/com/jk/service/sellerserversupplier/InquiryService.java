package com.jk.service.sellerserversupplier;

import com.jk.service.seller.sellerserversupplier.InquiryApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("service-seller")
public interface InquiryService extends InquiryApi {

}
