<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table class="table table-bordered table-striped responsive">
	<thead>
	<tr>
		<th>类型编码</th>
		<th>类型名称</th>
		<th>父类型名称</th>
		<th>是否叶子结点</th>
		<th>状态</th>	
		<th>创建时间</th>	
		<th>操作</th>	
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${pageInfo.result}" var="type"  varStatus="status">
	<tr>
		<td class="center">${type.typeId}</td>
		<td class="center">${type.typeName}</td>
		<td class="center">${type.parentTypeName}</td>
		<td class="center">
			<c:choose>
                       		<c:when test="${type.endNode==1}">
                       			是
                       		</c:when>
                       		<c:otherwise>
                       			否
                       		</c:otherwise>
                    				</c:choose>
		</td>
		<td class="center">
			<c:choose>
                       		<c:when test="${type.status==1}">
                       			有效
                       		</c:when>
                       		<c:otherwise>
                       			无效
                       		</c:otherwise>
                    				</c:choose>
		</td>
		<td class="center"><fmt:formatDate value="${type.createTime}" pattern="yyyy/MM/dd  HH:mm:ss" /></td>
		<td class="center"><a class="btn btn-info" href="#"  onclick="query(${type.typeId})"> <i
						class="glyphicon glyphicon-edit icon-white"></i> 编辑
				</a> <a class="btn btn-danger btn-setting" href="#" onclick="deleteType(${type.typeId})"> <i
						class="glyphicon glyphicon-trash icon-white"></i> 删除
				</a>
		</td>
	</tr>
	</c:forEach>
	</tbody>
</table>

<div>
    <ul id='page-element' data-pageindex="${pageInfo.pageIndex}" data-pagesize="${pageInfo.pageSize}" data-total="${pageInfo.total}"></ul>
</div>

<!-- pager.common.js -->
<script id="js" src="${ctx}/resources/js/pager.common.js"></script>