$(document).ready(function(){
					// 异步获取材料类型id和name并给#select的各option赋值
	select_common("/material/getMaterialTypeIdsAndNames", "selectType");
});