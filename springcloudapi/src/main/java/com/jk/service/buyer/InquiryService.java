package com.jk.service.buyer;

import com.jk.domain.inquiry.Inquiry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("ourInquiry")
public interface InquiryService {
    @GetMapping
    List<Inquiry> selectOurInquiry();
}
