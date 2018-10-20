package com.jk.service.seller.sellerserversupplier;

import com.jk.domain.serverQuotation.ServerQuotation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("servers")
public interface InquiryApi {
    /**
     * 询价单列表查询
     * @param
     * @return
     */
    @GetMapping("getInquiryList")
    Map<String, Object> getInquiryList(@RequestParam(value="inquiry") String inquiry);
    /**
     *   有材料单报价
     *
     */
    @PostMapping("insertQuotation")
    void insertQuotation(@RequestBody ServerQuotation serverQuotation);
}
