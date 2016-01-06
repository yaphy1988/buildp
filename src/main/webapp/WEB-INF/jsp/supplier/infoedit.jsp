<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script src="${ctx}/resources/js/manager/supplieredit.js"></script>
<form id="editForm"  method="post">
	<div class="box-content">	
		<table style="width:900px">
			<input id="editSupplierId" name="supplierId" value="${info.supplierId}" style="display: none;">
			<tr>
				<td style="text-align:right;">供应商名称：</td>
				<td>
					<input id="editSupplierName" name="supplierName" type="text" value="${info.supplierName}" style="width:250px" 
						class="form-control" onblur="check_name();">
					
				</td>
				<td>	
					<span class="required">*</span>
					<div id="name_msg"  style="float:left"></div>
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">地址：</td>
				<td>
					<div id="myRegion" data-regioncode="${info.regionCode}" style="display:inline">
					</div >
					<input id="editAddress" class="form-control" name="address" style="width:250px" value="${info.address }">
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">行政区域编码：</td>
				<td>
					<input id="editRegionCode" style="width:250px" type="text" readonly value="${info.regionCode}"
						class="form-control" name="regionCode" onblur="check_region_code();">
				</td>
				<td>
					<span class="required">*</span>
					<div id="region_code_msg"  style="float:left"></div>
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">营业执照编码：</td>
				<td>
					<input id="editBusinessPermit" style="width:250px" type="text" value="${info.businessPermit}"
						 class="form-control" name="businessPermit" onblur="check_business_permit();">
				</td>
				<td>
					<span class="required">*</span>
					<div id="business_permit_msg"  style="float:left"></div>
				</td>
			</tr>
			<tr>
				<td valign="top"  style="text-align:right;">主营业务介绍：</td>
				<td>
					<textarea id="editBusinessIntroduce" style="width:250px" class="autogrow"
						 name="businessIntroduce">${info.businessIntroduce}</textarea>
				</td>
				<br/>
			</tr>
			<tr>
				
				<td style="text-align:right;">状态：</td>
				<td id="editStatusTd">
					<c:choose>
			              		<c:when test="${info.status==1}">
			              			<input id="effective" type="radio" value="1" name="status" checked="checked">有效
							<input id="void" type="radio" value="0" name="status">无效
			              		</c:when>
			              		<c:otherwise>
			              			<input id="effective" type="radio" value="1" name="status">有效
							<input id="void" type="radio" value="0" name="status"  checked="checked">无效
			              		</c:otherwise>
			           	</c:choose>
					
				</td>
			</tr>
			<input id="editCreateStaff" type="hidden" value="${user.userName }">
		</table>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-default" onclick="saveEdit(${info.supplierId});">修改</button>
		&nbsp;&nbsp;
		<button type="reset" class="btn btn-default">重置</button>
		&nbsp;&nbsp;
		<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
	</div>
</form>