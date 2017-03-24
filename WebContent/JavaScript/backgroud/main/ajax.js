$(document).ready(function() {
	$("music-add").click(function() {
		$.post("background/LinkMusic_add.action", {
			name : $("music-name").val,
			path : $("music-path").val
		}, function(data, status) {
			alert("数据：" + data + "\n状态：" + status);
		});
	});
	$("#music-delete").click(function() {
		$.post("background/LinkMusic_delete.action", {
			id : 3
		}, function(response, status) {
			showMessage(response);
		});
	});

	function showMessage(response) {
		var responseObj = eval("(" + response + ")");
		var messageClass;
		var messageInfo;
		switch (responseObj.status) {
		case "SUCCESS":
			messageClass = "success";
			messageInfo = "Success : ";
			break;
		case "WARNING":
			messageClass = "warning";
			messageInfo = "Warning : ";
			break;
		case "ERROR":
			messageClass = "error";
			messageInfo = "Error : ";
			break;
		default:
			messageClass = "warning";
			messageInfo = "Unknown result.";
		}
		messageInfo += responseObj.message;
		var liElement = document.createElement("li");
		var textNode = document.createTextNode(messageInfo);
		liElement.className = messageClass;
		liElement.appendChild(textNode);
		$("#response-ul").prepend(liElement);
		$("#response-ul").children().on("click", function() {
			$(this).slideToggle();
		});
	}
	;
});