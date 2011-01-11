<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
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
 function createfckeditor() {
	var oFCKeditor = new FCKeditor('mcontent');
	oFCKeditor.BasePath = "/eight-zero/fckeditor/";
	oFCKeditor.ToolbarSet = "eduaskbbs";
	oFCKeditor.ReplaceTextarea();
}
</script>
		<script type="text/javascript">
		//光标定位
		function initFocus(){
		var obj = document.getElementById("mtitle");
		obj.focus();
	}
	//检查主题
	function checkMtitle(){
		var mtitle = document.getElementById("mtitle");
		if(mtitle.value == ""){
			alert("您还没有输入主题标题");
			return false;
		}
		return true;
	}
//检查验证码是否正确
function checkCode() {
	var code = document.getElementsByName("code");
	var codeR = document.getElementById("codeR");
	if (code.value != null) {
		if (window.XMLHttpRequest) {
			req = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			req = new ActiveXObject("Microsoft.XMLHTTP");
		}
		//设置回调函数
		req.onreadystatechange = callbackForCode;
		var url = "jsp/image.jsp/?code=" + code.value;
		alert(url+"=====");
		alert(code.value + "............");
		req.open("get", url, true);
		req.send(null);
		return true;
	} else {
		codeR.style.color = "red";
		codeR.innerHTML = "请输入验证码";
		return false;
	}
}
function callbackForCode() {
	var state = req.readyState;
	var codeR = document.getElementById("codeR");
	if (state == 4) {
		var doms = req.responseXML;
		var code = doms.getElementsByTagName("code");
		var message = code[0].getElementsByTagName("message")[0].firstChild.data;
		if (code[0].getElementsByTagName("message")[0].firstChild.data == "correct") {//验证码输入正确
			codeR.style.color = "green";
			codeR.innerHTML = "√ 输入正确";
		} else {
			codeR.style.color = "red";
			codeR.innerHTML = "输入错误";
		}
	}
}
//必须所有信息填写正确才能成功提交信息
function checkAll() {
	document.themeform.submit();
}
</script>
		<script type="text/javascript">
//刷新验证码
function reloadImage() {
	document.getElementById("identity").src = "jsp/image.jsp?ts=" + new Date().getTime();
}
</script>
	</head>
	<%
		response.setCharacterEncoding("utf-8");
	%>
	<body onload="initFocus();createfckeditor()">
		<form action="mianTitle_IncreaseTheme.action" method="post" name="themeform" onsubmit="checkMtitle()">
			<table border="0" width="80%">
				<tr>
					<td>
						帖子标题:
					</td>
					<td>
						<input type="text" name="mtitle" id="mtitle" width="80%">&nbsp;&nbsp;&nbsp;&nbsp;匿名用户不能发表评论！<a href=""> 登录</a>| <a href="">注册</a>
					</td>
				</tr>
				<tr>
					<td>
						帖子内容:
					</td>
					<td>
						<textarea rows="4" cols="60" name="mcontent">沙发空缺中~~~~</textarea>
					</td>
				</tr>
				<tr>
					<td>
						验证码:
					</td>
					<td>
						<input type="text" id="code" name="code" style="width: 50px;" onblur="checkCode()" />
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<img src="jsp/image.jsp" id="identity">
						<input type="button" value="看不清  换一张" id="btn" onclick="reloadImage()" />
					</td>
					<td>
						<span id="codeR"></span>
					</td>
				</tr>
				<tr>
					<td align="center">
						<input type="hidden" name="mianTitle" value="IncreaseTheme" >
						<input type="submit" value="发表帖子">
						<input type="reset" value="取消">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
