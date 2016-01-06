<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>供货商信息管理</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="supplier manage">
<meta name="author" content="yaphy">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/js/manager/suppliermanage.js"></script>
<!-- The styles -->
<style>
</style>
</head>
<body>
	<%@include file="/WEB-INF/jsp/common/header.jsp"%>
	<div class="ch-container">
		<div class="row">
			<%@include file="/WEB-INF/jsp/common/sidebar.jsp"%>

			<div id="content" class="col-lg-10 col-sm-10">
				<!-- content starts -->
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 欢迎您，${user.userName}
								</h2>
								
							</div>
							<div class="box-content">
								<div class="alert alert-info">
									查看供货商信息。
									<button id="addBtn" class="btn btn-success btn-sm">
									    	添加
									</button>
									<input type="hidden" id="optResult" value="${optResult}"/>
									<input id="addSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;添加成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
				                    </input>
				                    <input id="failMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;操作失败，请重试或联系管理人员！&quot;,&quot;layout&quot;:&quot;center&quot;,&quot;type&quot;:&quot;error&quot;}">
				                    </input>
				                    <input id="editSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;修改保存成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
				                    </input>
				                    <input id="delSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;删除成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
				                    </input>
								</div>
								
								<table
									class="table table-striped table-bordered bootstrap-datatable datatable responsive">
									<thead>
									<tr>
										<th>供货商名称</th>
										<th>地址</th>
										<th>营业执照编码</th>
										<th>主营业务介绍</th>	
										<th>状态</th>	
										<th>创建时间</th>	
										<th>操作</th>	
									</tr>
									</thead>
									<tbody>
									<c:forEach items="${infos}" var="info"  varStatus="status">
									<tr>
										<td class="center">${info.supplierName}</td>
										<td class="center">${info.address}</td>
										<td class="center">${info.businessPermit}</td>
										<td class="center">${info.businessIntroduce}</td>
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
										<td class="center"><input type="hidden" name="supplierid"
													value="${info.supplierId}"><a class="btn btn-info" href="#" onclick="editInfo(${info.supplierId});">
														<i class="glyphicon glyphicon-edit icon-white"></i> 编辑
												</a> <a class="btn btn-danger btn-setting" href="#"  onclick="deleteInfo(${info.supplierId});"> <i
														class="glyphicon glyphicon-trash icon-white"></i> 删除
												</a></td>
									</tr>
									</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!-- content ends -->
			</div>
		</div>
		<div class="modal fade" id="deleteDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>删除供应商</h3>
					</div>
					<div class="modal-body">
						<p>是否删除</p>
					</div>
					<div class="modal-footer">
						<a href="#" class="btn btn-primary" data-dismiss="modal">确定</a>
						<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
					</div>
				</div>
			</div>
		</div>
		
		<div class="modal fade" id="info-edit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div style="width:980px" class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>编辑供应商信息</h3>
					</div>
					<div id="editInfo">
					</div>
				</div>
			</div>
		</div>
		
		<!-- 添加供应商 -->
		<div class="modal fade" id="info-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div style="width:980px" class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>添加供应商信息</h3>
					</div>
					<%@include file="/WEB-INF/jsp/supplier/supplieradd.jsp"%>
				</div>
			</div>
		</div>
		
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<!-- application script for Charisma demo 
	<!--<script src="${ctx}/resources/js/frontServers.js"></script> -->
	</script>
	<!-- The styles -->
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
	div.save_success
	{
	    background-color: #fbf0db;
	    border: 1px solid #ff9000;
	    color: #af6606;
	    background-image: url(${ctx}/images/ok.png);
	    background-repeat: no-repeat;
	    background-position:10px center;
	    display:none;
	    padding-left:40px
	}
	.required
	{
		float:left;
		color:Red;
	}
	</style>
</body>
</html>
