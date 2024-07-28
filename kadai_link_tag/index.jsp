<%@ page contentType="text/html; charset=UTF-8" %>

<html>
 <head>
 	<title>Servlet/JSPの基礎を学ぼう</title>
 </head>
 
 <body>
 	<%--<a href=#>名前「侍太郎」をServletに送信</a> --%>
 	<a href="<%=request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a>
 	<%
 	String msg = (String) request.getAttribute("msg");
 	if (msg == null){
 		msg = "";
 	}
 	%>
 	<p><%= msg %></p>
 </body>
</html>