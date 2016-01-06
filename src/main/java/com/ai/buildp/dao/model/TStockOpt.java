package com.ai.buildp.dao.model;

import java.util.Date;

public class TStockOpt {
    private Long stockOptId;

    private Long stockId;

    private Long supplierId;

    private Long materialId;

    private String optType;

    private Long count;

    private Date createTime;

    private String createStaff;

    private String remark;

    public Long getStockOptId() {
        return stockOptId;
    }

    public void setStockOptId(Long stockOptId) {
        this.stockOptId = stockOptId;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
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

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType == null ? null : optType.trim();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(String createStaff) {
        this.createStaff = createStaff == null ? null : createStaff.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stockOptId=").append(stockOptId);
        sb.append(", stockId=").append(stockId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", materialId=").append(materialId);
        sb.append(", optType=").append(optType);
        sb.append(", count=").append(count);
        sb.append(", createTime=").append(createTime);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}