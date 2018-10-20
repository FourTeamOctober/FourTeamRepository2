package com.jk.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.domain.inquiry.Inquiry;
import com.jk.domain.serverQuotation.ServerQuotation;
import com.jk.mapper.InquiryMapper;
import com.jk.service.InquiryServices;
import com.jk.util.StringUuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class InqueryServicesImpl implements InquiryServices {
    @Autowired
    private InquiryMapper inquiryMapper;
    /**
     * 询价单列表查询
     * @param
     * @return
     */
    @Override
    public Map<String, Object> getInquiryList(Inquiry inquiry1) {
        //创建返回的集合
        Map<String, Object> map = new HashMap<>();
        //开启分页
        PageHelper.startPage(inquiry1.getPage(), inquiry1.getRows());
        List list =  inquiryMapper.getInquiryList(inquiry1);
        Page p =  (Page) list;
        long total = p.getTotal();
        map.put("rows", list);
        map.put("total", total);
        return map;
    }
    /**
     * 有材料单报价
     */
    @Override
    public void insertQuotation(ServerQuotation serverQuotation) {
        serverQuotation.setServerId(StringUuid.getUUID());
        inquiryMapper.insertQuotation(serverQuotation);
    }

}
