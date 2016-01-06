<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<%@ include file="/jsp/common/common_js.jsp"%>
	<title>Nested Layout - jQuery EasyUI Demo</title>
	<link href="<%=bp %>/easyui/themes/default/easyui.css" rel="stylesheet" type="text/css" />
	<link href="<%=bp %>/easyui/themes/default/icon.css" rel="stylesheet" type="text/css" />
</head>
<body class="easyui-layout" style="width:100%;height:100%;">
		<div data-options="region:'north'" style="height:80px">
			<img alt="" src="../images/top.png">
		</div>
		<div data-options="region:'south',split:true" style="height:50px;"></div>
		<div data-options="region:'east',split:true" title="East" style="width:180px;"></div>
		<div data-options="region:'west',split:true" title="West" style="width:100px;"></div>
		<div data-options="region:'center',iconCls:'icon-ok'" title="Center">
			<div class="easyui-layout" data-options="fit:true">

			</div>
		</div>

</body>
</html>