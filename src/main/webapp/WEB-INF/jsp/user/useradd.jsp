<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>用户添加</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="auth manage">
<meta name="author" content="yaphy">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/js/manager/authmanage.js"></script>
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
									添加用户信息
								</div>
								<form action="addUser" method="post">
									<table>
										<tr>
											<td>用户名：</td>
											<td>
												<input style="width:250px" type="text" class="form-control" id="inputSuccess1" name="userCode">
											</td>
										</tr>
										<tr>
											<td>称&nbsp;&nbsp;&nbsp;呼：</td>
											<td>
												<input style="width:250px" type="text" class="form-control" id="inputSuccess1" name="userName">
											</td>
										</tr>
										<tr>
											<td>角&nbsp;&nbsp;&nbsp;色：</td>
											<td>
												<%@include file="/WEB-INF/jsp/component/role_comp.jsp"%>
											</td>
										</tr>
										<tr>
											<td>密&nbsp;&nbsp;&nbsp;码：</td>
											<td>
												<input style="width:250px" type="password" class="form-control" id="inputSuccess1" name="passWord">
											</td>
										</tr>
										<input type="hidden" name="createUser" value="${user.userId }"/>
										<tr>
											<td>
												<button type="submit" class="btn btn-default">添加</button>
											</td>
											<td>
												<button type="reset" class="btn btn-default">重置</button>
											</td>
										</tr>
									</table>
								</form>
							</div>
						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!-- content ends -->
			</div>
		</div>
		
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
</body>
</html>
