$(document).ready(function() {
	$("music-add").click(function() {
		$.post("background/LinkMusic_add.action", {
			name : $("music-name").val,
			path : $("music-path").val
		}, function(data, status) {
			alert("数据：" + data + "\n状态：" + status);
		});
	});
});