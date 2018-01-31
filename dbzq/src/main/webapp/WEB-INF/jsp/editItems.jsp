<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
<c:forEach items="${errors }" var="error">
${error.defaultMessage }
</c:forEach>
<form action="${pageContext.request.contextPath }/items/editItemsSubmit.action" method="post" enctype="multipart/form-data">
<input type="hidden" name="id" value="${item.id}">
<table>
<tr>

<td>商品名称：</td><td><input type="text" name="name" value="${item.name}"></td>
</tr>
<tr>
<td>商品图片：</td><td><c:if test="${item.pic!=null}">
<img alt="" src="../images/${item.pic}" width="100" >
</c:if>
<input type="file" name="picFile" >
</td>
</tr>
<tr>
<td>商品价格:</td><td><input type="text" name="price" value="${item.price}"></td>
</tr>
<tr>
<td>订购日期:</td><td><input type="text" name="createtime" value="<f:formatDate value='${item.createtime}' pattern='yyyy-MM-DD'/>"></td>
</tr>
<tr>
<td>商品介绍:</td><td><input type="text" name="detail" value="${item.detail}"></td>
</tr>
<tr>
<td align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>
</html>