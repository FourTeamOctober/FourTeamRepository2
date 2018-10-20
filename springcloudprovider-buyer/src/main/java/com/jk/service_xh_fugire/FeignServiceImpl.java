package com.jk.service_xh_fugire;

import com.jk.domain.inquirySheet.InquirySheet;
import com.jk.mapper.figure.FeignMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FeignServiceImpl implements FeignService {
    @Autowired
    private FeignMapper feignMapper;

    @Override
    public List<InquirySheet> selectSheet() {
       return feignMapper.selectSheet();

    }

  /*  @Override
    public void updateInquirySheetById(InquirySheet inquirySheet) {
        feignMapper.updateInquirySheetById(inquirySheet);
    }

    @Override
    public List<InquirySheet> selectSheetById(String inquirySheetId) {
        return feignMapper.selectSheetById(inquirySheetId);
    }*/
}
