package com.jk.controller.gll_controller;

import com.jk.domain.inquiry.Inquiry;
import com.jk.service.buyer.InquiryService;
import com.jk.service.gll_service.InquiryServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InquiryController implements InquiryService {
    @Autowired
    private InquiryServiceApi InquiryServiceApi;
    @Override
    public List<Inquiry> selectOurInquiry() {
        return InquiryServiceApi.selectInquiry();
    }
}
