$(document).ready(function() {
	$("music-add").click(function() {
		$.post("background/User_logout.action", {
			name : $("music-name").val,
			url : $("music-url").val
		}, function(data, status) {
			alert("数据：" + data + "\n状态：" + status);
		});
	});
});