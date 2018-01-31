<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
<script type="text/javascript">
function deleteItems() {
	document.itemsForm.action="${pageContext.request.contextPath}/items/deleteItems.action";
	document.itemsForm.submit();
}
</script>
</head>

<body>
<form action="" name="itemsForm">
<table width="100%" border="1">
<tr><td><input type="button" value="select"><input type="button" value="delete"  onclick="deleteItems()"></td><td>
<select>
 
 <c:forEach items="${itemsType}" var="itemsType">
 <option value="${itemsType.key}">${itemsType.value}
 </option>
 </c:forEach>
</select>
</td></tr>
<tr><td>商品名</td><td>商品价格</td><td>订购日期</td><td>商品描述</td><td>操作</td></tr>

<c:forEach items="${items}" var="item">
<tr>
<td><input type="checkbox" value="${item.id}" name="delete_id"/>${item.name}</td><td>${item.price}</td><td><f:formatDate value="${item.createtime}" pattern="yyyy-MM-DD"/></td><td>${item.detail}</td>
<td><a href="${pageContext.request.contextPath}/items/editItems.action?id=${item.id}">修改</a>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>