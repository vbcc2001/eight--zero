
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="css/index.css" type="text/css"></link>

<table id="hotindex" >
    <tr>
      <td class="title" colspan="7">热门主题</td>
    </tr>
	<tr><th colspan="3">标题</th><th width="90">版块</th><th width="90">作者/日期</th><th width="90">回复/浏览</th><th width="90">最后回复</th></tr>
    <tr>
        <td width="18"><img alt="全局置顶" src="img/theme/pin_3.gif" /></td>
        <td width="16"><img alt="热门" src="img/theme/icon2.gif" /></td>
        <td width="818" align="left"><a href="#">游戏介绍</a><img alt="图片附件" src="img/theme/image_s.gif" /></td>
        <td><a href="#">娱乐</a>/<a href="#">影星天下</a></td>
        <td><a href="#">lsydevilycry</a><br />2009-11-9</td>
        <td><strong>1070</strong>/373954</td>
        <td><a href="#">lsydev</a><br />2010-6-1</td>
    </tr>
    <tr class="bg">
        <td width="18"><img alt="全局置顶" src="img/theme/pin_3.gif" /></td>
        <td width="16"><img alt="热门" src="img/theme/icon2.gif" /></td>
        <td width="818" align="left"><a href="#">游戏介绍</a><img alt="图片附件" src="img/theme/image_s.gif" /></td>
        <td><a href="#">娱乐</a>/<a href="#">影星天下</a></td>
        <td><a href="#">lsydevilycry</a><br />2009-11-9</td>
        <td><strong>1070</strong>/373954</td>
        <td><a href="#">lsydev</a><br />2010-6-1</td>
    </tr>
    <tr><td colspan="7" align="right"><a href="#" >更多...</a></td></tr>
</table>
