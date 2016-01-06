package com.ai.buildp.dao.model;

import java.util.Date;

public class TSupplierQuotation {
    private Long quotationId;

    private String projectId;

    private Long quotationBatch;

    private Long supplierId;

    private Long materialId;

    private Long unitPrice;

    private Long amount;

    private String measureCode;

    private Long totalPrice;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    public Long getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Long quotationId) {
        this.quotationId = quotationId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Long getQuotationBatch() {
        return quotationBatch;
    }

    public void setQuotationBatch(Long quotationBatch) {
        this.quotationBatch = quotationBatch;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getMeasureCode() {
        return measureCode;
    }

    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode == null ? null : measureCode.trim();
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quotationId=").append(quotationId);
        sb.append(", projectId=").append(projectId);
        sb.append(", quotationBatch=").append(quotationBatch);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", materialId=").append(materialId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", amount=").append(amount);
        sb.append(", measureCode=").append(measureCode);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append("]");
        return sb.toString();
    }
}