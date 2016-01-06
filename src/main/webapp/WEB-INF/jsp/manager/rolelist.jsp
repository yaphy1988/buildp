<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table class="table table-striped table-bordered responsive">
	<thead>
		<tr>
			<th>角色名称</th>
			<th>角色说明</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${pageInfo.result}" var="role" varStatus="status">
			<tr>
				<td class="center">${role.roleName}</td>
				<td class="center">${role.roleRemark}</td>
				<td class="center"><fmt:formatDate value="${role.createTime}"
						pattern="yyyy/MM/dd  HH:mm:ss" /></td>
				<td class="center"><input type="hidden" name="roleid"
					value="${role.roleId}"><a class="btn btn-info btn-edit"
					href="editpermission?roleId=${role.roleId}"> <i class="glyphicon glyphicon-edit icon-white"></i>
						编辑权限
				</a> <a class="btn btn-danger" onclick="deleteRole(${role.roleId},'${role.roleName}')"> <i
						class="glyphicon glyphicon-trash icon-white"></i> 删除
				</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<div>
    <ul id='page-element' data-pageindex="${pageInfo.pageIndex}" data-pagesize="${pageInfo.pageSize}" data-total="${pageInfo.total}"></ul>
</div>
<!-- pager.common.js -->
<script src="${ctx}/resources/js/pager.common.js"></script>

<div class="modal fade" id="deleteRole" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>角色的菜单权限</h3>
			</div>
			<div class="modal-body">
				<p>确认删除角色</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn btn-primary" data-dismiss="modal"
					id="btn-deleteRole">删除</a> <a href="#" class="btn btn-default"
					data-dismiss="modal">取消</a>
			</div>
		</div>
	</div>
</div>
