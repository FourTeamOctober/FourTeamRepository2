package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.domain.inquirySheet.InquirySheet;
import com.jk.domain.productcatgory.ProductCategory;
import com.jk.domain.range.Range;
import com.jk.mapper.BuyerMapper;
import com.jk.service.buyer.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BuyerController implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;

    @Override
    public Map<String, Object> selectInquiryList(@RequestParam(value = "inquirySheet") String inquirySheet) {
        InquirySheet inquirySheet1 = JSON.parseObject(inquirySheet, InquirySheet.class);

        Map<String, Object> map = new HashMap<>();

        //开启分页
        PageHelper.startPage(inquirySheet1.getPage(), inquirySheet1.getRows());
        List list =  buyerMapper.getInquirySheetList(inquirySheet1);
        Page p =  (Page) list;
        long total = p.getTotal();
        map.put("rows", list);
        map.put("total", total);
        return map;
    }

    /**
     * 查询定制需求的发布范围
     */
    @Override
    public List<Range> selectRangeList() {
        return buyerMapper.selectRangeList();
    }

    /**
     * 查询定制产品所需类目
     */
    @Override
    public List<ProductCategory> selectProductCategory(@RequestParam(value = "productcategoryId")String productcategoryId) {
        return buyerMapper.selectProductCategory(productcategoryId);
    }
}
