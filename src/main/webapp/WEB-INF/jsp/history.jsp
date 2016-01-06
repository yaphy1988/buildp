<%--@elvariable id="hostid" type="String"--%><%--@elvariable id="serviceid" type="String"--%>
<%--@elvariable id="title" type="String"--%><%--@elvariable id="period" type="String"--%>
<%--@elvariable id="subtitle" type="String"--%><%--@elvariable id="names" type="java.util.List"--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">

    <!-- Always force latest IE rendering engine or request Chrome Frame -->
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">

    <!-- Use title if it's in the page YAML frontmatter -->
    <title>历史状态信息</title>
    <link href="${ctx}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript">
        var serviceid = "${serviceid}";
        var period = "${period}";
        var ctx = "${ctx}/";
        var hostid = ${hostid};
    </script>
</head>

<body>

<div id="wrap">
    <p></p>
    <div>
        <div id="periodgroup" class="pull-right">
            <button id="period_3h" type="button" class="btn btn-xs">小时</button>
            <button id="period_36h" type="button" class="btn btn-xs">天</button>
            <button id="period_8d" type="button" class="btn btn-xs">周</button>
            <button id="period_40d" type="button" class="btn btn-xs">月</button>
        </div>
        <div id="navgroup">
            <c:forEach items="${names}" var="name">
                <button id="nav_${name.hostid}_${name.serviceid}" class="btn btn-xs">${name.name}</button>
            </c:forEach>
        </div>
        <div id="chart-container"></div>
    </div>
    <p></p>
    <!--<div class="container">
        <div class="row">
            <div class="col-sm-10">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <%--<span class="label label-success"></span><span></span>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>-->
</div>

<script type="text/javascript" src="${ctx}/resources/bower_components/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/highcharts.js"></script>
<script type="text/javascript" src="${ctx}/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/history.js"></script>

</body>
</html>