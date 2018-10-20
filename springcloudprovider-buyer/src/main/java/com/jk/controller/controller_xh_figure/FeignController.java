package com.jk.controller.controller_xh_figure;

import com.jk.domain.inquirySheet.InquirySheet;
import com.jk.service.figure.FeignServiceApi;
import com.jk.service_xh_fugire.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FeignController implements FeignServiceApi {
    @Autowired
    private  FeignService  feignService;


    @Override
    public List<InquirySheet> selectSheet( ) {

        return  feignService.selectSheet();

    }
/*
    @Override
    public void updateInquirySheetById(InquirySheet inquirySheet) {
        feignService.updateInquirySheetById(inquirySheet);
    }

    @Override
    public List<InquirySheet> selectSheetById(String inquirySheetId) {
        return feignService.selectSheetById(inquirySheetId);
    }*/
}
