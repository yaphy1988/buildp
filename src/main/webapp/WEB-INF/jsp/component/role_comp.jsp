<%@ page language="java" pageEncoding="UTF-8"%>

<!--  角色下拉选择组件 -->
    <div class="controls">
		<select id="selectRole" class='selectpicker' name="roleId">
		</select>
    </div>
    
   <script>
  $(document).ready(function() {
	$.ajax({
		url : context
				+ "/manager/getRoleIdsAndNames",
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			for (var i = 0; i < ids.length; i++) {
					$('#selectRole').append(
							"<option value='" + ids[i]
									+ "'>" + names[i]
									+ "</option>");
			}
			$('#selectRole').selectpicker('refresh');
		},
		error : function() {
		}

	});
	
 });

</script>