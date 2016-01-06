<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script src="${ctx}/resources/js/manager/materialinfoedit.js"></script>
<div id="editInfo" class="modal-body">
	<table>
		<input id="editMaterialId" type="hidden" value="${info.materialId}"/>
		<tr>
			<td style="text-align:right;">材料名称：</td>
			<td>
				<input id="editMaterialName" style="width:250px" type="text" class="form-control" name="materialName" value="${info.materialName }"/>
			</td>
		</tr>
		<tr>
			<td>材料类型：</td>
			<td>
				<input id="editMaterialType" type="hidden" value="${info.materialType }"/>
				<select id="select-edit" name="materialType">
				</select>
			</td>
		</tr>
		<tr>
			<td>规格描述：</td>
			<td>
				<input id="editStandard" style="width:250px" type="text" class="form-control" name="standard" value="${info.standard }" />
			</td>
		</tr>
		<tr>
			<td style="text-align:right;">状态：</td>
			<td>
				<c:choose>
                  		<c:when test="${info.status==1}">
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