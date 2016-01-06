<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ai" uri="/WEB-INF/tag/ai-tags.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@ include file="/jsp/common/common_js.jsp"%>
<title>Insert title here</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<script type="text/javascript">
	var addManager;
	var api = frameElement.api, W = api.opener;
	$(document).ready(function() {
		addManager = new $.AddManager();
	});
	(function(){
		$.AddManager = function(){
			this.settings = $.extend(true,{},$.AddManager.defaults);
			this.init();
		};
		$.extend($.AddManager,{
			defaults:{
				FORM_ID : "#myForm"
			},
			prototype:{
				init:function(){
					var _this = this;
					_this.addValidRules();
				},
				add:function(){
					var _this = this;
					var url = "${_base}/demo/add";
					var param = $(_this.settings.FORM_ID).serialize();
					if ($(_this.settings.FORM_ID).valid()) {
						$.ajax({
							async : false,
							type : "POST",
							url : url,
							modal : true,
							showBusi : false,
							data : param,
							success : function(data) {
								var $json = $.parseJSON(data);
								 if ($json.RES_RESULT == "SUCCESS") {
									$.dialog.alert($json.RES_MSG, function() {
										W.location.reload();
									});
								} else {
									$.dialog.alert($json.RES_MSG, function() {
										W.location.reload();
									});
								} 
							}
						});
					}
					return false;
				},
				addValidRules:function(){
					var _this = this;
					$(_this.settings.FORM_ID).validate({
						onfocusout : function(element) {
							$(element).valid();
						},
						rules : {
							name : {
								required : true
								,remote:{
									url:'${_base}/demo/ename'
									,data:{
										name:function(){
											return $("#name").val();
										}
									}
								}
							},
							code : {
								required : true
							},
							city : {
								required : true
							},
							email : {
								required : true,
								email : true
							}
						},
						messages : {
							name : {
								required : "请输入名称"
								,remote:"重复"
							},
							code : {
								required : "请输入编码"
							},
							city : {
								required : "请输入城市"
							},
							email : {
								required : "请输入邮箱",
								email : "不符合邮箱格式"
							}
						}
					});
				}
			}
		});
	})(jQuery);
	function testToken(){
		var param ={
	   			groupId: $("#name").val(),
	   			_FORM_TOKEN:$("#toen").val()
		     };
		var url="${_base}/group/wHomeSharedMember/getGroupUsers";
		$.ajax({
			async : false,
			type : "POST",
			url : url,
			modal : true,
			showBusi : false,
			data : param,
			success: function (data) {
				var dateJson = eval("("+data+")");
				if(dateJson.RES_RESULT == 'REPEATFAILED'){
					alert(dateJson.RES_MSG);
				}
			}
		});
	}
</script>
</head>
<body>
	<div>
		<form id="myForm" action="${_base}/group/wHomeSharedMember/getGroupUsers" method="post" class="cmxform">
			<ai:formToken id="toen"/>
			<div>
				<span>名称</span> <span><input type="text" id="name" name="name" /></span>
			</div>
			<div>
				<span>编码</span> <span><input type="text" id="code" name="code" /></span>
			</div>
			<div>
				<span>地市</span> <span><input type="text" id="city" name="city" /></span>
			</div>
			<div>
				<span>邮箱</span> <span><input type="text" id="email" name="email" /></span>
			</div>
		</form>
		<a href="javascript:void(0)" onclick="testToken()">提交</a>
	</div>
</body>
</html>