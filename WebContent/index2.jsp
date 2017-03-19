<%@page import="POJO.User"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//User user = (User) session.getAttribute("LoginUser");
	%>
	<%
		//=user.getId()
	%>
	<%
		//=user.getUsername()
	%>
	<%
		//=user.getPassword()
	%>
	${sessionScope.LoginUser.getId()}
	${sessionScope.LoginUser.getEmail()}
	${sessionScope.LoginUser.getUsername()}
</body>
</html>