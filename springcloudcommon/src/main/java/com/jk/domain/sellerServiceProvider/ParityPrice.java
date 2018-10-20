package com.jk.domain.sellerServiceProvider;

import com.jk.util.PageUtil;

import java.io.Serializable;

public class ParityPrice extends PageUtil implements Serializable {
    private static final long serialVersionUID = -8589711471631985499L;

    //ID主键
    private String ratiopriceId;
    //讯图单ID
    private String ratiopriceMapId;
    //项目编号
    private String ratiopriceNumber;
    //项目编号2
    private String ratiopriceCoding;
    //项目名称
    private String ratiopriceName;
    //渠道
    private String ratiopriceChannel;
    //渠道ID
    private String ratiopriceChannelNumber;
    //渠道名称
    private String ratiopriceChannelName;
    //开始时间
    private String ratiopriceStartTime;
    //结束时间
    private String ratiopriceEndTime;
    //状态
    private String ratiopriceState;

    public String getRatiopriceId() {
        return ratiopriceId;
    }

    public void setRatiopriceId(String ratiopriceId) {
        this.ratiopriceId = ratiopriceId;
    }

    public String getRatiopriceName() {
        return ratiopriceName;
    }

    public void setRatiopriceName(String ratiopriceName) {
        this.ratiopriceName = ratiopriceName;
    }

    public String getRatiopriceChannel() {
        return ratiopriceChannel;
    }

    public void setRatiopriceChannel(String ratiopriceChannel) {
        this.ratiopriceChannel = ratiopriceChannel;
    }

    public String getRatiopriceStartTime() {
        return ratiopriceStartTime;
    }

    public void setRatiopriceStartTime(String ratiopriceStartTime) {
        this.ratiopriceStartTime = ratiopriceStartTime;
    }

    public String getRatiopriceEndTime() {
        return ratiopriceEndTime;
    }

    public void setRatiopriceEndTime(String ratiopriceEndTime) {
        this.ratiopriceEndTime = ratiopriceEndTime;
    }

    public String getRatiopriceState() {
        return ratiopriceState;
    }

    public void setRatiopriceState(String ratiopriceState) {
        this.ratiopriceState = ratiopriceState;
    }

    public String getRatiopriceNumber() {
        return ratiopriceNumber;
    }

    public void setRatiopriceNumber(String ratiopriceNumber) {
        this.ratiopriceNumber = ratiopriceNumber;
    }

    public String getRatiopriceChannelNumber() {
        return ratiopriceChannelNumber;
    }

    public void setRatiopriceChannelNumber(String ratiopriceChannelNumber) {
        this.ratiopriceChannelNumber = ratiopriceChannelNumber;
    }

    public String getRatiopriceChannelName() {
        return ratiopriceChannelName;
    }

    public void setRatiopriceChannelName(String ratiopriceChannelName) {
        this.ratiopriceChannelName = ratiopriceChannelName;
    }

    public String getRatiopriceMapId() {
        return ratiopriceMapId;
    }

    public void setRatiopriceMapId(String ratiopriceMapId) {
        this.ratiopriceMapId = ratiopriceMapId;
    }

    public String getRatiopriceCoding() {
        return ratiopriceCoding;
    }

    public void setRatiopriceCoding(String ratiopriceCoding) {
        this.ratiopriceCoding = ratiopriceCoding;
    }
}
