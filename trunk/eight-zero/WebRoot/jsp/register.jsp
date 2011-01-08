<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>用户注册页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/login.css" type="text/css"></link>
	<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
    <script type="text/javascript" src="../js/jquery-1.4.4.js"></script>
  	<script type="text/javascript" src="../js/userTable.js"></script>
    <script type="text/javascript" src="js/userTable.js"></script>
    
  </head>
  
  <body>
  <jsp:include page="header.jsp" />
    <DIV id="login" style="width: 550px" >
<form action="userTable_check.action" method="post" name="registerForm" id="registerForm" onsubmit="return checkall()"  enctype="multipart/form-data" >
	<SPAN class="title">欢迎注册80社团会员：</SPAN><BR>
	<span class="star" ></span>
	<TABLE>
	  <TBODY>
		  <TR>
		    <TD><SPAN class="star">*</SPAN>会员名</TD>
		    <TD><INPUT class="text" type="text" id="userName" name="uname" />
		    <span  class="info" id="userNameInfo"></span>
		    </TD>
		    	
		  </TR>
		  
		  <tr>
		  	<td></td>
		  	<td><font color="#999999">请输入以字母或数字开头，4~15位用户名</font></td>
		  </tr>
		  
		  <TR>
		    <TD><SPAN class="star">*</SPAN>密码</TD>
		    <TD><INPUT class="text" type="password" id="password" name="upwd"/>
		    <span  class="info" id="passwordInfo"></span>
		    	</TD>
		    	
		  </TR>
		  
		  <tr>
		  	<td></td>
		  	<td><font color="#999999">请输入6~20位密码</font></td>
		  </tr>
		  
		  <TR>
		    <TD><SPAN class="star">*</SPAN>重复密码</TD>
		    <TD><INPUT class="text" type="password" id="repeatPassword" name="upwd2"/>
		    	<span  class="info" id="repeatPasswordInfo"></span></TD>
		    	
		  </TR>
		  <tr>
		  	<td></td>
		  	<td><font color="#999999">请重复输入上面的密码</font></td>
		  </tr>
		  
		  <TR>
		    <TD><SPAN class="star">*</SPAN>EMAIL</TD>
		    <TD><INPUT class="text" type="text" id="email" name="uemail" />
		    	<span id="emailInfo"></span>
		    	</TD>
		    	
		  </TR>
		  <tr>
		  	<td></td>
		  	<td><font color="#999999">请输入您的电子邮箱,找回密码时使用</font>
		  	</td>
		  </tr>
		  
		  <TR>
		    <TD><SPAN class="star">&nbsp;</SPAN>性别</TD>
		    <TD>
		    	<input name="sex" type="radio" value="男" checked="checked" />男
		    	<input name="sex" type="radio" value="女">女
		    	</TD>
		  </TR>
		  
		  <TR>
		    <TD><SPAN class="star">*</SPAN>验证码</TD>
		    <TD><INPUT class="text" type="text" id="validateCode" name="validateCode" size="6" onblur="return checkregcode()" onkeyup="checkCode(this)" />
		    	<input class="validateCode" type="text" size="8" disabled="disabled" />
		    	</TD>
		  </TR>
		  <TR>
		    <TD></TD>
		    <TD><INPUT value="注册" type="submit" /> &nbsp;<input type="reset" value="重置" /></TD>
		  </TR>
		  <TR>
		    <TD></TD>
		    <TD>注:<SPAN class="star">*</SPAN>号为必填选项</TD>
		  </TR>
	  </TBODY>
	</TABLE>
</form>
</DIV>
  </body>
</html>
