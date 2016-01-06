/**
 * suppliermanage.js
 * 供应商管理页面.js
 */

$(document).ready(function() {
	//进入增加供应商页面
	$('#addBtn').click(function(e){
		e.preventDefault();
		$('#info-add').modal('show');
	});
	

});

function editInfo(supplierId){
	 $('#info-edit').modal('show');
	 query(supplierId);
}

//删除供货商信息
function deleteInfo(supplierId){
	 $('#deleteDialog').modal('show');
	$('#deleteDialog .btn-primary').click(function(){
		$.ajax({
			url : getRootPath()+"supplier/deleteSupplier",
	        type : "post",
			cache: false,
	        dataType : "json",
			data: {"supplierId":supplierId},
	        success : function(data){
	        	$('#delSuccessMsg').click();
	        	setTimeout("window.location.href='info';",1000);
	        },
	        error : function(){
	        	$('#failMsg').click();
	        	setTimeout("window.location.href='info';",1000);
	        }
		});
	});
}

function query(supplierId){
	
	var qParams = {"supplierId":supplierId};
	
	$.ajax({
        url : getRootPath()+"supplier/queryBysupplierId",
        type : "post",
		cache: false,
        dataType : "html",
		data: qParams,
        beforeSend : function(){
        },
        success : function(data){
        	$("#editInfo").html(data);
        	$('#info-edit').modal('show');
        },
        error : function(){
        }
    });
}

var flag = false;


function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}


