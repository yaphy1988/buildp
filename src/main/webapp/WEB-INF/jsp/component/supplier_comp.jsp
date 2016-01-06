<%@ page language="java" pageEncoding="UTF-8"%>

<!--  供应商下拉选择组件 -->
    <div class="controls">
		<select id="selectSupplier" name="supplierId"  onchange="check_supplier();">
			<option selected value=""></option>
		</select>
    </div>
    
   <script>
  $(document).ready(function() {
	$.ajax({
		url : context + "/supplier/getSupplierIdsAndNames",
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			for (var i = 0; i < ids.length; i++) {
					$('#selectSupplier').append(
							"<option value='" + ids[i]
									+ "'>" + names[i]
									+ "</option>");
			}
			$('#selectSupplier').selectpicker('refresh');
		},
		error : function() {
		}

	});
	
 });

</script>