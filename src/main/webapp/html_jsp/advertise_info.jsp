<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="/html_jsp/common/head.jsp"%>
</head>


<body>
<%@include file="/html_jsp/common/top.jsp"%>

<div class="index_banner width1004">
	<img src="${ctx}/images/banner1.jpg">
</div>

<div class="index_center width1004">
	<div class="all_title"><img src="${ctx}/images/talented.png"></div>
	<div class="case_center">
		<div class="asks_buy_info_center">
			<div class="asks_buy_info_text advertise_add">
				<dl>
					<dt>招聘岗位：</dt>
					<dd>熟练操作工</dd>
				</dl>
				<dl>
					<dt>招聘人数：</dt>
					<dd><red>15</red>名</dd>
				</dl>
				<dl>
					<dt>要求：</dt>
					<dd>其他信息要求类型，由用户自己定义。他信息要求类型，由用户自己定义。他信息要求类型，由用户自己定义。他信息要求类型，由用户自己定义。他信息要求类型，由用户自己定义。他信息要求类型，由用户自己定义。他信息要求类型，由用户自己定义。</dd>
				</dl>

			</div>
		<div class="clear"></div>
		</div>
	</div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
