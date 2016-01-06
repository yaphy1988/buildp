package com.ai.buildp.dao.model;

public class TBaseRegion {
    private String regionCode;

    private String regionName;

    private String parentCode;

    private String initialChar;

    private String initialPinyin;

    private String fullPinyin;

    private String regionSuffix;

    private String areaCode;

    private Integer orderNum;

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getInitialChar() {
        return initialChar;
    }

    public void setInitialChar(String initialChar) {
        this.initialChar = initialChar == null ? null : initialChar.trim();
    }

    public String getInitialPinyin() {
        return initialPinyin;
    }

    public void setInitialPinyin(String initialPinyin) {
        this.initialPinyin = initialPinyin == null ? null : initialPinyin.trim();
    }

    public String getFullPinyin() {
        return fullPinyin;
    }

    public void setFullPinyin(String fullPinyin) {
        this.fullPinyin = fullPinyin == null ? null : fullPinyin.trim();
    }

    public String getRegionSuffix() {
        return regionSuffix;
    }

    public void setRegionSuffix(String regionSuffix) {
        this.regionSuffix = regionSuffix == null ? null : regionSuffix.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", regionCode=").append(regionCode);
        sb.append(", regionName=").append(regionName);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", initialChar=").append(initialChar);
        sb.append(", initialPinyin=").append(initialPinyin);
        sb.append(", fullPinyin=").append(fullPinyin);
        sb.append(", regionSuffix=").append(regionSuffix);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", orderNum=").append(orderNum);
        sb.append("]");
        return sb.toString();
    }
}