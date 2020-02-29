
function AccessPages(URL) {	
	
	$.ajax({
		url : URL,
		type : "POST",									
		success : function(response) {
			$("#main-section").html(response);
		},
		error : function() {
		}
	});	
}










