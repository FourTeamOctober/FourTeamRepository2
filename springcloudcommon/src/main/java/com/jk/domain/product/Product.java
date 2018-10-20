package com.jk.domain.product;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 911033504826761111L;

    private String productIid;
    private String productName;//产品名称
    private String categoryId;//关联类目表
    private int purchaseQuantity;//采购数量
    private String productCategory;//产品类别
    private int importPressureMax;//进口压力最大值
    private int importPressureMin;//进口压力最小值
    private int importPressureUnit;//进口压力单位
    private int exportPressureMax;//出口压力单位最大值
    private int exportPressureMin;//出口压力最小值
    private int exportPressureUnit;//出口压力单位
    private int flowmeterLength;//流量计长度
    private int voltageRegulator;//调压器
    private int outerBox;//外箱
    private int outerBoxMaterial;//外箱材质
    private String remarks;//备注
    private String enclosure;//附件
    private int demandType;//需求类型 1产品询价 2 询设计方案

    public String getProductIid() {
        return productIid;
    }

    public void setProductIid(String productIid) {
        this.productIid = productIid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getImportPressureMax() {
        return importPressureMax;
    }

    public void setImportPressureMax(int importPressureMax) {
        this.importPressureMax = importPressureMax;
    }

    public int getImportPressureMin() {
        return importPressureMin;
    }

    public void setImportPressureMin(int importPressureMin) {
        this.importPressureMin = importPressureMin;
    }

    public int getImportPressureUnit() {
        return importPressureUnit;
    }

    public void setImportPressureUnit(int importPressureUnit) {
        this.importPressureUnit = importPressureUnit;
    }

    public int getExportPressureMax() {
        return exportPressureMax;
    }

    public void setExportPressureMax(int exportPressureMax) {
        this.exportPressureMax = exportPressureMax;
    }

    public int getExportPressureMin() {
        return exportPressureMin;
    }

    public void setExportPressureMin(int exportPressureMin) {
        this.exportPressureMin = exportPressureMin;
    }

    public int getExportPressureUnit() {
        return exportPressureUnit;
    }

    public void setExportPressureUnit(int exportPressureUnit) {
        this.exportPressureUnit = exportPressureUnit;
    }

    public int getFlowmeterLength() {
        return flowmeterLength;
    }

    public void setFlowmeterLength(int flowmeterLength) {
        this.flowmeterLength = flowmeterLength;
    }

    public int getVoltageRegulator() {
        return voltageRegulator;
    }

    public void setVoltageRegulator(int voltageRegulator) {
        this.voltageRegulator = voltageRegulator;
    }

    public int getOuterBox() {
        return outerBox;
    }

    public void setOuterBox(int outerBox) {
        this.outerBox = outerBox;
    }

    public int getOuterBoxMaterial() {
        return outerBoxMaterial;
    }

    public void setOuterBoxMaterial(int outerBoxMaterial) {
        this.outerBoxMaterial = outerBoxMaterial;
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

    public int getDemandType() {
        return demandType;
    }

    public void setDemandType(int demandType) {
        this.demandType = demandType;
    }
}
