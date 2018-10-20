package com.jk.service_xh_fugire;


import com.jk.domain.inquirySheet.InquirySheet;

import java.util.List;

public interface FeignService {

    List<InquirySheet> selectSheet( );

/*    void updateInquirySheetById(InquirySheet inquirySheet);

    List<InquirySheet> selectSheetById(String inquirySheetId);*/
}
