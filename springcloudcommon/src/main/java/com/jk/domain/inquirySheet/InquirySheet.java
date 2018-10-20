package com.jk.domain.inquirySheet;

import java.io.Serializable;

public class InquirySheet  implements Serializable {

    private static final long serialVersionUID = 9110335048267610709L;

    private String inquirySheetId;
    private String createTime;//开始日期
    private String endTime;//截止日期
    private String publishTime;//公布日期
    private String email;//邮箱
    private String remarks;//备注
    private String enclosure;//附件

    public String getInquirySheetId() {
        return inquirySheetId;
    }

    public void setInquirySheetId(String inquirySheetId) {
        this.inquirySheetId = inquirySheetId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }
}
