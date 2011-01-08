<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
					<li class="li">
						<div class="navCellPadder">
							<div class="navBg">
								<div class="navIcon"
									style="background-image: url('img/001.PNG'); background-repeat: no-repeat;"
									onclick="javascript:gotoBoradtable(${null})"></div>
							</div>
						</div>
						<div id="subNav">
							<div class="title"></div>
							<div class="content">
								<div class="top"></div>
								<div class="middle">
									<ul>
									
										<li >
											<div class="subNavBg">
											<div class="subNavIcon"
												style="background-image: url('img/001.PNG'); background-repeat: no-repeat;"
												onclick="javascript:gotoBoradtable(${null},${null})"></div>
											<div class="font">新鲜事</span>
											</div>
										</li>
										</ul>
								</div>
								<div class="bottom"></div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
		</div>
		
	</body>
</html>