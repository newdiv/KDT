<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world! 
	
	${sessionScope.login.id}님 환영합니다.
	
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="member">회원가입으로 이동</a>

<a href="board">게시판으로 이동</a>

<a href="logForm">로그인</a>




</body>
</html>
