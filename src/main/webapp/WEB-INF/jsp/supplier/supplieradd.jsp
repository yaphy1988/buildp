<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script src="${ctx}/resources/js/manager/supplieradd.js"></script>
<form id="myForm" action="addSupplier" method="post">
	<div class="box-content">	
		<table style="width:900px">
			<tr>
				<td style="text-align:right;">供应商名称：</td>
				<td>
					<input id="addSupplierName" style="width:250px" type="text" 
						class="form-control" name="supplierName" onblur="check_name();">
				</td>
				<td>
					<span class="required">*</span>
					<div id="name_msg"  style="float:left"></div>
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">地址：</td>
				<td>
					<div id="myRegion" data-regioncode="000000" style="display:inline">
					</div >
					<input id="addAddress" class="form-control" name="address" style="width:250px">
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">行政区域编码：</td>
				<td>
					<input id="addRegionCode" style="width:250px" type="text" readonly
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
					<input id="addBusinessPermit" style="width:250px" type="text"
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
					<textarea id="addBusinessIntroduce" style="width:250px" class="autogrow" name="businessIntroduce"></textarea>
				</td>
				<br/>
			</tr>
			<tr>
				
				<td style="text-align:right;">状态：</td>
				<td id="addStatusTd">
					<input id="effective" type="radio" value="1" name="status" checked="checked">有效
					<input id="void" type="radio" value="0" name="status">无效
				</td>
			</tr>
			<input id="addCreateStaff" type="hidden" value="${user.userName }">
		</table>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-default" onclick="save();">添加</button>
		&nbsp;&nbsp;
		<button type="reset" class="btn btn-default">重置</button>
		&nbsp;&nbsp;
		<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
	</div>
</form>						
