package com.jk.controller.buyer.gll_controller;

import com.jk.domain.inquiry.Inquiry;
import com.jk.service.buyer.gll_service.InquiryFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("supplier/inquiry")
public class InquiryFeignController {
    @Autowired
    private InquiryFeignService inquiryFeignService;

    @GetMapping
    public List<Inquiry> selectOurInquiry() {
        return inquiryFeignService.selectOurInquiry();
    }
}
