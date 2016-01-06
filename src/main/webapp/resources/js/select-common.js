function select_common(url, id){
	$.ajax({
		url : context + url,
		type : "post",
		dataType : "JSON",
		success : function(data) {
			var ids = data.ids;
			var names = data.names;
			for (var i = 0; i < ids.length; i++) {
					$('#'+id).append(
							"<option value='" + ids[i]
									+ "'>" + names[i]
									+ "</option>");
			}
			$('#'+id).selectpicker('refresh');
		},
		error : function() {
		}

	});
}