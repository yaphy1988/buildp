$(document).ready(function(){
	
	//保存编辑的材料信息
	$('#confirmEdit').click(function(){
		var materialId = $('#editMaterialId').val();
		var materialName = $('#editMaterialName').val();
		var materialType = $('#select-edit').val();
		var standard = $('#editStandard').val();
		var status = $('#status').val();
		var updateStaff = $('#editUpdateStaff').val();
		var qParams = {"materialId":materialId, "materialName":materialName, "materialType":materialType,
				"standard":standard, "status":status, "updateStaff":updateStaff};
		saveEdit(qParams);
	});
	// 异步获取材料类型id和name并给#select的各option赋值
	$.ajax({
		url : context
				+ "/material/getMaterialTypeIdsAndNames",
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			var materialType = $('#editMaterialType').val();
			for (var i = 0; i < ids.length; i++) {
				if (ids[i] == materialType) {
					$('#select-edit').append(
							"<option selected value='"
									+ ids[i] + "'>"
									+ names[i]
									+ "</option>");
				} else {
					$('#select-edit').append(
							"<option value='" + ids[i]
									+ "'>" + names[i]
									+ "</option>");
				}
			}
			$('#select-edit').selectpicker('refresh');
		},
		error : function() {
		}

	});
});
function saveEdit(params){
	$.ajax({
        url : getRootPath()+"material/saveEditInfo",
        type : "post",
		cache: false,
        dataType : "JSON",
		data : params,
        beforeSend : function(){
        },
        success : function(data){
        	$('#editSuccessMsg').click();
        	setTimeout("self.location.reload();",1000);
        },
        error : function(){
        	$('#failMsg').click();
        	setTimeout("self.location.reload();",1000);
        }
    });
}