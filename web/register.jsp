<%@page import="com.xzc.model.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
Object o = session.getAttribute("user");
if(o!=null){
	User user = (User)o;
	out.println("当前登录用户："+user.getUsername()+"<br/>");
}
%>

<%
Object msg = request.getAttribute("message");
if(msg!=null)
	out.println(msg);
%>
<form action="register_do.jsp" method="post">
用户名：<input type="text" name="username" /><br/>
密码：<input type="password" name="password" /><br/>
年龄：<input type="text" name="age" /><br/>
性别： 男<input type="radio" name="sex" value="男" />女<input type="radio" name="sex" value="女" /><br/>
<input type="submit" value="注册" />
</form>

</body>
</html>