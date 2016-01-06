<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="/html_jsp/common/head.jsp"%>
</head>

<body>
<%@include file="/html_jsp/common/top.jsp"%>

<div class="index_banner width1004">
	<img src="${ctx }/images/index_banner.png">
</div>

<div class="index_center width1004">

	<div class="index_about_box">
		<div class="a_b_title"><a href="${ctx}/html_jsp/about.jsp">更多＋</a><span><img src="${ctx }/images/about.png"></span></div>
		<div class="a_b_center">
			<i><img src="${ctx }/images/index_about.png"></i>
			<span class="about_c_left">
			<p><b class="index_about_red">上海森易建筑装饰工程有限公司</b>成立于二00五年， 是一家集土建、装饰装修、机电安装工程为一体的大型综合性装饰装修企业，主要从事大型卖场、办公、商业等场所的装修施工和管理。公司近年不断改革完善，立求发展，先后成为家乐福、乐购等大型卖场的合格工程总承包。</br></p>
<p>公司非常注重自身实践能力的累积和市场敏...</p></span>
		</div>
	</div>

	<div class="index_successful_box">
		<div class="a_b_title"><a href="${ctx}/html_jsp/case.jsp">更多＋</a><span><img src="${ctx }/images/case.png"></span></div>
		<div class="s_b_center">
			<img src="${ctx }/images/index_successful.png">
		</div>
	</div>

	<div class="index_commodity_box">
		<div class="a_b_title"><a href="${ctx}/html_jsp/advertise.jsp">更多＋</a><span><img src="${ctx}/images/talented_short.png"></span></div>
		<div class="a_c_center">
			<dl>
				<dt>
					<div class="a_c_c">
						<center>由于公司业务发展，现招聘家装项目经理，安装预结算员，装饰预结算员，采购员，仓库管理员。</center>
					</div>
					<div class="clear"></div>
				</dt>
				<dd><time>2015.9.7</time><a href="#" title="施工员..">项目经理..</a></dd>
				<dd><time>2015.9.7</time><a href="#" title="家装项目经理..">安装预结算员..</a></dd>
			</dl>
		</div>
	</div>

	<div class="clear"></div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
