/**
 * materialinfomanage.js
 * 材料信息管理页面.js
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
	
	//获取材料类型
	select_common("/material/getMaterialTypeIdsAndNames", "selectTypeName");
	
 });
//添加材料类型
 function addInfo(){
 	$('#addDialog').modal('show');
 }

function save(){
	
		var materialName = $('#addMaterialName').val().trim();
		var materialType = $('#selectType').val().trim();
		var standard = $('#addStandard').val().trim();
		var status = $('#addStatusTd input:checked').val().trim();
		var createStaff = $('#createStaff').val().trim();
		
		var qParams = {"materialName":materialName, "materialType":materialType, "standard":standard,
				"status":status, "createStaff":createStaff};
		
		$.ajax({
			url : getRootPath()+"material/addMaterialInfo",
	        type : "post",
			cache: false,
			async: false,
	        dataType : "json",
			data: qParams,
	        success : function(data){
	        	$('#addSuccessMsg').click();
	        	setTimeout("window.location.href='infos';",1000);
	        },
	        error : function(){
	        	$('#FailMsg').click();
	        	setTimeout("window.location.href='infos';",1000);
	        }
		});
}
//删除材料信息
 function deleteInfo(materialId){
	 $('#deleteDialog').modal('show');
 	$('#deleteDialog .btn-primary').click(function(){
 		$.ajax({
			url : getRootPath()+"material/deleteMaterialInfo",
	        type : "post",
			cache: false,
	        dataType : "json",
			data: {"materialId":materialId},
	        success : function(data){
	        	$('#delSuccessMsg').click();
	        	setTimeout("window.location.href='infos';",1000);
	        },
	        error : function(){
	        	$('#failMsg').click();
	        	setTimeout("window.location.href='infos';",1000);
	        }
		});
 	});
 	
 }
 
 
 function pagerClick(pageIndex){
		
		var materialName = $('#materialName').val();
		var typeName = $('#selectTypeName option:selected').html();
		var standard = $('#standard').val();
		var status = $('#status').val();
		
		if(typeName == "全部"){
			typeName = "";
		}
		
		var qParams = {"pageIndex":pageIndex, "pageSize":10, "materialName":materialName, "typeName":typeName,
				"standard":standard, "status":status};
		$.ajax({
	        url : getRootPath()+"material/getPageInfos",
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
 
 function query(materialId){
	var qParams = {"materialId":materialId};
	$.ajax({
        url : getRootPath()+"material/queryByMaterialId",
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
        	alert("失败");
        }
    });
}


