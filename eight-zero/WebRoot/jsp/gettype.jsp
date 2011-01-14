<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript">
<!--
		function loading(){
			var type = document.getElementById("sonName");
			var types = document.getElementById("types");
			if(type.value == "请选择版块类型"){
				if(window.XMLHttpRequest){
						req = new XMLHttpRequest();
				}else if(window.XMLHttpRequest){
					req = new ActiveXObject("Microsoft.XMLHTTP");
				}
				req.onreadystatechange = callbackForCode_2;
				types.style.color ="red";
				types.innerHTML = "请选择一种版块类型";
				return false;
			}
		}
		function callbackForCode_2(){
			var state = req.readyState;
			if(state == 4){}
		}
//-->
</script>
    	<select name="sonName">
    		<c:forEach items="${list}" var="list">
    			<option value="${list.sonName }" id="sonName">
    				${list.sonName }
    			</option>
    		</c:forEach>
    	</select>
    	<span id="types"></span>
