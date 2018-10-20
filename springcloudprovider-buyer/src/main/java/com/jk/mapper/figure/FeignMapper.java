package com.jk.mapper.figure;

import com.jk.domain.inquirySheet.InquirySheet;

import java.util.List;

public interface FeignMapper {
    /**
     * 查询询图单列表
     * @return
     */
    List<InquirySheet> selectSheet( );

/*    *//**
     * 修改询图单列表
     * @param inquirySheet
     *//*

    void updateInquirySheetById(InquirySheet inquirySheet);

    *//**
     * 回填询图单列表
     * @param inquirySheetId
     * @return
     *//*
    List<InquirySheet> selectSheetById(String inquirySheetId);*/
}
