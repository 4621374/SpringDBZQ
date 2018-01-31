<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.2.1.js"></script>
<script type="text/javascript" >

function requestJson () {

	$.ajax({
	url:"${pageContext.request.contextPath}/requestJson.action",
	type:"post",
	contentType:"application/json;charset=utf-8",
	data:'{"name":"zhangsan","price":2323}',
	success:function(data){
	alert(data);
	}
	
	});
}
function responseJson () {
		$.ajax({
	url:"${pageContext.request.contextPath}/responseJson.action",
	type:"post",
	
	data:"name=手机&price=2000",
	success:function(data){
	alert(data);
	}
	
	});
}
</script>
</head>
<body>
<input type="button" value="json请求" onclick="requestJson()">
<input type="button"  value="http请求" onclick="responseJson()">
</body>
</html>