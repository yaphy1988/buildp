<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script src="${ctx}/resources/js/manager/materialtypeedit.js"></script>
<div class="modal-body">
	<table>
		<input id="editTypeId" type="hidden" value="${type.typeId }" />
		<tr>
			<td style="text-align:right;">类型名称：</td>
			<td>
				<input id="editTypeName" style="width:250px" type="text" class="form-control" name="typeName" value="${type.typeName }">
			</td>
		</tr>
		<tr>
			<td style="text-align:right;">父类型：</td>
			<td>
				<input id="editParentTypeId" type="hidden" value="${type.parentTypeId }"/>
				<select id="select-edit" name="parentTypeId">
					<option value=""></option>
				</select>
			</td>
		</tr>
		<tr>
			<td>是否叶子结点：</td>
			<td id="editEndNodeTd">
				<c:choose>
				<c:when test="${type.endNode==1}">
		            <input id="yes" type="radio" value="1" name="endNode" checked="checked">是
					<input id="no" type="radio" value="0" name="endNode">否
		        </c:when>
		        <c:otherwise>
		            <input id="yes" type="radio" value="1" name="endNode">是
					<input id="no" type="radio" value="0" name="endNode" checked="checked">否
		        </c:otherwise>
		        </c:choose>
			</td>
		</tr>
		<tr>
			<td style="text-align:right;">状态：</td>
			<td id="editStatusTd">
				<c:choose>
				<c:when test="${type.status==1}">
		            <input id="effective" type="radio" value="1" name="status" checked="checked">有效
					<input id="void" type="radio" value="0" name="status">无效
		        </c:when>
		        <c:otherwise>
		            <input id="effective" type="radio" value="1" name="status">有效
					<input id="void" type="radio" value="0" name="status" checked="checked">无效
		        </c:otherwise>
		        </c:choose>
			</td>
		</tr>
		<input id="editUpdateStaff" type="hidden" value="${user.userName}"/>
		
	</table>
</div>
<div class="modal-footer">
	<button id="confirmEdit" type="button" class="btn btn-default">修改</button>
	<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
</div>