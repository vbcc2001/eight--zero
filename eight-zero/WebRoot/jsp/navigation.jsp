<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="header.jsp"></jsp:include>
<div id="nav">
		<div class="navLeft"></div>
		<div class="navRight"></div>
		<div class="navMiddle">
			<ul>
				<li>
					<div class="navCellPadder">
						<div class="navBg"><div class="navBgPadder"><div class="navMask"><div class="navIcon navIcon01"></div></div></div></div>
						<div class="navTitleTop"></div>
						<span class="navTitleLeft">
						<span class="navTitleRight"><em>新鲜事</em></span></span>
					</div>
				</li>
			</ul>
		</div>	
</div>