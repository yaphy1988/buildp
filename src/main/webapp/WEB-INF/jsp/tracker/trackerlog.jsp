<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>日志监控--查看</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="stockinfo manage">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/tracker/js/jquery.wordWrap.js"></script>
<link href="${ctx}/resources/tracker/css/tracker.css" rel='stylesheet'>

<script type="text/javascript">
$(document).ready(function() {
	flag = true;
	$('#wrapCheckbtn').click(function(){
		var textarea = $('#logText').get();
		if (flag) {
			$(textarea).wordWrap('on');
			flag = false;
		} else {
			$(textarea).wordWrap('off');
			flag = true;
		}
	});
});
</script>
<script>
	$(document).ready(
		function() {
			$('#wrapCheck').click(function() {
				
			});
			var refresh = function() {
				$('#loading-mask').text('Loading...');
				$('#loading-mask').removeClass('error');
				$('#loading-mask').show();
				var data = {
					appender : $('#appender').val()
				};
				if ($('#lines').val() != '') {
					data.lines = $('#lines').val();
				}
				$.ajax({
					url : '/build_project/tracker/taillog',
					data : data,
					dataType : 'text',
					cache : false,
					success : function(data) {
						if (data.indexOf('TrackerError') == -1) {
							$('#loading-mask').hide();
							$('#logText').val(data);
							$('#logText').get(0).scrollTop = $('#logText').get(
									0).scrollHeight;
						} else {
							$('#loading-mask').addClass('error');
							$('#loading-mask').text(
									'Error: Check the log manually');
						}
					}
				});
			};
			$('#refresh').click(refresh);
			$('#lines').bind('keypress', function(e) {
				if (e.keyCode == 13) {
					refresh();
					return false;
				}
			});
			$('#download').click(function() {
			});
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
								<div class="alert alert-info" style="margin-bottom:6px;">
									日志信息查看。 
								</div>
								<form action="/build_project/tracker/getlog">
								<table style="font-size:16px;">
									<tr>
										<td>是否换行：</td>
										<td width="54px" id="wrapCheckbtn"><input data-no-uniform="true" type="checkbox" class="iphone-toggle"></td>
										<td>输出文件端: </td>
										<td> 
											<select id="appender" name="appender" class='selectpicker'>
													<c:forEach items="${appenders}" var="appender">
														<option value="${appender.name}">${appender.name}</option>
													</c:forEach>
											</select>
										</td>
										<td>行数：</td>
										<td><input type="number" id="lines" name="lines" value="200" size="4" style="margin-right: 5px;" class="form-control">
										</td>
										<td><button type="button" id="refresh" class="btn btn-primary btn-sm">刷新</button></td>
										<td><button type="submit" id="download" class="btn btn-info btn-sm">下载</button></td>
										<td width="100px"><div style="overflow: hidden;font-size: 6px;">
												<div id="loading-mask" style="display: none;"></div>
											</div>
										</td>
									</tr>
								
								</table>
								</form>
								<textarea id="logText" rows="20"  wrap="off">${tail}</textarea>
								<!-- <div id="wrap">
									<div id="options">
										<div style="float: left;">
											<input type="checkbox" id="wrapCheck">&nbsp;<label for="wrapCheck">是否换行</label>
										</div>
										<form action="/build_project/tracker/getlog">
											<div style="float: right;">
												<label  for="appender">输出文件端: </label>
												<select id="appender" name="appender">
													<option value="com.ai">com.ai</option>
												</select>
													<label for="lines">行数:</label>
													<input type="number" id="lines" name="lines" value="200"
													size="4" style="margin-right: 5px;">
												<button type="button" id="refresh">刷新</button>
												<button type="submit" id="download">下载</button>
											</div>
										</form>
										<div style="overflow: hidden;">
											<div id="loading-mask" style="display: none;"></div>
										</div>
									</div>
									<textarea id="logText" rows="20" spellcheck="false"></textarea>
								</div> -->
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
