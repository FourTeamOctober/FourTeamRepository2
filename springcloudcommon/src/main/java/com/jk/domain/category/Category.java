package com.jk.domain.category;

import java.io.Serializable;

public class Category implements Serializable {

    private static final long serialVersionUID = 9110335048267610703L;

    private String categoryId;//
    private int releaseScope;//发布范围
    private int firstClassCategory;//一级类目
    private int classTwoClass;//二级类目
    private int classThreeClass;//三级类目

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getReleaseScope() {
        return releaseScope;
    }

    public void setReleaseScope(int releaseScope) {
        this.releaseScope = releaseScope;
    }

    public int getFirstClassCategory() {
        return firstClassCategory;
    }

    public void setFirstClassCategory(int firstClassCategory) {
        this.firstClassCategory = firstClassCategory;
    }

    public int getClassTwoClass() {
        return classTwoClass;
    }

    public void setClassTwoClass(int classTwoClass) {
        this.classTwoClass = classTwoClass;
    }

    public int getClassThreeClass() {
        return classThreeClass;
    }

    public void setClassThreeClass(int classThreeClass) {
        this.classThreeClass = classThreeClass;
    }
}