<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Handsome Eric</title>
		<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Handsome Eric">
    <meta name="author" content="jianhua.ma">
		<%@include file="/jsp/common/common_css.jsp"%>
    <!-- The styles -->
    <style>
    	
    </style>
  </head>
  <body>
	<%@include file="/jsp/common/header.jsp"%>
	<div class="ch-container">
   		<div class="row">
	    		<%@include file="/jsp/common/sidebar.jsp"%>
	
	        <div id="content" class="col-lg-10 col-sm-10">
			        <!-- content starts -->
					    <div class="row">
						    <div class="box col-md-12">
							    <div class="box-inner">
								    <div class="box-header well" data-original-title="">
								        <h2>欢迎您，${user.userName}</h2>
								        <div class="refreshPlayerList" style="height:30px;"></div>
								    </div>
						    	</div>
					    	</div>
				    	</div><!--/row-->
		    			<!-- content ends -->
   				</div>
			</div> 
	<%@include file="/jsp/common/footer.jsp"%>
	</div><!--/.fluid-container-->
	<%@include file="/jsp/common/common_js.jsp"%>
	<!-- application script for Charisma demo 
	<!--<script src="${ctx}/resources/js/frontServers.js"></script> -->
	<script type="text/javascript">
		$(document).ready(function () {
			
		});
	</script>
  </body>
</html>
