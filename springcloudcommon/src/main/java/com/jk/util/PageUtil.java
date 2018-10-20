package com.jk.util;


import java.io.Serializable;

public class PageUtil implements Serializable {

    private static final long serialVersionUID = -4482249848292188412L;
    //当前页数
    private int page = 1;

    //每页条数
    private int limit = 3;

    private int rows = 3;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }



}
