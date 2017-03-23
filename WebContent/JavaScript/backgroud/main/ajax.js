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
		}, function(data, status) {
			console.log(data.message);
			alert(data.message + "#" + status);
		});
	});
});