
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="css/index.css" type="text/css"></link>

<table id="hotindex" >
    <tr>
      <th colspan="6">热门主题</th>
    </tr>
	<tr><td colspan="3">内容</td><td width="100">作者/日期</td><td width="94">回复/浏览</td><td width="116">最后回复</td></tr>
    <tr>
        <td width="18"><blockquote><p><img alt="全局置顶" src="img/theme/pin_3.gif" /> </p>	</blockquote></td>
        <td width="16"><blockquote><p><img src="img/theme/icon2.gif" /></p></blockquote></td>
        <td width="818" align="left"><p><span ><a href="title_1.html">游戏介绍</a></span> <img alt="图片附件" src="../../img/image_s.gif" /> </p></td>
        <td><blockquote><p><a href="http://bbs.gamersky.com/space-uid-210989.html">lsydevilmaycry</a><br /> <em>2009-11-9</em> </p></blockquote></td>
        <td><blockquote><p><strong>1070</strong>/<em>373954</em></p></blockquote></td>
        <td><blockquote><p>wl1018 <br /><em>2010-6-12   10:22</em> </p></blockquote></td>
    </tr>
</table>
