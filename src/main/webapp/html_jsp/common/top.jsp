<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<c:set var="ctxs" value="${pageContext.request.contextPath}/" />
<div class="head_logo width1004">
	<div class="logo"><img src="${ctx}/images/logo.png"></div>
	<div class="functional_key"><a href="${ctx}/login.jsp">登 录</a>|<a href="#">加入收藏</a>|<a href="#">设为首页</a></div>
	<div class="clear"></div>
</div>
<div class="menu_box" >
	<div class="menu2 width1004">
		<c:choose> 
			<c:when test="${fn:endsWith(pageContext.request.requestURL, ctxs)}">
				<a href="${ctx}" class="selection">首页</a>
			</c:when>
			<c:otherwise>
				<a href="${ctx}">首页</a>
			</c:otherwise>
		</c:choose>
		<c:choose> 
			<c:when test="${fn:endsWith(pageContext.request.requestURL, 'about.jsp')}">
				<a href="${ctx}/html_jsp/about.jsp" class="selection">公司简介</a>
			</c:when>
			<c:otherwise>
				<a href="${ctx}/html_jsp/about.jsp">公司简介</a>
			</c:otherwise>
		</c:choose>
		<c:choose> 
			<c:when test="${fn:endsWith(pageContext.request.requestURL, 'case.jsp') || fn:endsWith(pageContext.request.requestURL, 'case_info.jsp')}">
				<a href="${ctx}/html_jsp/case.jsp" class="selection">成功案例</a>
			</c:when>
			<c:otherwise>
				<a href="${ctx}/html_jsp/case.jsp">成功案例</a>
			</c:otherwise>
		</c:choose>
		<c:choose> 
			<c:when test="${fn:endsWith(pageContext.request.requestURL, 'advertise.jsp') 
							|| fn:endsWith(pageContext.request.requestURL, 'advertise_info1.jsp')
							|| fn:endsWith(pageContext.request.requestURL, 'advertise_info2.jsp')
							|| fn:endsWith(pageContext.request.requestURL, 'advertise_info3.jsp')
							|| fn:endsWith(pageContext.request.requestURL, 'advertise_info4.jsp')
							|| fn:endsWith(pageContext.request.requestURL, 'advertise_info5.jsp')}">
				<a href="${ctx}/html_jsp/advertise.jsp" class="selection">人才招聘</a>
			</c:when>
			<c:otherwise>
				<a href="${ctx}/html_jsp/advertise.jsp">人才招聘</a>
			</c:otherwise>
		</c:choose>
		<c:choose> 
			<c:when test="${fn:endsWith(pageContext.request.requestURL, 'centent.jsp')}">
				<a href="${ctx}/html_jsp/centent.jsp" class="selection">联系我们</a>
			</c:when>
			<c:otherwise>
				<a href="${ctx}/html_jsp/centent.jsp">联系我们</a>
			</c:otherwise>
		</c:choose>
		
		
		
		
	</div>
</div>

