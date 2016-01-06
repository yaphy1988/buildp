/**
 * editpermission.js
 * 修改权限
 */
$(document).ready(function() {
	//checkBox使用iCheck控件样式
	$("input").on('ifChanged', function(event){
		if($(this).attr("checked")==undefined) {
			$(this).attr("checked","true");
		} else {
			$(this).removeAttr("checked");
		}
    }).iCheck({
        checkboxClass: 'icheckbox_flat-blue',
        increaseArea: '20%'
	});
	//全选按钮
	$('#checkAll').on('ifChecked', function(event){
		$('input').iCheck('check');
	});
	$('#checkAll').on('ifUnchecked', function(event){
		$('input').iCheck('uncheck');
	});
});

function savePermission(roleId){
	var currentPermission = new Array();
	$("[name='myCheckBox']").each(function(){
		if($(this).attr("checked")!=undefined){
			var menuId = $(this).val();
			currentPermission.push(menuId);
		}
	});
	//alert(currentPermission);
	$.ajax({
		async : true,
		type : "POST",
		data : {
			currPermission:currentPermission.join(","),
			roleId:roleId
		},
		url : getRootPath()+"manager/savepermission",
		success: function(data){
			var json=$.parseJSON(data);
			initPermission = new Array();
			if(json&&json.RES_RESULT=="SUCCESS"){
				$("#showMsg").find("h3").html("权限修改结果");
				$("#showMsg").find("p").html("角色"+"的权限修改成功！");
				$("#showMsg").modal('show');
			}else{
				$("#showMsg").find("h3").html("权限修改结果");
				$("#showMsg").find("p").html("保存失败");
				$("#showMsg").modal('show');
			}
		}
	});
}