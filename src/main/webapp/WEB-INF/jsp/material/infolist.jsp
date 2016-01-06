<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<table id="infoTable" class="table table-bordered table-striped responsive">
	<thead>
		<tr>
			<th>材料编码</th>
			<th>材料名称</th>
			<th>材料类型</th>
			<th>规格描述</th>	
			<th>状态</th>	
			<th>创建时间</th>	
			<th>操作</th>	
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${pageInfo.result}" var="info"  varStatus="status">
		<tr>
			<td class="center">${info.materialId}</td>
			<td class="center">${info.materialName}</td>
			<td class="center">${info.typeName}</td>
			<td class="center">${info.standard}</td>
			<td class="center">
				<c:choose>
                        		<c:when test="${info.status==1}">
                        			有效
                        		</c:when>
                        		<c:otherwise>
                        			无效
                        		</c:otherwise>
                     				</c:choose>
			</td>
			<td class="center"><fmt:formatDate value="${info.createTime}" pattern="yyyy/MM/dd  HH:mm:ss" /></td>
			<td class="center"><a id="btn-info" class="btn btn-info" href="#" onclick="query(${info.materialId})"> <i
							class="glyphicon glyphicon-edit icon-white"></i> 编辑
					</a> <a class="btn btn-danger a-delete" href="#" onclick="deleteInfo(${info.materialId});"> <i
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
<script src="${ctx}/resources/js/pager.common.js"></script>