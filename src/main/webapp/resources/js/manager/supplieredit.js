var initSupplierName;

$(function(){
	//获取初始供货商名称
	initSupplierName = $('#editSupplierName').val().trim();
	//编辑供应商
	$('.btn-info').click(function(e){
		var SUPPLIERID = $(this).parent().find("input").first().val().trim();
		e.preventDefault();
		
		//根据SUPPLIERID去查询供应商信息
		query(SUPPLIERID);
		
	});
	
	$("#myRegion").region();
	
	initEditAddress();
	
	
	$('#myRegion').change(function(){
		var code = $('#myRegion').region("getRegionValue");
		$('#editRegionCode').attr('value',code);
	});
	
});



function initEditAddress(){
	var regionCode = $('#editRegionCode').val().trim();
	
	var addressElem = $('#editAddress');
	var addressVal = addressElem.val().trim();
	var regionName = "";
	
	var provinceName;
	var cityName;
	var countyName;
	if(regionCode.substring(0,2) != "00"){
		provinceName = getRegionNameByCode(regionCode.substring(0,2)+"0000");
		regionName += provinceName;
	}
	if(regionCode.substring(2,4) != "00"){
		cityName = getRegionNameByCode(regionCode.substring(0,4)+"00");
		regionName += cityName;
	}
	if(regionCode.substring(4,6) != "00"){
		countyName = getRegionNameByCode(regionCode);
		regionName += countyName;
	}

	addressElem.attr("value",addressVal.replace(regionName,""));

}

function getRegionNameByCode(regionCode){
	var name;
	$.ajax({
		async: false,
        url : getRootPath()+"base/getRegionName",
        type : "post",
		cache: false,
        dataType : "JSON",
		data : {"regionCode":regionCode},
        success : function(data){
        	name = data.regionName;
        }
    });
	return name;
}



function saveEdit(params){
	var flag = check_name() & check_region_code() & check_business_permit();
	
	if(flag!=null) {
		if(flag) {
			//设置地址
			set_address();
			var supplierId = $('#editSupplierId').val();
			var supplierName = $('#editSupplierName').val().trim();
			var address = $('#editAddress').val().trim();
			var regionCode = $('#editRegionCode').val().trim();
			var businessPermit = $('#editBusinessPermit').val().trim();
			var businessIntroduce = $('#editBusinessIntroduce').val().trim();
			var status = $('#editStatusTd input:checked').val().trim();
			var createStaff = $('#editCreateStaff').val().trim();
			
			var qParams = {"supplierId":supplierId, "supplierName":supplierName, "address":address, "regionCode":regionCode,
					"businessPermit":businessPermit, "businessIntroduce":businessIntroduce,
					"status":status, "createStaff":createStaff};
			$.ajax({
		        url : getRootPath()+"supplier/saveEditInfo",
		        type : "post",
				cache: false,
		        dataType : "JSON",
				data : qParams,
		        beforeSend : function(){
		        },
		        success : function(data){
		        	$('#editSuccessMsg').click();
		        	setTimeout("window.location.href='info';",1000);
		        },
		        error : function(){
		        	$('#failMsg').click();
		        	setTimeout("window.location.href='info';",1000);
		        }
		    });
		}
	}
}

function check_name() {
	var supplierName = $('#editSupplierName').val().trim();
	var result;
	$.ajax({
		url : getRootPath()+"supplier/isExistSupplierName",
		type : "post",
		cache: false,
		async: false,
		dataType : "json",
		data: {"supplierName":supplierName},
		
		success : function(data){
			var boo = data.flag;
			if(supplierName == ""){
				$('#name_msg').text("不能为空").addClass("error_msg");
				result = false;
			}else if(boo == false){
				$('#name_msg').text("").removeClass("error_msg");
				result = true;
			}else if(supplierName == initSupplierName){
				$('#name_msg').text("").removeClass("error_msg");
				result = true;
			}else{
				$('#name_msg').text("供应商名已存在").addClass("error_msg");
				result = false;
			}
		},
		error : function(){
		}
	});
	return result;
}

function check_region_code(){
	var regex = /^[0-9]{6}$/;
	var regionCode = $('#editRegionCode').val().trim();
	if(regionCode == ""){
		$('#region_code_msg').text("不能为空").addClass("error_msg");
		return false;
	}else if(!regex.test(regionCode)){
		$('#region_code_msg').text("请输入6位0-9的数字").addClass("error_msg");
		return false;
	}else{
		$('#region_code_msg').text("").removeClass("error_msg");
		return true;
	}
}

function check_business_permit(){
	var regex = /^[0-9]{15}$/;
	var businessPermit = $('#editBusinessPermit').val().trim();
	if(businessPermit == ""){
		$('#business_permit_msg').text("不能为空").addClass("error_msg");
		return false;
	}else if(!regex.test(businessPermit)){
		$('#business_permit_msg').text("请输入15位0-9的数字").addClass("error_msg");
		return false;
	}else{
		$('#business_permit_msg').text("").removeClass("error_msg");
		return true;
	}
}

function set_address(){
	var addr = null;
	
	var provinceSeleted = $('#province option:selected').text();
	var citySeleted = $('#city option:selected').text();
	var countySeleted = $('#county option:selected').text();
	
	var regionNullText = "--请选择--";
	
	if(provinceSeleted != undefined){
		addr = provinceSeleted;
	}
	if(citySeleted != undefined && citySeleted != regionNullText){
		addr = addr + citySeleted;
	}
	if(countySeleted != undefined && countySeleted != regionNullText){
		addr = addr + countySeleted;
	}
	addr += $('#editAddress').val();
	
	$('#editAddress').val(addr);
	
}
