/**
 * materialtypemanage.js
 * 材料类型管理页面.js
 */
 $(document).ready(function() {
	 pagerClick(1);

	//添加材料类型
	 $('#addDialog .btn-add').click(function(){
		 save();
	 });
	 
	//条件查找
	$('#find').click(function(){
			pagerClick(1);
	});
});

function addType(){
	$('#addDialog').modal('show');
}

//添加材料类型
function save(){
	var flag = check_name();
	alert(flag);
	if(flag!=null) {
		if(flag) {
			var typeName = $('#addTypeName').val().trim();
			var parentTypeId = $('#selectSupplier').val().trim();
			var endNode = $('#addEndNodeTd input:checked').val().trim();
			var status = $('#addStatusTd input:checked').val().trim();
			var createStaff = $('#createStaff').val().trim();
			
			var qParams = {"typeName":typeName, "parentTypeId":parentTypeId, "endNode":endNode,
					"status":status, "createStaff":createStaff};
			
			$.ajax({
				url : getRootPath()+"material/addMaterialType",
		        type : "post",
				cache: false,
		        dataType : "json",
				data: qParams,
		        success : function(data){
		        	$('#addSuccessMsg').click();
		        	setTimeout("window.location.href='types';",1000);
		        },
		        error : function(){
		        	$('#FailMsg').click();
		        	setTimeout("window.location.href='types';",1000);
		        }
			});
		}
	}
}

function check_name(){
	var typeName = $('#addTypeName').val().trim();
	var flag;
	$.ajax({
		url : getRootPath()+"material/isExistTypeName",
		type : "post",
		cache: false,
		async: false,
		dataType : "json",
		data: {"typeName":typeName},
		
		success : function(data){
			var boo = data.flag;
			if(typeName == ""){
				$('#name_msg').text("不能为空").addClass("error_msg");
				flag = false;
			}else if(boo == false){
				$('#name_msg').text("").removeClass("error_msg");
				flag = true;
			}else{
				$('#name_msg').text("该类型已存在").addClass("error_msg");
				flag = false;
			}
		},
		error : function(){
		}
	});
	return flag;
}

//删除材料类型函数
function deleteType(typeId){
	$('#deleteDialog').modal('show');
	$('#deleteDialog .btn-primary').click(function(){
		$.ajax({
			url : getRootPath()+"material/deleteMaterialType",
	        type : "post",
			cache: false,
	        dataType : "json",
			data: {"typeId":typeId},
	        beforeSend : function(){
	        },
	        success : function(data){
	        	$('#delSuccessMsg').click();
	        	setTimeout("window.location.href='types';",1000);
	        },
	        error : function(){
	        	$('#failMsg').click();
	        	setTimeout("window.location.href='types';",1000);
	        }
		});
	});
}
 
function pagerClick(pageIndex){
		var typeId = $('#typeId').val();
		var typeName = $('#typeName').val();
		var parentTypeName = $('#parentTypeName').val();
		var endNode = $('#endNode').val();
		var qParams = {"pageIndex":pageIndex, "pageSize":10, "typeId":typeId, "typeName":typeName,
			"parentTypeName":parentTypeName, "endNode":endNode};
		$.ajax({
	        url : getRootPath()+"material/getPageTypes",
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

function query(typeId){
	var qParams = {"typeId":typeId};
	$.ajax({
        url : getRootPath()+"material/queryByTypeId",
        type : "post",
		cache: false,
        dataType : "html",
		data: qParams,
        beforeSend : function(){
        },
        success : function(data){
        	$("#editContent").html(data);
        	$('#editDialog').modal('show');
        },
        error : function(){
        }
    });
}

