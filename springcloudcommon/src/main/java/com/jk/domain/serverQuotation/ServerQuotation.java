package com.jk.domain.serverQuotation;

import java.io.Serializable;

public class ServerQuotation  implements Serializable {
    private static final long serialVersionUID = 2240975457749047769L;
    /**
     * ID
      */
    private String serverId;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 单价
     */
    private Double unitPrice;
    /**
     * 运费
     */
    private Double assemblePrice;
    /**
     * 组装工费
     */
        private Double freightPrice;
    /**
     * 其他
     */
    private String  otherName;
    /**其他服务费用
     *
     */
    private Double otherPrice;
    /**
     * 备注
     */
    private String serverDesc;
    /**
     * 附件
     */
    private String accessory;
    /**
     * 供货周期
     */
    private int deliveryCycle;
    /**
     * 报价有效时间
     */
    private String durationTime;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getAssemblePrice() {
        return assemblePrice;
    }

    public void setAssemblePrice(Double assemblePrice) {
        this.assemblePrice = assemblePrice;
    }

    public Double getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(Double freightPrice) {
        this.freightPrice = freightPrice;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Double getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(Double otherPrice) {
        this.otherPrice = otherPrice;
    }

    public String getServerDesc() {
        return serverDesc;
    }

    public void setServerDesc(String serverDesc) {
        this.serverDesc = serverDesc;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public int getDeliveryCycle() {
        return deliveryCycle;
    }

    public void setDeliveryCycle(int deliveryCycle) {
        this.deliveryCycle = deliveryCycle;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }
}
