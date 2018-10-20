package com.jk.controller.sellerserversupplier;

import com.alibaba.fastjson.JSON;
import com.jk.domain.inquiry.Inquiry;
import com.jk.domain.serverQuotation.ServerQuotation;
import com.jk.service.InquiryServices;
import com.jk.service.seller.sellerserversupplier.InquiryApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class InquiryController implements InquiryApi {

    @Autowired
    private InquiryServices inquiryServices;

    /**
     * 询价单列表查询
     * @param inquiry
     * @return
     */
    @Override
    public Map<String, Object> getInquiryList(@RequestParam(value="inquiry")String inquiry) {
        Inquiry inquiry1 = JSON.parseObject(inquiry, Inquiry.class);
            return inquiryServices.getInquiryList(inquiry1);
    }

    /**
     *有材料单报价
     * @param serverQuotation
     */
    @Override
    public void insertQuotation(@RequestBody ServerQuotation serverQuotation) {
        inquiryServices.insertQuotation(serverQuotation);
    }
}