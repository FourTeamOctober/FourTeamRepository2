package com.jk.service.figure;

import com.jk.domain.inquirySheet.InquirySheet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("feignxiao")
public interface FeignServiceApi {
    @GetMapping
    List<InquirySheet> selectSheet();
/*    @PutMapping
    void updateInquirySheetById(InquirySheet inquirySheet);

    List<InquirySheet> selectSheetById(String inquirySheetId);*/
}
