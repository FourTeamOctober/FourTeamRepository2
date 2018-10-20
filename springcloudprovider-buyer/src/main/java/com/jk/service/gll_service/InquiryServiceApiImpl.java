package com.jk.service.gll_service;

import com.jk.domain.inquiry.Inquiry;
import com.jk.mapper.gll_mapper.InquiryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryServiceApiImpl implements InquiryServiceApi {
    @Autowired
    private InquiryMapper InquiryMapper;
    @Override
    public List<Inquiry> selectInquiry() {
        return InquiryMapper.selectInquiry();
    }

}
