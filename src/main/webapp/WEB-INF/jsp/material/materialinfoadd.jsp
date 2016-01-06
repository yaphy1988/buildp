<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<script src="${ctx}/resources/js/manager/materialinfoadd.js"></script>

<form method="post">
	<div class="modal-body">
		<table>
			<tr>
				<td style="text-align:right;">材料名称：</td>
				<td>
					<input id="addMaterialName" style="width:250px" type="text" class="form-control" name="materialName">
				</td>
			</tr>
			<tr>
				<td>材料类型：</td>
				<td>
					<select id="selectType" name="materialType">
					</select>
				</td>
			</tr>
			<tr>
				<td>规格描述：</td>
				<td>
					<input id="addStandard" style="width:250px" type="text" class="form-control" name="standard">
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">状态：</td>
				<td id="addStatusTd">
					<input id="effective" type="radio" value="1" name="status" checked="checked">有效
					<input id="void" type="radio" value="0" name="status">无效
				</td>
			</tr>
			<input id="createStaff" type="hidden" name="createStaff" value="${user.userName}"/>
		</table>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-default btn-add">添加</button>
		<button type="reset" class="btn btn-default">重置</button>
		<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
	</div>
	
</form>
