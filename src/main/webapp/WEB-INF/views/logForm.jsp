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
<a href="/">메인으로 이동</a>
<form action="" method="post">
<table border="1">
<c:choose>
<c:when test="${sessionScope.login ne null }">
${sessionScope.login.name}님 환영합니다.
</c:when>
<c:otherwise>
<tr>
<td>ID</td>
<td><input type="text" name="id"></td>
</tr>
<tr>
<td>PW</td>
<td><input type="password" name="pw"></td>
</tr>
</c:otherwise>
</c:choose>
<tr>
<td colspan="2">

<c:choose>
<c:when test="${sessionScope.login eq null }">
<input type="submit" value="로그인" formaction="login">
</c:when>
<c:otherwise>

<input type="submit" value="로그아웃" formaction="logout">
</c:otherwise>
</c:choose>
</td>

</tr>
</table>
</form>
</body>
</html>