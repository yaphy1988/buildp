
 $(document).ready(function() {
	//删除材料信息
	var MATERIALID;
	$('.btn-danger').click(function(){
		MATERIALID = $(this).parent().parent().find('td').first().html();
	});
	$('#myModal .btn-primary').click(function(){
		location.href="deleteMaterialInfo?materialId="+MATERIALID;
	});
	
	//进入增加材料信息页面
	$('#addBtn').click(function(){
		location.href="toAddMaterialInfo";
	});
	
	pagerClick(1);
	
	//获取材料类型列表
	select_common("/material/getMaterialTypeIdsAndNames","selectType");
	//获取创建人名字
	select_common("/user/getIdAndName","selectUser");
	
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
		var optType = $('#optType').val();
		var materialType = $("#materialType").val();
		var createStaff = $("#selectUser").val();
		var qParams = {"pageIndex":pageIndex, "pageSize":10,
				"startDate":startDate, "endDate":endDate,
				"optType":optType,"materialType":materialType,
				"createStaff":createStaff};
		$.ajax({
	        url : getRootPath()+"stock/stockoptpageinfo",
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