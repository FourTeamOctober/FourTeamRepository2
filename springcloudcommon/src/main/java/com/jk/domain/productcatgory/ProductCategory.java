package com.jk.domain.productcatgory;

import java.io.Serializable;

public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 5554258166423590097L;

    /**
     * 产品类目Id
     */
    private String productCategoryId;

    /**
     * 产品类目名称
     */
    private String productCategoryName;

    /**
     * 产品类目Pid
     */
    private String productCategoryPid;

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryPid() {
        return productCategoryPid;
    }

    public void setProductCategoryPid(String productCategoryPid) {
        this.productCategoryPid = productCategoryPid;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategoryId='" + productCategoryId + '\'' +
                ", productCategoryName='" + productCategoryName + '\'' +
                ", productCategoryPid='" + productCategoryPid + '\'' +
                '}';
    }
}
