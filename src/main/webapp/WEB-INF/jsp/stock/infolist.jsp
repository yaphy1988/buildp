<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table class="table table-bordered table-striped responsive">
	<thead>
		<tr>
			<th>材料编码</th>
			<th>供货商</th>
			<th>实际库存总量</th>
			<th>可用库存总量</th>	
			<th>创建时间</th>	
			<th>创建人</th>	
			<th>更新时间</th>	
			<th>更新人</th>	
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${pageInfo.result}" var="info"  varStatus="status">
		<tr>
			<td class="center">${info.materialId}</td>
			<td class="center">${info.supplierId}</td>
			<td class="center">${info.count}</td>
			<td class="center">${info.availCount}</td>
			<td class="center"><fmt:formatDate value="${info.createTime}" pattern="yyyy/MM/dd  HH:mm:ss" /></td>
			<td class="center">${info.createUser}</td>
			<td class="center"><fmt:formatDate value="${info.updateTime}" pattern="yyyy/MM/dd  HH:mm:ss" /></td>
			<td class="center">${info.updateUser}</td>
		</tr>
		</c:forEach>
		</tbody>
</table>

<div>
    <ul id='page-element' data-pageindex="${pageInfo.pageIndex}" data-pagesize="${pageInfo.pageSize}" data-total="${pageInfo.total}"></ul>
</div>

<!-- pager.common.js -->
<script src="${ctx}/resources/js/pager.common.js"></script>