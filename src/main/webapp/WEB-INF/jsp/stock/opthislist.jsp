<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table class="table table-bordered table-striped responsive">
	<thead>
		<tr>
			<th>操作记录ID</th>
			<th>单品库存量ID</th>
			<th>材料编码</th>
			<th>操作类型</th>	
			<th>操作数量</th>	
			<th>操作时间</th>	
			<th>创建人</th>	
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${pageInfo.result}" var="info"  varStatus="status">
		<tr>
			<td class="center">${info.stockOptId}</td>
			<td class="center">${info.stockId}</td>
			<td class="center">${info.materialId}</td>
			<td class="center">
			<c:if test="${info.optType=='01'}">
			    <c:out value="入库"/>
			</c:if>
			<c:if test="${info.optType=='02'}">
			    <c:out value="出库"/>
			</c:if>
			</td>
			<td class="center">${info.count}</td>
			<td class="center"><fmt:formatDate value="${info.createTime}" pattern="yyyy/MM/dd  HH:mm:ss" /></td>
			<td class="center">${info.createStaff}</td>
		</tr>
		</c:forEach>
		</tbody>
</table>

<div>
    <ul id='page-element' data-pageindex="${pageInfo.pageIndex}" data-pagesize="${pageInfo.pageSize}" data-total="${pageInfo.total}"></ul>
</div>

<!-- pager.common.js -->
<script src="${ctx}/resources/js/pager.common.js"></script>