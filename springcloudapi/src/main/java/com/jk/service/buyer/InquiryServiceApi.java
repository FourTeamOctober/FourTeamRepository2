package com.jk.service.buyer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("inquiryApi")
public interface InquiryServiceApi {
    @GetMapping
    Map<String, Object> getInquiryList(@RequestParam(value = "i") String i);
}
