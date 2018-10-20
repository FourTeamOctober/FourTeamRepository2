package com.jk.mapper;

import com.jk.domain.inquiry.Inquiry;
import com.jk.domain.serverQuotation.ServerQuotation;

import java.util.List;

public interface InquiryMapper {
    /**
     * 询价单列表查询
     * @param
     * @return
     */
    List getInquiryList(Inquiry inquiry);
    /**
     * 有材料单报价
     */
    void insertQuotation(ServerQuotation serverQuotation);
}
