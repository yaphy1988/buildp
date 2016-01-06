<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<script src="${ctx}/resources/js/manager/authmanage.js"></script>

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
									查看系统角色，为不同的角色分配菜单权限。
								</div>
								<div class="well">
									<form class="form-inline" role="form">
										<div id="myRegion" data-regioncode="350301" style="display:inline">
										</div >
										<div style="display:inline;"><button class="btn btn-primary">查询</button><a onclick="showRegion()">test</a></div>
									</form>
								</div>
								<div id="data-render" style="text-align:center">
									正在加载数据...
									<br/>
									<img src="${ctx}/images/ajax-loader-5.gif" title="img/ajax-loaders/ajax-loader-5.gif">
								</div>
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
