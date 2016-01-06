var indexController;
$(document).ready(function() {
	indexController = new $.IndexController();
	$(document).keydown(function(e) {
		if (!e)
			var e = window.event;
		if (e.keyCode == 13) {
			indexController.commit();
		}
	});

	$('#userCode').focus();
});
/*
 * f=function(){ $("#userCode").focus(); };
 */
/* 定义页面管理类 */
(function() {
	$.IndexController = function() {
		this.settings = $.extend(true, {}, $.IndexController.defaults);
		this.init();

	};
	$.extend($.IndexController, {
		defaults : {
			SUBMIT_ID : "#submit",
			USERNAME_ID : "#userCode",
			PASSWORD_ID : "#passWord",
			TIP_ID : "#tip"
		},
		prototype : {
			init : function() {
				var _this = this;
				_this.bindEvents();
			},
			bindEvents : function() {
				var _this = this;
				// 给查询按钮绑定事件
				$(_this.settings.SUBMIT_ID).bind("click", function() {
					_this.commit();
				});
//				$(_this.settings.USERNAME_ID).bind("blur", function() {
//					_this.commit2();
//				});

			},
			// 查询用户名是否存在 光标移开 不校验用户名
//			commit2 : function() {
//
//				var _this = this;
//				var usercode = $(_this.settings.USERNAME_ID).val();
//				if ($.trim(usercode).length > 0) {
//					$.ajax({
//						async : false,
//						type : "POST",
//						url : context + "/login/checkname",
//						modal : true,
//						showBusi : false,
//						data : {
//							usercode : usercode
//						},
//						success : function(data) {
//							var json = $.parseJSON(data);
//
//							if (json && json.RES_RESULT == "SUCCESS") {
//								$(".form-control").eq(0).css("border-color",
//										"#468847");
//								$(".form-control").eq(0).css("color", "#555");
//							} else {
//
//								$(".form-control").eq(0).css("border-color",
//										"#f00");
//								$(".form-control").eq(0).css("color", "#f00");
//
//								$("#name").html("用户名不存在！");
//
//							}
//						}
//					});
//				} else {
//					$(".form-control").eq(0).css("border-color", "#f00");
//					$(".form-control").eq(0).css("color", "#f00");
//					$("#name").html("用户名不能为空");
//
//				}
//			},
			// 查询加密常量
			commit : function() {
				var nameSp = $("#name").html();
				var passSp = $("#pass").html();
				var codeSp = $("#veriCode").html();
				var code = $("#code").val();
				if (nameSp != "" || passSp != "" || codeSp != "") {
					return;
				} else if (code == "") {
					$(".form-control").eq(2).css("border-color", "#f00");
					$(".form-control").eq(2).css("color", "#f00");
					$("#veriCode").html("验证码不可为空！");
					return;
				} else {
					submit(true);
				}
			}
		}
	});
})(jQuery);

$("#imgCode").bind(
		"click",
		function() {
			document.getElementById('imgCodeShow').src = context + "/verifyCode?"
					+ Math.random();
		});
$("#code").bind("blur", function() {
	var code = $("#code").val();
	if (code == "" || code == null) {
		$(".form-control").eq(2).css("border-color", "#f00");
		$(".form-control").eq(2).css("color", "#f00");
		$("#veriCode").html("验证码不可为空！");
		return;
	}
	var url = context + "/login/checkCode";
	var flag = false;
	$.ajax({
		async : false,
		type : "POST",
		url : url,
		data : {
			"code" : code
		},
		dataType : "JSON",
		success : function(data) {
			// alert(data.RES_MSG);
			if (data.RES_MSG == "fail") {
				$(".form-control").eq(2).css("border-color", "#f00");
				$(".form-control").eq(2).css("color", "#f00");
				$("#veriCode").html("验证码输入有误！");
			} else if (data.RES_MSG == "success") {
				$(".form-control").eq(2).css("border-color", "#468847");
				$(".form-control").eq(2).css("color", "#555");
				flag = true;
			}
		}
	});
});
$("#userCode").bind("focus", function() {
	$(".form-control").eq(0).css("border-color", "#66AFE9");// 初始的边框颜色
	$(".form-control").eq(0).css("color", "#555");
	$(".form-control").eq(1).css("border-color", "#66AFE9");// 初始的边框颜色
	$(".form-control").eq(1).css("color", "#555");
	$("#name").html("");
	$("#pass").html("");
});
$("#passWord").bind("blur", function() {
	var pw = $("#passWord").val();
	if (pw == "") {
		$(".form-control").eq(1).css("border-color", "#f00");
		$(".form-control").eq(1).css("color", "#f00");
		$("#pass").html("密码不可为空");
		return;
	}
});
$("#passWord").bind("focus", function() {
	if ($("#pass").html() != "" && $("#pass").html() == "密码不可为空") {
		$(".form-control").eq(1).css("border-color", "#66AFE9");// 初始的边框颜色
		$(".form-control").eq(1).css("color", "#555");
		$("#pass").html("");
	} else if ($("#pass").html() != "" && $("#pass").html() == "用户名或密码错误！") {
		$(".form-control").eq(0).css("border-color", "#66AFE9");// 初始的边框颜色
		$(".form-control").eq(0).css("color", "#555");
		$(".form-control").eq(1).css("border-color", "#66AFE9");// 初始的边框颜色
		$(".form-control").eq(1).css("color", "#555");
		$("#name").html("");
		$("#pass").html("");
	}
});

function submit(flag) {
	var PASSWORDCONSTANT = "";

	$.ajax({
		async : false,
		type : "POST",
		url : context + "/login/getPasswordConstant",
		modal : true,
		showBusi : false,
		success : function(data) {
			var json = $.parseJSON(data);

			if (json && json.RES_RESULT == "SUCCESS") {
				PASSWORDCONSTANT = json.RES_MSG;
			} else {

			}
		}
	});

	var usercode = $("#userCode").val();
	var password = $("#passWord").val();
	if ($.trim(usercode).length > 0) {
		password = hex_md5(password);

		password = hex_md5(password + PASSWORDCONSTANT);

		var vali;
		if (flag) {
			vali = "true";
		} else {
			vali = "false";
		}
		$.ajax({
				async : false,
				type : "POST",
				url : context + "/login/check",
				modal : true,
				showBusi : false,
				data : {
					vali : vali,
					usercode : usercode,
					password : password
				},
				success : function(data) {
					var json = $.parseJSON(data);

					if (json && json.RES_RESULT == "SUCCESS") {
						if (flag) {
							var url = context + "/manager/allroles";//成功登录。
							window.location.href = url;
						} else {
							$(".form-control").eq(0).css("border-color",
									"#468847");
							$(".form-control").eq(0).css("color", "#555");
							$(".form-control").eq(1).css("border-color",
									"#468847");
							$(".form-control").eq(1).css("color", "#555");
						}
					} else {

						$(".form-control").eq(0)
								.css("border-color", "#f00");
						$(".form-control").eq(0).css("color", "#f00");
						$(".form-control").eq(1)
								.css("border-color", "#f00");
						$(".form-control").eq(1).css("color", "#f00");
						$("#name").html("用户名或密码错误！");
						$("#pass").html("用户名或密码错误！");

					}
				}
			});
	}
}
$("#code").bind("focus", function() {
	$(".form-control").eq(2).css("border-color", "#66AFE9");// 初始的边框颜色
	$(".form-control").eq(2).css("color", "#555");
	$("#veriCode").html("");
});
