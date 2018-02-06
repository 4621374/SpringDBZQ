<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>登录</legend>
<form action="${pageContext.request.contextPath }/items/login.action" method="get">
<p>用户名：<input name="username">
</p>
<p>密码：<input name="password" type="password">
</p>
<p><input type="reset" value="取消">
   <input type="submit" value="登录">
</p>

</form>
</fieldset>

</body>
</html>