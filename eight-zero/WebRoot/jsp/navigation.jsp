<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<script type="text/javascript">
		//鼠标点击跳转事件
		function gotoBoradtable(id,subid) 
		{

			window.location.href = "index.jsp?id=" + id;
		}
		</script>
	<link rel="stylesheet" href="css/header.css" type="text/css"></link>
	</head>
	<body>
	<div id="main">
		<div id="nav">
			<div class="navLeft"></div>
			<div class="navRight"></div>
			<div class="navMiddle">
				<ul class="ul">
				<c:forEach items="${boradList}" var="boradTable">
					<li class="li">
						<div class="navCellPadder">
							<div class="navBg">
								<div class="navIcon"
									style="background-image: url('img/borad_img/${boradTable.bphoto}'); background-repeat: no-repeat;"
									onclick="javascript:gotoBoradtable(${null})"></div>
							</div>
						</div>
						<div id="subNav">
							<div class="title"></div>
							<div class="content">
								<div class="top"></div>
								<div class="middle">
									<ul>
									<c:forEach items="${boradTable.sonBorad}" var="sonBorad">
										<li >
											<div class="subNavBg">
											<div class="subNavIcon"
												style="background-image: url('img/sonBorad_img/${sonBorad.sphoto}'); background-repeat: no-repeat;"
												onclick="javascript:gotoBoradtable(${null},${null})"></div>
											<div class="font">${sonBorad.sonName}</span>
											</div>
										</li>
										</c:forEach>
										</ul>
								</div>
								<div class="bottom"></div>
							</div>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		</div>
		
	</body>
</html>