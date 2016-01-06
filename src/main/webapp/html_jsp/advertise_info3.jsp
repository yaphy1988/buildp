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
					<dd>装饰预结算员</dd>
				</dl>
				<dl>
					<dt>招聘人数：</dt>
					<dd><red>2</red>名</dd>
				</dl>
				<dl>
					<dt>岗位职责：</dt>
					<dd>1、精通工程造价及成本管理，具有一定现场施工经验、熟悉各种装饰材料的市场价格；<br />
						2、有现场预算跟踪经验，熟悉装饰工程施工工艺流程；<br />
						3、参与工程施工、成本控制；<br />
						4、熟悉掌握各种预算计量软件；<br />
					</dd>
				</dl>
				<dl>
					<dt>岗位要求：</dt>
					<dd>1、熟悉室内装饰装修行业的预结算，有过装饰装修行业预结算员的工作经验者优先考虑；<br />
						2、具备工程预、决算和工程管理的专业知识；<br />
						3、具有较强的团队意识和团队精神，具备良好的职业素养；<br />
						4、责任心强，有敬业精神，能吃苦。<br />
					</dd>
				</dl>

			</div>
		<div class="clear"></div>
		</div>
	</div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
