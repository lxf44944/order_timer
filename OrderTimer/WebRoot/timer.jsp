<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Object objdate = session.getAttribute("ogdate");
	Object ostatus = session.getAttribute("ostatus");
	if (objdate == null) {
		Calendar calendar = Calendar.getInstance();
		//查出订单下单时间并存在session中
		session.setAttribute("ogdate", calendar.getTime().getTime());
	}
	if (ostatus == null) {

		//查出订单状态并存在session中
		session.setAttribute("ostatus", 0);
	}
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>timer</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="css/style.css" media="screen"
	type="text/css" />
</head>

<body>
	<datalist>
		<option id="ogdate" label="ogdate" value="${sessionScope.ogdate}"></option>
	</datalist>
	<div id="countdown">
		<div id='tiles'></div>
		<div class="labels">
			<li>分</li>
			<li>秒</li>
		</div>
	</div>

	<script src='js/jquery.js'></script>

	<script src="js/timer.js"></script>
	<div style="text-align:center;clear:both;"></div>
</body>
</html>
