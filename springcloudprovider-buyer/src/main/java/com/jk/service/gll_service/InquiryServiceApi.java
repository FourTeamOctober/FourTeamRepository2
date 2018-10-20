package com.jk.service.gll_service;

import com.jk.domain.inquiry.Inquiry;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface InquiryServiceApi {
    @RequestMapping("selectInquiry")
    List<Inquiry> selectInquiry();
}
