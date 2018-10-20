package com.jk.domain.range;

import com.jk.util.PageUtil;

import java.io.Serializable;

public class Range implements Serializable {

    private static final long serialVersionUID = -7393478834790721064L;

    /**
     * 定制需求的发布范围id
     */
    private String rangeId;

    /**
     * 定制需求的发布范围Name
     */
    private String rangeName;

    public String getRangeId() {
        return rangeId;
    }

    public void setRangeId(String rangeId) {
        this.rangeId = rangeId;
    }

    public String getRangeName() {
        return rangeName;
    }

    public void setRangeName(String rangeName) {
        this.rangeName = rangeName;
    }

    @Override
    public String toString() {
        return "Range{" +
                "rangeId='" + rangeId + '\'' +
                ", rangeName='" + rangeName + '\'' +
                '}';
    }
}
