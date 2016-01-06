<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<style>
        * {
            margin: 0;
            padding: 0;
        }

        body {
            font-family: arial, helvetica, sans-serif;
            background-color: #212121;
            color: white;
            font-size: 28px;
            padding-bottom: 20px;
        }

        .error-code {
            font-family: 'Creepster', cursive, arial, helvetica, sans-serif;
            font-size: 200px;
            color: white;
            color: rgba(255, 255, 255, 0.98);
            width: 50%;
            text-align: right;
            margin-top: 5%;
            text-shadow: 5px 5px hsl(0, 0%, 25%);
            float: left;
        }

        .not-found {
            font-family: 'Audiowide', cursive, arial, helvetica, sans-serif;
            width: 45%;
            float: right;
            margin-top: 5%;
            font-size: 50px;
            color: white;
            text-shadow: 2px 2px 5px hsl(0, 0%, 61%);
            padding-top: 70px;
        }

        .clear {
            float: none;
            clear: both;
        }

        .content {
            text-align: center;
            line-height: 30px;
        }

        input[type=text] {
            border: hsl(247, 89%, 72%) solid 1px;
            outline: none;
            padding: 5px 3px;
            font-size: 16px;
            border-radius: 8px;
        }

        a {
            text-decoration: none;
            color: #9ECDFF;
            text-shadow: 0px 0px 2px white;
        }

        a:hover {
            color: white;
        }

    </style>
<title>页面不存在</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="error">
<meta name="author" content="yaphy">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
  
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
				
				<p class="error-code">
				    404
				</p>
				
				<p class="not-found">Not<br/>Found</p>
				
				<div class="clear"></div>
				<div class="content">
				    The page your are looking for is not found.
				    <br>
				    <a href="${ctx}/html_jsp/index.jsp">Go Home</a>
				    <br>
				
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
