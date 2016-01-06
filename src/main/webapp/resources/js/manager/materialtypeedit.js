$(document).ready(function(){
	
	//保存编辑的材料信息
	$('#confirmEdit').click(function(){
		var typeId = $('#editTypeId').val();
		var typeName = $('#editTypeName').val();
		var parentTypeId = $('#select-edit').val();
		var endNode = $('#editEndNodeTd input:checked').val();
		var status = $('#editStatusTd input:checked').val();
		var updateStaff = $('#editUpdateStaff').val();
		var qParams = {"typeId":typeId, "typeName":typeName, "parentTypeId":parentTypeId,
				 "endNode":endNode, "status":status, "updateStaff":updateStaff};
		saveEdit(qParams);
	});
	
	// 异步获取材料类型id和name并给#select的各option赋值，除了叶子节点
	$.ajax({
		url : context
				+ "/material/getMaterialTypeIdsAndNamesExceptEndNode",
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			var typeId = $('#editTypeId').val();
			var parentTypeId = $('#editParentTypeId').val();
			for (var i = 0; i < ids.length; i++) {
				//如果是父类型是自己，则跳过
				if(typeId == ids[i]){
					continue;
				}
				if (ids[i] == parentTypeId) {
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
        url : getRootPath()+"material/saveEditType",
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