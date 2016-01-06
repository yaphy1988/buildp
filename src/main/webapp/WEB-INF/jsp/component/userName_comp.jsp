<%@ page language="java" pageEncoding="UTF-8"%>

<!--  用户名下拉选择组件 -->
    <div class="controls">
		<select id="selectName" class='selectpicker' name="userName">
			<option selected value="%">--全部--</option>
		</select>
    </div>
    
   <script>
  $(document).ready(function() {
	$.ajax({
		url : context
				+ "/user/getIdAndName",
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			for (var i = 0; i < ids.length; i++) {
					$('#selectName').append(
							"<option value='" + names[i]
									+ "'>" + names[i]
									+ "</option>");
			}
			$('#selectName').selectpicker('refresh');
		},
		error : function() {
			alert("失败");
		}

	});
	
 });

</script>