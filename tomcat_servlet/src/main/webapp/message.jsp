<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<%--<% String message = (String) request.getAttribute("message");%>--%>
<%--isELIgnored="false"表示在本jsp中使用el表达式，否则表示不使用el表达式。--%>
<%--servlet2.4或者更新的版本，isELIgnored默认值为false，而2.3或者 更早的版本isELIgnored默认值为true。就导致了出现EL表达式无效的情况。--%>
<%@ page isELIgnored="false"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传结果</title>
</head>
<body>
<center>
<%--    <h2><%=message %></h2>--%>
    <h2>${message}</h2>
</center>
</body>
</html>
