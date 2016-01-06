package com.ai.buildp.dao.model;

public class TMeasureUnits {
    private String measureCode;

    private String measureName;

    private String measureType;

    private String measureTypeName;

    private String measureRemark;

    public String getMeasureCode() {
        return measureCode;
    }

    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode == null ? null : measureCode.trim();
    }

    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName == null ? null : measureName.trim();
    }

    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType == null ? null : measureType.trim();
    }

    public String getMeasureTypeName() {
        return measureTypeName;
    }

    public void setMeasureTypeName(String measureTypeName) {
        this.measureTypeName = measureTypeName == null ? null : measureTypeName.trim();
    }

    public String getMeasureRemark() {
        return measureRemark;
    }

    public void setMeasureRemark(String measureRemark) {
        this.measureRemark = measureRemark == null ? null : measureRemark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", measureCode=").append(measureCode);
        sb.append(", measureName=").append(measureName);
        sb.append(", measureType=").append(measureType);
        sb.append(", measureTypeName=").append(measureTypeName);
        sb.append(", measureRemark=").append(measureRemark);
        sb.append("]");
        return sb.toString();
    }
}