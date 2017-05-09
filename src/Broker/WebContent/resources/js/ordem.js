$(document).on('click', '#comprarButton', function() {
	
	var valor = $('#valor').val();
	
	$.ajax({
		type: "POST",
		url: comprarOrdemUrl,
		data: {'valor' : valor},
		dataType: "application/json",
		crossDomain: true,
		cache: false,
		complete: function (response) {
		    if (response.status == 200) {
    			alert("Envio realizado com sucesso!");
		    }
		    else {
		    	alert("Erro no envio!");
		    }
	    }
	});
});

$(document).on('click', '#venderButton', function() {
	
	var valor = $('#valor').val();
	
	$.ajax({
		type: "POST",
		url: venderOrdemUrl,
		data: {'valor' : valor},
		dataType: "application/json",
		crossDomain: true,
		complete: function (response) {
		    if (response.status == 200) {
    			alert("Envio realizado com sucesso!");
		    }
		    else {
		    	alert("Erro no envio!");
		    }
	    }
	});
});