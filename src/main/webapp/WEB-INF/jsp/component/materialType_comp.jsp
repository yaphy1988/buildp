<%@ page language="java" pageEncoding="UTF-8"%>

<!-- 材料类型下拉选择组件 -->
    <div class="controls">
		<select id="select" class='selectpicker' name="materialType">
			<option selected value="%">--全部--</option>
		</select>
    </div>
    
   <script>
  $(document).ready(function() {
	$.ajax({
		url : context
				+ "/material/getMaterialTypeIdsAndNames",
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			for (var i = 0; i < ids.length; i++) {
					$('#select').append(
							"<option value='" + ids[i]
									+ "'>" + names[i]
									+ "</option>");
			}
			$('#select').selectpicker('refresh');
		},
		error : function() {
			alert("失败");
		}

	});
	
 });

</script>