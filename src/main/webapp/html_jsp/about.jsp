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
	<div class="all_title"><img src="${ctx}/images/about.png"></div>
	<div class="about_center">
		<div class="cener_logo"><img src="${ctx}/images/logo.png"></div>
		<span class="about_c_left">
		<p><red>上海森易建筑装饰工程有限公司</red>成立于二00五年， 是一家集土建、装饰装修、机电安装工程为一体的大型综合性装饰装修企业，主要从事大型卖场、办公、商业等场所的装修施工和管理。公司近年不断改革完善，立求发展，先后成为家乐福、乐购等大型卖场的合格工程总承包。</br></p>
<p>公司非常注重自身实践能力的累积和市场敏感度的提高，注重从现场勘查、预算报价、材料采购、规范施工的一整套无缝衔接的管理体系。</br></p>
<p>公司拥有一支理念创新和技术精湛的骨干队伍，现拥有管理人员50名，其中中高级技术职称人员28名，8个项目组，固定在册施工人员两百多名。</br></p>
<p>公司设有行政管理部、财务部、工程部、预算部、技术部、采供部、质检部和售后服务部。各部分工明确，责任到人。</br></p>
<p>公司一直秉承“以质量求生存，以信誉求发展”的经营理念，始终坚持以“吃苦耐劳、创新拼搏、务实诚信、卓越自我”的企业精神。业主的要求就是我们的追求，满足业主的需求作为我们追求的至高目标，将以科学的管理、精湛的工艺、全新的服务，努力成为装饰行业的领航者。</p>
		</span>
		<div class="about_img"><img src="${ctx}/images/about_map1.png"></div>
		<div class="about_line"><img src="${ctx}/images/about_line.png"></div>
		<h2>我们的团队</h2>
		<span>We love building and rebuilding brands.<br />
			Using colour, fonts and illustration, we brand companies in a way you’ll never forget.</span>
		<div class="row tuandui">
			<div class="col-md-4"><img src="${ctx}/images/shanghai.jpg"><p>上海团队</p></div>
			<div class="col-md-4"><img src="${ctx}/images/wuhan.png"><p>武汉团队</p></div>
		</div>
	</div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
