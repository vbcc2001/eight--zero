<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
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
	<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
			window.onload = function()
			{
			var oFCKeditor = new FCKeditor( 'MyTextarea' ) ;
			oFCKeditor.BasePath = "/eight-zero/fckeditor/" ;
			oFCKeditor.ToolbarSet = "eduaskbbs";
			oFCKeditor.ReplaceTextarea() ;
			}
			</script>
	
  </head>
  <body>
   <form action="" method="post" >
   	<div >
   	帖子标题:<input type="text" name="mtitle" id="mtitle" width="80%">
   	</div>
   	<br>
   帖子内容:
  <textarea rows="4" cols="60" name="MyTextarea">沙发空缺中</textarea>
				<br>
验证码:<input type="text" >
<br> 
<input type="submit" value="发表帖子">
<input type="reset" value="取消">
   </form>
  </body>
</html>
