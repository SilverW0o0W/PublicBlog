<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Login</title>
<link href="<%=path%>/CSS/login/style.css" rel="stylesheet" />
<!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
	<form method="post" action="<%=path%>/background/User_login.action"
		class="login">
		<p>
			<label for="login">User Name:</label> <input type="text" name="email"
				id="login" placeholder="name@example.com" required="required">
		</p>
		<p>
			<label for="password">Password:</label> <input type="password"
				name="password" id="password" placeholder="password"
				required="required">
		</p>
		<p class="login-submit">
			<button type="submit" class="login-button">Login</button>
		</p>
		<p class="forgot-password">
			<a href="index.html">Forgot your password?</a>
		</p>
	</form>
</body>
</html>
