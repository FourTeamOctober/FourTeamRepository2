package com.jk.controller.figure;

import com.jk.domain.inquirySheet.InquirySheet;
import com.jk.service.figure.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pc/feign")
public class FeignController   {
    @Autowired
    private FeignService feignService;

    /**
     * 询图单列表查询
     * @return
     */
   @GetMapping
    public List<InquirySheet> selectSheet(){
       return feignService.selectSheet();

    }
/*

    */
/**
     * 询图单列表回填
     * @param inquirySheetId
     * @param model
     * @return
     *//*

    @GetMapping("{inquirySheetId}")
    public  List<InquirySheet> selectSheetById(@PathVariable("inquirySheetId") String  inquirySheetId, Model model){
      List<InquirySheet>   list=feignService.selectSheetById(inquirySheetId);
        model.addAttribute("ll",list);
        return list;
    }

    */
/**
     * 询图单列表修改
     * @param inquirySheet
     *//*

    @PutMapping
    public void  updateInquirySheetById(InquirySheet inquirySheet){
        feignService.updateInquirySheetById(inquirySheet);
    }
*/


}
