/**
 * authmanage.js
 * 权限管理页面js
 */
$(document).ready(function() {
	//删除用户
	var USERID;
	$('.btn-danger').click(function(){
		USERID = $(this).parent().parent().find('td').first().html();
	});
	$('#myModal .btn-primary').click(function(){
		location.href="deleteUser?userId="+USERID;
		
	});
	
	//进入增加用户页面
	$('#addBtn').click(function(e){
		e.preventDefault();
		$('#user-add').modal('show');
	});
	
	pagerClick(1);
	$("#myRegion").region();
});

window.onload = function() {
	var optResult = $('#optResult').val().trim()
	 if(optResult == "addSuccess"){
		 $('#addSuccessMsg').click();
	 } else if (optResult == "delSuccess"){
		 $('#delSuccessMsg').click();
	 } else if (optResult == "editSuccess"){
		 $('#editSuccessMsg').click();
	 } else if (optResult == "fail"){
		 $('#FailMsg').click();
	 }
	 $('#optResult').value = "null";
	 $('#supplierId').value = "null";
	 
}

function pagerClick(pageIndex){
	var qParams = {"pageIndex":pageIndex, "pageSize":10};
	
	$.ajax({
        url : getRootPath()+"manager/getallroles",
        type : "post",
		cache: false,
        dataType : "html",
		data: qParams,
        beforeSend : function(){
        },
        success : function(data){
			$("#data-render").html(data);
        },
        error : function(){
        }
    });
}

//删除角色
function deleteRole(roleId, roleName){
	$("#deleteRole").find("h3").html("删除角色");
	$("#deleteRole").find("p").html("确定删除角色“<span style='color:red'>"+roleName+"</span>”吗？");
	$("#deleteRole").modal('show');
	$("#btn-deleteRole").bind("click",function(){
		$.ajax({
			async : true,
			type : "POST",
			data : {
				roleId:roleId
			},
			url : getRootPath()+"manager/deleterole",
			success: function(data){
				var json=$.parseJSON(data);
				if(json&&json.RES_RESULT=="SUCCESS"){
					location.reload();
				}else{
					
				}
			}
		});
	});
}

var can_Save = false;

function save() {
	//参数校验
	check_name();
	check_passwd();
	if(flag!=null) {
		if(flag) {
			$('#myForm').submit();
		} else {
			alert("表单中存在不符合规则的数据，请检查.");
		}
	}
}

function check_code() {
	var userCode = $('#userCode').val().trim();
	
	var Reg =  /^[a-zA-Z_0-9]{4,20}$/;
	if(!Reg.test(userCode)){
		$('#useCode_msg').text("请输入合法的登录名：长度4~20，由字母和数字和下划线组成").addClass("error_msg");
		can_Save = false;
	} else {
		$('#useCode_msg').text("").removeClass("error_msg");
		can_Save = true;
	}
	
}

function check_passwd(){
	var passwd1 = $('#passWord1').val().trim();
	var Reg =  /^[a-zA-Z]\w{5,17}$/;
	if(!Reg.test(passwd1)){
		$('#passwd_msg').text("密码规则：以字母开头,长度6~18，由字母和数字和下划线组成").addClass("error_msg");
		can_Save = false;
	} else {
		$('#passwd_msg').text("").removeClass("error_msg");
		can_Save = true;
	}
}

function conf_passwd(){
	var passwd1 = $('#passWord1').val().trim();
	var passwd2 = $('#passWord2').val().trim();
	if(passwd1!=passwd2){
		$('#conf_passwd_msg').text("两次填写的密码不一致").addClass("error_msg");
		can_Save = false;
	} else {
		$('#conf_passwd_msg').text("").removeClass("error_msg");
		can_Save = true;
	}
}

function showRegion(){
	var mySelect = $('#myRegion');
	var values = mySelect.region("getRegionValue");
	alert(values);
}
