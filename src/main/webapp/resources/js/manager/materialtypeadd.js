$(document).ready(function(){
					// 异步获取材料类型id和name并给#select的各option赋值
					//除了是叶子结点的材料类型
	select_common("/material/getMaterialTypeIdsAndNamesExceptEndNode", "selectSupplier");
});