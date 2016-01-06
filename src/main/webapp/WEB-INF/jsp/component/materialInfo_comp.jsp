<%@ page language="java" pageEncoding="UTF-8"%>

<!-- 材料信息下拉选择组件 -->
    <div class="controls">
		<select id="selectMaterialId"  name="materialId"><!--   onchange="getStockAvailCount();">-->
		</select>
    </div>
    
   <script>
  $(document).ready(function() {
	  $.ajax({
			url : context
					+ "/material/getMaterialIdsAndNamesAndStandards",
			type : "post",
			dataType : "JSON",
			success : function(data) {
				var ids = data.ids;
				var names = data.names;
				for (var i = 0; i < ids.length; i++) {
					if (i == 0) {
						$('#selectMaterialId').append(
								"<option selected value='"
										+ ids[i] + "'>"
										+ names[i]
										+ "</option>");
					} else {
						$('#selectMaterialId').append(
								"<option value='" + ids[i]
										+ "'>" + names[i]
										+ "</option>");
					}
				}
				$('#selectMaterialId').addClass("selectpicker");
				
			},
			error : function() {
			}

		});
	
 });

</script>