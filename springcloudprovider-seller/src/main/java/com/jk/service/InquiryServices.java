package com.jk.service;

import com.jk.domain.inquiry.Inquiry;
import com.jk.domain.serverQuotation.ServerQuotation;

import java.util.Map;

public interface InquiryServices {
    /**
     * 询价单列表查询
     * @param
     * @return
     */
    Map<String, Object> getInquiryList(Inquiry inquiry1);
    /**
     * 有材料单报价
     */
    void insertQuotation(ServerQuotation serverQuotation);
}
