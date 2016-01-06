$(function(){
	tab("nav-tabs","li","pane-wrapper","div","onclick");
	//获取材料信息列表
	select_common("/material/getMaterialIdsAndNamesAndStandards","inSelectMaterial");
	select_common("/material/getMaterialIdsAndNamesAndStandards","outSelectMaterial");
	//获取供货商列表
	select_common("/supplier/getSupplierIdsAndNames", "inSelectSupplier");
	select_common("/supplier/getSupplierIdsAndNames", "outSelectSupplier");
	
	$('#inCount').blur(function(){
		check_in_count(this,"#in_count_msg");
	});
	$('#inSelectSupplier').change(function(){
		check_supplier(this,"#in_supplier_msg");
	});
	$('#outCount').blur(function(){
		check_out_count(this,"#out_count_msg");
	});
	$('#outSelectSupplier').change(function(){
		check_supplier(this,"#out_supplier_msg");
	});
});

function tab(tab_t_n,tab_t_tag,tab_c_n,tab_c_tag,evt){
    var tab_t = $("."+tab_t_n);
    var tab_t_li = $("."+tab_t_n+">"+tab_t_tag);
    var tab_c = $("."+tab_c_n);
    var tab_c_li = $("."+tab_c_n+">"+tab_c_tag);
    var len = tab_t_li.length;
    var i=0;
    for(i=0; i<len; i++){
    	tab_t_li[i].index = i;
        tab_t_li[i][evt] = function(){
            for(var j=0; j<len; j++){
                tab_t_li[j].className = '';
                tab_c_li[j].className = 'hide';
            }
            tab_t_li[this.index].className = 'active';
            tab_c_li[this.index].className = 'active';
        }
    }
}

function check_in_count(id,msg) {
	var count = $(id).val();
	//如果count为空或者小于等于０或者为小数，则显示错误
	if(count==null || count<=0 || parseInt(count)!=count){
		$(msg).text("不能为空，且是大于0的整数").addClass("error_msg");
		return false;
	}else{
		$(msg).text("").removeClass("error_msg");
		return true;
	}
}

function check_out_count(id,msg) {
	var count = $(id).val();
	//如果count为空或者小于等于０或者为小数，
	//或是可用库存为空或小于出库数count,   则显示错误
	var availCount = $('#availCount').html().trim();
	if(count==null || count<=0 || parseInt(count)!=count){
		$(msg).text("不能为空，且是大于0的整数").addClass("error_msg");
		return false;
	}else if(availCount == null || availCount - count < 0){
		$(msg).text("可用库存量不够").addClass("error_msg");
		return false;
	}else{
		$(msg).text("").removeClass("error_msg");
		return true;
	}
}

function check_supplier(id,msg){
	var supplierId = $(id).val();
	if(supplierId == ""){
		$(msg).text("不能为空").addClass("error_msg");
		return false;
	}else{
		$(msg).text("").removeClass("error_msg");
		return true;
	}
}

//获取可用库存量
function getStockAvailCount(){
	var materialId = $('#outSelectMaterial').val();
	var supplierId = $('#outSelectSupplier').val();
	
	$.ajax({
		url : getRootPath()+"stock/getStockAvailCount",
		type : "post",
		cache: false,
		dataType : "json",
		data: {"materialId":materialId,"supplierId":supplierId},
		
		success : function(data){
			var availCount = data.availCount;
			if(availCount != null){
				$('#availCount').text(availCount);
			}else{
				$('#availCount').text("0");
			}
		},
		error : function(){
		}
	});
}

function savein() {
	var flag = check_supplier("#inSelectSupplier","#in_supplier_msg") && check_in_count("#inCount","#in_count_msg");
	if(flag!=null) {
		if(flag) {
			var materialId = $('#inSelectMaterial').val().trim();
			var supplierId = $('#inSelectSupplier').val().trim();
			var count = $('#inCount').val().trim();
			var optType = "01";
			var createStaff = $('#addCreateStaff').val().trim();
			
			var qParams = {"materialId":materialId, "supplierId":supplierId, "count":count,
					"optType":optType, "createStaff":createStaff};
			
			$.ajax({
				url : context + "/stock/stockInOpt",
				type : "post",
				dataType : "JSON",
				data: qParams,
				success : function(data){
					if(data.flag){
			        	$('#successMsg').click();
					}else{
						$('#failMsg').click();
					}
					$('#inForm')[0].reset();
		        },
		        error : function(){
		        	$('#failMsg').click();
		        	$('#inForm')[0].reset();
		        }

			});
		}
	}
}

function saveout() {
	var flag = check_supplier("#outCount","#out_supplier_msg") && check_out_count("#outCount","#out_count_msg");
	if(flag!=null) {
		if(flag) {
			var materialId = $('#outSelectMaterial').val().trim();
			var supplierId = $('#outSelectSupplier').val().trim();
			var count = $('#outCount').val().trim();
			var optType = "02";
			var createStaff = $('#addCreateStaff').val().trim();
			
			var qParams = {"materialId":materialId, "supplierId":supplierId, "count":count,
					"optType":optType, "createStaff":createStaff};
			
			$.ajax({
				url : context + "/stock/stockOutOpt",
				type : "post",
				dataType : "JSON",
				data: qParams,
				success : function(data){
					if(data.flag){
			        	$('#successMsg').click();
			        	getStockAvailCount();
					}else{
						$('#failMsg').click();
					}
					$('#outForm')[0].reset();
		        },
		        error : function(){
		        	$('#failMsg').click();
		        	$('#outForm')[0].reset();
		        }

			});
		}
	}
}