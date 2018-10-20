package com.jk.mapper;

import com.jk.domain.inquirySheet.InquirySheet;
import com.jk.domain.productcatgory.ProductCategory;
import com.jk.domain.range.Range;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyerMapper {

    /**
     * 查询询图单列表
     * @param inquirySheet
     * @return
     */
    List<InquirySheet> getInquirySheetList(InquirySheet inquirySheet);

    /**
     * 查询定制需求的发布范围
     */
    List<Range> selectRangeList();

    /**
     * 查询定制产品所需类目
     */
    List<ProductCategory> selectProductCategory(String productcategoryId);
}
