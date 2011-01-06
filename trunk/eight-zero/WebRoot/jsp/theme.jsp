<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>发表帖子</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
   <form action="" method="post" >
   	<div >
   	帖子标题:<input type="text" name="mtitle" id="mtitle" width="80%">
   	</div>
   	<br>
   帖子内容:
   <img border="0" align="middle" src="../img/updateimg.jpg">&nbsp;
   <img border="0" src="../img/flash.jpg">
   <img border="0" src="../img/tupiao.jpg">&nbsp; 
   <br>
 <textarea rows="10" cols="50"> </textarea>
 <br/>
  <br/>
验证码:<input type="text" >
<br> 
<input type="submit" value="发表帖子">
<input type="reset" value="取消">
   </form>
  </body>
</html>
