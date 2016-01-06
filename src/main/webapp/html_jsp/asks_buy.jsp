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
	<div class="all_title"><img src="${ctx}/images/commodity.png"></div>
	<div class="case_center">
		<div class="case_list">
			<div class="case_list_img"><img src="${ctx}/images/index_commodity.png"></div>
			<div class="case_list_txt">
				<h2><a href="asks_buy_info.jsp">笔记本电脑</a><span class="asks_nember">数量：<red>3743</red> 台</span></h2>
				<span>家乐福（Carrefour）成立于1959年，是大卖场业态的首创者，是欧洲第一大零售商，
世界第二大国际化零售连锁集团。现拥有11,000多家营运零售单位，业务范围遍及世界30个
国家和地区。...
</span>			
			</div>
			<div class="clear"></div>
		</div>
		<div class="case_list">
			<div class="case_list_img"><img src="${ctx}/images/index_successful.png"></div>
			<div class="case_list_txt">
				<h2><a href="asks_buy_info.jsp">笔记本电脑</a><span class="asks_nember">数量：<red>3743</red> 台</span></h2>
				<span>	家乐福（Carrefour）成立于1959年，是大卖场业态的首创者，是欧洲第一大零售商，
世界第二大国际化零售连锁集团。现拥有11,000多家营运零售单位，业务范围遍及世界30个
国家和地区。...
</span>			
			</div>
			<div class="clear"></div>
		</div>
		<div class="case_list">
			<div class="case_list_img"><img src="${ctx}/images/index_successful.png"></div>
			<div class="case_list_txt">
				<h2><a href="asks_buy_info.jsp">笔记本电脑</a><span class="asks_nember">数量：<red>3743</red> 台</span></h2>
				<span>	家乐福（Carrefour）成立于1959年，是大卖场业态的首创者，是欧洲第一大零售商，
世界第二大国际化零售连锁集团。现拥有11,000多家营运零售单位，业务范围遍及世界30个
国家和地区。...
</span>			
			</div>
			<div class="clear"></div>
		</div>
		<div class="pages">
				<a href="#" class="selection">1</a>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>
		</div>
		<div class="clear"></div>
	</div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
