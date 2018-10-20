package com.jk.service.buyer;

import com.jk.domain.inquirySheet.InquirySheet;
import com.jk.domain.productcatgory.ProductCategory;
import com.jk.domain.range.Range;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@RequestMapping("buyer")
public interface BuyerService {
    /**
     * 询图单列表查询
     * @return
     */
    @GetMapping("selectInquiryList")
    Map<String, Object> selectInquiryList(@RequestParam(value = "inquirySheet") String inquirySheet);

    /**
     * 查询定制需求的发布范围
     */
    @GetMapping("range")
    List<Range> selectRangeList();

    /**
     * 查询定制产品所需类目
     */
    @GetMapping("productcategory")
    List<ProductCategory> selectProductCategory(@RequestParam(value = "productcategoryId")String productcategoryId);
}
