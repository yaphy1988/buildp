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
	<div class="all_title"><img src="${ctx}/images/contacts.png"></div>
	<div class="about_center">
		<div class="cener_logo"><img src="${ctx}/images/logo.png"></div>
		<div class="center_c_box">
			<div class="center_c_t">
			上海市杨浦区政益路28号304室<br>
			电话：021-55120735<br>
			传真：021-55120736<br>
			邮箱：sh_senyi@163.com<br>
			</div>

			<div class="center_c_img">
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=Q4YyRHgQPshkyXfVEjREcsq2"></script>
<div style="width:500px;height:500px;margin:0 auto" id="allmap"></div>
<script type="text/javascript">
    var map = new BMap.Map("allmap");    
    var point = new BMap.Point(121.525369,31.309006);  // 需要标注的位置的经纬度  
    map.centerAndZoom(point, 15);  // 中心位置和缩放倍数
    map.enableScrollWheelZoom();   // 添加滚动轴
    map.addControl(new BMap.NavigationControl());   // 添加左上角的标尺工具
    map.addControl(new BMap.NavigationControl());    
    map.addControl(new BMap.ScaleControl());    
    map.addControl(new BMap.OverviewMapControl());    
    map.addControl(new BMap.MapTypeControl());    
    map.setCurrentCity("上海"); 
    
    var opts = {    
         width : 200,     // 信息窗口宽度    
        height: 20,     // 信息窗口高度    
         title : "上海市杨浦区政益路28号"  // 信息窗口标题   
    }    
    var infoWindow = new BMap.InfoWindow("上海森易建筑装饰有限公司", opts);  // 创建信息窗口对象    
    map.openInfoWindow(infoWindow, map.getCenter());      // 打开信息窗口 
    var marker = new BMap.Marker(point);        // 创建标注,即地图上的小红点    
    map.addOverlay(marker);                             
</script>
			</div>
			
		</div>		
	</div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
