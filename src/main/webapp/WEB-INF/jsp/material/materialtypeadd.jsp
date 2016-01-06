<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<script src="${ctx}/resources/js/manager/materialtypeadd.js"></script>
<style>
div.error_msg
{
    color:Red;
    background-image:url("${ctx}/images/wrong.gif") ;
    background-repeat:no-repeat;
    background-position:left center;
    border:1px solid red;
    padding-left:20px;
}
.required
{
	float:left;
	color:Red;
}
</style>
<form action="addMaterialType" method="post">
	<div class="modal-body">
		<table>
			<tr>
				<td style="text-align:right;">类型名称：</td>
				<td>
					<input id="addTypeName" style="width:250px" type="text" class="form-control" name="typeName" onblur="check_name();">
				</td>
				<td>
					<span class="required">*</span>
					<div id="name_msg"  style="float:left"></div>
				</td>
			</tr>
			<tr>
				<td style="text-align:right;">父类型：</td>
				<td>
					<select id="selectSupplier" name="parentTypeId">
						<option selected value=""></option>
					</select>
				</td>
			</tr>
			<tr>
				<td>是否叶子结点：</td>
				<td id="addEndNodeTd">
					<input id="yes" type="radio" value="1" name="endNode" checked="checked">是
					<input id="no" type="radio" value="0" name="endNode">否
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
			

