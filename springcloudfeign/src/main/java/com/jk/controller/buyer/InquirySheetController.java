package com.jk.controller.buyer;

import com.jk.domain.productcatgory.ProductCategory;
import com.jk.domain.range.Range;
import com.jk.service.buyer.InquirySheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("pc/inquirySheet")
public class InquirySheetController {

    @Autowired
    private InquirySheetService inquirySheetService;

    /**
     * 询图单列表查询
     * @return
     */
    @GetMapping("selectInquiryList")
    public Map<String, Object> selectInquiryList(@RequestParam(value = "inquirySheet") String inquirySheet){
        System.out.println("请求进来了");
        return inquirySheetService.selectInquiryList(inquirySheet);
    }


    /**
     * 查询定制需求的发布范围
     */
    @GetMapping("range")
    public List<Range> selectRangeList(){
        return inquirySheetService.selectRangeList();
    }

    /**
     * 查询定制产品所需类目
     */
    @GetMapping("productcategory")
    public List<ProductCategory> selectProductCategory(@RequestParam(value = "productcategoryId") String productcategoryId){
            System.out.println("productcategoryId = [" + productcategoryId + "]");
            return inquirySheetService.selectProductCategory(productcategoryId);
    }

    /**
     * 新增渠道类目表
     */
/*    @PostMapping("insertProductCategory")
    public*/
}
