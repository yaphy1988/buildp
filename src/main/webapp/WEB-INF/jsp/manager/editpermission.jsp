<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>管理平台</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="auth manage">
<meta name="author" content="yaphy">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/js/manager/editpermission.js"></script>
<script>
$(document).ready(function(){
  
});
</script>
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
								<div class="alert alert-info">编辑角色拥有的菜单权限</div>
								<table class="table table-bordered table-striped responsive">
									<thead>
										<tr>
											<th align="center"><input type="checkbox" id="checkAll"><label for="checkAll">选择</label></input></th>
											<th>菜单编码</th>
											<th>菜单名称</th>
											<th>菜单说明</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${menuInfos}" var="menu" varStatus="status">
											<tr>
												<td align="center"><div>
													<c:if test="${menu.right==1}">
													<input type="checkbox" name="myCheckBox" value="${menu.menuId}" checked>
													</c:if>
													<c:if test="${menu.right==0}">
													<input type="checkbox" name="myCheckBox" value="${menu.menuId}">
													</c:if><label>&nbsp&nbsp&nbsp&nbsp</label>
													</div></td>
												<td>${menu.menuId}</td>
												<td>${menu.menuName}</td>
												<td>${menu.remark}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<div class="box-content  buttons">
					                <p>
					                    <button class="btn btn-primary" id="btn-save-permission" onclick="savePermission(${roleId})">保存</button>
					                    <button class="btn btn-danger" id="btn-cancel-permission" onclick="history.go(-1)">取消</button>
					                </p>
				                </div>
							</div>
						</div>
					</div>
					<!--/span-->
				</div>
				<!--/row-->

				<div class="modal fade" id="showMsg" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">×</button>
								<h3>这里是消息标题</h3>
							</div>
							<div class="modal-body">
								<p>消息体内容</p>
							</div>
							<div class="modal-footer">
								<a href="#" class="btn btn-default" data-dismiss="modal">确认</a>
							</div>
						</div>
					</div>
				</div>
				<!-- content ends -->
			</div>
		</div>
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
</body>
</html>