$(document).ready(function() {

	pagerClick(1);
	
	//获取创建人名字
	select_common("/user/getIdAndName","selectUser");
	//获取供货商名称
	select_common("/supplier/getSupplierIdsAndNames","selectSupplier");
	
	//日期组件
	$('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 3,
		forceParse: 0
    });
	
	//条件查找
	$('#query').click(function(){
			pagerClick(1);
	});
	
 });
function pagerClick(pageIndex){
	var startDate = $('#startDate').val();
	var endDate = $('#endDate').val();
	var supplierId = $('#selectSupplier').val();
	var minAvailCount = $('#minAvailCount').val().trim();
	var maxAvailCount = $('#maxAvailCount').val().trim();
	var createStaff = $("#selectUser").val();
	var qParams = {"pageIndex":pageIndex, "pageSize":10,
			"startDate":startDate, "endDate":endDate, "supplierId":supplierId,
			"minAvailCount":minAvailCount, "maxAvailCount":maxAvailCount, "createStaff":createStaff};
	
	$.ajax({
	    url : getRootPath()+"stock/stockpageinfo",
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