package com.jk.domain.product;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = 911033504826761111L;

    private String product_id;
    private String product_name;//产品名称
    private String category_id;//关联类目表
    private int purchase_quantity;//采购数量
    private String product_category;//产品类别
    private int import_pressure_max;//进口压力最大值
    private int import_pressure_min;//进口压力最小值
    private int import_pressure_unit;//进口压力单位
    private int export_pressure_max;//出口压力单位最大值
    private int export_pressure_min;//出口压力最小值
    private int export_pressure_unit;//出口压力单位
    private int flowmeter_length;//流量计长度
    private int voltage_regulator;//调压器
    private int outer_box;//外箱
    private int outer_box_material;//外箱材质
    private String remarks;//备注
    private String enclosure;//附件
    private int demand_type;//需求类型 1产品询价 2 询设计方案

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getPurchase_quantity() {
        return purchase_quantity;
    }

    public void setPurchase_quantity(int purchase_quantity) {
        this.purchase_quantity = purchase_quantity;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public int getImport_pressure_max() {
        return import_pressure_max;
    }

    public void setImport_pressure_max(int import_pressure_max) {
        this.import_pressure_max = import_pressure_max;
    }

    public int getImport_pressure_min() {
        return import_pressure_min;
    }

    public void setImport_pressure_min(int import_pressure_min) {
        this.import_pressure_min = import_pressure_min;
    }

    public int getImport_pressure_unit() {
        return import_pressure_unit;
    }

    public void setImport_pressure_unit(int import_pressure_unit) {
        this.import_pressure_unit = import_pressure_unit;
    }

    public int getExport_pressure_max() {
        return export_pressure_max;
    }

    public void setExport_pressure_max(int export_pressure_max) {
        this.export_pressure_max = export_pressure_max;
    }

    public int getExport_pressure_min() {
        return export_pressure_min;
    }

    public void setExport_pressure_min(int export_pressure_min) {
        this.export_pressure_min = export_pressure_min;
    }

    public int getExport_pressure_unit() {
        return export_pressure_unit;
    }

    public void setExport_pressure_unit(int export_pressure_unit) {
        this.export_pressure_unit = export_pressure_unit;
    }

    public int getFlowmeter_length() {
        return flowmeter_length;
    }

    public void setFlowmeter_length(int flowmeter_length) {
        this.flowmeter_length = flowmeter_length;
    }

    public int getVoltage_regulator() {
        return voltage_regulator;
    }

    public void setVoltage_regulator(int voltage_regulator) {
        this.voltage_regulator = voltage_regulator;
    }

    public int getOuter_box() {
        return outer_box;
    }

    public void setOuter_box(int outer_box) {
        this.outer_box = outer_box;
    }

    public int getOuter_box_material() {
        return outer_box_material;
    }

    public void setOuter_box_material(int outer_box_material) {
        this.outer_box_material = outer_box_material;
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

    public int getDemand_type() {
        return demand_type;
    }

    public void setDemand_type(int demand_type) {
        this.demand_type = demand_type;
    }
}
