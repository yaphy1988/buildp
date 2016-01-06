package com.ai.buildp.model.view;

import java.util.Date;

public class TMaterialTypeView {
	private Long typeId;

    private String typeName;

    private Long parentTypeId;
    
    private String parentTypeName;

    private String endNode;

    private Long sorts;

    private String status;

    private Date createTime;

    private String createStaff;

    private Date updateTime;

    private String updateStaff;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Long getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(Long parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    
    public String getParentTypeName() {
        return parentTypeName;
    }

    public void setParentTypeName(String parentTypeName) {
        this.parentTypeName = parentTypeName == null ? null : parentTypeName.trim();
    }

    public String getEndNode() {
        return endNode;
    }

    public void setEndNode(String endNode) {
        this.endNode = endNode == null ? null : endNode.trim();
    }

    public Long getSorts() {
        return sorts;
    }

    public void setSorts(Long sorts) {
        this.sorts = sorts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(String updateStaff) {
        this.updateStaff = updateStaff == null ? null : updateStaff.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", parentTypeId=").append(parentTypeId);
        sb.append(", parentTypeName=").append(parentTypeName);
        sb.append(", endNode=").append(endNode);
        sb.append(", sorts=").append(sorts);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", createStaff=").append(createStaff);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateStaff=").append(updateStaff);
        sb.append("]");
        return sb.toString();
    }
}
