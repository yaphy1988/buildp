$(function(){
	$("#myRegion").region();
	
	$('#province').change(function(){
		set_region();
	});
	$('#city').change(function(){
		set_region();
	});
	$('#county').change(function(){
		set_region();
	});
});


//添加材料类型
function addInfo(){
	$('#addDialog').modal('show');
}

function save() {
	var flag = check_name() & check_region_code() & check_business_permit();
	if(flag!=null) {
		if(flag) {
			//设置地址
			set_address();
			var supplierName = $('#addSupplierName').val().trim();
			var address = $('#addAddress').val().trim();
			var regionCode = $('#addRegionCode').val().trim();
			var businessPermit = $('#addBusinessPermit').val().trim();
			var businessIntroduce = $('#addBusinessIntroduce').val().trim();
			var status = $('#addStatusTd input:checked').val().trim();
			var createStaff = $('#addCreateStaff').val().trim();
			
			var qParams = {"supplierName":supplierName, "address":address, "regionCode":regionCode,
					"businessPermit":businessPermit, "businessIntroduce":businessIntroduce,
					"status":status, "createStaff":createStaff};
			
			$.ajax({
				url : getRootPath()+"supplier/addSupplier",
		        type : "post",
				cache: false,
				async: false,
		        dataType : "json",
				data: qParams,
		        success : function(data){
		        	$('#addSuccessMsg').click();
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
	var supplierName = $('#addSupplierName').val().trim();
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
	var regionCode = $('#addRegionCode').val().trim();
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
	var businessPermit = $('#addBusinessPermit').val().trim();
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

function set_region(){
	var province = $('#province').val();
	var city = $('#city').val();
	var county = $('#county').val();
	var text;
	if(province != undefined && province != '000000'){
		text = province;
	}
	if(city != undefined && city != '000000'){
		text = city;
	}
	if(county != undefined && county != '000000'){
		text = county;
	}
	if(text != null){
		$('#addRegionCode').attr('value',text);
	}else{
		$('#addRegionCode').attr('value',"");
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
	addr += $('#addAddress').val();
	$('#addAddress').val(addr);
}