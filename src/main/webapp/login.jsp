<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width; initial-scale=0.8;  user-scalable=0;" />
	<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
    <link href="resources/css/css.css" rel="stylesheet" type="text/css">
    
  </head>
  
  
  
  <body class="da_bj">
  

  <div class="login_main"></div>
  <div class="login_main_A">
   <ul>
  <li class="biaot_t">上海森易系统登录</li>
   <div class="form-horizontal" >
                <fieldset>
                    <div class="input-group input-group-lg" style="margin-top: 22px">
                        <span class="input-group-addon" style="border: 0px solid #ccc; border-radius: 0px;"><i class="glyphicon glyphicon-user red"></i></span>
                        <input type="text" class="form-control" placeholder="用户名" id="userCode" style="border: 1px solid #ccc; border-radius: 0px;">
                        <span id="name" style="display: none"></span>
                    </div>
                    <br>
                    <div class="input-group input-group-lg" style="margin-top: 8px">
                        <span class="input-group-addon" style="border: 0px solid #ccc; border-radius: 0px;"><i class="glyphicon glyphicon-lock red"></i></span>
                        <input type="password" class="form-control" placeholder="密码" id="passWord" style="border: 1px solid #ccc; border-radius: 0px;" >
                        <span id="pass" style="display: none"></span>
                    </div>
                   <br>
                    <div class="input-group input-group-lg" style="margin-top: 8px">
                        <span class="input-group-addon" style="border: 0px solid #ccc; border-radius: 0px;"><i class="glyphicon glyphicon-eye-open red"></i></span>
                        <input type="text" class="form-control" placeholder="验证码" style="width: 120px;border: 1px solid #ccc; border-radius: 0px;" id="code">
                        <span id="veriCode" style="display: none"></span>
                       <a id="imgCode" style="cursor: hand; float:right;"><img id="imgCodeShow" src="${ctx}/verifyCode"/ style="height:33px; width:90px;"></a> 
                    </div>
                  <br>
                    <p class="center col-md-5" style="width: 100%;margin-top: 10px; padding-left:0px; padding-right:0px; "  >
                        <button class="btn_login btn btn-primary" id="submit">登&nbsp;&nbsp;&nbsp;录</button>
                    </p>
                </fieldset>
            </div>
  </ul>
  </div>
  <script src="resources/js/md5-min.js"></script>
  <script src="resources/js/login.js"></script>
</body>
</html>
