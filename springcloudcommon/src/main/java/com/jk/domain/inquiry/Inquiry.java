package com.jk.domain.inquiry;

import java.io.Serializable;

public class Inquiry implements Serializable {

    private static final long serialVersionUID = 9110335048267610704L;

    private String inquirySheetId;
    private String createTime;//报价开始日期
    private String endTime;//报价截止日期
    private String publishTime;//中标结果公布日期
    private int expectedReceivingCycle;//期望收货周期
    private int supplierScope;//供应商范围 1 无限制 2仅限白名单内供应商
    private int minimumQuantity;//最低参与报价供应商的数量
    private int expectedTotalPrice;//预期总价(含税)
    private int prepaymentRatio;//预付款比例
    private int advancePaymentAccount;//预付款账期
    private int paymentInProportion;//缴付款比例
    private int paymentPeriod;//缴付款账期
    private int ticketToMoneyRatio;//票到款比例
    private int ticketToAccountPeriod;//票到款账期
    private int tailProportion;//尾款比例
    private int endAccountPeriod;//尾款账期
    private int invoiceType;//发票类型 1 增值税普通发票 2 增值税专用发票
    private int taxRate;//关联税率表
    private int ticketOpening;//开票方式 1 按订单金额开票 2 自己去想
    private int clearingMerchant;//结算商ID    关联字段
    private int distributionMode;//配送方式 1 线上发货 2上门提货
    private String receivingAddress;//收货地址
    private String remarks;//备注信息
    private String enclosure;//附件
    private int materialSheetYn;//是否提供材料单  1 是 2 否

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

    public int getExpectedReceivingCycle() {
        return expectedReceivingCycle;
    }

    public void setExpectedReceivingCycle(int expectedReceivingCycle) {
        this.expectedReceivingCycle = expectedReceivingCycle;
    }

    public int getSupplierScope() {
        return supplierScope;
    }

    public void setSupplierScope(int supplierScope) {
        this.supplierScope = supplierScope;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public int getExpectedTotalPrice() {
        return expectedTotalPrice;
    }

    public void setExpectedTotalPrice(int expectedTotalPrice) {
        this.expectedTotalPrice = expectedTotalPrice;
    }

    public int getPrepaymentRatio() {
        return prepaymentRatio;
    }

    public void setPrepaymentRatio(int prepaymentRatio) {
        this.prepaymentRatio = prepaymentRatio;
    }

    public int getAdvancePaymentAccount() {
        return advancePaymentAccount;
    }

    public void setAdvancePaymentAccount(int advancePaymentAccount) {
        this.advancePaymentAccount = advancePaymentAccount;
    }

    public int getPaymentInProportion() {
        return paymentInProportion;
    }

    public void setPaymentInProportion(int paymentInProportion) {
        this.paymentInProportion = paymentInProportion;
    }

    public int getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(int paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public int getTicketToMoneyRatio() {
        return ticketToMoneyRatio;
    }

    public void setTicketToMoneyRatio(int ticketToMoneyRatio) {
        this.ticketToMoneyRatio = ticketToMoneyRatio;
    }

    public int getTicketToAccountPeriod() {
        return ticketToAccountPeriod;
    }

    public void setTicketToAccountPeriod(int ticketToAccountPeriod) {
        this.ticketToAccountPeriod = ticketToAccountPeriod;
    }

    public int getTailProportion() {
        return tailProportion;
    }

    public void setTailProportion(int tailProportion) {
        this.tailProportion = tailProportion;
    }

    public int getEndAccountPeriod() {
        return endAccountPeriod;
    }

    public void setEndAccountPeriod(int endAccountPeriod) {
        this.endAccountPeriod = endAccountPeriod;
    }

    public int getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(int invoiceType) {
        this.invoiceType = invoiceType;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTicketOpening() {
        return ticketOpening;
    }

    public void setTicketOpening(int ticketOpening) {
        this.ticketOpening = ticketOpening;
    }

    public int getClearingMerchant() {
        return clearingMerchant;
    }

    public void setClearingMerchant(int clearingMerchant) {
        this.clearingMerchant = clearingMerchant;
    }

    public int getDistributionMode() {
        return distributionMode;
    }

    public void setDistributionMode(int distributionMode) {
        this.distributionMode = distributionMode;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
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

    public int getMaterialSheetYn() {
        return materialSheetYn;
    }

    public void setMaterialSheetYn(int materialSheetYn) {
        this.materialSheetYn = materialSheetYn;
    }
}
