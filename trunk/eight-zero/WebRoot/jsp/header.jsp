<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="../css/header.css" type="text/css"></link>
<link rel="stylesheet" href="css/header.css" type="text/css"></link>
<script type="text/javascript" src="../js/jquery-1.4.4.js"></script>
<script type="text/javascript" src="js/jquery-1.4.4.js"></script>
<script type="text/javascript" src="../js/jquery.textRemindAuto-1.0.js"></script>
<script type="text/javascript" src="js/jquery.textRemindAuto-1.0.js"></script>
<script type="text/javascript">
<!--
//输入框提示自动消失方法
$(function(){
    $("#keyword").textRemindAuto({
        focusColor: "#000000"								  
    });
});;

//-->
</script>
<div id="header">
	<div class="navMain">
        <a class="logo" title="80社团"  href="#"></a> 
        <div class="login" >
        <c:choose>
        <c:when test="${user==null}">
           	<a href="#" title="登录">登录</a>
		    <a href="#" title="注册">注册</a>
		    <a href="#" title="忘记密码">忘记密码</a>
		</c:when>
		<c:otherwise>
			欢迎您,&nbsp;&nbsp;${user.name}&nbsp;&nbsp;[
		    <a href="#" title="注册">退出</a>]&nbsp;&nbsp;|&nbsp;
		    <a href="#" title="忘记密码">个人中心</a> 
		</c:otherwise>
		</c:choose>
       </div>
     	<div id="seach" >
		<form action="#" onsubmit="return false" id="topSearchForm" >
			<div class="input"><input type="text" id="keyword" name="keyword" value="全文检索"></div>
			<div class="submit"><input type="submit" id="submit"  value=" "></div>
		</form>
		</div>
	</div>
</div> 