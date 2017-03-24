<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<base href="<%=basePath%>">
<title>Background-Main</title>
<link href="CSS/backgroud/main/style.css" rel="stylesheet" />
<!--[if lt IE 9]><link rel="stylesheet" type="text/css" href="css/ie.css" /><![endif]-->
<script src="JavaScript/jquery-3.1.1.min.js"></script>
<script src="JavaScript/backgroud/main/main.js"></script>
<script src="JavaScript/backgroud/main/ajax.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="content">
			<div class="main">
				<div class="controls">
					<nav class="links">
						<ul>
							<li><a href="#" class="like">Like <span class="num">5</span></a></li>
							<li><a href="#" class="comment">Comment <span
									class="num">3</span>
							</a></li>
						</ul>
					</nav>
					<div class="profile-box">
						<span class="profile"> <a href="#" class="section"> <img
								class="image" src="" alt="image description" width="26"
								height="26" /> <span class="text-box"> Welcome <strong
									class="name">${sessionScope.LoginUser.getUsername()}</strong>
							</span>
						</a> <a href="#" class="opener">opener</a>
						</span> <a href="background/User_logout.action" class="btn-on">On</a>
					</div>
				</div>
				<div class="tabs">
					<div class="response-bar">
						<ul class="status" id="response-ul">
						</ul>
					</div>
					<div id="dashboard" class="tab">
						<article>
							<div class="text-section">
								<h1>Dashboard</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<div class="text-section">
								<h2>Article</h2>
								<p>12</p>
							</div>
							<div class="text-section">
								<h2>Dashboard</h2>
								<p>This is a quick overview of some features</p>
							</div>
							<div class="text-section">
								<h2>Music</h2>
								<p>10</p>
							</div>
						</article>
					</div>
					<div id="pictures" class="tab">
						<article>
							<div class="text-section">
								<h1>Pictures</h1>
								<p>This is a quick overview of some features</p>
							</div>

						</article>
					</div>
					<div id="articles" class="tab">
						<article>
							<div class="text-section">
								<h1>Articles</h1>
								<p>This is a quick overview of some features</p>
							</div>
						</article>
					</div>
					<div id="applications" class="tab">
						<article>
							<div class="text-section">
								<h1>Applications</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<div class="text-section">
								<h2>Add music</h2>
								<p>
									<input type="text" name="music-name" /> <input type="text"
										name="music-path" /> <input type="button" name="music-add"
										value="Add" />
								</p>
							</div>
							<div class="text-section">
								<h2>Music list</h2>
								<div>
									<table>
										<tr>
											<td>Music id</td>
											<td>Music name</td>
											<td>URL</td>
											<td>Operation</td>
										</tr>
										<tr>
											<td>1</td>
											<td>Lemon tree</td>
											<td><a href="http://silvercodingcat.com">https://silvercodingcat.com/blablablabla</a></td>
											<td><a href="">Delete</a></td>
										</tr>
									</table>
									<input type="button" name="music-delete" id="music-delete"
										value="delete">
								</div>
							</div>
						</article>
					</div>
					<div id="tab-5" class="tab">
						<article>
							<div class="text-section">
								<h1>Dashboard</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<ul class="status">
								<li class="error">Error : This is an error placed text
									message.</li>
								<li class="warning">Warning: This is a warning placed text
									message.</li>
								<li class="succes">Success : This is a Success placed text
									message.</li>
							</ul>
						</article>
					</div>
					<div id="comments" class="tab">
						<article>
							<div class="text-section">
								<h1>Comments</h1>
								<p>This is a quick overview of some features</p>
							</div>
						</article>
					</div>
					<div id="tab-7" class="tab">
						<article>
							<div class="text-section">
								<h1>Dashboard</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<ul class="status">
								<li class="error">Error : This is an error placed text
									message.</li>
								<li class="warning">Warning: This is a warning placed text
									message.</li>
								<li class="Success">Success : This is a Success placed text
									message.</li>
							</ul>
						</article>
					</div>
					<div id="tab-8" class="tab">
						<article>
							<div class="text-section">
								<h1>Dashboard</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<ul class="status">
								<li class="error">Error : This is an error placed text
									message.</li>
								<li class="warning">Warning: This is a warning placed text
									message.</li>
								<li class="success">Success : This is a Success placed text
									message.</li>
							</ul>
						</article>
					</div>
				</div>
			</div>
		</div>
		<aside id="sidebar">
			<strong class="logo"><a href="#">lg</a></strong>
			<ul class="tabset buttons">
				<li class="active"><a href="#dashboard" class="dashboard"><span>Dashboard</span><em></em></a>
					<span class="tooltip"><span>Dashboard</span></span></li>
				<li><a href="#pictures" class="pictures"><span>Pictures</span><em></em></a>
					<span class="tooltip"><span>Pictures</span></span></li>
				<li><a href="#articles" class="articles"><span>Articles</span><em></em></a>
					<span class="tooltip"><span>Articles</span></span></li>
				<li><a href="#applications" class="applications"><span>Applications</span><em></em></a>
					<span class="tooltip"><span>Applications</span></span></li>
				<li><a href="#tab-5" class="ico5"><span>Archive</span><em></em></a>
					<span class="tooltip"><span>Archive</span></span></li>
				<li><a href="#comments" class="comments"> <span>Comments</span><em></em>
				</a> <span class="num">11</span> <span class="tooltip"><span>Comments</span></span>
				</li>
				<li><a href="#tab-7" class="ico7"><span>Plug-in</span><em></em></a>
					<span class="tooltip"><span>Plug-in</span></span></li>
				<li><a href="#tab-8" class="ico8"><span>Settings</span><em></em></a>
					<span class="tooltip"><span>Settings</span></span></li>
			</ul>
			<span class="shadow"></span>
		</aside>
	</div>
</body>
</html>