package com.jk.controller.seller.sellerserversupplier;

import com.jk.domain.serverQuotation.ServerQuotation;
import com.jk.service.sellerserversupplier.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 询价单
 */
@RestController
@RequestMapping("seller/inquiry")
public class InquiryController {
        @Autowired
        private InquiryService inquiryService;

        /**
         * 询价单列表查询
         * @param
         * @return
         */
        @GetMapping("getInquiryList")
        public Map<String,Object> getInquiryList(@RequestParam(value="inquiry") String inquiry){
                return inquiryService.getInquiryList(inquiry);
        }
        /**
         * 有材料单报价
         */
        @PostMapping("insertQuotation")
        public void insertQuotation(@RequestBody ServerQuotation serverQuotation){
                inquiryService.insertQuotation(serverQuotation);
        }


}
