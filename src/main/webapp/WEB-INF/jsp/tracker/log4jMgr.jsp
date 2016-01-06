<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>日志监控--设置</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="stockinfo manage">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/tracker/js/jquery.wordWrap.js"></script>
<link href="${ctx}/resources/tracker/css/tracker.css" rel='stylesheet'>
<script type="text/javascript">

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
								<div class="alert alert-info">
									日志运行时级别设置，系统重启后会失效。 
								</div>
								<div id="wrap">
										<div id="loggersContainer">
											<table id="loggers" cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered bootstrap-datatable datatable responsive">
												<thead>
													<tr>
														<th>Logger</th>
														<th>Level</th>
													</tr>
												</thead>
												<tbody>
												<c:forEach items="${loggers}" var="logger"  varStatus="status">
													<tr class="logger-odd">
														<td class="logger-name">
														<label for="${logger.name}">${logger.name}</label></td>
														<td class="logger-level">
															<form action="/build_project/trackers/setConf" method="post" onchange="$(this).submit();">
																<select id="${logger.name}" name="${logger.name}">
																	<c:choose>
																		<c:when test="${logger.level=='TRACE' }">
																			<option value="TRACE" selected="selected">TRACE</option>
																			<option value="DEBUG">DEBUG</option>
																			<option value="INFO">INFO</option>
																			<option value="WARN">WARN</option>
																			<option value="ERROR">ERROR</option>
																			<option value="FATAL">FATAL</option>
																			<option value="OFF">OFF</option>
																		</c:when>
																		<c:when test="${logger.level=='DEBUG' }">
																			<option value="TRACE">TRACE</option>
																			<option value="DEBUG" selected="selected">DEBUG</option>
																			<option value="INFO">INFO</option>
																			<option value="WARN">WARN</option>
																			<option value="ERROR">ERROR</option>
																			<option value="FATAL">FATAL</option>
																			<option value="OFF">OFF</option>
																		</c:when>
																		<c:when test="${logger.level=='INFO' }">
																			<option value="TRACE">TRACE</option>
																			<option value="DEBUG">DEBUG</option>
																			<option value="INFO"  selected="selected">INFO</option>
																			<option value="WARN">WARN</option>
																			<option value="ERROR">ERROR</option>
																			<option value="FATAL">FATAL</option>
																			<option value="OFF">OFF</option>
																		</c:when>
																		<c:when test="${logger.level=='WARN' }">
																			<option value="TRACE">TRACE</option>
																			<option value="DEBUG">DEBUG</option>
																			<option value="INFO">INFO</option>
																			<option value="WARN"  selected="selected">WARN</option>
																			<option value="ERROR">ERROR</option>
																			<option value="FATAL">FATAL</option>
																			<option value="OFF">OFF</option>
																		</c:when>
																		<c:when test="${logger.level=='ERROR' }">
																			<option value="TRACE">TRACE</option>
																			<option value="DEBUG">DEBUG</option>
																			<option value="INFO">INFO</option>
																			<option value="WARN">WARN</option>
																			<option value="ERROR"  selected="selected">ERROR</option>
																			<option value="FATAL">FATAL</option>
																			<option value="OFF">OFF</option>
																		</c:when>
																		<c:when test="${logger.level=='FATAL' }">
																			<option value="TRACE">TRACE</option>
																			<option value="DEBUG">DEBUG</option>
																			<option value="INFO">INFO</option>
																			<option value="WARN">WARN</option>
																			<option value="ERROR">ERROR</option>
																			<option value="FATAL"  selected="selected">FATAL</option>
																			<option value="OFF">OFF</option>
																		</c:when>
																		<c:when test="${logger.level=='OFF' }">
																			<option value="TRACE">TRACE</option>
																			<option value="DEBUG">DEBUG</option>
																			<option value="INFO">INFO</option>
																			<option value="WARN">WARN</option>
																			<option value="ERROR">ERROR</option>
																			<option value="FATAL">FATAL</option>
																			<option value="OFF"  selected="selected">OFF</option>
																		</c:when>
																	</c:choose>
																</select>
															</form>
														</td>
													</tr>
												</c:forEach>
												</tbody>
											</table>
										</div>
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
