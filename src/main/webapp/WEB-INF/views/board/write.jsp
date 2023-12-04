<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/write" method="post">
<table border="1">

<tr><td>제목</td><td><input type="text" name="title">
<input type="hidden" name="id" value="${sessionScope.login.id}">
</td></tr>
<tr><td>내용</td><td><textarea rows="30" cols="50" name="content"></textarea></td></tr>
<tr><td colspan="2"><input type="submit" value="글쓰기"></td></tr>
</table>
</form>
</body>
</html>